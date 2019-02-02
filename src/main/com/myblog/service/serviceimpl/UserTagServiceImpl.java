package main.com.myblog.service.serviceimpl;

import main.com.myblog.model.VO.UserTag;
import main.com.myblog.service.UserTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserTagServiceImpl implements UserTagService {





    @Override
    public List<UserTag> getUserTagVO(long user_id) {
        return null;
    }
}
