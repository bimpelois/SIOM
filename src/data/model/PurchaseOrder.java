package data.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PurchaseOrder {
    private int orderId;
    private String supplierId;
    private String status;
    private PurchaseOrder Status;
    private LocalDateTime createdAt;
    private BigDecimal Price;
}
