package com.cloudspatialprovider.api;

import com.cloudspatialprovider.programmingchallenge.model.LatLong;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * FetchDistanceInMeters.
 *
 * @author Viktoryia Zhak
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class FetchDistanceInMeters {
    private static final int SQUARE = 2;

    public static double calculate(LatLong from, LatLong to) {
        int latitudeStart = from.getLatitude();
        int latitudeFinish = to.getLatitude();
        int longitudeStart = from.getLongitude();
        int longitudeFinish = to.getLongitude();

        return Math.sqrt(Math.pow((latitudeFinish - latitudeStart), SQUARE) + Math.pow((longitudeFinish - longitudeStart), 2));
    }
}
