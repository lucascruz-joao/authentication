package com.letscode.authorization.domain.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@AllArgsConstructor @NoArgsConstructor
public class RateDTO {
    private Long userId;
    @Max(value = 5)
    @Min(value = 0)
    private Integer value;
}
