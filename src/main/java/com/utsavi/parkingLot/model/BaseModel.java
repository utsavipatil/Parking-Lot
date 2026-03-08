package com.utsavi.parkingLot.model;

import lombok.Data;

import java.util.Date;

@Data
public abstract class BaseModel { //Common Attributes
  private Long id;
  private Date createdAt;
  private Date modifiedAt;
}
