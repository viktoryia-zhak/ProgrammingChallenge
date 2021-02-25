package com.cloudspatialprovider.programmingchallenge.web.request;

import com.cloudspatialprovider.programmingchallenge.model.LatLong;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * UpdateDistanceRequest.
 *
 * @author Viktoryia Zhak
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateDistanceRequest {
    @NotNull
    private LatLong from;

    @NotNull
    private LatLong to;
}
