package com.chixing.entity;


import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class OrderAndResign implements Serializable {


    /**
     *  订单编号
     */
    private String designOrderNo;

    /**
     * 方案id
     */
    private Integer designId;

    /**
     * 方案名字
     */
    private String designName;

    /**
     * 方案图片
     */
    private String field1;

    /**
     * 户型
     */
    private String designHouseType;

    /**
     * 风格
     */
    private String designStyle;

    /**
     * 面积
     */
    private Double designArea;

    /**
     * 价格
     */
    private Double designPrice;

}
