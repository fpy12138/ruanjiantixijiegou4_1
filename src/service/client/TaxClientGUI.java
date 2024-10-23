package service.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaxClientGUI {
    private JFrame frame;
    private JTextField incomeField;
    private JButton calculateButton;
    private JLabel resultLabel;
    private TaxCalculatorService service;

    public TaxClientGUI() {
        service = new TaxCalculatorService();
        initializeUI();
    }

    private void initializeUI() {
        frame = new JFrame("个人所得税计算器");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);

        incomeField = new JTextField(10);
        calculateButton = new JButton("计算税款");
        resultLabel = new JLabel("个人所得税为：0");

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateTax();
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("请输入月收入："));
        frame.add(incomeField);
        frame.add(calculateButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }

    private void calculateTax() {
        try {
            double income = Double.parseDouble(incomeField.getText());
            TaxCalculator taxCalculator = service.getTaxCalculatorPort();
            double tax = taxCalculator.calculatePersonalIncomeTax(income);
            resultLabel.setText("个人所得税为：" + tax);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "请输入有效的数字格式");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, "计算税款时发生错误");
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // 设置 Swing 应用程序的 UI 更新线程
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TaxClientGUI();
            }
        });
    }
}
