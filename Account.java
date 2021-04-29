/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package main;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Account {
    String name;
    long accno;
    String AType;
    double balance;
    
}
class Cur_account extends Account
{
    Cur_account(String n,long a)
    {
        name=n;
       accno=a;
       AType="Current";
       balance=0.0;
    }
   void deposit(double n)
   {
       balance=balance+n;
       System.out.println("Balance updated");
       System.out.println("New Balance:"+balance);
   }
   void showbal()
   {
        System.out.println("Balance:"+balance);
   }
   void withdraw(double n)
   {
       if(n<=balance)
       {
           balance=balance-n;
           System.out.println("Balance updated");
       }
       else
       {
           System.out.println("Insufficient Balance");
       }
   }
   void min_bal()
   {
       if(balance<2500)
       {
           balance=balance-0.02*balance;
           System.out.println("Penalty of 2%(i.e service tax) is debited from your account");
           System.out.println("Balance updated");
       }
       else
       {
           System.out.println("Enough balance");
       }
   }   
}
class Sav_account extends Account
{
    Sav_account(String n,long a)
    {
        name=n;
       accno=a;
       AType="Savings";
       balance=0.0;
    }
   void deposit(double n)
   {
       balance=balance+n;
       System.out.println("Balance updated");
       System.out.println("New Balance:"+balance);
   }
   void showbal()
   {
        System.out.println("Balance:"+balance);
   }
   void withdraw(double n)
   {
       if(n<=balance)
       {
           balance=balance-n;
           System.out.println("Balance updated");
       }
       else
       {
           System.out.println("Insufficient Balance");
       }
   }
   void intrest(float t,float i)
   {
       double princ;
       princ=(balance*t*i)/100;
       balance=balance+princ;
       System.out.println("interest Added to your account");
   }
}
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name,Atype;
        long accno;
        int a;
        System.out.println("Enter 1-Savings and 2-current");
        a=sc.nextInt();
        //Account A1=new Account(name,accno,Atype);
        if(a==2)
        {
            int num;
            System.out.println("Enter name,account no");
            name=sc.next();
            accno=sc.nextLong();
            Cur_account C1=new Cur_account(name,accno);
            do
            {
                System.out.println("Enter 1-deposit 2-display balance 3-check enough balance 4-withdraw 5-exit");
                num=sc.nextInt();
                switch(num)
                {
                    case 1:
                        System.out.println("Enter the deposit you want to enter");
                        double dip;
                        dip=sc.nextDouble();
                        C1.deposit(dip);
                        break;
                    case 2:
                        C1.showbal();
                        break;
                    case 3:
                        C1.min_bal();
                        break;
                    case 4:
                        System.out.println("Enter the money you want to with draw");
                        double mon;
                        mon=sc.nextDouble();
                        C1.withdraw(mon);
                        break;
                     
                }
            }while(num!=5);    
        }
        else
        {
            System.out.println("Enter name,account no");
            name=sc.next();
            accno=sc.nextLong();
            Sav_account C1=new Sav_account(name,accno);
            int num;
            do
            {
                System.out.println("Enter 1-deposit 2-display balance 3-intrest 4-withdraw 5-exit");
                num=sc.nextInt();
                switch(num)
                {
                    case 1:
                        System.out.println("Enter the deposit you want to enter");
                        double dip;
                        dip=sc.nextDouble();
                        C1.deposit(dip);
                        break;
                    case 2:
                        C1.showbal();
                        break;
                    case 3:
                        System.out.println("Enter time and intrest rate");
                        float time,rate;
                        time=sc.nextFloat();
                        rate=sc.nextFloat();
                        C1.intrest(time, rate);
                        break;
                    case 4:
                        System.out.println("Enter the money you want to with draw");
                        double mon;
                        mon=sc.nextDouble();
                        C1.withdraw(mon);
                        break;
                     
                }
            }while(num!=5);    
        }
        
    }
}
