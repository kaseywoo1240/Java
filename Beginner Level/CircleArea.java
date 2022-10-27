import java.io.*;
import java.lang.*;

public class CircleArea {

  public static void main(String[] args) {
    int r = 0;
        try {
          BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter Radius of Circle : ");
          r = Integer.parseInt(br1.readLine());
          double area = Math.PI*r*r;
          System.out.println("Area of Circle : " + area);
          double perimeter = 2 * Math.PI*r;
          System.out.println("Perimeter of Circle: " + perimeter);

        }
        catch(Exception e) {
          System.out.println("Error : " + e);
        }
  }
}
