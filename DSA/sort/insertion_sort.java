package DSA.sort;

public class insertion_sort { //tc:O(n2)
    public static void insertSort(int arr[]){
        for (int i=1;i<arr.length;i++){ // i : 1 2 3 4
            int curr=arr[i]; // curr: 4 3 2 1
            int prev=i-1; // prev: 0 1 2 3
            //finding out the current position to insert
            while(prev >= 0 &&arr[prev]< curr   ){ //desc order :curr > arr[prev]
                arr[prev+1] = arr[prev]; //prev: 1 2 1      arr[prev] : 4 4 3  //  curr : 3 2 2 
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    public static void print_arr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" "); //1 2 3 4 5
        }
    }
    public static void main(String[] args) {
        int arr[]= {3,6,2,1,8,7,4,5,3,1};
        insertSort(arr);
        print_arr(arr);

    }
    
}
