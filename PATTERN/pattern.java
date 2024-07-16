public class pattern {
    public static void main(String[] args) {
        // for(int i=1;i<=4;i++){

        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=(4-i+1);j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // int n=4;
        // for(int line=1;line<=n;line++){
        //     for(int num=1;num<=line;num++){
        //         System.out.print(num);
        //     }
        //     System.out.println();
        // }
        // int n=4;
        // char ch='A';
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }
        
        /*int n=5;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(row<=col){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");                    
               }
            }
            System.out.println();
        }
        op:
        *****
        ****
        ***
        **
        *

        
        int n=5;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(row+col>=n+1){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");                    
               }
            }
            System.out.println();
        }
         *
        **
       ***
      ****
     *****
     */
    
//         for(int row=1;row<=6;row++){
//             for(int col=1;col<=10;col++){
//                 if(row+col>=6 )
//                 {
//                     System.out.print("*");

//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
int n=5;
int total_num_of_line=n;
int spaces=n-1;
int stars=1;
int current_num_of_line=1;
while(current_num_of_line<=total_num_of_line){
    //print spaces
    for(int i=1;i<=spaces;i++){
        System.out.print(" ");
    }
    //print stars
    for(int i=1;i<=stars;i++){
        System.out.print("*");
    }
    //prepare nect line
    System.out.println();
    current_num_of_line++;
    spaces--;
    stars++;
}
    }
}


