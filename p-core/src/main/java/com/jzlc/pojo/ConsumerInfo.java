package com.jzlc.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@ToString
public class ConsumerInfo implements Serializable{
	/***/
	public static Integer UNTESTED = 0;
	private static final long serialVersionUID = 1L;

	/**用户id*/
	private String consumerId;
	/**电话*/
	private Integer tel;
	/**邮箱*/
	private String email;
	/**身份证号码*/
	private Integer idCard;
	/**身份证正面照片*/
	private String imageA;
	/**身份证反面照片*/
	private String imageB;
	/**认证状态:身份证验证 邮箱验证 手机验证 银行卡绑定 密保问题是否设置*/
	private Integer bitState;
	/**投资风格： 0未测试  12345*/
	private Integer style = UNTESTED;
	/**MD5加密的六位支付密码*/
	private Integer password;
	/**账户总资产*/
	private Integer sumMoney;
	/**余额*/
	private Integer balance;
	/**已用金额*/
	private Integer usedMoney;
}
