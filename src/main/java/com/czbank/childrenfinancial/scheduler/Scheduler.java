package com.czbank.childrenfinancial.scheduler;

import com.czbank.childrenfinancial.Utils.ApplicationContextUtil;
import com.czbank.childrenfinancial.mapper.FinProductInfMapper;
import com.czbank.childrenfinancial.mapper.FinancialOpsMapper;
import com.czbank.childrenfinancial.po.SchedulerParams;
import com.czbank.childrenfinancial.service.FinProductInfService;
import com.czbank.childrenfinancial.service.FinancialOpsService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Component
@Controller
public class Scheduler {
//    每天0点执行

//    @Resource
    @Autowired
    FinancialOpsMapper financialOpsMapper;
    @Autowired
    FinancialOpsService financialOpsService;
    @Autowired
    FinProductInfMapper finProductInfMapper;
    @Autowired
    FinProductInfService finProductInfService;

    public static Scheduler scheduler;

//    FinancialOpsService financialOpsService = (FinancialOpsService) ApplicationContextUtil.getBean(FinancialOpsService.class);
//    FinancialOpsMapper financialOpsMapper = (FinancialOpsMapper)ApplicationContextUtil.getBean(FinancialOpsMapper.class);
//    FinProductInfService finProductInfService = (FinProductInfService)ApplicationContextUtil.getBean(FinProductInfService.class);
//    FinProductInfMapper finProductInfMapper = (FinProductInfMapper)ApplicationContextUtil.getBean(FinProductInfMapper.class);


    @PostConstruct
    public void init(){
        scheduler = this;
        scheduler.finProductInfMapper = this.finProductInfMapper;
        scheduler.financialOpsMapper = this.financialOpsMapper;
        scheduler.finProductInfService = this.finProductInfService;
        scheduler.financialOpsService = this.financialOpsService;

    }

//    每天0时执行定时任务
    @Scheduled(cron = "0 0 0 ? * *")
//    @Scheduled(fixedRate = 10000)
    public void periodPurchaseTask() {

        List<SchedulerParams> paramsList = new ArrayList<>();
        System.out.println("执行定时任务，执行时间是" + new Date(System.currentTimeMillis()));
        try {
            paramsList = finProductInfService.testparams();
        }catch(Exception e){
            System.out.println(paramsList);
            System.out.println(finProductInfMapper.getParams1());
        }

        for(SchedulerParams params : paramsList){
//            判断是不是定投条目
            if(params.getTimePeriod() == 0) continue;

//            判断是否到要再次购买的周期
            if(params.getTimediff() >= params.getTimePeriod()){
//                判断余额够不够
                String card = params.getCardNbr();

                double balance = financialOpsMapper.getAmt(card);
                double amt = params.getAmt();
                if(balance < amt) continue;//如果卡中余额已经不够再买一次，跳过
//                余额够，再次购买update
                String busiId = params.getBusiId();
                financialOpsMapper.expenseUpdate(card, amt);
                finProductInfMapper.purchaseProdAgain(busiId,amt);

            }
        }

    }
}
