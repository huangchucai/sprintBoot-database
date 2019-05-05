package hello.mapper;
import hello.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM  user where id = #{id}")
    User findUserById(@Param("id") Integer id);

    @Select("SELECT * FROM user where username = #{username}")
    User findUserByUsername(@Param("username") String username);

    @Insert("INSERT INTO user(username, encrypted_password, create_at, update_at)" +
            "values (#{username}, #{encryptedPassword}, now(), now())")
    void save(@Param("username") String username, @Param("encryptedPassword") String encryptedPassword);
}
