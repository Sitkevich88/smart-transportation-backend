package ru.smart_transportation.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewOrder implements Serializable {
    private Integer station1;
    private Integer station2;
    private Integer cargoType;
    private Float weight;
    private String comment;
}
