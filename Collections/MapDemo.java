package oops_with_java_2026_202501100600124.Collections;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer,Integer> mp = new HashMap<>();

        mp.put(1, 90);
        mp.put(2, 92);
        mp.put(3, 87);
        mp.put(4, 82);
        mp.put(5, 99);

        System.out.println("All student roll-marks:");
        System.out.println(mp.entrySet());
        for(Map.Entry<Integer,Integer> i : mp.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }

        if(mp.containsKey(9)){
            System.out.println(mp.get(9));
        }else{
            System.out.println("Key not found");
        }

        mp.put(4,70);
        try{
            mp.remove(9);
        }catch(Exception e){
            System.out.println("Key not found");
        }
    }
}