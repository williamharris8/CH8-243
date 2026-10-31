import java.util.HashMap;
import java.util.Scanner;

public class BiodiversityTracker {
    public static void main(String[] args) {
        HashMap<String, Integer> registry = new HashMap<>();
        registry.put("Gray Wolf", 12);
        registry.put("Bald Eagle", 8);
        registry.put("Red Fox", 25);
        registry.put("Monarch Butterfly", 140);
        registry.put("River Otter", 5);

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