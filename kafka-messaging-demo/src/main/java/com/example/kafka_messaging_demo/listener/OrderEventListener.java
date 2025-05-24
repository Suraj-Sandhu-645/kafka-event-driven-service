package com.example.kafka_messaging_demo.listener;

import com.example.kafka_messaging_demo.dto.OrderEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderEventListener {

  @KafkaListener(topics = "order_topic", groupId = "weekly-sentiment-group")
  public void consumeOrder(OrderEvent orderEvent) {
    System.out.println("Received Order Event: " + orderEvent);
  }
}
