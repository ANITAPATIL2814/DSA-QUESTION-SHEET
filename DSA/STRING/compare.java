package DSA.STRING;

public class compare {
    
    public static void main(String[] args) {
        String s=new String("anita");
        String s1="anita";
        String s2="anita";
        if(s == s2){ // it show not equal becz here == checks the object comaprsion so that we use equals function
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        if(s1 == s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        if(s.equals(s2)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }


    }
}
