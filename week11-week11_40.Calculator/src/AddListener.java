
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdala
 */
public class AddListener implements ActionListener {
    private Calculator calc; 
    private JTextField input; 
    private JTextField output;
    private JButton button; 
    public AddListener(Calculator calc, JTextField input, JTextField output, JButton button){
        this.calc = calc; 
        this.input = input; 
        this.output = output; 
        this.button = button; 
       
    }

    @Override
    public void actionPerformed(ActionEvent add) {
      int x = Integer.parseInt(output.getText()); 
      int y = Integer.parseInt(input.getText()); 
      int sum = calc.add(x, y);
      output.setText("" + sum);
    }
    
}
