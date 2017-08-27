package com.oms.contrller;

import com.oms.common.ClientRequest;
import com.oms.common.Constant;
import com.oms.common.ServerResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Jelly on 2017/8/27.
 */
@Controller
@RequestMapping(value = "/")
@SessionAttributes("")
@Slf4j
public class LogingContrller extends BaseController{


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody Object login(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {

        String sessionUser = null;
        modelMap.addAttribute(Constant.SESSIONUSER, sessionUser);
        request.getSession().setAttribute(Constant.SESSIONUSER, sessionUser);
        return null;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody ServerResponse<Object> aaa(@ModelAttribute Object user, @RequestBody ClientRequest<Object> str) {

        Object obj = parseOmniRequestData(str,Object.class);

        return null;
    }

}
