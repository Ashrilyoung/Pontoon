/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pontoon;

import java.util.Scanner;

/**
 *
 * @author 16007873
 */
public class Pontoon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
{

    
        //initialising variables
    
        String choice = "";                             //string to store the users card choices
        int[] cards = new int[10];                      //array to store cards that have been picked
        int card1=0;                                    //integer to store users first card
        int card2=0;                                    //integer to store users second drawn card
        int newcard=0;                                  //int to store the next drawn card number
        int total=0;                                    //int to store the total card numbers
        boolean result;                                 //boolean to store the outcome 
        boolean busted;                                 //boolean to store whether or not the total card number is over 21
        int nocards=2;                                  //start nocards at 2
        int[][] cardchoices = new int[5][10];           //2d array to hold game number and card choice
        int gameno = 1;                                 //game number
        
            
            //initialise card numbers
            
            card1 = RandomNumber.getRandomNumber();                  //call getRandomNumber to generate a random nuber to be assigned to card1
            card2 = RandomNumber.getRandomNumber();                  //call getRandomNumber to generate a random nuber to be assigned to card2
            System.out.print(card1+" ");                //print result of random generation (for testing)
            System.out.print(card2+" ");                //print result of random generation (for testing)
            total = CalcTotal.calcTotal(card1, card2);            //generate the total number of card1 + card2
            System.out.print(total+" ");                //print result of calcTotal (for testing)
            cards[0] = card1;                           //set first cards value to the value of card1
            cards[1] = card2;                           //set first cards value to the value of card2
            
            
            
            //keyboard input
            
            Scanner kboard = new Scanner(System.in);                //keyboard scanner to listen for keypresses
            System.out.println("Do you wish to continue y/n?");     //display a message for user
            choice = kboard.next();                                 //stores the most recent keyboard press in the choice variable
            while (choice.equalsIgnoreCase("y"))                    //while choice variable is y
                {
                System.out.println("Do you wish to continue y/n?"); //display a message for user
                newcard = RandomNumber.getRandomNumber();                        //generate a random number to be stored in newcard
                total = newcard + total;                            //add newcard to total
                System.out.print(total+" ");                        //display the current contents of total
                choice = kboard.next();                             //assign the next keyboard press to the choice variable
                cards[nocards] = newcard;                           //set cards at nocards to newcard
                cardchoices[gameno][nocards] = newcard;             //set cardschoices at nocards and gamenumber to newcard
                nocards = nocards + 1;                              //add one to nocards representing another card ready to be drawn
                }
                
            
            //results of game
            
            busted = Busted.busted(total);              //pass the total to busted so it can return a boolean value based on the total
            result = GetResult.getResult(total);           //pass the total to getResult so it can return a boolean value based on the total
            
            if(busted == true){                   //if the busted boolean is set to true
            
                System.out.print("Busted! your cards equal " + total + " which is over 21. ");   //print message for user
                
            }
            if(result == true){                 //if the result boolean is set to true
            
                System.out.print("You have Won. ");     //print message for user

            }
            else if(result == false && busted == false){         //if the result boolean and busted boolean are both false 
                
                System.out.print("You have lost.");       //print message for user
                gameno = gameno + 1;

            }
            
            System.out.print("Your Cards Were: ");  //print message for user
                
                for (int x=0;x<nocards;x++){             //repeat for as many objects that have been stored in array
                    
                    System.out.print(cards[x]+",");    //print out card numbers
                
                }

}

     
    
}
