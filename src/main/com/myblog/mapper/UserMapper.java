package main.com.myblog.mapper;

import main.com.myblog.model.VO.User;
import main.com.myblog.model.VO.UserTag;

import java.util.List;

public interface UserMapper {

    public User getUserVO(long user_id);

//    public List<UserTag> getUserTagVO(long user_id);
}
