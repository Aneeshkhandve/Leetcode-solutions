
public class ZigzagConversion{
    
    public static String convert(String s,int numRows){
        if(numRows==1){
            return s;
        }
        StringBuilder str = new StringBuilder();
        int k = (numRows-1)*2;
        int n = s.length();
        for(int i=0;i<numRows;i++){
            int index = i;
            while(index<n){
                str.append(s.charAt(index));
                if(i!=0 && i!=numRows-1){
                    int k1 = k-(2*i);
                    int k2 = index+k1;
                    if(k2<n){
                        str.append(s.charAt(k2));
                    }
                }
                index+=k;
            }
        }
        return str.toString();
    }

    public static void main(String args[]){
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s,numRows));


    }
}
