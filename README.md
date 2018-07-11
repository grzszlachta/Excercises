# Excercises
Excercises and part of homeworks

import java.lang.Math.*;

public class AreTheSame
  
{
  /*
  Given two arrays a and b write a function comp(a, b) (compSame(a, b) in Clojure) 
  that checks whether the two arrays have the "same" elements, with the same multiplicities. 
  "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.
  */
 
  public static void main(String[] args)
  {
    int [] a = {121, 144, 19, 161, 19, 144, 19, 11};
    int [] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        
    comp (a, b);
   
  }

public static boolean comp (int[] inputA, int[] inputB){
  boolean result = false;
  int counter = 0;
  for (int i=0; i<inputA.length; i++){
    for (int j=0; i<inputB.length; j++){
      if (Math.pow(inputA[i], 2) == inputB[j]){
        result=true;
      } else {counter++;}
      if (counter == inputA.length){
        result = false;
        break;        
      }
    }
  } 
    
  return result;  
  
}
}
