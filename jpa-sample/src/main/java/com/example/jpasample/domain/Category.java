package com.example.jpasample.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Category {
  @Id
  @GeneratedValue
  @Column(name = "CATEGORY_ID")
  private Long id;

  private String name;

  @OneToMany(mappedBy = "category")
  private List<CategoryItem> items;
}
