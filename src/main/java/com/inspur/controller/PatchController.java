package com.inspur.controller;

import com.inspur.mapper.PatchMapper;
import com.inspur.service.PatchService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @Author ZhangTao
 * @Date 2023/08/02
 * @Description
 */
@RestController
public class PatchController {

    @Autowired
    private PatchService patchService;

    @RequestMapping("/patchinfo")
    public Map<Object,Object> test(){
        List<String> ids = new ArrayList<>();
        ids.add("0013a07e-9dce-4478-9b05-340bf4705d3b");
        Map<String, List<String>> stringListMap = new HashMap<>();
        stringListMap.put("PATCHID", ids);

        Map map = patchService.selectPatchState(stringListMap.get("PATCHID"));

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = (String) map.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }
        return map;
    }
    public static void main(String[] args) {



    }
}
