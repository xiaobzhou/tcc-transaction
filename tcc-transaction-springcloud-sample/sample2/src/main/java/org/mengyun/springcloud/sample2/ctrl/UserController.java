package org.mengyun.springcloud.sample2.ctrl;

import org.mengyun.springcloud.sample2.entity.Result;
import org.mengyun.springcloud.sample2.entity.UserParamWarp;
import org.mengyun.springcloud.sample2.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userCtrl")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping(path = "/save")
    public Result save(@RequestBody UserParamWarp userParamWarp) {
        Result result = new Result();
        try {
            userService.save(userParamWarp.getTransactionContext(), userParamWarp.getUser());
            result.setSuccess(true);
            result.setMessage("success");
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage(e.getMessage());
        }
        return result;
    }

    @PostMapping(path = "/confirmSave")
    public Result confirmSave(@RequestBody UserParamWarp userParamWarp) {
        Result result = new Result();
        try {
            userService.confirmSave(userParamWarp.getTransactionContext(), userParamWarp.getUser());
            result.setSuccess(true);
            result.setMessage("success");
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage(e.getMessage());
        }
        return result;
    }

    @PostMapping(path = "/cancelSave")
    public Result cancelSave(@RequestBody UserParamWarp userParamWarp) {
        Result result = new Result();
        try {
            userService.cancelSave(userParamWarp.getTransactionContext(), userParamWarp.getUser());
            result.setSuccess(true);
            result.setMessage("success");
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage(e.getMessage());
        }
        return result;
    }
}