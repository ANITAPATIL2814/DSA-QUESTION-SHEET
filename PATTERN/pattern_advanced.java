public class pattern_advanced {
     
    /* how rectangle

    public static void hollo_rect(int row,int cols){
        //outer loop
        for(int i=1;i<=row;i++){
            //ineer loop - columns
            for(int j=1;j<=cols;j++){
                //cell - (i,j)
                if(i==1 || i==row || j==1 ||j==cols){
                    System.out.print("*");
                }
                else{

                    System.out.print(" ");
                }
            }
    System.out.println();
        }
    }
    public static void main(String[] args) {
      hollo_rect(4, 5);
    } 
    */
    /*
     * half pyramid
     * public static void pyramid(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //ineer loop - columns
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
    System.out.println();
        }
    }
    public static void main(String[] args) {
      pyramid( 4);
    } 
     */
    /*
     * inverted half pyramid
     * 
     * public static void pyramid(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //ineer loop - numbers
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            
    System.out.println();
        }
    }
    public static void main(String[] args) {
      pyramid( 5);
    } 
     */
    /*
     * floyd's triangle
     *  public static void pyramid(int n){
        //outer loop
        int counter =1;
        for(int i=1;i<=n;i++){
            //ineer loop - how many times  will counter  be printed 
            for(int j=1;j<=i+1;j++){
                System.out.print(counter+" ");
                counter++;
            }
            
    System.out.println();
        }
    }
    public static void main(String[] args) {
      pyramid( 5);
    } 
     */
    /*
     * zero_one triangle
     * public static void zero_one_triangle(int n){
        //outer loop
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                if((i+j)%2==0){ //to print even or odd
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
                
            }
            
    System.out.println();
        }
    }
    public static void main(String[] args) {
      zero_one_triangle( 5);
    } 

}

     */
    /*
     * butterfly pattern
     * public static void butterfly(int n){
        // 1st half
        for(int i=1;i<=n;i++){
            //stars-i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces- 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars-i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }    
        System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--){
           
                //stars-i
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                //spaces- 2*(n-i)
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
                }
                //stars-i
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }    
            System.out.println();
        }
        

    }
    public static void main(String[] args) {
      butterfly( 5);
    } 


     */
    /*
     * solid rombus
     * public static void rombus(int n){
        // 1st half
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        rombus(5);
    }
     */
    /*hollow rhombus
    public static void rombus(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //hollow rect - stars
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        rombus(5);
    }
*/
/*
 *  diamond rhombus
 * 
 */
public static void diamond(int n){
        //1st half
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=(2*i)-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
           
        
        //2nd half
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=(2*i)-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
    
    
    public static void main(String[] args) {
        diamond(5);
    }
}


    