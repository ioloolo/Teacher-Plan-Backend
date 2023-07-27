package com.github.ioloolo.schoolhelper_teacher.domain.timetable.context;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public final class GetTimeTableRequest {

    private int school;
    private int teacher;
}