package com.czbank.childrenfinancial.service;

import com.czbank.childrenfinancial.po.LsInf;
import com.czbank.childrenfinancial.po.UserInf;

import java.util.List;
import java.util.Map;

public interface UserManagementService {
    //个人基本信息查询-ok
    UserInf queryUserInf(String account);

    //借记卡绑定-ok
    String settleBankCard(String account, String cardNbr, String payPw);


    //余额查询:卡余额+理财产品余额-ok
    Map<String, String> getRemainAmt(String account);

    //流水明细查询-ok
    List<LsInf> queryLsDetail(String account, int pageNum, int pageSize);

    //账户信息维护
    //修改自己的账户 父母账户修改子女账户
    //手机号维护-ok
    String maintainUserInf(String account, String phoneNbr);

    //用户密码更新-ok
    String maintainLoginPw(String account, String oriPw, String newPw);

    Map<String, Object> querySonAcctByParentAcct(String pAcct);

}
