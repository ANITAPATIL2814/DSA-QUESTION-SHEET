package DSA.divide_conquer;


public class quick_sort {
    //to print array
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void QuickSort(int arr[],int si,int ei){
        if(si >= ei){
            return;
        }
        //last element
        int p_idx = partition(arr, si, ei);
        QuickSort(arr, si, p_idx-1); //left
        QuickSort(arr, p_idx+1, ei); //right 

    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1; //to make place for ele smaller than pivot
        for(int j=si;j<ei;j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                
            }
        }
        i++;
        //swap
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        QuickSort(arr, 0, arr.length-1);
        printarr(arr);
    }
}
