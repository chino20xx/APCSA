import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {  
    Color brown = new Color(143,71,9);
    World world = new World(500,500);
   
    Turtle yertle = new Turtle(world);
    Turtle burtle = new Turtle(world);
    Turtle curtle = new Turtle(world);
    Turtle durtle = new Turtle(world);
    
    // Add your code here
    //below is the code for the green square
    yertle.setBodyColor(Color.GREEN);
    yertle.setPenWidth(3);
    yertle.penUp();
    yertle.moveTo(100,200);
    yertle.penDown();
    for (int i=0; i<4; i++) {
      yertle.forward(100);
      yertle.turnRight();
    }
    //below is the code for the triangular roof above the square
    yertle.penUp();
    yertle.setBodyColor(brown);
    yertle.moveTo(100,100);
    yertle.penDown();
    yertle.turn(30);
    yertle.forward(100);
    yertle.turn(120);
    yertle.forward(100);

//below is code for the blue door
  yertle.setBodyColor(Color.BLUE);
  yertle.setPenWidth(2);
  yertle.penUp();
  yertle.moveTo(135,200);
  yertle.turn(-150);
  yertle.penDown();
  yertle.forward(40);
  yertle.turnRight();
  yertle.forward(30);
  yertle.turnRight();
  yertle.forward(40);

//below draws left black square
yertle.setBodyColor(Color.BLACK);
yertle.setPenWidth(2);
yertle.penUp();
yertle.moveTo(110,150);
yertle.penDown();
yertle.turn(180);
for (int i=0; i<4; i++) {
      yertle.forward(25);
      yertle.turnRight();
    }
yertle.penUp();
//below draws the right black square
yertle.moveTo(163,150);
yertle.setPenWidth(2);
yertle.penDown();
for (int i=0; i<4; i++) {
      yertle.forward(25);
      yertle.turnRight();
    }
//below draws the garage
yertle.setBodyColor(Color.CYAN);
yertle.setPenWidth(2);
yertle.penUp();
yertle.moveTo(200,140);
yertle.turn(90);
yertle.penDown();
yertle.forward(150);
yertle.turnRight();
yertle.forward(60);
yertle.turnRight();
yertle.forward(150);
//below makes the rectangle/garage into 3D
yertle.turnRight();
yertle.forward(55);
yertle.turn(30);
yertle.forward(40);
yertle.turn(60);
yertle.forward(150);
yertle.turn(120);
yertle.forward(40);
yertle.turn(180);
yertle.forward(40);
yertle.turn(150);
yertle.forward(55);
yertle.turn(30);
yertle.forward(40);
//below draws the door to the cyan garage
yertle.turn(60);
yertle.forward(20);
yertle.setBodyColor(Color.RED);
yertle.forward(90);
yertle.turnRight();
yertle.forward(35);
yertle.turnRight();
yertle.forward(80);
yertle.turnRight();
yertle.forward(35);

    world.setVisible(true);
  }
}
