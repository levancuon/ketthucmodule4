package org.example.kethucmodule4.DTO;

import java.time.LocalDateTime;

public interface OrderDTO {
     String getCategoryName();
     String getCategoryCode();
     String getProductCode();
     String getProductName();
     Double getProductPrice();
     Double getProductStatus();
     String status();
     LocalDateTime BuyDay();
     Long quantity();
     LocalDateTime dayMin();
     LocalDateTime dayMax();


}
