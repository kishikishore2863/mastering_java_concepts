package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prime {
    public static void main(String[] args) {
        int[] passengers = {19, 13, 26, 4, 25, 11, 21};
        int[] buses = {20, 30, 10}; // Bus arrival times (not capacity)

        final int BUS_CAPACITY = 2; // Each bus can take only 2 passengers

        List<List<Integer>> busAllocations = new ArrayList<>();
        for (int k = 0; k < buses.length; k++) {
            busAllocations.add(new ArrayList<>()); // Create empty lists for each bus
        }

        Arrays.sort(passengers);
        Arrays.sort(buses);

        System.out.println("Sorted Passengers: " + Arrays.toString(passengers));
        System.out.println("Sorted Buses: " + Arrays.toString(buses));

        int i = 0; // Passenger index
        int j = 0; // Bus index

        while (i < passengers.length && j < buses.length) {
            if (passengers[i] < buses[j] && busAllocations.get(j).size() < BUS_CAPACITY) {
                busAllocations.get(j).add(passengers[i]); // Allocate passenger to the bus
                i++; // Move to the next passenger
            } else {
                j++; // Move to the next bus if full or passenger doesn't fit
            }
        }

        System.out.println("Bus Allocations: " + busAllocations);
    }
}
