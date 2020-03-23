package com.dftcmedia.tckk.microservice.eureka;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        Integer[] arr={3, 3, 9, 4, 9, 2, 2, 8, 9, 9, 8, 9};
        sort(arr);
    }
    public static void get() {
        System.out.println("Get");
        throw new NullPointerException();
    }

    public static void sort(Integer[] arr) {
        Map<Integer,Integer> map = new LinkedHashMap(arr.length);
        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list);
        for (Integer integer : list) {
            Integer integer1 = map.get(integer);
            if(Objects.isNull(integer1)){
                map.put(integer, 1);
            }else {
                map.put(integer, map.get(integer)+1);
            }

        }

        List<Integer> collect = map.entrySet().stream().map(e -> {
            TestData testData = new TestData();
            testData.setKey(e.getKey());
            testData.setValue(e.getValue());
            return testData;
        }).sorted(Comparator.comparing(TestData::getValue).thenComparing(TestData::getKey)).map(TestData::getKey).collect(Collectors.toList());
        System.out.println(collect);

    }

    static class TestData{
        private Integer key;
        private Integer value;

        public Integer getKey() {
            return key;
        }

        public void setKey(Integer key) {
            this.key = key;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }
    }

    public static boolean f(List<Integer> list, int sum) {
        for (int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if((list.get(i)+list.get(j))==sum){
                    return true;
                }
            }
        }
        return false;
    }
}
