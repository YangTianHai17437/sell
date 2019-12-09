package com.imooc.service;
/*
 *@author： 秃头佬
 *时间： 2019年12月04日
 */

import com.imooc.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {
    ProductCategory findOne(Integer categoryId);
    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
    //加库存
    //减库存
}
