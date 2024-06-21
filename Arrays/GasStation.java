
public class GasStation{
    
    public static int canCompleteCircuit(int gas[],int cost[]){
        int currentGas=0;
        int totalGas=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            currentGas+=gas[i]-cost[i];
            totalGas+=gas[i]-cost[i];
            
            if(currentGas<0){
                start=i+1;
                currentGas=0;
            }
        }
        if(totalGas>=0){
            return start;
        }else{
            return -1;
        }
    }

    public static void main(String args[]){
        
        int gas[]={1,2,3,4,5};
        int cost[]={3,4,5,1,2};
        System.out.println(canCompleteCircuit (gas,cost));

    }
}
