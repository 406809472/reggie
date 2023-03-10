package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.SetmealDto;
import com.itheima.reggie.entity.Setmeal;

/**
 * @author sbqstart
 * @create 2022/4/20 - 21:35
 */
public interface SetmealService extends IService<Setmeal> {
   void saveWithDish(SetmealDto setmealDto);
}
