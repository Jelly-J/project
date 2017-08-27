package com.oms;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OmsApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void test() {

        ObjectMapper objectMapper = new ObjectMapper();


        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        List<String> arrayList = new ArrayList<>();
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");

        List<String> array = new ArrayList<>();
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("e");

        for (String da : list) {

            for (String d : arrayList) {
                if (da.equals(d)) {
                    array.remove(d);
                }
            }
        }

        list.addAll(array);
        list.forEach(d -> {
            System.out.println(d);
        });
    }

}
