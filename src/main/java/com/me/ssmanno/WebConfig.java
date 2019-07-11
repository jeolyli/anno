package com.me.ssmanno;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletRegistration;

public class WebConfig implements WebApplicationInitializer{
    public void onStartup(javax.servlet.ServletContext servletContext) {
        //1.加载spring容器
        AnnotationConfigWebApplicationContext ctx =
                new AnnotationConfigWebApplicationContext();
        ctx.register(MyConfig.class);
        ctx.setServletContext(servletContext);

        //2.把dispathcherServlet创建出来
        DispatcherServlet dispatcherServlet =
                new DispatcherServlet();
        dispatcherServlet.setApplicationContext(ctx);
        ServletRegistration.Dynamic springmvc = servletContext.addServlet("springmvc", dispatcherServlet);
        springmvc.addMapping("/");
        springmvc.setLoadOnStartup(1);
    }
}
