package com.boot.demo.entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
public class stock {
    Long id;
    BigDecimal quantiy;
    LocalDate startDate;
    Long acticleId;
}
