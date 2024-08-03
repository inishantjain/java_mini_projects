package org.example;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
public class App{
    public static void main( String[] args ) throws LifecycleException  {
        System.out.println( "Hello World!" );

        Tomcat tomcat = new Tomcat();
//        tomcat.setPort(8080);
        Context context = tomcat.addContext("", null);
        Tomcat.addServlet(context, "HelloServlet", new HelloServlet());//the name HelloServlet need not be the actual name
        context.addServletMappingDecoded("/hello", "HelloServlet");

        tomcat.getConnector();//need to do in tomcat version >=9
        tomcat.start();
        tomcat.getServer().await();
    }
}
