package com.lll.interceptor.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import sun.rmi.runtime.Log;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@Slf4j
@Component
public class MyInterceptor implements HandlerInterceptor {
    //请求处理前，也就是访问Controller前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String num = request.getParameter("num");
        if(num==null){
            System.out.println("请求被拦截器拦截了");
            return false;
        }else {
            return true;
        }
    }
    //请求已经被处理，但在视图渲染前
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("请求处理结束了");
    }
    //请求结果结果已经渲染好了，但是没有返回结果也无法修改reponse了（一般用于清理数据）
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
