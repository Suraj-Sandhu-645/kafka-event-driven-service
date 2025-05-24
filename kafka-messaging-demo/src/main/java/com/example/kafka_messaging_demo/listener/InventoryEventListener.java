package com.example.kafka_messaging_demo.listener;

import com.example.kafka_messaging_demo.dto.InventoryEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class InventoryEventListener {

  @KafkaListener(topics = "inventory_topic", groupId = "weekly-sentiment-group")
  public void consumeInventory(InventoryEvent inventoryEvent) {
    System.out.println("Received Inventory Event: " + inventoryEvent);
  }
}
