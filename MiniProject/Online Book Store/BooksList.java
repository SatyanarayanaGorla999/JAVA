package com.miniProject;

import java.util.*;
import java.util.List;


public class BooksList
{
    private List<Books> books;
    static double total;

    //Constructor
    public BooksList()
    {
        this.books = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch (n)
        {
            case 1:
                System.out.println("Available History Books :");
                this.historyBooks(new Books(1, "Modern History", "Lucent", 11));
                this.historyBooks(new Books(2, "Ancient History", "Lucent", 100));
                this.historyBooks(new Books(3, "Early India ", "   Romila Thapar", 1111.11));
                break;
            case 2:
                System.out.println("Available Geography Books :");
                this.geographyBooks(new Books(1, "India Geo", "Joshua", 22.22));
                this.geographyBooks(new Books(2, "Mountains", "Mounty", 222.22));
                this.geographyBooks(new Books(3, "Maps", "Daniel", 2222.22));
                break;
            case 3:
                System.out.println("Available Polity Books :");
                this.polityBooks(new Books(1, "Polity", "George", 33.33));
                this.polityBooks(new Books(2, "Laxmikanth", "DD Basu", 333.33));
                this.polityBooks(new Books(3, "Vijetha", "Kishore", 3333.33));
                break;
            case 4:
                System.out.println("Available Economy Books :");
                this.economyBooks(new Books(1, "Ind Economy", "Genny", 44.44));
                this.economyBooks(new Books(2, "Freakonomics", "Steve", 444.44));
                this.economyBooks(new Books(3, "The Shock Doctrine", "Navomie", 4444.44));
                break;
            case 5:
                System.out.println("Available English Novels :");
                this.englishNovels(new Books(1, "1984", "George", 55.55));
                this.englishNovels(new Books(2, "Moby-Dick", "Herman", 555.55));
                this.englishNovels(new Books(3, "Jane Eyre", "Charles", 5555.55));
                break;
            case 6:
                System.out.println("Available Telugu Novels :");
                this.teluguNovels(new Books(1, "Kanyasulkam", "Gurazada", 66.66));
                this.teluguNovels(new Books(2, "Anandamath", "Chandra", 666.66));
                this.teluguNovels(new Books(3, "  Midhunam", "Sriramana", 6666.66));
                break;
            case 7:
                System.out.println("Available Hindi Novels :");
                this.hindiNovels(new Books(1, "Godaan", "Thomas", 77.77));
                this.hindiNovels(new Books(2, "Tamas", "Thomas", 777.77));
                this.hindiNovels(new Books(3, "Rangbhoomi", "Rakesh", 7777.77));
                break;
            case 8:
                System.out.println("Available Other Books :");
                this.otherBooks(new Books(1, "Kill", "George", 88.88));
                this.otherBooks(new Books(2, "The Lord", "Green", 888.88));
                this.otherBooks(new Books(3, "1984", "David", 8888.88));
                this.otherBooks(new Books(4, "Brave", "Soban", 1888.88));
                break;
            default:last();

        }
    }

    public void historyBooks(Books book)
    {

        books.add(book);
    }

    public void geographyBooks(Books book)
    {
        books.add(book);
    }

    public void polityBooks(Books book)
    {
        books.add(book);
    }

    public void economyBooks(Books book)
    {
        books.add(book);
    }

    public void englishNovels(Books book)
    {
        books.add(book);
    }

    public void teluguNovels(Books book)
    {
        books.add(book);
    }

    public void hindiNovels(Books book)
    {
        books.add(book);
    }

    public void otherBooks(Books book)
    {
        books.add(book);
    }


    public List<Books> getBooks()
    {
        return books;
    }

          // main metod --1
    public static void main(String[] args)
    {
        System.out.println("      *Welcome to the Online Book Store*");
        start();
        System.out.println();
        System.out.println("Total = "+"₹"+total);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        payment(total);
        System.out.println();
        paymentSuccessful();

    }


        //    metod start---2
        public static void start ()
        {

            System.out.println("List Of All Books");
            System.out.println("1.History");
            System.out.println("2.Geography");
            System.out.println("3.Polity");
            System.out.println("4.Economy");
            System.out.println("5.English Novels");
            System.out.println("6.Telugu Novels");
            System.out.println("7.Hindi Novels");
            System.out.println("8.Other Books");
            System.out.println("9.Exit");
            System.out.println("Enter Any One Category ");
            BooksList booksList= new BooksList();
            listAllBooks(booksList);

        }



    //     books list----3
        public static void listAllBooks(BooksList booksList)
        {


            //System.out.println("\nList of Available Books:");
            System.out.printf("%-5s %-5s %15s %15s%n", "id", "name", "author", "price");
            System.out.println("------------------------------------------------------");
            for (Books book : booksList.getBooks())
            {
                System.out.printf("%-5s %-10s %10s %15s%n", book.getId(), book.getName(), book.getAuthor(), book.getPrice());
            }
            System.out.println();
            System.out.println("Enter the Id");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            for (Books book : booksList.getBooks())
            {
                if (book.getId() == n)
                {
                    System.out.println(book);
                   String  name = book.getName();
                    double price= book.getPrice();
                      orderedBooks(name, price);
                    System.out.println();
                    System.out.println("Enter 1 to Choose More Books and 2 for Total Bill");
                    int shopAgain = sc.nextInt();
                    if (shopAgain == 1)
                    {
                        System.out.println("Continue to Shop");
                        start();
                    }
                    else
                    {
                        System.out.println();
                        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Total Bill :-");
                        System.out.println("-----------------------------------------------------------------------------------------------------------------");
                        System.out.println();
                        System.out.println("Books :-");
                    }
                    List<Object> l = new ArrayList<>();
                    l.add(book.getName());
                    for (Object o : l)
                    {

                        System.out.println("        " + o);
                    }
                }

            }
        }
        //order details---4
        private static void orderedBooks (String name,double price)
        {
            System.out.println();
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Order Details :-");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Book        :" + name);
            System.out.println("Price       :" + price);
          int disc= discount(price);
            System.out.println("Discount    :"+disc+"%");
            System.out.println("GST         :7%");
            System.out.println("-----------------------------------------------------------------------");
            double tot = (price) - (0.01*disc * price) + ((7*0.01) * price);
            total += tot;
            System.out.println("Cost        :₹" + tot);
            System.out.println("-----------------------------------------------------------------------");
        }

    private static int discount(double price)
    {
        int discount;
        if(price<=100)
        {
            discount=5;
            return discount;
        }
        else if (price>100&&price<=1000)
        {
            discount=10;
            return discount;
        }
        else
            discount=20;
        return discount;
    }

    // payments----5
        private static void payment (double total)
        {
            System.out.println("Enter 1 For Payment or 2 for Exit");
            Scanner sc = new Scanner(System.in);
            int payment = sc.nextInt();
            if (payment == 1)
            {
                Payment p = new Payment();
                p.options(total);
            } else last();
        }
        public static void paymentSuccessful()
        {
            System.out.println("Your Order Placed Successfully");
            System.out.println("Delivered With in 7 Days");
            last();
        }
        //last-----7
        public static void last ()
        {
            System.out.println();
            System.out.println("                  Thank You for Shopping");
            System.out.println("------------------------Shop Again----------------------------");
           System.exit(0);
        }

    }




