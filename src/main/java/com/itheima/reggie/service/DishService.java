package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.common.R;
import com.itheima.reggie.dto.DishDto;
import com.itheima.reggie.entity.Dish;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author sbqstart
 * @create 2022/4/20 - 21:33
 */
public interface DishService extends IService<Dish> {
    public void saveWithFlavor(DishDto dishDto);
    public DishDto getByIdWithFlavor(Long id);
    public Page page1(Page<DishDto> page);
    public List<DishDto> getDtoList();
    public List<DishDto> getAllDishDto();
}
