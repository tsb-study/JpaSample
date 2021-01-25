package com.example.jpasample.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("Book")
public class Book extends Item {
  private String author;
  private String isbn;
}
