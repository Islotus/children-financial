package com.czbank.childrenfinancial.dao;

import com.czbank.childrenfinancial.mapper.BusiInfMapper;
import com.czbank.childrenfinancial.mapper.CardInfMapper;
import com.czbank.childrenfinancial.mapper.LsInfMapper;
import com.czbank.childrenfinancial.mapper.UserInfMapper;
import com.czbank.childrenfinancial.po.BusiInf;
import com.czbank.childrenfinancial.po.CardInf;
import com.czbank.childrenfinancial.po.LsInf;
import com.czbank.childrenfinancial.po.UserInf;
import com.netflix.discovery.converters.Auto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

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

    @Autowired
    BusiInfMapper busiInfMapper;

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

    public CardInf getCardInfByUserId(String userId) {
        if (StringUtils.isEmpty(userId)) {
            throw new RuntimeException("用户编号为空");
        }

        return cardInfMapper.getCardInfByCardNbr(userId);
    }

    public BusiInf getBusiInfByUserId(String userId) {
        if (StringUtils.isEmpty(userId)) {
            throw new RuntimeException("用户编号为空");
        }

        return busiInfMapper.getBusiInfByUserId(userId);
    }

}
