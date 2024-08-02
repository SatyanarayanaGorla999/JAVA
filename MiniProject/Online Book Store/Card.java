package com.miniProject;

import java.util.Scanner;

public class Card
{
    public  static void card(double total)
    {
        int savedCard=123456789;
        double avlBal=1000;
        System.out.println("Enter the Card number");
        Scanner sc = new Scanner(System.in);
       try
       {
           int cardNumber = sc.nextInt();

         if (savedCard== cardNumber)
         {

               int comp = 1234;
               System.out.println("Enter Pin");
               int pin = sc.nextInt();
               if (comp == pin)
               {
                   if(avlBal>=total)
                   {
                       System.out.println("      Payment Successful");BooksList.paymentSuccessful();
                   }
                   else
                   {
                       System.out.println("Insufficient Balance");
                   System.out.println("Available Balance is :₹"+avlBal); BooksList.last();
                   }

               }
               else {
                   System.out.println("Enter valid Pin");
                   for (int i = 1; i <= 3; i++) {

                       int newpin = sc.nextInt();
                        if (newpin == comp)
                        {
                            if(avlBal>=total)
                            {
                                 System.out.println("Payment Successful");BooksList.paymentSuccessful();
                            }
                            else
                            {
                                System.out.println("Insufficient Balance");
                            System.out.println("Available Balance is :₹"+avlBal);  BooksList.last();
                            }

                        }
                        else if (i >= 3)
                       {
                           System.out.println("Your Card Blocked Try After  24 Hours");BooksList.last();
                       }
                        else System.out.println("Enter Valid Pin");
                   }
               }
           } else
           {
               System.out.println("Invalid Card Number,Please Try Again");
               BooksList.last();
           }
       }
       catch(Exception e)
       {
         System.out.println(e);
           System.out.println("Enter valid Number and Try Again");BooksList.last();

       }

    }
}
