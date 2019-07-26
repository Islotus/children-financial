package com.czbank.childrenfinancial.dao;

import com.czbank.childrenfinancial.Utils.SnowFlake;
import com.czbank.childrenfinancial.mapper.CardInfMapper;
import com.czbank.childrenfinancial.mapper.LsInfMapper;
import com.czbank.childrenfinancial.mapper.UserInfMapper;
import com.czbank.childrenfinancial.po.CardInf;
import com.czbank.childrenfinancial.po.LsInf;
import com.czbank.childrenfinancial.po.UserInf;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Slf4j
@Component
public class UserMngDao {

    @Autowired
    UserInfMapper userInfMapper;

    @Autowired
    LsInfMapper lsInfMapper;

    @Autowired
    CardInfMapper cardInfMapper;

    public UserInf getUserInfByAcctAndPw(String account, String password) {

        Example example = new Example(UserInf.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("account", account);
        criteria.andEqualTo("loginPw", password);

        return userInfMapper.selectOneByExample(example);
    }

    public UserInf getUserInfByAccount(String account) {
        if (StringUtils.isEmpty(account)) {
            throw new RuntimeException("账号为空");
        }

        Example example = new Example(UserInf.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("account", account);

        return userInfMapper.selectOneByExample(example);
    }

    public void maintainUserInf(UserInf userInf) {
        if (StringUtils.isEmpty(userInf.getAccount())) {
            throw new RuntimeException("账号为空");
        }

        userInfMapper.updatePhoneNbr(userInf.getAccount(), userInf.getPhoneNbr());
    }

    public void maintainLoginPw(String account, String newPw) {
        if (StringUtils.isEmpty(account)) {
            throw new RuntimeException("账号为空");
        }

        userInfMapper.updateLoginPw(account, newPw);
    }

    public List<LsInf> queryLsInfByAccount(String account, int pageNum, int pageSize) {
        if (StringUtils.isEmpty(account)) {
            throw new RuntimeException("账号为空");
        }

        return lsInfMapper.queryLsInf(account, pageNum, pageSize);
    }

    public void settleCardNbr(CardInf cardInf) {
        cardInfMapper.insertSelective(cardInf);
    }

    public int register(UserInf userInf){
        //"values(#{userId},#{account},#{relatedAccount},#{name},#{isParent},
        // #{idCard},#{birthday},#{phoneNbr},#{loginPw},#{openTime})")

//        userInf.setAccount(account);
//        userInf.setLoginPw(loginPw);
//        userInf.setName(name);
//        userInf.setBirthday(birth);
//        userInf.setPhoneNbr(phone);
//        userInf.setIdCard(idCard);
        //return userInfMapper.register(userInf);
        int num = 0;
        int ret = 0;
        try{
            num = userInfMapper.hasAccount(userInf);
        }catch(Exception e){
            ret = -1;
            log.info("查询账户是否存在错误");
        }
        if(num != 0){
            ret = 2;
        }else{
            //生成user_id
            String idStr = String.valueOf(SnowFlake.nextId());
            String id = idStr.substring(idStr.length() - 7);
            log.info("id: " +id);
            userInf.setUserId(id);
            //获取年龄,判断是父还是子
            int age = Integer.parseInt(userInf.getIdCard().substring(6,14));
            SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
            log.info(df.format(new Date()));
            int now = Integer.parseInt(df.format(new Date()));
            int isAdult = now - age;
            if(isAdult >= 18)
            {
                userInf.setIsParent("1");
            } else {
                userInf.setIsParent("0");
            }
            //获取当前时间
            Date date = null;
            try{
                df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                date = df.parse(df.format(new Date()));
                log.info(date.toString());
            }catch(ParseException e){
                e.printStackTrace();
            }
            userInf.setOpenTime(date);
            try{
                log.info("Dao: " + userInf);
                ret = userInfMapper.register(userInf);
            }catch(Exception e){
                ret = -1;
                log.info("注册插入表 user_inf 错误");
                log.error(e.toString());
            }
        }
        return ret;
    }



}
