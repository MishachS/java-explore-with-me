package ru.practicum.mapper;

import lombok.experimental.UtilityClass;
import ru.practicum.dto.EndpointHitDto;
import ru.practicum.model.Stats;

import java.time.LocalDateTime;

@UtilityClass
public class StatsMapper {
    public static Stats endpointToStats(EndpointHitDto endpointHitDto, LocalDateTime timestamp) {
        return new Stats(null, endpointHitDto.getApp(), endpointHitDto.getUri(), endpointHitDto.getIp(), timestamp);
    }
}
