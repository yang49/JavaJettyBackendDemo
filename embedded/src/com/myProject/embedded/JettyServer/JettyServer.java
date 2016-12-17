package com.myProject.embedded.JettyServer;

/**
 * Created by yang on 13/12/16.
 */



import org.eclipse.jetty.server.Server;
//import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.webapp.WebAppContext;


public class JettyServer {

    public static void main(String[] args) {
        try {
            int port = 8080;
            Server server = new Server(port);
            WebAppContext context = new WebAppContext();
            String dir = System.getProperty("user.dir");
            dir = dir + "/embedded/web/";
            System.out.println(dir);

            String descriptor = dir+"/WEB-INF/web.xml";
            System.out.println("descriptor -> " + descriptor);

            context.setDescriptor(descriptor);
            context.setDefaultsDescriptor(dir + "/WEB-INF/webdefault.xml");
            context.setResourceBase(dir);
            context.setContextPath("/yang");

            server.setHandler(context);

            server.start();
            server.join();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
