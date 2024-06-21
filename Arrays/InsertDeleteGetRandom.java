import java.util.*;
public class InsertDeleteGetRandom{
    HashMap<Integer , Integer> hm;
    List<Integer> list;

    public InsertDeleteGetRandom() {
        hm=new HashMap<>();
        list=new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(hm.containsKey(val)) return false;
        list.add(val);
        hm.put(val,list.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(hm.containsKey(val)==false)
         return false;
        int ind=hm.get(val);
        Collections.swap(list,ind,list.size()-1);
        int swappedWith=list.get(ind);
        hm.put(swappedWith,ind);
        list.remove(list.size()-1);
        hm.remove(val);
        return true;
            
    }
    
    public int getRandom() {
        Random random=new Random();
        int n=random.nextInt(list.size());
        return list.get(n);
            
    }



    public static void main(String args[]){
        
        InsertDeleteGetRandom randomizedSet=new InsertDeleteGetRandom();
        System.out.println(randomizedSet.insert(1)); 
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.insert(2)); 
        System.out.println(randomizedSet.remove(1)); 
        System.out.println(randomizedSet.remove(1)); 
        System.out.println(randomizedSet.getRandom()); 

    }
    }

