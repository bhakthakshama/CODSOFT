package com.mycompany.gradecalculator;
import java.util.*;
import java.io.*;

public class Gradecalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("WELCOME TO STUDENT GRADE CALUCLATOR !\nPLEASE ENTER REQUIRED DETAILS TO GET THE ACCURATE GRADE.");
        System.out.println("-------------------------------------------------------------------------");
        System.out.print("\nEnter your name : ");
        String name=sc.next();
        System.out.print("\nEnter the marks for the following subjects out of 100: ");
        System.out.print("\n1.MATHEMATICS : ");
        int math=sc.nextInt();
        if(math>100)
        {
            System.out.println("\nPlease enter your marks out of 100");
            System.out.print("\n1.MATHEMATICS : ");
            int math1=sc.nextInt();
            math=math1;
        }
        System.out.print("\n2.PHYSICS : ");
        int phy=sc.nextInt();
        if(phy>100)
        {
            System.out.println("\nPlease enter your marks out of 100");
            System.out.print("\n2.PHYSICS : ");
            int phy1=sc.nextInt();
            phy=phy1;
        }
        System.out.print("\n3.CHEMISTRY : ");
        int chem=sc.nextInt();
        if(math>100)
        {
            System.out.println("\nPlease enter your marks out of 100");
            System.out.print("\n3.CHEMISTRY : ");
            int chem1=sc.nextInt();
            chem=chem1;
        }
        System.out.print("\n4.BIO/CS/STATS : ");
        int opt=sc.nextInt();
        if(opt>100)
        {
            System.out.println("\nPlease enter your marks out of 100");
            System.out.print("\n4.BIO/CS/STATS : ");
            int opt1=sc.nextInt();
            opt=opt1;
        }
        System.out.print("\n5.HINDI/KAN/SANSKRIT : ");
        int lang=sc.nextInt();
        if(opt>100)
        {
            System.out.println("\nPlease enter your marks out of 100");
            System.out.print("\n5.HINDI/KAN/SANSKRIT : ");
            int lang1=sc.nextInt();
            lang=lang1;
        }
        System.out.println("");
        if(math<35 || phy<35 || chem<35 || opt<35 || lang<35)
        {
            System.out.print("\n YOU FAILED "+name+" !!"+"Sorry but you have to try harder next time. Work on your weak points, put ample efforts and you'll do better...");
            System.out.println("\n-------------------------------------------------------------------------");
            System.exit(0);
        }
        System.out.print("\n"+name + ", your grades accordingly are :");
        System.out.println();
        int sum=math+phy+chem+opt+lang;
        System.out.print("\nTOTAL MARKS SCORED IS :"+sum+" / 500");
        int avg=(sum/5);
        System.out.print("\nAVERAGE PERCENTAGE OBTAINED IS :"+avg+"%");
        char grade;
        if(avg>=90 && avg<=100)
        {
            grade='S';
            System.out.print("\nGRADE ATTAINED IS : "+grade);
            System.out.print("\nCONGRATULATIONS "+name+" !! YOU PASSED !!"+"You did great, keep up with your good work...");
        }
        else if(avg>=80 && avg<90)
        {
            grade='A';
            System.out.print("\nGRADE ATTAINED IS : "+grade);
            System.out.print("\nCONGRATULATIONS "+name+" !! YOU PASSED !!"+"You did well and you can do even better...");
        }
        else if(avg>=70 && avg<80)
        {
            grade='B';
            System.out.print("\nGRADE ATTAINED IS : "+grade);
            System.out.print("\nCONGRATULATIONS "+name+" !! YOU PASSED !!"+"Your score lies in second grade, put more efforts next time...");
        }
        else if(avg>=60 && avg<70)
        {
            grade='C';
            System.out.print("\nGRADE ATTAINED IS : "+grade);
            System.out.print("\nCONGRATULATIONS "+name+" !! YOU PASSED !!"+"Your score lies in first grade, put more efforts and you'll perform better...");
        }
        else if(avg>=35 && avg<=45)
        {
            grade='D';
            System.out.print("\nGRADE ATTAINED IS : "+grade);
            System.out.print("\n YOU PASSED "+name+" !!"+"Your score is below average, please look into it and work more on your weak points...");
        }
        else if(avg<35)
        {
            grade='F';
            System.out.print("\nGRADE ATTAINED IS : "+grade);
            System.out.print("\n YOU FAILED "+name+" !!"+"Sorry but you have to try harder next time. Work on your weak points, put ample efforts and you'll do better...");
        }
        else
        {
            grade='E';
            System.out.print("\nGRADE ATTAINED IS : "+grade);
            System.out.print("\n YOU PASSED "+name+" !!"+"Your score is above average, please work more on your weak points...");
        }
        System.out.println("\n-------------------------------------------------------------------------");
    }
}
