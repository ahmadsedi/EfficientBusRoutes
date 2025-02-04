package com.ahmadsedi.bus;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 04/02/2025
 * Time: 16:42
 */

public class BusRouteOrganiser {

    public static int linesToEliminate(int[][] busStops) {
        List<Bus> buses = Arrays.stream(busStops).map(Bus::new).collect(Collectors.toList());
        return (int) IntStream.range(0, busStops.length).
                mapToLong(i -> IntStream.range(i, busStops.length).filter(j -> i != j).
                        mapToObj(buses::get).filter(bus2 -> {
                    Bus bus1 = buses.get(i);
                    return !bus2.isRedundant()&&bus2.hasOverlap(bus1);
                }).count()).sum();
    }

}
