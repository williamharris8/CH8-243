import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class BiodiversityTracker {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, Integer> registry = new HashMap<>();
        registry.put("Gray Wolf", 12);
        registry.put("Bald Eagle", 8);
        registry.put("Red Fox", 25);
        registry.put("Monarch Butterfly", 140);
        registry.put("River Otter", 5);

        Scanner fileScanner = new Scanner(new File("sightings.txt"));
        while (fileScanner.hasNextLine()) {
            String name = fileScanner.nextLine();
            if (registry.containsKey(name)) {
                registry.put(name, registry.get(name) + 1);
            } else {
                registry.put(name, 1);
            }
        }
        fileScanner.close();
        System.out.println(registry);

        String mostFrequentSpecies = "";
        int maxCount = Integer.MIN_VALUE;
        String leastFrequentSpecies = "";
        int minCount = Integer.MAX_VALUE;

        for (String name : registry.keySet()) {
            int count = registry.get(name);
            if (count > maxCount) {
                maxCount = count;
                mostFrequentSpecies = name;
            }
            if (count < minCount) {
                minCount = count;
                leastFrequentSpecies = name;
            }
        }
        System.out.println("Most frequent: " + mostFrequentSpecies + " (" + maxCount + ")");
        System.out.println("Least frequent: " + leastFrequentSpecies + " (" + minCount + ")");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a species name: ");
        String species = input.nextLine();

        Integer count = registry.get(species);
        if (count == null) {
            System.out.println(species + " is not currently in the registry.");
        } else {
            System.out.println(species + " population: " + count);
        }
    }
}
