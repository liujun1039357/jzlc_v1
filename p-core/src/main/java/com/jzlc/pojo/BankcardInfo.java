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
public class BankcardInfo implements Serializable{
	/***/
	public static Integer Bound = 0;
	private static final long serialVersionUID = 1L;

	/**用户id*/
	private String consumerId;
	/**银行卡号*/
	private String cardId;
	/**修改时间*/
	@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
	private Date updateTime;
	/**0: 已绑定 1 已解绑 2 无效*/
	private Integer cardStates = Bound;
}
