package com.itheima.reggie.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.reggie.common.R;
import com.itheima.reggie.dto.DishDto;
import com.itheima.reggie.entity.Dish;
import com.itheima.reggie.mapper.DishMapper;
import com.itheima.reggie.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author sbqstart
 * @create 2023/3/10 - 12:56
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    DishService dishService;
    @Autowired
    DishMapper dishMapper;

    @GetMapping("/list")
    public List<DishDto> list() {
        return dishService.getDtoList();
    }

    @GetMapping("/page")
    public Page page() {
        Page<DishDto> pageInfo = new Page<>(1, 10);
        dishService.page1(pageInfo);
        return pageInfo;
    }

    @GetMapping("/all")
    public List<DishDto> getAllDtoList() {
        return dishMapper.getAllDishDto();
    }
    @GetMapping("/one")
    public Dish getDishByName(String name) {
        return dishMapper.getDishByName(name);
    }
}
