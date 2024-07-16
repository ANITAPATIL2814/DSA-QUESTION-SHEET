package DSA.OOPS;

public class super1 {
    public static void main(String[] args) {
        Horse h= new Horse();
        System.out.println(h.color);
    }
}
class Animal{
    String color;

    Animal(){
        System.out.println("animal constructor is called");
    }
}
class Horse extends Animal{
    Horse(){
        super(); // java automatically call super() constructor no need to declare
        super.color="red";
        System.out.println("horse contructor is called");
    }
}
