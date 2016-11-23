package com.xugc.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 接口授权拦截器
 * Created by xuguocheng on 2016/11/23.
 */
public class AuthInterceptor implements HandlerInterceptor {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.debug("preHandle,uri:{}", request.getRequestURI());
        String accessToken = request.getParameter("access_token");
        if (accessToken == null || accessToken.length() == 0) {
            logger.debug("preHandle,result:{}",false);
            throw new Exception("没有授权信息!");
        }
        logger.debug("preHandle,result:{}",true);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.debug("postHandle,uri:{}", request.getRequestURI());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.debug("afterCompletion,uri:{}", request.getRequestURI());
    }
}
