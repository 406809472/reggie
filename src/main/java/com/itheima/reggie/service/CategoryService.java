package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Category;

/**
 * @author sbqstart
 * @create 2022/4/20 - 19:38
 */
public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
