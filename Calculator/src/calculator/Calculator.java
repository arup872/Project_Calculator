/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Acer
 */
import java.io.*;
import java.util.*;
public class Calculator {

    static int First, Second;
    static int Result;
    static char Operator;
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        try
        {
        while((Result>=0)||(Result<=0))
        {
        if(Result==0)
        {
            System.out.println("Enter the First Integer Number = ");
            First = sc.nextInt();
            System.out.println("Enter an operator (+, -, *, /): ");
            Operator = sc.next().charAt(0);

        }
        
        else
        {
            First = Result;
            System.out.println("Enter an operator (+, -, *, /): ");
            Operator = sc.next().charAt(0);
        }
        switch(Operator)
        {
            case '+':
            {
                System.out.println("Enter the Second Integer Number = ");
                Second = sc.nextInt();
                Result = First+ Second;
                System.out.println("Result of Addition is = "+Result);
                System.out.println("");
                break;
            }
            case '-':
            {
                System.out.println("Enter the Second Integer Number = ");
                Second = sc.nextInt();
                Result = First - Second;
                System.out.println("Result of Subtraction is = "+Result);
                System.out.println("");
                break;
            }
            case '*':
            {
                System.out.println("Enter the Second Integer Number = ");
                Second = sc.nextInt();
                Result = First* Second;
                System.out.println("Result of Multiplication is = "+Result);
                System.out.println("");
                break;
            }
            case '/':
            {
                System.out.println("Enter the Second Integer Number = ");
                Second = sc.nextInt();
                Result = First / Second;
                System.out.println("Result of Division is = "+Result);
                System.out.println("");
                break;
            }
        }
        
        
    
     }
        }
        catch(Exception e)
        {
            System.out.println("");
            System.out.println("enter correct formate");
        }
}
        
    
}
