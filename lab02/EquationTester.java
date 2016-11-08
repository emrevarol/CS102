/** EquationTester.java
  * Lab02
  * @Author : Burak Erdem Varol
  * @Date : 10.10.2016
  * EquationTester class is doing some equations such as substract,add,gcd etc.
  */

import java.util.Scanner;
public class EquationTester {
  
  public static void main(String[] args) {
    
    int a1, a2;
    int b1, b2;
    int c1, c2;
    Equation equation1, equation2;

    Scanner scan = new Scanner(System.in);
    /*
     * Scanning user inputs
     */
    System.out.print("Enter the value of a, b and c for first equation: ");
    a1 = scan.nextInt();
    b1 = scan.nextInt();
    c1 = scan.nextInt();
    /*
     * first equation object creating
     */
    equation1  = new Equation(a1, b1, c1);
    /*
     * reduce equation method is running
     */
    equation1.reduceEquation();
    
    System.out.print("Enter the value of a, b and c for second equation: ");
    a2 = scan.nextInt();
    b2 = scan.nextInt();
    c2 = scan.nextInt();
    /*
     * second equation object creating
     */
    equation2 = new Equation(a2, b2, c2);
    /*
     * reduce equation method is running
     */
    equation2.reduceEquation();
    System.out.println(equation2);
    
    /*
     * Printing all needed
     */
    System.out.println("*******************");
    System.out.println("First equation: " + equation1);
    System.out.println("Second equation: " + equation2);
    System.out.println("*******************");
    System.out.println("Sum of the equation: " + (equation1.add(equation2)));
    System.out.println("Subtraction of the equations: " + (equation1.subtract(equation2)));
    
  }
}
