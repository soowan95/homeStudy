import java.util.*;

public class LearnMap {
    public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<String, Integer>();
        a.put("one", 1);
        a.put("two", 2);
        a.put("Three", 3);
        System.out.println(a.get("one"));

        iteratorUsingForEach(a);
        iteratorUsingIterator(a);
    }

    static void iteratorUsingForEach(HashMap map){
        Set<Map.Entry<String, Integer>> entries = map.entrySet(); //Map은 iterator을 사용할 수 없기 때문에 .entrySet()을 통해서 Set으로 저장함.
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    static void iteratorUsingIterator(HashMap map){
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> i = entries.iterator();
        while(i.hasNext()) {
            Map.Entry<String, Integer> entry = i.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());    
        }
    }
    
}
