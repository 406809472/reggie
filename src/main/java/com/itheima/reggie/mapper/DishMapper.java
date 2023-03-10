package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.reggie.common.R;
import com.itheima.reggie.dto.DishDto;
import com.itheima.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author sbqstart
 * @create 2022/4/20 - 21:32
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
    @Select("select a.*,b.name from dish a join category b on a.category_id = b.id")
    public Page page1(Page<DishDto> page);

    @Select("select a.*,b.name categoryName from dish a join category b on a.category_id = b.id")
    public List<DishDto> getDtoList();

    public List<DishDto> getAllDishDto();
    public Dish getDishByName(@Param("name") String name);
}
