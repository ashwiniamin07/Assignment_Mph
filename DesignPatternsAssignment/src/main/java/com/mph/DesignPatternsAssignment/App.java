package com.mph.DesignPatternsAssignment;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Logger log1=Logger.getInstance();
       log1.log("Application started");
       System.out.println(log1.hashCode());
       Logger log2=Logger.getInstance();
       log2.log("Application started again");
       System.out.println(log2.hashCode());
       System.out.println(log1==log2);
    }
}
