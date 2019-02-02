package main.com.myblog.mapper;

import main.com.myblog.model.VO.UserTag;

import java.util.List;

public interface UserTagMapper {

    public List<UserTag> getUserTagVO(long user_id);

}
