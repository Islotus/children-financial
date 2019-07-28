package com.czbank.childrenfinancial.postput;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class UserMngIn {

    //账号
    private String account;

    //是否设置父账号
    private String isSetParent;

    //限额
    private String limit;

    //卡号
    private String cardNbr;

    //支付金额
    private String payPw;

    //每页大小
    private String ps;

    //每页数量
    private String pn;

    //原密码
    private String oriPw;

    //新密码
    private String newPw;

    //手机号
    private String phoneNbr;

}
