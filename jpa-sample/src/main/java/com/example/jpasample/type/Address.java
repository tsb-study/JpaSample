package com.example.jpasample.type;

import java.util.Objects;

import javax.persistence.Embeddable;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor
@Embeddable
public class Address {
  private String city;
  private String street;
  private String zipcode;

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Address)) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(city, address.getCity()) && Objects.equals(street, address.getStreet())
        && Objects.equals(zipcode, address.getZipcode());
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, street, zipcode);
  }
}
