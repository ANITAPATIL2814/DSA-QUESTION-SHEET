package DSA.LEETCODE;

public class water {
    /* 
     * public static int trapped_rain(int height[]){
        //calculate left  max boundary - in the form of array 
        int n=height.length;
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]); //becz here we calulate from front side
        }
       

        //calculate right  max boundary - in the form of array 
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1]; //becz we are calculate rightmax from last
        for(int i=n-2;i>=0;i--){ //becz here (n-1)  alredy calulate right max bounday
            rightmax[i]=Math.max(height[i],rightmax[i+1]); //becz here we calulate from back side
        }

        int trapped_water=0;
        //loop - calculate waterlevel
        for(int i=0;i<n;i++){
            //waterlevel= min(leftmaxbound,right max bound)
           int waterlevel = Math.min(leftmax[i],rightmax[i]);
            //trapped water= (waterlevel- height)*width
           trapped_water += waterlevel-height[i];
        }
        return trapped_water;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        
        System.out.println(trapped_rain(height));
    }
    */
    // Q container with most water 
    /*1st solution
    public static int maxarea(int height[]){
        int max=0;
        for(int i=0;i<height.length;i++){ // 0 to 8
            for(int j=0;j<height.length;j++){ // 0 to 8 run 9 times
                int breadth=Math.abs(j-i);
                int length=Math.min(height[i],height[j]);
                int area=breadth*length;
                max=Math.max(area,max);
            }
        }
        return max;
    }
        */
        //2nd solution
    public static int maxarea(int height[]){
        int max=0;
        int left=0;
        int right=height.length-1;
        while(left<=right){
            int area=0;
            int length=Math.min(height[left],height[right]);
            int breadth=Math.abs(left-right);
            area=breadth*length;
            max=Math.max(area,max);
            if(height[left]<=height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        System.out.println(maxarea(height));
    }
    
}
