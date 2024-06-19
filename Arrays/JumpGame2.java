
public class JumpGame2{
    
    public static int jump(int nums[]){
        int curMax=0;
        int curReach=0;
        int jumps=0;
        for(int i=0;i<nums.length-1;i++){
            curMax=Math.max(curMax,i+nums[i]);
            
            if(i==curReach){
                jumps++;
                curReach=curMax;
            }
        }
        return jumps;
    }

    public static void main(String args[]){

    int nums[]={2,3,1,1,4};
    System.out.println(jump(nums));

    }
}
