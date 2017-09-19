package Assignment2;                                                         //Package declaration

import java.util.Scanner;                                                    //Scanner class imported
public class Assignment2_3 {                                                 // Name of the class
	public static void main(String[] args) { 	                             //Main method started
		
		Scanner s = new Scanner(System.in);                                  // object initialized for user input
        System.out.print("Enter the size of X Pattern : ");                  
        int size = s.nextInt();                                              //Integer variable size initialized to get the input from user 
        int rows, column;                                                    //Two Integer variables row and column initialized   
        s.close();                                                           //Object of scanner class "s" closed
        for (rows = 1; rows <= size; rows++) {                               //for loop expression started, value of row initialized to 1,this condition will execute till number of rows is less than equal to size. 
        	for (column = 1; column <= size; column++) {					 //nested for loop expression started, value of column initialized to 1,this condition will execute till number of column is less than equal to size. 	
                 if (column == rows) {                                       // if condition to check values of column and rows are same 
                     System.out.print("*");                                  //it will print "*" when the above if condition will be true   
                  }                                                          // if condition closed    
                  else if (column == size - (rows - 1)) {                    //else if condition to check the diagonal coordinates starting from last column
                      System.out.print("*");                                 //it will print "*" when the above condition will be true
                  }                                                          //else if condition closed
                   else {                                                    // else statement stared     
                       System.out.print(" ");                                // when the above else statement will be true it will print space
                   }                                                         //else condition closed
               }                                                             //nested for loop closed
        System.out.println();                                                //it will take the cursor to the next line
        }                                                                    // main for loop closed
    }                                                                        // main method closed   
}                                                                            // class closed

