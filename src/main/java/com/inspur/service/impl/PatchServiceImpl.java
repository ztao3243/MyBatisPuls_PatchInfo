package com.inspur.service.impl;

import com.inspur.mapper.PatchMapper;
import com.inspur.service.PatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author ZhangTao
 * @Date 2023/08/02
 * @Description
 */
@Service
public class PatchServiceImpl implements PatchService {

    @Autowired
    private PatchMapper patchMapper;
    @Override
    public Map<String, Object> selectPatchState(List<String> PATCHID) {
        return patchMapper.selectPatchState(PATCHID);
    }
}
