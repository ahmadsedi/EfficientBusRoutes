package com.ahmadsedi.bus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 04/02/2025
 * Time: 16:47
 */

public class BusRouteOrganiserTest {
    @Test
    void linesToEliminate_given3Overlapped(){
        int[][] busStops = {{2, 4}, {3, 6}, {3, 9}, {5, 7}};
        long lines = BusRouteOrganiser.linesToEliminate(busStops);
        Assertions.assertEquals(3, lines);
    }
    @Test
    void linesToEliminate_given1Overlapped(){
        int[][] busStops = {{2, 4}, {3, 6}};
        long lines = BusRouteOrganiser.linesToEliminate(busStops);
        Assertions.assertEquals(1, lines);
    }
    @Test
    void linesToEliminate_givenNolapped(){
        int[][] busStops = {{2, 4}, {5, 6}};
        long lines = BusRouteOrganiser.linesToEliminate(busStops);
        Assertions.assertEquals(0, lines);
    }
    @Test
    void linesToEliminate_givenEmptyArray(){
        int[][] busStops = {};
        long lines = BusRouteOrganiser.linesToEliminate(busStops);
        Assertions.assertEquals(0, lines);
    }
}
