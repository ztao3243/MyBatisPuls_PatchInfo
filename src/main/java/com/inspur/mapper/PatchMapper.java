package com.inspur.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.inspur.entity.Patchentity;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author ZhangTao
 * @Date 2023/08/02
 * @Description
 */

@Mapper
public interface PatchMapper  extends BaseMapper<Patchentity> {
    @MapKey("PATCHID")
    Map<String, Object> selectPatchState(@Param("PATCHID") List<String> PATCHID);

}
