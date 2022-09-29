package com.example.domain.user.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="m_tweet")
public class Tweet {
    @Id
    private Integer userId;
    private String tweet;
}
