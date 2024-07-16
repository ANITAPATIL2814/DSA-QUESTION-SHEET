package DSA.STRING;

public class directions {
    public static float shortest_path(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //south
            if(dir =='S'){
                y--;
            }
            //north
            else if(dir =='N'){
                y++;
            }
            //west
            else if(dir =='W'){
                x--;
            }
            //east
             else {
                x++;
            }
        }
        //formula 
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);//math squrt function return double value need to do typecast
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(shortest_path(path));
    }
}
