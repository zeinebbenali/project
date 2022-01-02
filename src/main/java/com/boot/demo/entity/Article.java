package com.boot.demo.entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Article {
    Long id;
    String name;
    BigDecimal amount;
    String providerName;
}
