package com.dftcmedia.tckk.microservice.eureka;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        String[] arr = {"not", "add", "dog", "acid", "add", "elf", "gap", "cat", "rat" };
        List<String> list = Arrays.asList(arr);
        Test2 test2 = new Test2();
        System.out.println(test2.foo(list, "a"));
    }

    public  List<String> foo(List<String> list, String subString) {
        return list.stream().filter(str->str.indexOf(subString)!=-1).distinct().limit(3).map(e->{
            StringBuffer sb = new StringBuffer(e);
            return sb.reverse().toString();
        }).collect(Collectors.toList());
    }
}
