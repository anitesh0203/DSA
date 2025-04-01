package lambda1.practice;

import java.util.*;
import java.util.stream.Collectors;

public class SliceStream {


    //Input: nums = [1,1,1,2,2,3], k = 2
    //Output: [1,2]
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int x : nums) {
            if(map.get(x)==null) {
                map.put(x,1);
            }else {
                map.put(x,map.get(x)+1);
            }
        }

        Map<Integer, Integer> anss = map.entrySet()
                .stream()
                .sorted(new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        return o2.getValue() - o1.getValue();
                    }
                }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x, y) -> x, LinkedHashMap::new));


        int [] ans = new int[k];

        Iterator<Map.Entry<Integer, Integer>> enter = anss.entrySet().iterator();


        for (int i=0 ;i<k;i++) {
            ans[i] = enter.next().getKey();
       }
        return ans;

    }

    public static void main(String[] args) {
        SliceStream sliceStream = new SliceStream();
        sliceStream.topKFrequent(new int []{1,1,1,2,2,3},2);
        System.out.println("hold");

    }


}
