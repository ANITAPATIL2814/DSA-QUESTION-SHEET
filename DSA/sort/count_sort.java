package DSA.sort;

public class count_sort {
    /* asc order 
     * public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);            

        }
        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){ //iterate on original array
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){ //iterate on frequency array
            while (count[i] > 0) { //whenever count value not become 0 put num on original array arr[j], make original array index j++; 
                arr[j] = i; //index of original array start from 0
                j++;
                count[i] --;
            }
        }

    }
    */
    /*desc order */
      public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);            
        }
        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){ //iterate on original array
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=count.length-1;i>=0;i--){ //iterate on frequency array
            while (count[i] > 0) { //whenever count value not become 0 put num on original array arr[j], make original array index j++;                 
                arr[j] = i; //index of original array start from 0
                j++;
                count[i] --;
            }
        }

    }
     
    
    public static void print_arr(int arr[])
    {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
     int arr[]={1,4,1,3,2,4,3,7};
     countingSort(arr);
     print_arr(arr);
    }
}
