package DSA.BIT;

public class PQ {
    /*lowercase to uppercase
    public static void main(String[] args) {
        for(char ch='A';ch<='Z';ch++){
            System.out.print((char)(ch|' '));
        }
    }*/
    /*Add 1 to an integer using Bit Manipulation
     *  public static void main(String[] args) {
        int x=6;
        System.out.println(x + " + "+ 1 +" is " + -~x);
        x=-4;
        System.out.println(x + " + "+1+" is " + -~x);
        x=0;
        System.out.println(x + " + "+1+" is " + -~x);

    }
     */
    //swap using XOR operator
    public static void main(String[] args) {
        int x=3,y=4;
        System.err.println("before swap x: "+ x+ " and y: "+ y);
        x=x^y;
        y=x^y;
        x=x^y;
        System.err.println("after swap x: "+ x+ " and y: "+ y);

    }
   
}
