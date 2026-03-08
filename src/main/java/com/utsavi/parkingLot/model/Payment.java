package com.utsavi.parkingLot.model;

import com.utsavi.parkingLot.enums.PaymentMode;
import com.utsavi.parkingLot.enums.PaymentStatus;

import java.util.Date;

public class Payment {
  private Date date;
  private double amount;
  private PaymentStatus paymentStatus;
  private PaymentMode paymentMode;
  private Bill bill;
  private String referenceNumber;
}
