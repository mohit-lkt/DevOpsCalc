package Calculator;

import java.util.*;
import java.lang.Math;
public class Main
{
    public static void main(String args[])
    {
        int flag=0,ch;
        double num;
        Scanner reader = new Scanner(System.in);
        System.out.println("Calculator System");
        do
        {
            System.out.println("Option Menu");
            System.out.println("");
            System.out.println("1) Square root function");
            System.out.println("2) Factorial function");
            System.out.println("3) Natural logarithm (base е )");
            System.out.println("4) Power function");
            System.out.println("5) Exit");
            System.out.print("Enter your choice: ");
            ch = reader.nextInt();
            if(ch==5)
            {
                flag = 1;
            }
            else
            {
                switch(ch)
                {
                    case 1:
                        System.out.println("Square root function");
                        System.out.println("Enter number");
                        num = reader.nextDouble();
                        System.out.println(Math.sqrt(num));
                        break;
                    case 2:
                        System.out.println("Factorial function");
                        System.out.println("Enter number");
                        num = reader.nextDouble();
                        double fact = 1;
                        for(int i=1;i<=num;i++){
                            fact=fact*i;
                        }
                        System.out.println(Math.sqrt(fact));
                        break;
                    case 3:
                        System.out.println("Natural logarithm (base е )");
                        System.out.println("Enter number");
                        num = reader.nextDouble();
                        System.out.println(Math.log(num));
                        break;
                    case 4:
                        System.out.println("Power function  ");
                        System.out.println("Enter number");
                        num = reader.nextDouble();
                        System.out.println(Math.pow(num,2.0));
                        break;
                    default: System.out.println("Exiting program due to invalid input");
                        flag=1;
                }
            }
            System.out.println("\n");
        }while(flag==0);
    }
}