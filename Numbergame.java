
package com.mycompany.numbergame;
import java.util.*;
import java.io.*;

public class Numbergame {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int rnum,count=0;
        int min=1,max=100,attempts=5;
        rnum=random.nextInt(max-min+1)+min;
        while(attempts!=0)
        {
            for(int i=1;i<=attempts;i++)
            {
                System.out.println("Enter the number between 0 to 100 :");
                int num=sc.nextInt();
                if(num>min && num<max)
                {
                    if(num==rnum)
                    {
                        count++;
                        System.out.println("Whoa CONGRATULATIONS !! You've guessed the number right ! The number of guesses u took is :"+count);
                        System.out.println("Do you wanna continue playing ? 1 (yes) or 2 (no) :");
                        int ch=sc.nextInt();
                        if(ch==1 || ch==2)
                        {
                        switch(ch)
                        {
                            case 1: main(args);
                                    break;
                                    
                            case 2: System.out.println("Thank you for playing ! Hope you had a good time !!");
                                    System.exit(0);        
                        }
                        }
                        else
                        {
                            System.out.println("Glad to have seen you playing... kindly choose from the mentioned options only");
                        }
                    }
                    else if(num>rnum)
                    {
                        if(num>=(rnum+5) && num <=(rnum+10) || num<=(rnum+5) && num<=(rnum+10))
                        {
                            System.out.println("You are very close.... try guessing a bit smaller number");
                            count++;
                            
                        }
                        else if(num>=(rnum+11) && num <=(rnum+15) )
                        {
                            System.out.println("You are going a little far from guessing the right one... try guessing a smaller number");
                            count++;
                        }
                        else
                        {
                            System.out.println("You are guessing a higher number... try guessing smaller number");
                            count++;
                        }
                    }
                    else if(num<rnum)
                    {
                        if(num <=(rnum-5) && num >=(rnum-10) || num>=(rnum-5) && num <=(rnum-1))
                        {
                            System.out.println("You are very close.... try guessing a bit larger number");
                            count++;                            
                        }
                        else if(num>=(rnum-15) && num <(rnum-10))
                        {
                            System.out.println("You are going a little far from guessing the right one... try guessing a larger number");
                            count++;
                        }
                        else
                        {
                            System.out.println("You are guessing a smaller number... try guessing larger number");
                            count++;
                        }
                    }
                }
                else
                {
                    System.out.println("Please enter a number within the specified range ! (This guess won't be counted)");
                    main(args);
                }
            }
            System.out.println("You have crossed the limit of attempts !");
            System.out.println("Thank you for playing !Hope you had a good time!!\nThe number is :"+rnum);
            System.exit(0);
        }
    }
}
