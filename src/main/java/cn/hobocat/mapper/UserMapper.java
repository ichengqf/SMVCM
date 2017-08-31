package cn.hobocat.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


import cn.hobocat.model.User;

public interface UserMapper {
	
	@Select("select * from t_user where username=#{un} and password=#{pw}")
    @Results({
		
		@Result(id=true,property="id",column="id",javaType=Integer.class),
		@Result(property="username",column="username",javaType=String.class),
		@Result(property="password",column="password",javaType=String.class),
		@Result(property="account",column="account",javaType=Double.class)
	})
	public User login(@Param("un")String username,@Param("pw")String password);
	
	//商品查询列表
	public List<User> findUserList(User user)throws Exception;
}