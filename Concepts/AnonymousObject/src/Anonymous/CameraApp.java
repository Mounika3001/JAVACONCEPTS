package Anonymous;

import java.util.Scanner;

public class CameraApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Camera c=new Camera();
	System.out.println("Enter the camera brand name");
	c.brand=scan.next("Enter the camera color");
	System.out.println();
	c.color=scan.next();
    System.out.println("Enter the camera pixels ");
    c.px=scan.nextInt();
    System.out.println("================================");
    c.focus();
    System.out.println("================================");
    c.captureImage();
    System.out.println("================================");
    c.displayImage();
    scan.close();
    new Camera().displayImage();//Anonymous objects
	
}
}
