package main.com.myblog.mapper;

import main.com.myblog.model.VO.User;
import org.apache.ibatis.annotations.Param;


/**
 * @author SquirrelChen
 */
public interface UserMapper {

    /**
     *  getUserVO
     * @param userId
     * @return User
     */
    User selectUserVOById(@Param("userId")long userId);

}
