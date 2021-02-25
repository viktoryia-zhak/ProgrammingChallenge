package com.cloudspatialprovider.programmingchallenge.service;

import com.cloudspatialprovider.api.FetchDistanceInMeters;
import com.cloudspatialprovider.programmingchallenge.model.LatLong;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * DistanceService.
 * Service that provides distance from two geographic locations.
 *
 * @author Viktoryia Zhak
 */
@RequiredArgsConstructor
@Slf4j
@Service
public class DistanceService {

    @Cacheable(value = "distance", key = "{#from, #to}")
    public Double distanceInMeters(LatLong from, LatLong to) {
        Double distance = FetchDistanceInMeters.calculate(from, to);

        log.info(String.format("-------CALCULATED DISTANCE BETWEEN POINTS {%s,%s} IS %s}----------", from, to, distance));

        return distance;
    }

    @CacheEvict(value = "distance", key = "{#from, #to}")
    public void updateDistance(LatLong from, LatLong to) {
        log.info(String.format("-------UPDATING DISTANCE BETWEEN POINTS {%s,%s}----------", from, to));
        //logic for updating
    }
}
