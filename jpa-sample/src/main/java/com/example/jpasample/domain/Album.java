package com.example.jpasample.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("Album")
public class Album extends Item {
  private String artist;
  private String etc;
}
