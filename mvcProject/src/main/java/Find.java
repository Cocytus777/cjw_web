import java.util.*;

public class Find {
    public static void main(String[] args) {
        String[] arg = {"a","b","c","d"};
        List<String> argList =  new ArrayList<>(3);
        argList.add("a");
        argList.add("b");
        argList.add("c");
        Object[] a = argList.toArray();
        System.out.println(Arrays.asList(a));
        String[] b = new String[2];
        b = argList.toArray(b);
        System.out.println(Arrays.asList(b));
        String[] c = new String[3];
        argList.toArray(c);
        System.out.println(Arrays.asList(c));
        String[] d = new String[5];
        argList.toArray(d);
        System.out.println(Arrays.asList(d));
        Map<String,Object> map = new HashMap<>();
        map.put("a","aa");
        map.put("b","bb");
        Set<String> keys = map.keySet();
        Collection<Object> values = map.values();
        Set<Map.Entry<String,Object>> entrySet = map.entrySet();

    }

}