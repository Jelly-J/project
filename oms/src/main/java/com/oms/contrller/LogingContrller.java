package com.oms.contrller;

import com.oms.common.ClientRequest;
import com.oms.common.Constant;
import com.oms.common.ServerResponse;
import com.oms.entity.AccountInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Jelly on 2017/8/27.
 */
//@RequestMapping(value = "/login")
@SessionAttributes(Constant.SESSIONUSER)
@Slf4j
@Controller
public class LogingContrller extends BaseController {


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody
    ServerResponse<Object> login(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        ServerResponse<Object> serverResponse = new ServerResponse<>();
        AccountInfo sessionUser = new AccountInfo();
        //modelMap.addAttribute(Constant.SESSIONUSER, sessionUser);
        request.getSession().setAttribute(Constant.SESSIONUSER, sessionUser);
        serverResponse.setData(sessionUser);
        log.info("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        return serverResponse;
    }

    @RequestMapping(value = "/signout", method = RequestMethod.POST)
    public @ResponseBody
    ServerResponse<Object> signout(@ModelAttribute AccountInfo user, @RequestBody ClientRequest<String> str) {
        ServerResponse<Object> serverResponse = new ServerResponse<>();
        String obj = parseOmniRequestData(str, String.class);
        log.info(obj.toString());
        serverResponse.setData(obj);
        return serverResponse;
    }

}
