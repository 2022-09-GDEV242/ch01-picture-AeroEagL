
/**
 * This class presents a picture of a surprised bunny, and draws itself 
 * on a canvas.
 * @version Sept 11 2022
 * @author Colin Francis
 */
import java.util.Scanner;
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    
    private Triangle nose;
    private Triangle leftEar;
    private Triangle rightEar;
    private Circle tail;
    private Circle body;
    private Circle head;
    private Circle leftEye;
    private Circle rightEye;
    private Circle mouth;
    private Square hindLegs;
    private Square frontLegs;
    private Square grass;
    
    private boolean drawn;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Picture pictureDraw = new Picture();
        String userInput;
        pictureDraw.draw();
        do{
            do{
            System.out.println("Type 'blackwhite' if you want to swap to" 
               + " black and white version of picture. Type 'stop' to"
               + " stop the bunny from changing colors!");
            userInput = input.nextLine();
            }
            while(!userInput.equalsIgnoreCase("blackwhite") &&
                !userInput.equalsIgnoreCase("stop"));
            
            if(userInput.equalsIgnoreCase("stop"))
            {

            }
            else if(userInput.equalsIgnoreCase("blackwhite"))
            {
                while(!userInput.equalsIgnoreCase("colorful") && 
                    !userInput.equalsIgnoreCase("stop"))
                {
                    pictureDraw.setBlackAndWhite();
                    System.out.println("Swapped to black and white version");
                    System.out.println("If you want to swap back to colorful version,"
                        + " type 'colorful'. Type 'stop' to stop the bunny from"
                        + "changing colors!");
                    userInput = input.nextLine();
                    if(userInput.equalsIgnoreCase("colorful"))
                    {
                        pictureDraw.setColor();
                        System.out.println("Swapped to colorful version");
                    }
                }
            }
        }
        while(!userInput.equalsIgnoreCase("stop"));
    }
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        hindLegs = new Square();
        frontLegs = new Square();
        grass = new Square();
        nose = new Triangle();
        rightEar = new Triangle();
        leftEar = new Triangle();
        body = new Circle();
        head = new Circle();
        tail = new Circle();
        leftEye = new Circle();
        rightEye = new Circle();
        mouth = new Circle();
        
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            body.changeColor("grey");
            body.moveHorizontal(0);
            body.moveVertical(0);
            body.changeSize(120);
            body.makeVisible();
            
            hindLegs.changeColor("darkgrey");
            hindLegs.moveHorizontal(-65);
            hindLegs.moveVertical(65);
            hindLegs.changeSize(30);
            hindLegs.makeVisible();
            
            frontLegs.changeColor("darkgrey");
            frontLegs.moveHorizontal(-5);
            frontLegs.moveVertical(65);
            frontLegs.changeSize(30);
            frontLegs.makeVisible();
            
            
            head.changeColor("darkgrey");
            head.moveHorizontal(70);
            head.moveVertical(-5);
            head.changeSize(60);
            head.makeVisible();
            
            tail.changeColor("lightgrey");
            tail.moveHorizontal(-10);
            tail.moveVertical(40);
            tail.changeSize(40);
            tail.makeVisible();
            
            leftEye.changeColor("skyblue");
            leftEye.moveHorizontal(85);
            leftEye.moveVertical(10);
            leftEye.changeSize(10);
            leftEye.makeVisible();
            
            rightEye.changeColor("skyblue");
            rightEye.moveHorizontal(105);
            rightEye.moveVertical(10);
            rightEye.changeSize(10);
            rightEye.makeVisible();
            
            leftEar.changeColor("lightgrey");
            leftEar.moveHorizontal(105);
            leftEar.moveVertical(-60);
            leftEar.changeSize(15,15);
            leftEar.makeVisible();
            
            rightEar.changeColor("lightgrey");
            rightEar.moveHorizontal(135);
            rightEar.moveVertical(-60);
            rightEar.changeSize(15,15);
            rightEar.makeVisible();   
            
            nose.changeColor("pink");
            nose.moveHorizontal(120);
            nose.moveVertical(-30);
            nose.changeSize(10,15);
            nose.makeVisible();
            
            mouth.changeColor("white");
            mouth.moveHorizontal(94);
            mouth.moveVertical(35);
            mouth.changeSize(12);
            mouth.makeVisible();
            
            grass.changeColor("green");
            grass.moveHorizontal(-400);
            grass.moveVertical(90);
            grass.changeSize(1000);
            grass.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        body.changeColor("black");
        hindLegs.changeColor("black");
        frontLegs.changeColor("black");
        head.changeColor("black");
        tail.changeColor("black");
        leftEye.changeColor("white");
        rightEye.changeColor("white");
        leftEar.changeColor("black");
        rightEar.changeColor("black");
        nose.changeColor("white");
        mouth.changeColor("white");
        grass.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        body.changeColor("orange");
        hindLegs.changeColor("darkgrey");
        frontLegs.changeColor("darkgrey");
        head.changeColor("darkgrey");
        tail.changeColor("lightgrey");
        leftEye.changeColor("skyblue");
        rightEye.changeColor("skyblue");
        leftEar.changeColor("lightgrey");
        rightEar.changeColor("lightgrey");
        nose.changeColor("pink");
        mouth.changeColor("white");
        grass.changeColor("green");
    }
}
