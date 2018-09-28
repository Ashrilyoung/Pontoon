/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pontoon;

/**
 *
 * @author dwarfonfire
 */
public class GetResult {
    
        public static boolean getResult(int z){                   //function to generate boolean based off the passed total number
            boolean result;                              //create boolean for result
            if(z > 19 && z <= 21){                       //if for passed int being greater than 19 and less than or equal to 21
                result = true;                         //set result to true
            }else{
                result = false;                  //set result to false
            }
            return result;                       //return boolean result 
        } 
}
