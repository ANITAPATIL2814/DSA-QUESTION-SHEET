import java.util.Scanner;

public class PQ2_conditional {
    public static void main(String[] args) {
        /*
         Q check if number is positive or negative
         Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0)
        {
            System.out.println("number is positive");
        }
        else{
            System.out.println("number is negative");
        }
         */
        /*
         Q2 You have a fever if your temperature is above 100 and otherwise prints You don't have a fever
         double temp=103.2;
        if(temp>100){
            System.out.println("u have fever");
        }
        else
        {
            System.out.println("u don't have fever");
        }
         */
        /*
         Q3 Write a Javaprogram to input week number(1-7) and print day of week name using switch case.
         Scanner sc=new Scanner(System.in);
        System.out.println("enter week number(1/7) : ");
        int week= sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thru");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("Monday");
                break;
            default:
            System.out.println("Invalidinput!Pleaseenterweeknumberbetween1-7."); 
                break;
        }
        Q check if year is leap or not
        
         */
         Scanner sc=new Scanner(System.in);
         int year=sc.nextInt();
         boolean x= year%4 == 0;
         boolean y=year%100 !=0;
         boolean z=year%100==0 && year%400==0;
         if (x && (y||z) ){
             System.out.println(year+" is leap year");
         }
         else{
             System.out.println(year+" is not leap year");
         }

    }
}
