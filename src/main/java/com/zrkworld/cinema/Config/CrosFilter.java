//package com.zrkworld.cinema.Config;
//
//import org.springframework.http.HttpStatus;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * Created by 关 on 2020/10/20 10:10
// */
//public class CrosFilter implements javax.servlet.Filter {
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletResponse response = (HttpServletResponse)servletResponse;
//        HttpServletRequest request = (HttpServletRequest)servletRequest;
//
////        response.setHeader("Access-Control-Allow-Origin", "*");
////        response.setHeader("Access-Control-Allow-Credentials", "true");
////        response.setHeader("Access-Control-Allow-Methods", "*");
////        response.setHeader("Access-Control-Allow-Headers", "Content-Type,Access-Token");//这里“Access-Token”是我要传到后台的内容key
////        response.setHeader("Access-Control-Expose-Headers", "*");
////
////        if (!"OPTIONS".equals(request.getMethod())) {
////            boolean allowedPath = ALLOWED_PATHS.c
////        }
//        try {
//
//            //跨域
//            response.setHeader("Access-Control-Allow-Origin", "*");
//            //跨域 Header
//            response.setHeader("Access-Control-Allow-Methods", "*");
//
//            response.setHeader("Access-Control-Allow-Headers", "Content-Type,XFILENAME,XFILECATEGORY,XFILESIZE");
//
//            // 浏览器是会先发一次options请求，如果请求通过，则继续发送正式的post请求
//
//            // 配置options的请求返回
//
//            if (request.getMethod().equals("OPTIONS")) {
//
//                response.setStatus(200);
//
//                // hresp.setContentLength(0);
//
//                response.getWriter().write("OPTIONS returns OK");
//
//                return;
//
//            }
//
//            // Filter 只是链式处理，请求依然转发到目的地址。
//
//            filterChain.doFilter(request, response);
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//        }
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//}
