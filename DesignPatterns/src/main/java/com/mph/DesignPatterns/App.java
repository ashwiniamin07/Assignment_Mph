package com.mph.DesignPatterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//      DBConnection conn1=DBConnection.getInstance();
//      System.out.println(conn1.hashCode());
//      DBConnection conn2=DBConnection.getInstance();
//      System.out.println(conn2.hashCode());
//      DBConnection conn3=DBConnection.getInstance();
//      System.out.println(conn3.hashCode());
    	
    	//Factory pattern
//    	Shape s1=ShapesFactory.getShape("circle");
//    	s1.draw();
//    	Shape s2=ShapesFactory.getShape("square");
//    	s2.draw();
    	
    	//Abstract Factory Pattern
//    	GUIFactory gui=new WinFactory();
//    	Button button=gui.createButton();
//    	
//    	CheckBox checkBox=gui.createCheckBox();
//    	button.click();
//    	checkBox.check();
    	
    	//Builder pattern
//    	Pizza pizza=new Pizza.Builder("medium")
//    			.cheese(true)
//    			.olives(false)
//    			.build();
//    	System.out.println(pizza);
    	
    	//Template method pattern-behavioral
//    	DrinkMaker tea=new TeaMaker();
//    	tea.prepareDrink();
//    	
//    	DrinkMaker coffee=new CoffeeMaker();
//    	coffee.prepareDrink();
    	
    	//structural pattern
    	//Bridge pattern
//    	
//    	Video youtubeHd=new YouTube(new HDProcessing());
//    	youtubeHd.playVideo();
//    	
//    	Video youtube4k=new YouTube(new FourKProcessing());
//    	youtube4k.playVideo();
    	
    	//Proxy pattern
    	
    	Payment netBanking=new NetBanking();
    	netBanking.pay(5000);
    	System.out.println("**********************");
    	Payment upi=new UpiPayment();
    	upi.pay(70000);
    	
    	
    	
    	
    }
}
