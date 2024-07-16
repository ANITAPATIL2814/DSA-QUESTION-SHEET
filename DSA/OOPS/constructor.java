package DSA.OOPS;


public class constructor {
    public static void main(String[] args) {
      student s1=new student();  
      s1.name="anita";
      student s3= new student(s1);
      System.out.println(s3.name);
      System.out.println(s1.name);
 
    }
    
}
class student{
    String name;
    student(){//non parameterized
        System.out.println("constructor is called");
    }
    student(String name){// parameterized
        this.name=name;
    }
    student(student s1){// copy 
        this.name=s1.name;
    }
}
   

