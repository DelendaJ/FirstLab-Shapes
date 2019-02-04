
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square body;
    private Square window;
    private Triangle roof1;
    private Circle snow;
    private Square chimney1;
    private Square chimney2;
    private Square chimney3;
    private Square fire;
    private Square fire2;
    private Square fire3;
    private Square fire4;
    private Square door1;
    private Square door2;
    private Square door3;
    private Triangle door4;
    private Square door4real;
    private Square door5;
    private Square door6;
    private Circle knob;
    
    
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        roof1 = new Triangle();
        roof1.changeSize(100,250);
        roof1.makeVisible();
        roof1.changeColor("magenta");
        roof1.moveHorizontal(158);
        roof1.moveVertical(35);
        
        body = new Square();
        body.changeColor("black");
        body.changeSize(200);
        body.moveHorizontal(60);
        body.moveVertical(130);
        body.makeVisible();

        snow = new Circle();
        snow.changeSize(30);
        snow.makeInvisible();
        snow.changeColor("blue");
        snow.moveHorizontal(20);
        snow.moveVertical(60);
        
        chimney1 = new Square();
        chimney1.changeColor("green");
        chimney1.changeSize(30);
        chimney1.moveHorizontal(220);
        chimney1.moveVertical(70);
        chimney1.makeVisible();
        
        chimney2 = new Square();
        chimney2.changeColor("green");
        chimney2.changeSize(30);
        chimney2.moveHorizontal(220);
        chimney2.moveVertical(90);
        chimney2.makeVisible();
        
        chimney3 = new Square();
        chimney3.changeColor("green");
        chimney3.changeSize(30);
        chimney3.moveHorizontal(220);
        chimney3.moveVertical(50);
        chimney3.makeVisible();
        
        fire = new Square();
        fire.changeColor("yellow");
        fire.changeSize(20);
        fire.moveHorizontal(220);
        fire.moveVertical(30);
        fire.makeVisible();
        
        fire2 = new Square();
        fire2.changeColor("red");
        fire2.changeSize(20);
        fire2.moveHorizontal(230);
        fire2.moveVertical(30);
        fire2.makeVisible();
        
        fire3 = new Square();
        fire3.changeColor("yellow");
        fire3.changeSize(20);
        fire3.moveHorizontal(240);
        fire3.moveVertical(30);
        fire3.makeVisible();
        
        fire4 = new Square();
        fire4.changeColor("red");
        fire4.changeSize(30);
        fire4.moveHorizontal(60);
        fire4.moveVertical(50);
        fire4.makeInvisible();
        
        door1 = new Square();
        door1.changeColor("red");
        door1.changeSize(30);
        door1.moveHorizontal(120);
        door1.moveVertical(210);
        door1.makeVisible();
        
        door2 = new Square();
        door2.changeColor("red");
        door2.changeSize(30);
        door2.moveHorizontal(140);
        door2.moveVertical(210);
        door2.makeVisible();
        
        door3 = new Square();
        door3.changeColor("red");
        door3.changeSize(30);
        door3.moveHorizontal(160);
        door3.moveVertical(210);
        door3.makeVisible();
        
        door4 = new Triangle();
        door4.changeSize(30,40);
        door4.makeInvisible();
        door4.changeColor("green");
        door4.moveHorizontal(50);
        door4.moveVertical(15);
        
        door4real = new Square();
        door4real.changeColor("red");
        door4real.changeSize(70);
        door4real.moveHorizontal(120);
        door4real.moveVertical(230);
        door4real.makeVisible();
        
        door5 = new Square();
        door5.changeColor("red");
        door5.changeSize(30);
        door5.moveHorizontal(60);
        door5.moveVertical(50);
        door5.makeVisible();
        
        door6 = new Square();
        door6.changeColor("red");
        door6.changeSize(30);
        door6.moveHorizontal(60);
        door6.moveVertical(50);
        door6.makeInvisible();
        
        knob = new Circle();
        knob.changeColor("black");
        knob.changeSize(10);
        knob.moveHorizontal(170);
        knob.moveVertical(260);
        knob.makeVisible();
        
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
   
    }

}
