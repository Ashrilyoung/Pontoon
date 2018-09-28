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
public class RandomNumber {
    
        public static int getRandomNumber(){        //function to generate random numbers 
            int random = 0;                         // set variable to 0
            random = (int)(Math.random()*10) + 1;        //generate random number between 1 and 10
            return random;                              //return random number
        }
}
