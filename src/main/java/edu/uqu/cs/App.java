package edu.uqu.cs;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/


public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/

/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/
 
    public static void main(String [] args) {
        

        public static void twisters(){
        for (int i=1;i<=110;i++){
            if (i%2==0){
                System.out.print("Tweetle"); 
            }
            if (i%4==0){
                System.out.print("Beetle");
            }
            if (i%6==0){
                System.out.print("Poodle");
            } 
            if (i%2!=0 && i%4!=0 && i%6!=0) {
                System.out.print(i); 
            } 
            for (int num=1;num<=10;num++)
                if (i==11*num){
                    System.out.println("");
                }
            
        }
    }
    
    public static String phoneKeypad(String str){
        
        String result="";
        String str2=str.toLowerCase();
        for (int index=0;index<str.length();index++){
             char c=str.charAt(index);
             if (c=='a' || c=='b' || c=='c'){
                 result+="2";
             }
             else if (c=='d' || c=='e' || c=='f'){
                 result+="3";
            }  
             else if ( c== 'g' || c=='h' || c=='i'){
                 result+="4";
             }
             else if (c=='j' || c=='k' || c=='l'){
                 result+="5";
             }
             else if (c=='m' || c=='n' || c=='o'){
                 result+="6";
             }
             
        
        } return result;
    }
     
    public static void main(String[] args) {
        twisters();
        
        System.out.println("");
        
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a line of string:");
        String str=input.nextLine();
        System.out.println(phoneKeypad(str));
    }
    
}

}
