/** Equation.java
  * Lab02
  * @Author : Burak Erdem Varol
  * @Date : 10.10.2016
  * Equation class has methods such as substract,add,gcd etc.
  */

public class Equation {
  
  /** @Param a : First number
    * @Param b : Second number
    * @Param c : Third number
    */
  private int a, b, c;
  
  /**
   * Setter
   * @param a
   * Setting parameter a
   */
  public void setA( int a ){
    this.a = a;
  }
  
  /**
   * Setter
   * @param b
   * Setting parameter b
   */
  public void setB( int b ){
    this.b = b;
  }
  
  /**
   * Setter
   * @param c
   * Setting parameter c
   */
  public void setC( int c ){
    this.c = c;
  }
  
  /**
   * Getter
   * @return integer : First number a
   */
  public int getA(){
    return a;
  }
  
  /**
   * Getter
   * @return integer : Second number b
   */
  public int getB(){
    return b;
  }
  
  /**
   * Getter
   * @return integer : Third number c
   */
  public int getC(){
    return c;
  }
  
  /*
   * Constructor
   * @param a : equation first number
   * @param b : equation second number
   * @param c : equation third number
   * Equation constructor creates equation object
   */
  public Equation(int a, int b, int c) {
    if (b < 0) {
      a = a * -1;
      b = b * -1;
      if (b < 0)
        b = b * -1;
      
      c = c * -1;
    }
    
    this.a = a;
    this.b = b;
    this.c = c;
  }
  
  /*
   * reduceEquation method
   * It is using gcd3 methods for result
   */
  public void reduceEquation(){
    int s = gcd3( a, b, c );
    if(s != 0){
      a = a / s;
      b = b / s;
      c = c / s;
    }
  }
  
  /*
   * add method
   * It is adding equations
   * @param equation eq : equation object
   * @return result : added equation
   */
  public Equation add( Equation eq){
    int fir = a + eq.getA();
    int sec = b + eq.getB();
    if( sec < 0 )
      sec = sec * -1;
    
    int thi = c + eq.getC();
    
    Equation result = new Equation( fir, sec, thi );
    result.reduceEquation();
    return result;
  }
  /**
   * subtract method
   * It is subtract equations
   * @param eq : equation object
   * @return equation object subtracted
   */
  public Equation subtract( Equation eq ){
    int fir = a - eq.getA();
    int sec = b - eq.getB();
    if (sec < 0)
      sec = sec * -1;
    
    int thi = c - eq.getC();
    
    Equation result = new Equation( fir, sec, thi );
    result.reduceEquation();
    return result;
  }
  
  /**
   * gcd method
   * @param num1 : first number
   * @param num2 : second number
   * @return result :  gcd that takes two integers and finds their greatest common divisor
   */
  public int gcd( int num1, int num2 ) {
    
    int result;
    int max = 0;
    int min = 0;
    
    if (num1 == num2){
      max = num1;
      min = num2;
    }
    else if (num1 > num2){
      max = num1;
      min = num2;
    }
    else if (num2 > num1){
      max = num2;
      min = num1;
    }
    while( min != 0 ){
      int res = min;
      min = max % min;
      max = res;
    }
    return max;
  }
  
  /*
   * gcd3 method
   * gcd3 method that takes three integers and finds their greatest common divisor
   * @return integer representation of the method
   */
  public int gcd3 ( int a, int b, int c ){
    int result = 0;
    result = gcd( gcd ( a, b ), c);
    if(result < 0)
      result = result * -1;
    
    return result;
  }
  /*
   * toString method
   * @return string representation of the method
   */
  public String toString(){ 
    String result = a + " = ";
    if ( b != 0 )
      if ( b != 1)
      result += b + "x";
    else 
    {
      result += "x";
    }
    if(b != 0 && c > 0)
      result += " + ";
    
    if( c != 0 )
      result += c;
    
    if (b == 0 && c == 0){
      result += 0;
    }
    
    return result;
    
  }
}
