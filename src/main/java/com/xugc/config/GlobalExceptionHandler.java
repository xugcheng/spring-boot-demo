package com.xugc.config;

import com.xugc.index.domain.Result;
import com.xugc.index.exception.BusinessException;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2016/11/19.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    public static final String DEFAULT_ERROR_VIEW = "error";

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest request, Exception ex) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", ex);
        mav.addObject("url", request.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }

    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public Result<String> jsonErrorHandler(HttpServletRequest req, BusinessException e) throws Exception {
        Result<String> r = new Result<String>();
        r.setMessage(e.getMessage());
        r.setCode(Result.ERROR);
        r.setData("");
        r.setUrl(req.getRequestURL().toString());
        return r;
    }

}
