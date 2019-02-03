package main.com.myblog.service.serviceimpl;

import main.com.myblog.mapper.UserMapper;
import main.com.myblog.model.VO.User;
import main.com.myblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserVO(long user_id) {
        return userMapper.selectUserVOById(user_id);
    }
}
