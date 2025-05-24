package com.example.kafka_messaging_demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderEvent {
  private String orderId;
  private String product;
  private int quantity;
  private double price;
}
