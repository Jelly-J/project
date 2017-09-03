package com.oms.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by Jelly on 2017/9/2.
 */
@Data
public class AccountInfo {

    /**
     *
     */
    private Long id = 1l;

    /**
     *
     */
    private Long parentId;

    /**
     *
     */
    private String accountType="main";

    /**
     *
     */
    private String loginId="haha";

    /**
     *
     */
    private String customerCode;

    /**
     *
     */
    private String accountName;

    /**
     *
     */
    private String nonceToken;

    /**
     *
     */
    private String passwordSalt;

    /**
     *
     */
    private String passwordHash;

    /**
     *
     */
    private String phoneNumber;

    /**
     *
     */
    private String contactNumber;

    /**
     *
     */
    private String faxNumber;

    /**
     *
     */
    private String altEmail;

    /**
     *
     */
    private String siteLink;

    /**
     *
     */
    private String webchatId;

    /**
     *
     */
    private String qqId;

    /**
     *
     */
    private String accountStatus;

    /**
     *
     */
    private Date createdDate;

    /**
     *
     */
    private Long createdBy;

    /**
     *
     */
    private Date modifiedDate;

    /**
     *
     */
    private Long modifiedBy;
}