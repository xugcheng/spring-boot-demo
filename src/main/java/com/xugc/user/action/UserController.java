package com.xugc.user.action;

import com.xugc.user.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by Administrator on 2016/11/18.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    static Map<Integer, User> users = Collections.synchronizedMap(new HashMap<Integer, User>());

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<User> getUserList() {
        return new ArrayList<User>(users.values());
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postUsers(@ModelAttribute User user) {
        users.put(user.getId(), user);
        return "success";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("id") Integer id) {
        return users.get(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String putUser(@ModelAttribute User user, @PathVariable("id") Integer id) {
        User u = users.get(id);
        u.setNickName(user.getNickName());
        u.setPhone(user.getPhone());
        return "success";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable("id") Integer id) {
        users.remove(id);
        return "success";
    }
}
