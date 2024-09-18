package com.devteria.identity_service.dto.request;

import com.devteria.identity_service.entity.Employee;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TimeSheetRequest {
    LocalDateTime timeIn;

    LocalDateTime  timeOut;

    Long late;

    Long workHour;

    Employee employee;
}