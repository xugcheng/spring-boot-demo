package com.xugc.user.action;

import com.xugc.user.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by Administrator on 2016/11/18.
 */
@Api(value = "用戶")
@RestController
@RequestMapping("/users")
public class UserController {

    static Map<Integer, User> users = Collections.synchronizedMap(new HashMap<Integer, User>());

    @ApiOperation(value = "查询用户列表")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<User> getUserList() {
        return new ArrayList<User>(users.values());
    }

    @ApiOperation(value = "创建用户")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postUsers(@ModelAttribute User user) {
        users.put(user.getId(), user);
        return "success";
    }

    @ApiOperation(value = "获取用户详细信息")
    @ApiImplicitParam(name = "id",value = "用户ID",required = true,dataType = "Long")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("id") Integer id) {
        return users.get(id);
    }

    @ApiOperation(value = "修改用户详细信息")
    @ApiImplicitParam(name = "id",value = "用户ID",required = true,dataType = "Long")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String putUser(@ModelAttribute User user, @PathVariable("id") Integer id) {
        User u = users.get(id);
        u.setNickName(user.getNickName());
        u.setPhone(user.getPhone());
        return "success";
    }

    @ApiOperation(value = "删除用户")
    @ApiImplicitParam(name = "id",value = "用户ID",required = true,dataType = "Long")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable("id") Integer id) {
        users.remove(id);
        return "success";
    }
}
