package com.kdyzm.spring.helloworld.JUC;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: dirk
 * @CreateDate: 2019-04-24 17:12
 */
public class TestConcurrentHashMap {
    public static void main(String[] args) {
        Map map = new ConcurrentHashMap();
        /*map.putIfAbsent(1,1);
        map.putIfAbsent(17,17);
        map.putIfAbsent(33,33);

        System.out.println(map.get(17));*/


        fullPutCoverage(map);
        System.out.println("size="+map.size());
    }

    public static void fullPutCoverage(Map map){
        map.putIfAbsent(7,7);
        map.putIfAbsent(23,23);
        map.putIfAbsent(39,39);

        map.putIfAbsent(11,11);
        map.putIfAbsent(27,27);

        map.putIfAbsent(15,15);
        map.putIfAbsent(31,31);
        map.putIfAbsent(47,47);
        map.putIfAbsent(63,63);
        map.putIfAbsent(79,79);
        map.putIfAbsent(95,95);
        map.putIfAbsent(111,111);
        map.putIfAbsent(127,127);


        for(Object key : map.keySet()){
            System.out.println("k=>"+key+",v=>"+map.get(key));
        }

    }
}
