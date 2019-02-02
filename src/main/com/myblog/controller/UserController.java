package main.com.myblog.controller;

import com.alibaba.fastjson.JSON;
import main.com.myblog.model.VO.User;
import main.com.myblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    private String message;

    private int code;

    private Map resultmap=new HashMap<>();


    @RequestMapping(value = "/user/{user_id}",method = RequestMethod.GET)
    @ResponseBody
    public Object userVO(@PathVariable("user_id")long user_id)
    {
        User user=userService.getUserVO(user_id);
        if(user!=null)
        {
            resultmap.put("data",user);
            code=200;
            message="SUCCESS There are have data";
            resultmap.put("code",code);
            resultmap.put("msg",message);
            return JSON.toJSON(resultmap);
        }
        code=0;
        message="ERROR There are not data";
        resultmap.put("code",code);
        resultmap.put("msg",message);
        return JSON.toJSON(resultmap);
    }

}
