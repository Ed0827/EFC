import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class EcologicalFootprintCalculator extends JFrame {
    private JComboBox<String> enterConsumption;
    private JComboBox<String> enterDiet;
    private JComboBox<String> enterTrash;
    private JButton calculateFootprint;

    public EcologicalFootprintCalculator() {
        super("Ecological Footprint Calculator");
        initializeComponents();
        layoutComponents();
        addListeners();
        finalizeFrame();
    }

    private void initializeComponents() {
        String[] consumptionLevels = {"Low", "Mid", "High"};
        String[] dietCategories = {"Animal Consumption", "Plant-Based Diet"};
        String[] trashCategories = {"Recyclable", "Compostable"};
        enterConsumption = new JComboBox<>(consumptionLevels);
        enterDiet = new JComboBox<>(dietCategories);
        enterTrash = new JComboBox<>(trashCategories);

        calculateFootprint = new JButton("Calculate Footprint");
    }

    private void layoutComponents() {
        setLayout(new GridLayout(5, 1));  // 5 rows, 1 column
        add(new JLabel("Select Consumption Level:"));
        add(enterConsumption);
        add(new JLabel("Select Diet Type:"));
        add(enterDiet);
        add(new JLabel("Select Trash Type:"));
        add(enterTrash);
        add(calculateFootprint);
    }

    private void addListeners() {
        calculateFootprint.addActionListener(e -> {
            String consumption = (String) enterConsumption.getSelectedItem();
            String diet = (String) enterDiet.getSelectedItem();
            String trash = (String) enterTrash.getSelectedItem();
            double footprint = calculateFootprint(consumption, diet, trash);
            JOptionPane.showMessageDialog(this, "Your ecological footprint is: " + footprint);
        });
    }

    private double calculateFootprint(String consumption, String diet, String trash) {
        // Placeholder for calculation logic
        return Math.random() * 10;  // Simulate some footprint value
    }

    private void finalizeFrame() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new EcologicalFootprintCalculator();
    }
}
