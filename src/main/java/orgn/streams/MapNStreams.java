package orgn.streams;

import java.util.*;
import java.util.stream.Collectors;

public class MapNStreams {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(19,"ram");
        map.put(1,"kam");
        map.put(6,"jam");
        map.put(5,"wam");
        map.put(20,"pam");

        //take the map values and sort them to a list

        List<String> motul = map.entrySet()
                        .stream().sorted(new Comparator<Map.Entry<Integer, String>>() {
                    @Override
                    public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                        if(o1.getKey()>o2.getKey()) {
                            return 1;
                        }
                        return -1;
                    }
                }).map(Map.Entry::getValue).collect(Collectors.toList());

        System.out.println(motul);


        //iterate over the map and just print the key

        map.entrySet().stream()
                .forEach((x)->{
                    System.out.println(x.getKey());
                });

        //sort the map on the basis of the values

        Map<Integer, String> a = map.entrySet().stream()
                .sorted(new Comparator<Map.Entry<Integer, String>>() {
                    @Override
                    public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                        return o1.getKey() - o2.getKey();
                    }
                }).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(x,y)->x, LinkedHashMap::new));

        System.out.println(a);

//        Map.Entry::getKey and Map.Entry::getValue: These are method references. Map.Entry::getKey refers to the getKey() method of the Map.Entry interface, and Map.Entry::getValue refers to the getValue() method. These methods are used as mapping functions to extract the key and value from each Map.Entry object in the stream.
//
//        (x, y) -> x: This is a merge function. It specifies what to do when encountering duplicate keys during the collection process. In this case, if there are duplicate keys, it uses the value of the existing key (denoted by x) and ignores the new value (denoted by y). This effectively preserves the original value associated with the key.
//
//                LinkedHashMap::new: This specifies the type of map to be created to store the collected entries. In this case, a LinkedHashMap is used, which preserves the order of insertion of elements. This ensures that the order of elements in the resulting map is the same as the order in which they were encountered in the stream.
//
//                Putting it all together, Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x, y) -> x, LinkedHashMap::new) collects the elements of the stream into a map where each entry is obtained by applying the getKey() method to extract the key and the getValue() method to extract the value from each Map.Entry object. If
//                there are duplicate keys, it keeps the original value associated with the key, and it uses a LinkedHashMap to preserve the insertion order of elements in the resulting map.
    }
}
