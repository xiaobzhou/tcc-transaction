package org.mengyun.springcloud.sample1.ctrl;

import org.mengyun.springcloud.sample1.entity.Result;
import org.mengyun.springcloud.sample1.entity.User;
import org.mengyun.springcloud.sample1.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/userCtrl")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(path = "/save")
    public Result save() {
        Result result = new Result();
        try {
            User user = new User();
            user.setId(UUID.randomUUID().toString());
            user.setName("foo");
            user.setAge(18);
            userService.save(user);
            result.setSuccess(true);
            result.setMessage("success");
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage(e.getMessage());
        }
        return result;
    }
}