package com.miniProject;


import java.util.Scanner;

public class Payment extends Card
{
   public static void options(double total)
   {
       System.out.println("Payment Options");
       System.out.println("1.Debit Card");
       System.out.println("2.Credit Card");
       System.out.println("3.UPI Options");
       System.out.println("4.Cash On Delivery");
       System.out.println("Enter Any Option");
       Scanner sc = new Scanner(System.in);
       int option=sc.nextInt();
       switch (option)
       {
           case 1:debitCard(total);break;
           case 2:creditCard(total);break;
           case 3:upiOptions();break;
           case 4:cashOnDelivery();break;
           default:System.out.println("Enter valid option");BooksList.last();
       }
   }
 public static void debitCard(double total)
    {
      card(total);
    }

    public static void creditCard(double total)
    {
        card(total);
    }
    public static void upiOptions()
    {
      System.out.println("Amount Sent to UPI apps ");
      System.out.println("Payment Successful");
    }

    public static void cashOnDelivery()
    {
      System.out.println("Cash on Delivery Applied");
    }


}
