package com.laba;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random random =new Random();
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new TreeSet<>();
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<25;i++){
            // получим случайное число
            int rand = random.nextInt(10);
            // добавим в списко
            list.add(rand);
            // если нет в set -  то добавим в set и mapm
            if (!set.contains(rand)){
                set.add(rand);
                map.put(rand,i);
            }
        }
        System.out.print("List: ");
        System.out.println(list);
        System.out.print("Set: ");
        System.out.print(set);
        System.out.println(" number of uniques numbers "+set.size());
        System.out.print("Map: ");
        System.out.println(map);
    }


}
