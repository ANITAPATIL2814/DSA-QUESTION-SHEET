package DSA.sort;

public class bubble_sort {
    public static void bubble_sort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){

            for(int j=0;j<arr.length-1-turn;j++){
                //swap
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    /*
     * //if array is already sorted then we need to make one variable and increament
    public static void bubble_sort_algo(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int swaps=0;
            for(int j=0;j<arr.length-1-turn;j++){
                
                swaps++;
                
            }
        }
    }
     */
    
    public static void print_arr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }
    public static void main(String[] args) {
        int arr[]= {3,6,2,1,8,7,4,5,3,1};
        bubble_sort(arr);
        print_arr(arr);
    }
}
