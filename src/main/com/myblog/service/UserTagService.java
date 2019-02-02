package main.com.myblog.service;

import main.com.myblog.model.VO.UserTag;
import java.util.List;

public interface UserTagService {
   public  List<UserTag> getUserTagVO(long user_id);
}
