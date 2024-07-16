package DSA.RECURSION;


public class PQ {
    /*
     *Q  For a given integer array of size N. You have to find all the occurrences(indices) of a given element(Key and print them.Use a recursive   function to solve this problem.
     public static void linearSearch(int [] arr,int key,int end){
        //base case
        if(end<0) return;
        linearSearch(arr, key, end-1);
        if(arr[end] == key)
        {
            System.out.println(end+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={30,20,10,20,20};
        int key=20;
        linearSearch(arr, key, arr.length-1);
    }
     */
    /* Q You are given a number (eg -  2019), convert it into a String of english like
     * static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printdigiit(int number){
        if(number == 0){
            return;
        }
        int lastdigit=number%10;
        printdigiit(number/10);
        System.out.print(digits[lastdigit]+" ");
    }
    public static void main(String[] args) {
        printdigiit(1234);
    }
     */
    /* Q Question 3 :Write a program to findLength of aStringusing Recursion.
     * 
     */
    public static int length(String str){
        if(str.length() == 0){
            return 0;
        }
        return length(str.substring(1))+1;
   }
    public static void main(String[] args) {
        String str="abcde";
        System.out.println("length of string : "+length(str));
    }

}
