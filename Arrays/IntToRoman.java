
public class IntToRoman{
    
    public static String intToRoman(int num){
        int[] values={1,4,5,9,10,40,50,90,100,400,500,900,1000}; 
        String[] roman={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};       
      StringBuilder sb=new StringBuilder();
      
      for(int i=values.length-1;i>=0 && num > 0;i--){
          while(num>=values[i]){
              sb.append(roman[i]);
              num-=values[i];
          }
      }
      return sb.toString();
    }

    public static void main(String args[]){
    
    int num = 4560;
    System.out.println(intToRoman(num));

    }
}
