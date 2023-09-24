/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atm;
import java.util.*;

public class Atm {
    private int card;
    private int pin;
	
    public int getcard()
    {
        return card;
    }
	
    public void setcard(int card) 
    {
        if(card>0)            
            this.card=card;
    }
	
    public int getpin()
    {
        return pin;
    }
	
    public void setpin(int pin)
    {
        this.pin=pin;
    }
	
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

	System.out.println("Enter card number:");
	int cardU=sc.nextInt();
		
	System.out.println("Enter pin number:");
	int pinU=sc.nextInt();
		
	Atm atcp=new Atm();
	atcp.setcard(1234);
	atcp.setpin(123);
		
	if(cardU==atcp.getcard() && pinU==atcp.getpin())
	{
            System.out.println("Login successful ! Welcome KSHAMA ,How can we help you ? ");
	}
	else
	{
            System.out.println("Login unsuccessful ! Enter valid details!");
            main(args);
	}
		
	balance b=new balance();
	Atm a1=new balance();
	withdraw w=new withdraw();
	Atm a2=new withdraw();
	deposit d=new deposit();
	Atm a3=new deposit();
	int bal=50000;

	while(true)
	{
            System.out.println("\nChoose the operation to want to perform :\n1.CHECK BALANCE\n2.WITHDRAW MONEY\n3.DEPOSIT\n4.EXIT");
            int choice=sc.nextInt();
					
            switch(choice)
            {
		case 1 :    b.display(bal);
                            break;
						
		case 2 :    System.out.println("Enter the money you want to withdraw :");
                            int draw=sc.nextInt();
                            if(draw<=bal)
                            {
                                w.display(bal,draw);
                                bal-=draw;
                            }
                            else
                            {
                                System.out.println(" Above the limit ! Please enter a value acc to the balance");
                            }
                            break;
						
		case 3 :    System.out.println("Enter the money you want to deposit :");
                            int put=sc.nextInt();
                            if(put>0)
                            {
                                d.display(bal,put);
                                bal+=put;
                            }
                            else
                            {
                                System.out.println(" Below the limit ! Please enter a value acc to the balance");
                            }
                            break;
			 		 
		case 4 :    System.out.println("Thank you for logging in !");
                            System.exit(0);
						
		default :   System.out.println("Choose from the operations mentioned !"); 
			}
		}	
    }
}

class balance extends Atm
{
	public void display(int bal)
	{
		System.out.println("Balance is : Rs."+bal);
	}
}

class withdraw extends Atm
{
	public void display(int bal,int draw)
	{
		System.out.println("The amount withdrawn is : Rs."+draw);
		System.out.println("The current balance is : Rs."+(bal-draw));
	}
}

class deposit extends Atm
{
	public void display(int bal,int put)
	{
		System.out.println("The amount deposited is : Rs."+put);
		System.out.println("The current balance is : Rs."+(bal+put));
	}
}