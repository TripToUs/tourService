package com.lion.BMWtour.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NaviWithQueryDto {
    private PointDto start;
    private String query;
}
