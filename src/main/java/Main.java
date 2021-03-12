import java.util.Scanner;

public class Main
{
    public Main() {
    }
    public static void main(String args[])
    {   Main m = new Main();
        int flag=0,ch;
        double num,num1,num2;
        Scanner reader = new Scanner(System.in);
        System.out.println("Calculator System");
        do
        {
            System.out.println("Option Menu");
            System.out.println("");
            System.out.println("1) Square root");
            System.out.println("2) Factorial");
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
                        if(num>=0){
                            System.out.println(m.squareroot(num));
                        }
                        else{
                            System.out.println("Number can not be negative");
                        }
                        break;
                    case 2:
                        System.out.println("Factorial function");
                        System.out.println("Enter number");
                        num = reader.nextDouble();

                        if(num>=0){
                            System.out.println(m.factorial(num));
                        }
                        else{
                            System.out.println("Number can not be negative");
                        }
                        break;
                    case 3:
                        System.out.println("Natural logarithm (base е )");
                        System.out.println("Enter number");
                        num = reader.nextDouble();
                        System.out.println(m.log(num));
                        break;
                    case 4:
                        System.out.println("Power function  ");
                        System.out.println("Enter first number");
                        num1 = reader.nextDouble();
                        System.out.println("Enter second number");
                        num2 = reader.nextDouble();
                        if(num1==0 && num2==0){
                            System.out.println("Not defined");
                            break;
                        }
                        System.out.println(m.power(num1,num2));
                        break;
                    default: System.out.println("Exiting program due to invalid input");
                        flag=1;
                }
            }
            System.out.println("\n");
        }while(flag==0);
    }
    public double squareroot(double number) {
        double result = Math.sqrt(number);
        return result;
    }
    public double factorial(double number) {
        double fact = 1;
        for(int i=1;i<=number;i++) {
            fact = fact * i;
        }
        return fact;
    }
    public double log(double number) {
        double result = Math.log(number);
        return result;
    }
    public double power(double number1,double number2) {
        double result = Math.pow(number1,number2);
        return result;
    }
}