package com.inspur.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author ZhangTao
 * @since 2023-08-07
 */
@Data
@Entity
@Table(name = "`PMPMMasterDataApplication`")
public class PMPMMasterDataApplication  {


    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USER_ID")
    @SequenceGenerator(name = "SEQ_USER_ID", sequenceName = "SEQ_USER_ID")
    private String ID;

    private String ApplicationCode;

    private String Application_SM;

    private String Application_SQBM;

    private String Application_SQR;

    private Date Application_SQRQ;

    private String BillStatus;

    private String Customer;

    private Date EffectiveDate;

    private String ProcessInstance;

    private String ProductLine;

    private String Project;

    private String SUType;

    private String Type;

    private String UptMsg_CreatedBy;

    private Date UptMsg_CreatedOn;

    private String UptMsg_LastChangedBy;

    private Date UptMsg_LastChangedOn;

    private Date Version;


}
