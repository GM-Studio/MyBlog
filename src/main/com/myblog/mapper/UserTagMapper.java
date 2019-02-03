package main.com.myblog.mapper;

import main.com.myblog.model.VO.UserTag;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author SquirrelChen
 */
public interface UserTagMapper {

    /**
     *  selectUserTagVOById
     * @param userId
     * @return
     */
    List<UserTag> selectUserTagVOById(@Param("userId")long userId);

}
