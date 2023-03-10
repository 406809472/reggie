package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author sbqstart
 * @create 2022/4/15 - 22:58
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
