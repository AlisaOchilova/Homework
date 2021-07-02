package homework5;

import java.util.*;
import java.util.Collection;

public class NewMap {

    public static <String, Animals> Map<Animals, java.util.Collection<String>> inverse(Map<String, Animals> map){
        Map<Animals, Collection<String>> resultMap = new HashMap<>();

        Set<String> keys = map.keySet();
        for(String key : keys){
            Animals value = map.get(key);
            resultMap.compute(value, (v, ks) -> {
                if(ks == null){
                    ks = new HashSet<>();
                }
                ks.add(key);
                return ks;
            });
        }

        return resultMap;
    }
}
