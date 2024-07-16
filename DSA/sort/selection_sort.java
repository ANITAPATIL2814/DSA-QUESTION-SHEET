package DSA.sort;

public class selection_sort {
    public static void selection(int arr[]){
        for(int i=0 ; i<arr.length;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos] > arr[j]){ //< for decreasing order
                    minpos=j;
                }
            }
            //swap - swap with current position
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp; 
        }
    }
    public static void print_arr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }
    public static void main(String[] args) {
        int arr[]= {3,6,2,1,8,7,4,5,3,1};
        selection(arr);
        print_arr(arr);

    }
}
