package homework5;

import java.util.*;

public class Test {
    public static void main(String[] args){

        Cat cat1 = new Cat(AnimalsType.CAT, "ferve", "eer1");
        Cat cat2 = new Cat(AnimalsType.CAT, "ferve", "eer2");

        Dog dog1 = new Dog(AnimalsType.DOG, "fsfdsferve", "dfsdfeer1");
        Dog dog2 = new Dog(AnimalsType.DOG, "fsfdsferve", "dfsdfeer2");

        List<Animals> list = new ArrayList<>();
        list.add(cat1);
        list.add(cat2);
        list.add(dog1);
        list.add(dog2);

        Set<Animals> set = new HashSet(list);

        Map<String,Animals> map = new HashMap();
        map.put(cat1.getName(), cat1);
        map.put(cat2.getName(), cat2);
        map.put(dog1.getName(), dog1);
        map.put(dog2.getName(), dog2);

    };
}
