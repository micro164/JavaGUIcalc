import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

/**
 * @author Micro164
 * Class calculator that extends the class JFrame and implements ActionListener.
 * This is a simple scientific calculator, meaning it has more than the basic
 * add, subtract, multiply, and divide functions. It also implements this functions
 * in a GUI.
 */

public class Calculator extends JFrame implements ActionListener{

	/**
	 * The variables WIDTH, HEIGHT, and NUM_OF_DIG are initialized for the GUI
	 */
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 300;
	public static final int HEIGHT = 400;
	public static final int NUM_OF_DIG = 20;
	private JTextField ioField;
	private double answer = 0.0;
	
	/**
	 * Main method for creating the GUI calculator
	 * @param args
	 */
	public static void main(String[] args) {
		Calculator aCalculator = new Calculator();
		aCalculator.setVisible(true);
	}
	
	/**
	 * The Constructor of calculator, which sets up the buttons and window for the GUI calculator.
	 */
	public Calculator(){
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		setLayout(new BorderLayout());
		JPanel textPanel = new JPanel();
		textPanel.setLayout(new FlowLayout());
		ioField = new JTextField("",NUM_OF_DIG);
		ioField.setBackground(Color.WHITE);
		textPanel.add(ioField);
		add(textPanel, BorderLayout.NORTH);
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.BLACK);
		buttonPanel.setLayout(new GridLayout(7,4));
		
		JButton SinButton = new JButton("Sin");
		SinButton.addActionListener(this);
		buttonPanel.add(SinButton);
		
		JButton CosButton = new JButton("Cos");
		CosButton.addActionListener(this);
		buttonPanel.add(CosButton);
		
		JButton TanButton = new JButton("Tan");
		TanButton.addActionListener(this);
		buttonPanel.add(TanButton);
		
		JButton lParenButton = new JButton("(");
		lParenButton.addActionListener(this);
		buttonPanel.add(lParenButton);
		
		JButton aSinButton = new JButton("aSin");
		aSinButton.addActionListener(this);
		buttonPanel.add(aSinButton);
		
		JButton aCosButton = new JButton("aCos");
		aCosButton.addActionListener(this);
		buttonPanel.add(aCosButton);
		
		JButton aTanButton = new JButton("aTan");
		aTanButton.addActionListener(this);
		buttonPanel.add(aTanButton);
		
		JButton rParenButton = new JButton(")");
		rParenButton.addActionListener(this);
		buttonPanel.add(rParenButton);
		
		JButton sqrtButton = new JButton("sqrt");
		sqrtButton.addActionListener(this);
		buttonPanel.add(sqrtButton);
		
		JButton logButton = new JButton("ln");
		logButton.addActionListener(this);
		buttonPanel.add(logButton);
		
		JButton expButton = new JButton("e^a");
		expButton.addActionListener(this);
		buttonPanel.add(expButton);
		
		JButton ansButton = new JButton("ANS");
		ansButton.addActionListener(this);
		buttonPanel.add(ansButton);
		
		JButton sevenButton = new JButton("7");
		sevenButton.addActionListener(this);
		buttonPanel.add(sevenButton);
		
		JButton eightButton = new JButton("8");
		eightButton.addActionListener(this);
		buttonPanel.add(eightButton);
		
		JButton nineButton = new JButton("9");
		nineButton.addActionListener(this);
		buttonPanel.add(nineButton);
		
		JButton mulButton = new JButton("*");
		mulButton.addActionListener(this);
		buttonPanel.add(mulButton);
		
		JButton fourButton = new JButton("4");
		fourButton.addActionListener(this);
		buttonPanel.add(fourButton);
		
		JButton fiveButton = new JButton("5");
		fiveButton.addActionListener(this);
		buttonPanel.add(fiveButton);
		
		JButton sixButton = new JButton("6");
		sixButton.addActionListener(this);
		buttonPanel.add(sixButton);
		
		JButton subButton = new JButton("-");
		subButton.addActionListener(this);
		buttonPanel.add(subButton);
		
		JButton oneButton = new JButton("1");
		oneButton.addActionListener(this);
		buttonPanel.add(oneButton);
		
		JButton twoButton = new JButton("2");
		twoButton.addActionListener(this);
		buttonPanel.add(twoButton);
		
		JButton threeButton = new JButton("3");
		threeButton.addActionListener(this);
		buttonPanel.add(threeButton);
		
		JButton addButton = new JButton("+");
		addButton.addActionListener(this);
		buttonPanel.add(addButton);
		
		JButton zeroButton = new JButton("0");
		zeroButton.addActionListener(this);
		buttonPanel.add(zeroButton);
		
		JButton clearButton = new JButton("Clear");
		clearButton.addActionListener(this);
		buttonPanel.add(clearButton);
		
		JButton eqButton = new JButton("=");
		eqButton.addActionListener(this);
		buttonPanel.add(eqButton);
		
		JButton divButton = new JButton("/");
		divButton.addActionListener(this);
		buttonPanel.add(divButton);
		
		add(buttonPanel, BorderLayout.CENTER);
	}

	/**
	 * Throws exceptions if input is wrong
	 */
	public void actionPerformed(ActionEvent e){
		try{
			CorrectNumForm(e);
		}catch (NumberFormatException e2){
			ioField.setText("ERROR");
		} catch (ScriptException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	/**
	 * This is the actual implementation of the GUI calculator
	 * @param e
	 * @throws ScriptException
	 */
	
	public void CorrectNumForm(ActionEvent e)throws ScriptException{
		switch(e.getActionCommand()){
		case "+":
			ioField.setText(ioField.getText() + "+");
			break;
		case "-":
			ioField.setText(ioField.getText() + "-");
			break;
		case "*":
			ioField.setText(ioField.getText() + "*");
			break;
		case "/":
			ioField.setText(ioField.getText() + "/");
			break;
		case "9":
			ioField.setText(ioField.getText() + "9");
			break;
		case "8":
			ioField.setText(ioField.getText() + "8");
			break;
		case "7":
			ioField.setText(ioField.getText() + "7");
			break;
		case "6":
			ioField.setText(ioField.getText() + "6");
			break;
		case "5":
			ioField.setText(ioField.getText() + "5");
			break;
		case "4":
			ioField.setText(ioField.getText() + "4");
			break;
		case "3":
			ioField.setText(ioField.getText() + "3");
			break;
		case "2":
			ioField.setText(ioField.getText() + "2");
			break;
		case "1":
			ioField.setText(ioField.getText() + "1");
			break;
		case "0":
			ioField.setText(ioField.getText() + "0");
			break;
		case "Sin":
			ioField.setText(ioField.getText() + "Sin (");
			break;
		case "Cos":
			ioField.setText(ioField.getText() + "Cos (");
			break;
		case "Tan":
			ioField.setText(ioField.getText() + "Tan (");
			break;
		case "aSin":
			ioField.setText(ioField.getText() + "aSin (");
			break;
		case "aCos":
			ioField.setText(ioField.getText() + "aCos (");
			break;
		case "aTan":
			ioField.setText(ioField.getText() + "aTan (");
			break;
		case "sqrt":
			ioField.setText(ioField.getText() + "sqrt (");
			break;
		case "ln":
			ioField.setText(ioField.getText() + "ln (");
			break;
		case "e^a":
			ioField.setText(ioField.getText() + "exp (");
			break;
		case "ANS":
			ioField.setText(ioField.getText() + answer);
			break;
		case "(":
			ioField.setText(ioField.getText() + "(");
			break;
		case ")":
			ioField.setText(ioField.getText() + ")");
			break;
		case "Clear":
			ioField.setText("");
			break;
		case "=":
			ScriptEngineManager mgr = new ScriptEngineManager();
		    ScriptEngine engine = mgr.getEngineByName("JavaScript");
		    String temp = ioField.getText();
		    temp = temp.replace("aSin", "Math.asin");
		    temp = temp.replace("aCos", "Math.acos");
		    temp = temp.replace("aTan", "Math.atan");
		    temp = temp.replace("Sin", "Math.sin");
		    temp = temp.replace("Cos", "Math.cos");
		    temp = temp.replace("Tan", "Math.tan");
		    temp = temp.replace("sqrt", "Math.sqrt");
		    temp = temp.replace("ln", "Math.log");
		    temp = temp.replace("exp", "Math.exp");
		    String Sanswer = (engine.eval(temp)).toString();
		    ioField.setText(Sanswer);
		    answer = stringToDouble(Sanswer);
			break;
		}
	}
	
	private static double stringToDouble(String sObj){
		return Double.parseDouble(sObj.trim());
	}
}