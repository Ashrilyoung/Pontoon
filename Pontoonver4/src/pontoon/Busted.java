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
public class Busted {
        
        public static boolean busted(int z){                            //function to generate boolean based off the passed total number
            boolean busted;                           //create boolean for result
            if(z > 21){                        //if passed int is greater than 21 
                busted = true;                //set boolean to true
            }else{
                busted = false;            //set boolean to false
            }
            return busted;                      //return boolean result 
        }
    
}
