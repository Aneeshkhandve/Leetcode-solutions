
public class ReverseString{
    
    public static String reverseWords(String s){
        String ans = " ";
        for(int i=0;i<s.length();i++){
            StringBuilder sb = new StringBuilder();
            while(i<s.length() && s.charAt(i)!= ' '){
                sb.append(s.charAt(i));
                i++;
            }if(sb.length()!=0){
                ans=" " + sb + ans;
            }
        }
        return ans.substring(1);
    }

    public static void main(String args[]){
        String s="the sky is blue";
        System.out.println(reverseWords(s));


    }
}
