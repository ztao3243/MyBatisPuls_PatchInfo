package com.inspur;

import com.inspur.PatchMain;
import com.inspur.service.PatchService;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @Author ZhangTao
 * @Date 2023/08/02
 * @Description
 */
@SpringBootTest(classes = PatchMain.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestPatch {

    @Autowired
    private PatchService patchService;

    @Test
    public void selectpatch(){
        List<String> ids = new ArrayList<>();
        ids.add("0013a07e-9dce-4478-9b05-340bf4705d3b");
        ids.add("00032b72-07b9-4c40-8641-60652d191ae8");
        ids.add("0004d1d7-16e6-4c18-90bd-556dcdeae5a4");
        Map<String, List<String>> stringListMap = new HashMap<>();
        stringListMap.put("PATCHID", ids);

        Map map = patchService.selectPatchState(stringListMap.get("PATCHID"));

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
             map.get(key);
            System.out.println("key = " + key + ", value = " + map.get(key));
        }


    }
}
