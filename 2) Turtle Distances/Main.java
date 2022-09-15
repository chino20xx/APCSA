import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {  
    World world = new World(300,300);
   
     
    Turtle yertle = new Turtle(world);
    Turtle scurtle=new Turtle(world);

    yertle.forward(50);
    yertle.turn(90);
    yertle.forward(25);
System.out.println(yertle.getDistance(0,0));
    
    //System.out.println(yertle.getDistance((0,0));
    // Add your code here
    scurtle.turn(180);
    scurtle.forward(75);
    double distance = yertle.getDistance(scurtle.getXPos(), scurtle.getYPos());
      
      //(scurtle.xPos(), scurtle.yPos());
    System.out.println(distance);

  
    world.setVisible(true);
  }
}
