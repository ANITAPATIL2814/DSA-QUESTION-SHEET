package DSA.STRING;

public class basic {
    public static void print_letters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String str="anita";
        String s= new String("abc");
        System.out.println(str.length());//5
        System.out.println(s.charAt(2));//c

        print_letters(str);
    }
}
