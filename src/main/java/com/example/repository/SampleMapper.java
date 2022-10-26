package com.example.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.sample.model.Sample;

@Mapper
public interface SampleMapper {
    /** サンプル取得(1件) */
    public Sample findOne();
}
