package com.ShauzabMomDadAlinaAriza.ShauzabPresentFamily.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class LocationTrackerService {

    private static final List<String> NUMBERS = Arrays.asList(
            "+918448641646", "+919015226215", "+919560481916",
            "+918750351419", "+919911632885", "+918381582591"
    );

    // This method will run every 1 second
    @Scheduled(fixedRate = 1000)
    public void trackNumbers() {
        for (String number : NUMBERS) {
            // For now: Mock location
            double lat = 28.6 + Math.random() * 0.1; // Delhi region
            double lon = 77.2 + Math.random() * 0.1;

            System.out.println("Tracking " + number + " -> Lat: " + lat + ", Lon: " + lon);
            // TODO: Save to DB or send to Kafka for real use
        }
    }
}
