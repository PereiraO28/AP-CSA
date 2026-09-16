import java.util.*;

public class Kinematics {
  public static void main(String[] args) {
    Scanner readIn = new Scanner(System.in);

    System.out.print("Enter the initial velocity: ");
    double vi = readIn.nextDouble();

    System.out.print("Enter the time: ");
    double t = readIn.nextDouble();

    System.out.print("Enter the acceleration: ");
    double a = readIn.nextDouble();

    double delta_x = calcDisplacement(vi, t, a);
    System.out.println(delta_x);
    
  }
  
  public static double calcDisplacement(double v_initial, double time, double acceleration) {
    double dx = v_initial * time + 0.5 * acceleration * Math.pow(time, 2);
    return dx;
    
  }
  
}
