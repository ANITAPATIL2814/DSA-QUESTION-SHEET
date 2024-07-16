package DSA;

public class PS_10 {

    public static void main(String[] args) {
       /*
       //count sort
       int n=6;
        int arr[]=new int[n];
        arr[0]=6;
        arr[1]=2;
        arr[2]=6;
        arr[3]=6;
        arr[4]=2;
        arr[5]=4;
        int mx=0;
        for(int i=0;i<n;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }    
        int count[]=new int[mx+1];
        for(int i=0;i<n;i++){
            int element=arr[i];
            count[element]++;
        }
        int k=0;
        for(int i=mx;i>=0;i--){
            int freq=count[i];
            for(int j=1;j<=freq;j++){
                arr[k]=i;
                k++;
            }
        }
        System.out.println("sorted array in desc order ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        */
        /*
         * //insertion sort
         * int n=4;
        int arr[]=new int[n];
        arr[0]=2;
        arr[1]=3;
        arr[2]=4;
        arr[3]=5;
        for(int i=1;i<n;i++){
            int j=i-1;
            int curr=arr[i];
            while(j>=0 && arr[j]<curr){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
        System.out.println("desc order");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
         */
        //selection sort
        int n=4;
        int arr[]=new int[n];
        arr[0]=2;
        arr[1]=7;
        arr[2]=4;
        arr[3]=8;
        for(int i=0;i<n;i++){
            int pos=i; //0 1 2 3
            for(int j=i+1;j<n;j++){ // (0+1 = 1 ) (1+2 = 3 )
                if(arr[pos]<arr[j]){ // (at index 1 : 7) , (at index 3: 8) so arr[pos]=7 8
                    pos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[pos];
            arr[pos]=temp;
        } 
        System.out.println("desc order");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
        
}
