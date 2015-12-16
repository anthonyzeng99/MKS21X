import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener {
    private Container pane;
    private JTextField inputField;
    private JLabel outputMessage;

    public TempConversionWindow() {
	this.setTitle("Temperature Converter");
	this.setSize(300,200);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	inputField = new JTextField(10);

	JButton toCelciusButton = new JButton("To Celcius");
	toCelciusButton.addActionListener(this);
	toCelciusButton.setActionCommand("toC");

	JButton toFahrenheitButton = new JButton("To Fahrenheit");
	toFahrenheitButton.addActionListener(this);
	toFahrenheitButton.setActionCommand("toF");

	outputMessage = new JLabel();

	pane.add(inputField);
	pane.add(toCelciusButton);
	pane.add(toFahrenheitButton);
	pane.add(outputMessage);
	
    }

    public static double toCelcius(double temp) {
	return (temp - 32) * (5.0 / 9.0);
    }

    public static double toFahrenheit(double temp) {
	return ( temp * (9.0 / 5.0) ) + 32;
    }
    

    public void actionPerformed(ActionEvent action) {
	String event = action.getActionCommand();
	double tempToConvert;
	double convertedTemp;
	try {
	    tempToConvert = Double.parseDouble(inputField.getText());
	} catch (Exception e) {
	    outputMessage.setText("Invalid temperature format");
	    return;
	}	
	if ( event.equals("toC") ) {
	    convertedTemp = toCelcius(tempToConvert);
	    outputMessage.setText(Double.toString(convertedTemp));
	} else if ( event.equals("toF") ) {
	    convertedTemp = toFahrenheit(tempToConvert);
	    outputMessage.setText(Double.toString(convertedTemp) ); 
	}
    }
	
    

} 