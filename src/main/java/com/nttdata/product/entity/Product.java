package com.nttdata.product.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Data
@Document
public class Product {
    @Id
    private String id;
    private String name;
    private String type;
    private Double maintenanceFee;
    private int movementLimit;
    private Date day;
}
