
public class JumpGame1{
    
    public static boolean jump(int nums[]){
        int lastGoodIndex = nums.length-1;
        int i=0;
        while(i<=lastGoodIndex){
            if(i+nums[i]>=lastGoodIndex){
                return true;
            }
            if(nums[i]==0 && i < lastGoodIndex){
                return false;
            }
            i=i+nums[i];
        }
        return false;
    }

    public static void main(String args[]){
        int nums[]={2,3,1,1,4};
    System.out.println(jump(nums));
    }
}
