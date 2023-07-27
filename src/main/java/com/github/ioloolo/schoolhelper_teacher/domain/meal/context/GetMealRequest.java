package com.github.ioloolo.schoolhelper_teacher.domain.meal.context;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public final class GetMealRequest {

    private String name;
    private String location;
}
