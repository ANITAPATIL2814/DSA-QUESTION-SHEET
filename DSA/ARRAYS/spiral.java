package DSA.ARRAYS;

public class spiral {
    public static int print_spiral(int matrix[][]){
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        while (startrow <= endrow && startcol <= endcol) {
                //top : SC--EC -- 1 2 3 4
                for(int j=startcol;j<=endcol;j++){  //j-column
                    System.out.print(matrix[startrow][j]+" ");
                }
                //right : SR+1--ER -- 8 12  16
                for(int i=startrow+1;i<=endrow;i++){
                    System.out.print(matrix[i][endcol]+" ");
                }
                //bottom : EC-1--SC -- 15 14 13
                for(int j=endcol-1;j>=startcol;j--){
                    if(startrow== endrow){
                        break;
                    }
                    System.out.print(matrix[endrow][j]+" ");
                }
                //left: ER-1--SR+1 --5 6
                for(int i=endrow-1;i>=startrow+1;i--){
                    if(startcol== endcol){
                        break;
                    }
                    System.out.print(matrix[i][startcol]+" ");
                }
                startcol++;
                startrow++;
                endcol--;
                endrow--;
        }
        return endcol;

    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        print_spiral(matrix);
    }   
}
