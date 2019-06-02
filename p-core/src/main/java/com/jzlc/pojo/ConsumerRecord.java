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
public class ConsumerRecord implements Serializable {
    /***/
    public static Integer SUCCESS= 0;
    private static final long serialVersionUID = 1L;

    /**流水ID*/
    private String recordId;
    /**用户ID*/
    private String consumerId;
    /**ip*/
    private Integer ip;
    /**登录时间*/
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date loginTime;
    /**登录状态,默认为0 登录成功  1 登录失败*/
    private Integer loginFlag = SUCCESS;

}
