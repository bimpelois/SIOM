package data.model;

import data.model.enums.productCartegory;

import java.math.BigDecimal;

public class Product {
    private int productId;
    private String sku;
    private String name;
    private productCartegory category;
    private BigDecimal unitPrice;
    private BigDecimal minStockLevel;
    private boolean active;
}
