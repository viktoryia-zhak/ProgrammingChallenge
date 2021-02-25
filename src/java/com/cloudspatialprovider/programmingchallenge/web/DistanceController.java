package com.cloudspatialprovider.programmingchallenge.web;

import com.cloudspatialprovider.programmingchallenge.web.request.UpdateDistanceRequest;
import com.cloudspatialprovider.programmingchallenge.web.response.DistanceResponse;
import com.cloudspatialprovider.programmingchallenge.model.LatLong;
import com.cloudspatialprovider.programmingchallenge.service.DistanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * DistanceController.
 *
 * @author Viktoryia Zhak
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/distance")
public class DistanceController {
    private final DistanceService distanceService;

    @GetMapping
    public ResponseEntity<DistanceResponse> getDistance(@RequestParam LatLong from,
                                                        @RequestParam LatLong to) {
        Double distance = distanceService.distanceInMeters(from, to);
        return ResponseEntity.ok().body(new DistanceResponse(distance));
    }

    @PutMapping
    public ResponseEntity<?> updateDistance(@RequestBody @Valid UpdateDistanceRequest updateDistanceRequest) {
        distanceService.updateDistance(updateDistanceRequest.getFrom(), updateDistanceRequest.getTo());
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
