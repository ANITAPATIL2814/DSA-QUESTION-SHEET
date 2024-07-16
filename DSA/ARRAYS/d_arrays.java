package DSA.ARRAYS;

import java.util.Scanner;

public class d_arrays {

    /*search function
    public static boolean search(int matrix[][], int key){
        for(int i=0;i<matrix.length;i++){ //row
            for(int j=0;j<matrix[0].length;j++){ //column
                if(matrix[i][j] == key){
                    System.out.println("found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }*/
   /* smallest matrix
    * public static int smallest(int matrix[][]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){ //row
            for(int j=0;j<matrix[0].length;j++){ //column
                if(smallest > matrix[i][j]){
                    smallest=matrix[i][j];
                }
            }
        }
        System.out.println("smallest matrix is "+smallest);
        return smallest;
       
    }
    */
    public static int largest(int matrix[][]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){ //row
            for(int j=0;j<matrix[0].length;j++){ //column
                if(largest < matrix[i][j]){
                    largest=matrix[i][j];
                }
            }
        }
        System.out.println("largest matrix is "+largest);
        return largest;
       
    }

    
    
       public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=3, m=3;
        //input
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){ //row
            for(int j=0;j<m;j++){ //column
                matrix[i][j]=sc.nextInt();
            }
        }

        // //output
        for(int i=0;i<n;i++){ //row
            for(int j=0;j<m;j++){ //column
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        

        /*op for searching key
        search(matrix, 5);
        smallest(matrix);
        */
        largest(matrix);
        

    }
       
}
