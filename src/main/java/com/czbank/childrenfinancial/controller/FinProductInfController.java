package com.czbank.childrenfinancial.controller;

import com.czbank.childrenfinancial.po.BusiInf;
import com.czbank.childrenfinancial.postput.LoginIn;
import com.czbank.childrenfinancial.postput.ProdBuyInfo;
import com.czbank.childrenfinancial.service.FinProductInfService;
import com.czbank.childrenfinancial.service.impl.UserMngServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@CrossOrigin
@RestController
@RequestMapping(value = "/finProd")
public class FinProductInfController {

    @Autowired
    private FinProductInfService productService;

    @Autowired
    private UserMngServiceImpl userMngService;

//    查询理财产品信息
    @RequestMapping(value = "/getProductInfo")
    public Object getProductInfo(@RequestBody LoginIn loginIn, HttpServletRequest request){
        HttpSession session = request.getSession();
//        String account = (String)session.getAttribute("account");
//        Map<Object, Object> reMap = productService.getProductInfo(account);
        Map<Object, Object> reMap = productService.getProductInfo(loginIn.getAccount());
        return reMap;
    }

//    购买理财产品
    @RequestMapping(value = "/purchaseProduct")
    public Object purchaseProduct(@RequestBody ProdBuyInfo prodBuyInfo){
        String card = prodBuyInfo.getCard();
        String prodId = prodBuyInfo.getProdId();
        String amountStr = prodBuyInfo.getAmount();
        Double amount = Double.parseDouble(amountStr);
        String period = prodBuyInfo.getPeriod();

        int r = productService.purchaseProduct(card,prodId,amount,period);
        String resultStatus = String.valueOf(r);

        return resultStatus;
    }

//    查询已经购买的理财产品
    @RequestMapping(value = "/queryProdHasBuyed")
    public Object queryProdHasBuyed(@RequestBody LoginIn loginIn){

        String account = loginIn.getAccount();
        System.out.println(account);
        System.out.println("C层输出：" + productService.queryProdHasBuyed(account));
        return productService.queryProdHasBuyed(account);
    }

//    查询已经购买的基金总额
    @RequestMapping(value = "/querySumPropertyByAccount")
    public Map<Object,Object> querySumPropertyByAccount(@RequestBody LoginIn loginIn){

        Map<Object,Object> reMap = new HashMap<>();
        List<BusiInf> busiInfList = (List)queryProdHasBuyed(loginIn);
        if(busiInfList.isEmpty()){
            reMap.put("status","-1");
            return reMap;
        }
        double LCTotal = 0;
        double DTTotal = 0;
        for(BusiInf busiInf : busiInfList){
            int period = busiInf.getTimePeriod();
            double amount = busiInf.getSumAmt().doubleValue();
            if(period != 0) DTTotal += amount;
            LCTotal += amount;
        }
        double balance = Double.parseDouble((String)userMngService.getRemainAmt(loginIn.getAccount()).get("cardAmt"));
        double totalAmount = balance + LCTotal;

        DecimalFormat df = new DecimalFormat("0.000");

        reMap.put("totalAmount",df.format(totalAmount));
        reMap.put("balance",df.format(balance));
        reMap.put("LCTotalAmount",df.format(LCTotal));
        reMap.put("DTTotalAmount",df.format(DTTotal));
        reMap.put("status","0");
        return reMap;
    }

    @RequestMapping(value = "testparams")
    public void testparams(){
        productService.testparams();
    }

}
