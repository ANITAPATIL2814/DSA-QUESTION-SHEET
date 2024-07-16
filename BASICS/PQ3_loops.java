import java.util.Scanner;

public class PQ3_loops {
    public static void main(String[] args) {
        /*
         Q1
        for(int i=0;i<5;i++){
            System.out.println("hwlloe");
            i+=2;
        }
        Q2 Write a program that reads a set of integers,and then prints the sum of the even and odd integers
        Scanner s=new Scanner(System.in);
        int number;
        int evensum=0;
        int oddsum=0;
        int choice;
        do{
            System.out.println("enter number");
            number=s.nextInt();
            if(number%2==0){
                evensum+=number;
            }
            else{
                oddsum+=number;
            }
            System.out.println("do u waznt to continue ? press 1 for yes  or 0 for No");
            choice=s.nextInt();
            
        }while(choice==1);
        System.out.println("sum of even num : "+evensum);
        System.out.println("sum of odd num : "+oddsum);
        
        Q3 factorial of number
        Scanner sc=new Scanner(System.in);
        int num;
        int fact=1;
        System.out.println("enter num");
        num=sc.nextInt();
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println(fact);

        Q4 multipliaction of table
        */
        Scanner s=new Scanner(System.in);
        System.out.println("enter num");
        int n=s.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+n*i);

        }
    }   
}
