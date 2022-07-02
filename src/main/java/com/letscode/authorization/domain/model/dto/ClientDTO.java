package com.letscode.authorization.domain.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor @NoArgsConstructor
public class ClientDTO {
    @NotNull
    private String name;
    @NotNull
    private String email;
    @NotNull
    private String password;
}
