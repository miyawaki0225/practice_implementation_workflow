package com.example.domain.sample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.sample.model.Sample;
import com.example.domain.sample.service.SampleService;
import com.example.repository.SampleMapper;

@Service
public class SampleServiceImpl implements SampleService {

    @Autowired
    private SampleMapper mapper;

    @Override
    public Sample getSample() {
        return mapper.findOne();
    }
}
