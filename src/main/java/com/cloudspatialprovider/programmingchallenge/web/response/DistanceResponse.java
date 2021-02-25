package com.cloudspatialprovider.programmingchallenge.web.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * DistanceResponse.
 *
 * @author Viktoryia Zhak
 */
@Getter
@Setter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DistanceResponse {
    private double distance;
}
