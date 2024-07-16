package DSA.OOPS;

public class abstraction {
    public static void main(String[] args) {
        Horse h= new Horse();
        h.eat();
        h.walk();
    }
}

abstract class Animal{
    void eat(){ // non abstract method
        System.out.println("animal eats");
    }
    abstract void walk();// abstract method
}
class Horse extends Animal{
    void walk(){
        System.out.println("walk on 4 legs");
    }
}