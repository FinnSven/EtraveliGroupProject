package com.etraveligroup.refactoring.movieRental.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CultMoviePricingStrategyTest {

    @Test
    void testFullRentalProcess() {
        // Given
        double sourcingFee = 20.0;
        int daysRented = 4;
        CultMoviePricingStrategy pricingStrategy = new CultMoviePricingStrategy(sourcingFee);

        // When
        double price = pricingStrategy.calculatePrice(daysRented);
        int points = pricingStrategy.calculatePoints(daysRented);
        RentalInfo rentalInfo = new RentalInfo(price, points);
        String aiResult = pricingStrategy.searchForCopy("Repo Man");

        // Then
        assertEquals(18.0 + 20.0, price, 0.01); // 10 + 4*2 + 20 = 18 + 20
        assertEquals(2, points); // daysRented > 2
        assertTrue(aiResult.contains("found rare copy"));
        assertEquals(price, rentalInfo.getAmount(), 0.001);
        assertEquals(points, rentalInfo.getFrequentRenterPoints());
    }
}