package DSA.RECURSION;

public class basic {
    public static void printDec( int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printIncre( int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printIncre(n-1);
        System.out.print(n+" ");
    }
    //factroial
    public static int fact(int n){
        if(n == 0){// base case
            return 1;
        }
        int f= fact(n-1);
        int fn= n*fact(n-1);
        return fn;
    }
    //sum
    public static int calSum(int n){
        if(n == 1){// base case
            return 1;
        }
        int sn= calSum(n-1);
        int s= n+sn;
        return s;
    }
    //fibnacii
    public static int Fibb(int n){

        if(n == 0 || n == 1){// base case
            return n;
        }
        int fn1= Fibb(n-1);
        int fn2= Fibb(n-2);
        int fn=fn1+fn2;
        return fn;
    }
    public static boolean isSort(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSort(arr, i+1);
       
    }
    public static int first(int arr[],int key,int i){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return first(arr,key, i+1);
       
    }
    public static int last(int arr[],int key,int i){

        if(i == arr.length){
            return -1;
        }
        int isFound=last(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
       
    }
    public static int pow(int a,int n){

        if(n ==0){
            return 1;
        }
        int half=pow(a,n/2);
        int halfpow=half*half;
        if(n%2!=0){
            halfpow=a*halfpow;
        }
        return halfpow;
       
    }



 public static void main(String[] args) {
    // int n =5;
    // printIncre(n);
    // System.out.println(fact(n));
    // System.out.println(calSum(n));
    // printDec(n);
    // System.out.println(Fibb(n));
    // int arr[]={1,2,3,4};
    // int arr1[]={4,3,2,1};
    // System.out.println(isSort(arr1, 0));
    // System.out.println(isSort(arr, 0));
    // int arr[]={8,3,6,9,5,10,2,5,3};
    // System.out.println(first(arr, 5, 0));
    // System.out.println(last(arr, 5, 0));
    int a=2;
    int n=5;
    System.out.println(pow(a, n));
 }   
}
