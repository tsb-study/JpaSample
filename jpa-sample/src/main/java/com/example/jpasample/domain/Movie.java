package com.example.jpasample.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("Movie")
public class Movie extends Item {
  private String director;
  private String actor;
}
