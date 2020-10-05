import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner( System.in);
    
  System.out.println("Please enter three integers on separate lines");

    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();

    if( num1 >= num2 && num1 >= num3)
     System.out.println(num1+" is the largest Number");

    else if (num2 >= num1 && num2 >= num3)
     System.out.println(num2+" is the largest Number");

    else
      System.out.println(num3+" is the largest Number");
  }
}

