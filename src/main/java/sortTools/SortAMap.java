package sortTools;

import hanah.Inner;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortAMap {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("ankjh",23);
        map.put("ankj",20);
        map.put("ank",24);

        List<Map.Entry<String, Integer>> mapList = map.entrySet()
                .stream().sorted(new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        if(o1.getValue()>o2.getValue())
                            return 1;
                        else
                            return -1;
                    }
                })
                .collect(Collectors.toList());

        Map<String,Integer> ans = new HashMap<>();
        mapList.forEach(x->ans.put(x.getKey(),x.getValue()));
        System.out.println(ans);


    }
}
