package com.xiangxue;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ThreadPoolExecutor;

/**
 *类说明：servlet3异步任务
 */
public class AsyncServletDemo {

//    //监听器里初始化线程池
//    static class listener implements ServletContextListener{
//
//        public void contextInitialized(ServletContextEvent sce) {
//            //初始化
//        }
//
//        public void contextDestroyed(ServletContextEvent sce) {
//            //销毁线程池
//
//        }
//    }
//
//    class work implements Runnable{
//
//        public void run() {
//            //do business work
//            //AsyncContext
//            //get response
//        }
//    }
//
//    //3
//    class AsnycLi implements AsyncListener{
//
//        public void onComplete(AsyncEvent event) throws IOException {
//
//        }
//
//        public void onTimeout(AsyncEvent event) throws IOException {
//
//        }
//
//        public void onError(AsyncEvent event) throws IOException {
//
//        }
//
//        public void onStartAsync(AsyncEvent event) throws IOException {
//
//        }
//    }
//
//    //4
//    RequestMapping("/....")
//    void getUserRequest(){
//        AsyncContext = requset.getAsyncContext
//        set(AsnycLi);
//    }


}
