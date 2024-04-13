import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Welcome to the Effective Ecological Footprint Calculator!");

        JFrame frame = new JFrame("Ecological Footprint Calculator");

        String[] consumptionLevels = { "Low", "Mid", "High" };
        JComboBox<String> enterConsumption = new JComboBox<>(consumptionLevels);

        String[] dietCategories = { "Animal Consumption", "Plant-Based Diet" };
        JComboBox<String> enterDiet = new JComboBox<>(dietCategories);

        String[] trashCategories = { "Recyclable", "Compostable" };
        JComboBox<String> enterTrash = new JComboBox<>(trashCategories);

        JButton calculateFootprint = new JButton("Calculate Footprint");

        // add components to frame
        frame.add(enterConsumption);
        frame.add(enterDiet);
        frame.add(enterTrash);
        frame.add(calculateFootprint);

        // add action listener to button
        calculateFootprint.addActionListener(e -> {
            // get input values
            String consumption = (String) enterConsumption.getSelectedItem();
            String diet = (String) enterDiet.getSelectedItem();
            String trash = (String) enterTrash.getSelectedItem();

            // convert consumption level to numerical value
            int consumptionValue;
            switch (consumption) {
                case "Low":
                    consumptionValue = 1;
                    break;
                case "Mid":
                    consumptionValue = 3;
                    break;
                case "High":
                    consumptionValue = 5;
                    break;
                default:
                    consumptionValue = 0;
            }

            // calculate and display footprint
            double footprint = calculateFootprint(consumptionValue, diet, trash);
            if (footprint <= 0.5) {
                System.out.println("You're saving the world!");
            } else if (footprint >= 1.5) {
                System.out.println("You're average, not helping or destroying.");
            } else if (footprint >= 2.5) {
                System.out.println("You're not contributing to the ecological footprint.");
            }
        });

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static double calculateFootprint(int consumption, String diet, String trash) {
        return 0.0;
    }
}