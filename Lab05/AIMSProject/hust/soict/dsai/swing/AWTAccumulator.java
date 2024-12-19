package hust.soict.dsai.aims.swing;

import java.awt.Label;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class AWTAccumulator extends Frame{
    private TextField tfInput;
    private TextField tfOutput;
    private int sum = 0;

    public AWTAccumulator(){
        setLayout(new GridLayout(2,2));
        add(new Label("Enter an Interger: "));

        tfInput = new TextField(10);
        add(tfInput);
        tfInput.addActionListener(new tfInputListener());

        add(new Label("The Accumulated sum is: "));

        tfOutput = new TextField(10);
        tfOutput.setEditable(false);
        add(tfOutput);

        setTitle("AWT Accumulator");
        setSize(350, 120);
        setVisible(true);
    }

    public static void main(String[] args){
        new AWTAccumulator();
    }
    private class tfInputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ewt){
            int numberIn = Integer.parseInt(tfInput.getText());
            sum += numberIn;
            tfInput.setText("");
            tfOutput.setText(sum + "");
        }
    }

}
