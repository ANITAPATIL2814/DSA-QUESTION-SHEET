package DSA.ARRAYS;

import java.util.Scanner;

public class array{
    /* public static void main(String[] args) {
       cration of array
        int marks[]=new int[50];
        int numbers[]={1,2,3};
        int m[]={3,4,2};
        String fruits[]={"apple","mango"};
        //input & output
        int mark[]=new int[50];
        Scanner s=new Scanner(System.in);
        mark[0]=s.nextInt();
        mark[1]=s.nextInt();
        mark[2]=s.nextInt();
        System.out.println("phy : "+mark[0]);
        System.out.println("chem : "+mark[1]);
        System.out.println("math : "+mark[2]);
        //update
        mark[2]=mark[2]+1;
        mark[2]=mark[2]-1;
        mark[2]=mark[2]/2;
        mark[2]=mark[2]*2;
        System.out.println("math updated mark : "+mark[2]);
        System.out.println("math updated mark : "+mark[2]);
        System.out.println("math updated mark : "+mark[2]);
        System.out.println("math updated mark : "+mark[2]);
        mark[2]=100;
        System.out.println("math updated mark : "+mark[2]);
        int per=(mark[0]+mark[1]+mark[2])/3;
        System.out.println("percentage : "+per+"%");
        //to find length of array
        System.out.println("length of array :"+mark.length);

        //array as function argument


    }
*/
/*
 * passing array as an argument
public static void update(int mark[],int nonChangable){
    nonChangable=10;
    for(int i=0; i<mark.length;i++){

        mark[i]=mark[i]+1;
    }
}
public static void main(String[] args) {
    int mark[]={97,98,99};
    int nonChangable=5;
    update(mark,nonChangable);
    System.out.println(nonChangable);

    //print marks
    for(int i=0;i<mark.length;i++){
        System.out.println(mark[i]);
    }
    System.out.println();
}
}

 */
/* linear search
 public static  int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};
        int key=6;
        int index=linearSearch(numbers, key);
        if(index ==- 1){
            System.out.println("Not found");
        }
        else{
            System.out.println("key is ar index :"+index);
        }
    }
}
 */

 
/*largest and smallest  num in array 
  public static int getLargest( int numbers[]){
        int largest=Integer.MIN_VALUE;//-infinity
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){ //num is bigger than largest num
                largest=numbers[i]; // update largest equal to number
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("smallest  valur is :"+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,6,5};
        System.out.println("largest value is : "+getLargest(numbers));
    }
}
  */
/*binary search
  public static int binarySearch(int number[],int key){
        int start=0, end=number.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            //comparisons
            if(number[mid]==key){ //found
                return mid;
            }
            if(number[mid]<key){ //right
                start=mid+1;
            }else{ //left
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14};
        int key=10;
        System.out.println("index of key is :"+binarySearch(number, key));
    }
}
*/


/*
//  * reverse an array
 public static void reverse(int number[]){
    int start=0, end=number.length-1;
    while (start<end) {
        //swap
        int temp=number[end];
        number[end]=number[start];
        number[start]=temp;
        start++;
        end--;
    }
}
public static void main(String[] args) {
    int number[]={2,4,6,8,10};
    reverse(number);
    //priny array
    for(int i=0;i<number.length;i++){
        System.out.print(number[i]+" ");
    }

}

}
*/
 
// /* Max subarray sum 
public static void subarray(int number[])
{
    
    int currsum= 0;
    int maxsum=Integer.MIN_VALUE;
    for (int i=0;i<number.length;i++)
    { 
    //loop from 0 to n
        int start=i;    //2,4,6,8,10
        for(int j=i;j<number.length;j++)
        { 
        //start to end 
            int end=j;
             currsum=0;
            for(int k =start; k<=end; k++)
            { 
            //print
                currsum+=number[k];
            }
            System.out.println(currsum);
            if(maxsum<currsum)
            {
                maxsum=currsum;
            }
        }
        System.out.println();
    }
    System.out.println("Total sum: "+maxsum);
}

public static void main(String[] args) {
    int number[]={1,-2,6,-1,3};
    subarray(number);
   
}
}


/* max sum array sum using prefix sum 
 * public static void subarray(int number[])
{
    
    int currsum= 0;
    int maxsum=Integer.MIN_VALUE;
    int prefix[]=new int[number.length];
    prefix[0]=number[0];
    //calculate prefix array
    for (int i=1;i<prefix.length;i++)
    {
        prefix[i]=prefix[i-1]+number[i];
    }
        for(int i=0;i<number.length;i++)
        {
            int start=i;    //2,4,6,8,10
        for(int j=i;j<number.length;j++)
        { 
        //start to end 
            int end=j;
             currsum= start==0 ? prefix[end] : prefix[end]-prefix[start-1];
            if(maxsum<currsum)
            {
                maxsum=currsum;
            }
        }
        }
    System.out.println("maximum  sum: "+maxsum);
}

public static void main(String[] args) {
    int number[]={1,-2,6,-1,3};
    subarray(number);
   
// */
// public static void kadanes(int number[])
// {
//     int ms=Integer.MIN_VALUE;
//     int cs=0;
//     for(int i=0;i<number.length;i++){
//         cs=cs+number[i];
//         if(cs<0){
//             cs=0;
//         }
//         ms=Math.max(cs,ms);

//     }
//     System.out.println("max sum :"+ms);

    
// }

// public static void main(String[] args) {
//     int number[]={-2,-3,4,-1,-2,1,5,-3};
//     kadanes(number);
   
// }

// }