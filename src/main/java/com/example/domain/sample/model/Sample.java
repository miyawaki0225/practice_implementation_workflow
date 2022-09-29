package com.example.domain.sample.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="sample")
public class Sample {
    @Id
    private String sampleId;

    private String sampleText;
}
