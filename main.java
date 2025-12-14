import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextLine()) return;

        String[] input = sc.nextLine().trim().split("\\s+");

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (String s : input) {
            int plant = Integer.parseInt(s);
            freqMap.put(plant, freqMap.getOrDefault(plant, 0) + 1);
        }

        int maxFreq = 0;
        int result = Integer.MAX_VALUE;

        for (int plant : freqMap.keySet()) {
            int freq = freqMap.get(plant);

            if (freq > maxFreq || (freq == maxFreq && plant < result)) {
                maxFreq = freq;
                result = plant;
            }
        }

        System.out.println(result);
    }
}
