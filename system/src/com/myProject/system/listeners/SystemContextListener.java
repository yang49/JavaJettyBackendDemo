package com.myProject.system.listeners;

/**
 * Created by yang on 13/12/16.
 */

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SystemContextListener implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context initialized:"+sce.getServletContext().getContextPath());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context Destroyed:"+sce.getServletContext().getContextPath());
    }
}
