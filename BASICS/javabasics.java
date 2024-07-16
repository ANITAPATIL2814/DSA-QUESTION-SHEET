import java.util.Scanner;

public class javabasics {
    public static void main(String[] args) {
        /*
            System.out.println("* * * *");
            System.out.println("* * * ");
            System.out.println("* * ");
            System.out.println("* ");
        */
        // input from user
        /*  Scanner sc= new Scanner(System.in);
            String input=sc.next();
            System.out.println(input);
            String input=sc.nextLine();
            System.out.println(input);
            int input=sc.nextInt();
            System.out.println(input);
            float input=sc.nextFloat();
            System.out.println(input);
            double input=sc.nextDouble();
            System.out.println(input);
            long input=sc.nextLong();
            System.out.println(input);
            boolean input=sc.nextBoolean();
            System.out.println(input);
        */

        /*
        Q1 sum of two sum user input
        Scanner s=new Scanner(System.in);
        int a= s.nextInt();
        int b= s.nextInt();
        int sum=a+b;
        System.out.println(sum);
         */

        /*
        Q2 product of a&b
         Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int pro=a*b;
        System.out.println(pro);
         */
        
        /*
         Q3 Area of circle
        Scanner s=new Scanner(System.in);
        float r=s.nextFloat();
        float area = 3.14f * r * r;
        System.out.println(area);
         */

         /*
          type casting ex
        Scanner s=new Scanner(System.in);
        float a=25.0f;
        int b= (int)a;
        System.out.println(b);
          */
        
          /*
           type promotion in expression
            short a=5;
            byte b=25;
            char c='c';
            byte ct=(byte)(a+b+c);
            System.out.println(a);

            System.out.println(b);
            System.out.println(c);
            
            System.out.println(ct);
           */
            /*
             If..else statment
            int age=22;
            if (age>=18) {
                System.out.println("you can drive, vote");
                
            }
            else{
                System.out.println("you r not adult");
            }
             */
            /*
             Q print largest of 2 num
             int a=1,b=3;
            if(a>=b)
            {
                System.out.println("a is largest of 2");
            }
            else{
                System.out.println("b  is largest of 2");
            }
             */
             /*
              Q2 print even or odd number
              int a=3;
            if(a%2==0)
            {
                System.out.println("number is even ");
            }
            else{
                System.out.println("num is odd");
            }
              */
            /*
             Q income tax calculator using else..if
             Scanner s=new Scanner(System.in);
            int income=s.nextInt();
            int tax;
            if(income<500000){
                tax=0;
            }
            else if(income>=500000 && income<1000000){
                tax=(int)(income*0.2);
            }
            else{
                tax=(int)(income*0.3);
            }
            System.out.println("your tax is: "+tax);
             */
            /*
             Q print the largest of 3 number
             int a=1,b=3,c=6;
            if (a>=b && a>=c){
                System.out.println("a is largest");
            }
            else if (b>=c )
            {
                System.out.println("b is largest");
            }
            else{
                System.out.println("c is largest");
            }

             */
            /*
             Q  check of student is pass or fail using ternary operator
             int marks=30;
            String stud= marks>=33? "pass":"fail";
            System.out.println(stud);

             */
            /*
             Q calculator using switch statment

             */
            Scanner sc=new Scanner(System.in);
            
            System.out.println("enter a");
            int a=sc.nextInt();
            System.out.println("enter b");
            int b=sc.nextInt();
            System.out.println("enter operator");
            char operator=sc.next().charAt(0);
            switch (operator) {
                case '+': System.out.println(a+b);
                    break;
                case '-':System.out.println(a-b);
                    break;
                case '*':System.out.println(a*b);
                    break;
                case '/':System.out.println(a/b);
                    break;
                case '%':System.out.println(a%b);
                    break;
                default: System.out.println("wrong operator");
                    break;
            }
            
            
    }    
}
