/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.handling;

import static string.handling.BinaryToDecimal.getDecimal;

/**
 *
 * @author pc
 */
public class StringHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Decimal of 1011 is: "+getDecimal(1011));  
        System.out.println("Decimal of 1234 is: "+getDecimal(1234));  

    }

}
 class BinaryToDecimal{    
  public  static int getDecimal(int binary){  
    int decimal = 0;  
    int n = 0;  
    while(true){  
      if(binary == 0){  
        break;  
      } else {  
          int temp = binary%10;  
          decimal += temp*Math.pow(2, n);  
          binary = binary/10;  
          n++;  
       }  
    }  
    return decimal;  
}
 }
        
    
    

