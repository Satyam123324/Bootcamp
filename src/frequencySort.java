import java.util.*;

public class frequencySort {
    public static void main(String[] args) {

        int[] arr = {4,5,6,5,4,3};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr)
            map.put(num, map.getOrDefault(num,0)+1);

        List<Integer> list = new ArrayList<>();

        for(int num : arr)
            list.add(num);

        list.sort((a,b)->{
            if(map.get(a).equals(map.get(b)))
                return a-b;
            return map.get(b)-map.get(a);
        });

        System.out.println(list);
    }
}