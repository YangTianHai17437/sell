package com.imooc.dataobject;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 *@author： 秃头佬
 *时间： 2019年12月04日
 */
@Entity
@DynamicUpdate
@Data
@NoArgsConstructor
public class ProductCategory {
    /**
     * 类目id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增类型的
    private Integer categoryId;

    /**
     * 类目名字.
     */
    private String categoryName;

    /**
     * 类目编号.
     */
    private Integer categoryType;

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
