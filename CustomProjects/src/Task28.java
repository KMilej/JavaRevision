import java.util.ArrayList;
import java.util.Random;

public class Task28 {
    public void task28() {
        ArrayList<String> elements = new ArrayList<>();
        elements.add("ball");
        elements.add("nose");
        elements.add("car");
        elements.add("white");
        elements.add("yellow");
        elements.add("blue");
        elements.add("orange");
        elements.add("black");
        elements.add("pink");
        elements.add("gray");

        ArrayList<String> randomElements = new ArrayList<>();
        Random random = new Random();

        while (randomElements.size() < elements.size()) {
            int index = random.nextInt(elements.size());
            String element = elements.get(index);

            if (!randomElements.contains(element)) {
                randomElements.add(element);
            }
        }
        System.out.println("Original list: " + elements);
        System.out.println("Randomized list: " + randomElements);

    }
}
