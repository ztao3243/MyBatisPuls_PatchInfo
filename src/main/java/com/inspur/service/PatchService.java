package com.inspur.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author ZhangTao
 * @Date 2023/08/02
 * @Description
 */
public interface PatchService {

    Map<String, Object> selectPatchState(@Param("PATCHID") List<String> PATCHID);
}
