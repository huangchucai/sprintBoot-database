package hello.mapper;

import hello.services.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM  user where id = #{id}")
    User findUserById(@Param("id") Integer id);
}
