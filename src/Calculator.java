import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	boolean isOperatorClicked=false;
	float result = 0;
	float oldValueF;
	float newValueF;
	float OperaterResult=0;
	String oldValue;
	String currentOperator="";
	
	JFrame jf;
	JLabel displayJLabel,OldDisplayLabel,OperatorLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton zeroButton;
	JButton dotButton,plusButton,minusButton,mulButton,divButton,equalButton,DualzeroButton;
	JButton clearButton,BackButton,linkButton;
	
	
//	===== constructor ====
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(415,475);
		jf.setLocation(850,180);
		jf.getContentPane().setBackground(Color.black);;
		
		displayJLabel=new JLabel();
		displayJLabel.setBounds(76,55,312,80);
		displayJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayJLabel.setForeground(Color.white);
		displayJLabel.setBackground(Color.black);
		displayJLabel.setFont(new Font("Arail",Font.PLAIN,55));
		displayJLabel.setOpaque(true);
		
		OldDisplayLabel=new JLabel();
		OldDisplayLabel.setBounds(90,20,290,35);
		OldDisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		OldDisplayLabel.setForeground(Color.gray);
		OldDisplayLabel.setBackground(Color.black);
		OldDisplayLabel.setFont(new Font("Arail",Font.PLAIN,20));
		OldDisplayLabel.setOpaque(true);
		
		OperatorLabel=new JLabel();
		OperatorLabel.setBounds(5,65,70,70);
		OperatorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		OperatorLabel.setForeground(Color.gray);
		OperatorLabel.setBackground(Color.black);
		OperatorLabel.setFont(new Font("Arail",Font.PLAIN,50));
		OperatorLabel.setOpaque(true);
		
		jf.add(displayJLabel);
		jf.add(OldDisplayLabel);
		jf.add(OperatorLabel);
		
//		======= Buttons ======
		sevenButton=new JButton("7");
		sevenButton.addActionListener(this);
		sevenButton.setBounds(5,140,70,70);
		sevenButton.setBackground(new Color(47, 54, 70));
		sevenButton.setForeground(Color.WHITE);
		sevenButton.setBorder(BorderFactory.createLineBorder(Color.black));
		sevenButton.setFont(new Font("Arail",Font.PLAIN,30));
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.addActionListener(this);
		eightButton.setBounds(75,140,70,70);
		eightButton.setBackground(new Color(47, 54, 70));
		eightButton.setForeground(Color.WHITE);
		eightButton.setBorder(BorderFactory.createLineBorder(Color.black));
		eightButton.setFont(new Font("Arail",Font.PLAIN,30));
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.addActionListener(this);
		nineButton.setBounds(145,140,70,70);
		nineButton.setBackground(new Color(47, 54, 70));
		nineButton.setForeground(Color.WHITE);
		nineButton.setBorder(BorderFactory.createLineBorder(Color.black));
		nineButton.setFont(new Font("Arail",Font.PLAIN,30));
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.addActionListener(this);
		fourButton.setBounds(5,210,70,70);
		fourButton.setBackground(new Color(47, 54, 70));
		fourButton.setForeground(Color.WHITE);
		fourButton.setBorder(BorderFactory.createLineBorder(Color.black));
		fourButton.setFont(new Font("Arail",Font.PLAIN,30));
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.addActionListener(this);
		fiveButton.setBounds(75,210,70,70);
		fiveButton.setBackground(new Color(47, 54, 70));
		fiveButton.setForeground(Color.WHITE);
		fiveButton.setBorder(BorderFactory.createLineBorder(Color.black));
		fiveButton.setFont(new Font("Arail",Font.PLAIN,30));
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.addActionListener(this);
		sixButton.setBounds(145,210,70,70);
		sixButton.setBackground(new Color(47, 54, 70));
		sixButton.setForeground(Color.WHITE);
		sixButton.setBorder(BorderFactory.createLineBorder(Color.black));
		sixButton.setFont(new Font("Arail",Font.PLAIN,30));
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.addActionListener(this);
		oneButton.setBounds(5,280,70,70);
		oneButton.setBackground(new Color(47, 54, 70));
		oneButton.setForeground(Color.WHITE);
		oneButton.setBorder(BorderFactory.createLineBorder(Color.black));
		oneButton.setFont(new Font("Arail",Font.PLAIN,30));
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.addActionListener(this);
		twoButton.setBounds(75,280,70,70);
		twoButton.setBackground(new Color(47, 54, 70));
		twoButton.setForeground(Color.WHITE);
		twoButton.setBorder(BorderFactory.createLineBorder(Color.black));
		twoButton.setFont(new Font("Arail",Font.PLAIN,30));
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.addActionListener(this);
		threeButton.setBounds(145,280,70,70);
		threeButton.setBackground(new Color(47, 54, 70));
		threeButton.setForeground(Color.WHITE);
		threeButton.setBorder(BorderFactory.createLineBorder(Color.black));
		threeButton.setFont(new Font("Arail",Font.PLAIN,30));
		jf.add(threeButton);
		
		dotButton=new JButton(".");
		dotButton.addActionListener(this);
		dotButton.setBounds(5,350,70,70);
		dotButton.setBackground(new Color(47, 54, 70));
		dotButton.setForeground(Color.WHITE);
		dotButton.setBorder(BorderFactory.createLineBorder(Color.black));
		dotButton.setFont(new Font("Arail",Font.PLAIN,30));
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.addActionListener(this);
		zeroButton.setBounds(75,350,70,70);
		zeroButton.setBackground(new Color(47, 54, 70));
		zeroButton.setForeground(Color.WHITE);
		zeroButton.setBorder(BorderFactory.createLineBorder(Color.black));
		zeroButton.setFont(new Font("Arail",Font.PLAIN,30));
		jf.add(zeroButton);
		
		DualzeroButton=new JButton("00");
		DualzeroButton.addActionListener(this);
		DualzeroButton.setBounds(145,350,70,70);
		DualzeroButton.setBackground(new Color(47, 54, 70));
		DualzeroButton.setForeground(Color.WHITE);
		DualzeroButton.setBorder(BorderFactory.createLineBorder(Color.black));
		DualzeroButton.setFont(new Font("Arail",Font.PLAIN,30));
		jf.add(DualzeroButton);
		
		divButton=new JButton("/");
		divButton.addActionListener(this);
		divButton.setBounds(215,140,70,70);
		divButton.setBackground(new Color(47, 54, 70));
		divButton.setForeground(new Color(247, 144, 0));
		divButton.setBorder(BorderFactory.createLineBorder(Color.black));
		divButton.setFont(new Font("Arail",Font.PLAIN,30));
		jf.add(divButton);
		
		mulButton=new JButton("x");
		mulButton.addActionListener(this);
		mulButton.setBounds(215,210,70,70);
		mulButton.setBackground(new Color(47, 54, 70));
		mulButton.setForeground(new Color(247, 144, 0));
		mulButton.setBorder(BorderFactory.createLineBorder(Color.black));
		mulButton.setFont(new Font("Arail",Font.PLAIN,30));
		jf.add(mulButton);
		
		minusButton=new JButton("-");
		minusButton.addActionListener(this);
		minusButton.setBounds(215,280,70,70);
		minusButton.setBackground(new Color(47, 54, 70));
		minusButton.setForeground(new Color(247, 144, 0));
		minusButton.setBorder(BorderFactory.createLineBorder(Color.black));
		minusButton.setFont(new Font("Arail",Font.PLAIN,30));
		jf.add(minusButton);
		
		plusButton=new JButton("+");
		plusButton.addActionListener(this);
		plusButton.setBounds(215,350,70,70);
		plusButton.setBackground(new Color(47, 54, 70));
		plusButton.setForeground(new Color(247, 144, 0));
		plusButton.setBorder(BorderFactory.createLineBorder(Color.black));
		plusButton.setFont(new Font("Arail",Font.PLAIN,30));
		jf.add(plusButton);
		
		clearButton=new JButton("Clear");
		clearButton.addActionListener(this);
		clearButton.setBounds(285,140,110,70);
		clearButton.setBackground(new Color(87, 87, 87));
		clearButton.setForeground(Color.WHITE);
		clearButton.setBorder(BorderFactory.createLineBorder(Color.black));
		clearButton.setFont(new Font("Arail",Font.PLAIN,20));
		jf.add(clearButton);
		
		BackButton=new JButton("Back");
		BackButton.addActionListener(this);
		BackButton.setBounds(285,210,110,70);
		BackButton.setBackground(new Color(87, 87, 87));
		BackButton.setForeground(Color.WHITE);
		BackButton.setBorder(BorderFactory.createLineBorder(Color.black));
		BackButton.setFont(new Font("Arail",Font.PLAIN,20));
		jf.add(BackButton);
		
		equalButton=new JButton("=");
		equalButton.addActionListener(this);
		equalButton.setBounds(285,280,110,140);
		equalButton.setBackground(new Color(247, 144, 0));
		equalButton.setForeground(Color.WHITE);
		equalButton.setBorder(BorderFactory.createLineBorder(Color.black));
		equalButton.setFont(new Font("Arail",Font.PLAIN,50));
		jf.add(equalButton);
		
		linkButton =new JButton("Rillwan");
		linkButton.addActionListener(this);
		linkButton.setBounds(130,420,150,15);
		linkButton.setBackground(Color.black);
		linkButton.setForeground(Color.WHITE);
		linkButton.setBorderPainted(false);
		linkButton.setFont(new Font("Arail",Font.PLAIN,10));
		jf.add(linkButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//========== Addition multiple ==========
	void Algorithum(float value) {
		try {
			OldDisplayLabel.setText(oldValue);
			switch (currentOperator) {
	        case "":
	        	OperaterResult = value;
	            break;
	        case "+":
	        	OperaterResult += value;
	            break;
	        case "-":
	        	OperaterResult -= value;
	            break;
	        case "*":
	        	OperaterResult *= value;
	            break;
	        case "/":
	        	OperaterResult /= value;
	            break;
			}
			
			displayJLabel.setText(OperaterResult+"");
		} catch (Exception E2) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(jf,"congratulation!!!\nDo not Work it!\nTry Again..!!!","Very Good!!!", JOptionPane.ERROR_MESSAGE);
		}
	}
	
//	==== main ==== 
	public static void main(String[] args) {
		new Calculator();
	}

//	========= Button Action ========
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	try {

		if(e.getSource() == oneButton) {
			if(isOperatorClicked) {
				displayJLabel.setText("1");
				OldDisplayLabel.setText(oldValue);
				isOperatorClicked=false;
			}else {
				displayJLabel.setText(displayJLabel.getText() + "1");
			}
			
		}else if(e.getSource()==twoButton) {
			if(isOperatorClicked) {
				displayJLabel.setText("2");
				OldDisplayLabel.setText(oldValue);
				isOperatorClicked=false;
			}else {
				displayJLabel.setText(displayJLabel.getText() + "2");
			}
			
		}else if(e.getSource()==threeButton) {
			if(isOperatorClicked) {
				displayJLabel.setText("3");
				OldDisplayLabel.setText(oldValue);
				isOperatorClicked=false;
			}else {
				displayJLabel.setText(displayJLabel.getText() + "3");
			}
			
		}else if(e.getSource()==fourButton) {
			if(isOperatorClicked) {
				displayJLabel.setText("4");
				OldDisplayLabel.setText(oldValue);
				isOperatorClicked=false;
			}else {
				displayJLabel.setText(displayJLabel.getText() + "4");
			}
			
		}else if(e.getSource()==fiveButton) {
			if(isOperatorClicked) {
				displayJLabel.setText("5");
				OldDisplayLabel.setText(oldValue);
				isOperatorClicked=false;
			}else {
				displayJLabel.setText(displayJLabel.getText() + "5");
			}
			
		}else if(e.getSource()==sixButton) {
			if(isOperatorClicked) {
				displayJLabel.setText("6");
				OldDisplayLabel.setText(oldValue);
				isOperatorClicked=false;
			}else {
				displayJLabel.setText(displayJLabel.getText() + "6");
			}
			
		}else if(e.getSource()==sevenButton) {
			if(isOperatorClicked) {
				displayJLabel.setText("7");
				OldDisplayLabel.setText(oldValue);
				isOperatorClicked=false;
			}else {
				displayJLabel.setText(displayJLabel.getText() + "7");
			}
			
		}else if(e.getSource()==eightButton) {
			if(isOperatorClicked) {
				displayJLabel.setText("8");
				OldDisplayLabel.setText(oldValue);
				isOperatorClicked=false;
			}else {
				displayJLabel.setText(displayJLabel.getText() + "8");
			}
			
		}else if(e.getSource()==nineButton) {
			if(isOperatorClicked) {
				displayJLabel.setText("9");
				OldDisplayLabel.setText(oldValue);
				isOperatorClicked=false;
			}else {
				displayJLabel.setText(displayJLabel.getText() + "9");
			}
			
		}else if(e.getSource()==zeroButton) {
			if(isOperatorClicked) {
				displayJLabel.setText("0");
				OldDisplayLabel.setText(oldValue);
				isOperatorClicked=false;
			}else {
				displayJLabel.setText(displayJLabel.getText() + "0");
			}
			
		}else if(e.getSource()==DualzeroButton) {
			if(isOperatorClicked) {
				displayJLabel.setText("00");
				OldDisplayLabel.setText(oldValue);
				isOperatorClicked=false;
			}else {
				displayJLabel.setText(displayJLabel.getText() + "00");
			}
			
		}else if(e.getSource()==dotButton) {
			displayJLabel.setText(displayJLabel.getText() + ".");
			
//			========== Addition =================
		}else if(e.getSource()==plusButton) {
			isOperatorClicked=true;
			oldValue=displayJLabel.getText();
			Algorithum(Float.parseFloat(oldValue));
			currentOperator="+";
			displayJLabel.setText("");
			OperatorLabel.setText(currentOperator);

//			========== Multiplication ===========
		}else if(e.getSource()==mulButton) {
			isOperatorClicked=true;
			oldValue=displayJLabel.getText();
			Algorithum(Float.parseFloat(oldValue));
			currentOperator="*";
			displayJLabel.setText("");
			OperatorLabel.setText(currentOperator);
			
//			========== Division ===========
		}else if(e.getSource()==divButton) {
			isOperatorClicked=true;
			oldValue=displayJLabel.getText();
			Algorithum(Float.parseFloat(oldValue));
			currentOperator="/";
			displayJLabel.setText("");
			OperatorLabel.setText(currentOperator);
			
//			========== Subtraction ===========
		}else if(e.getSource()==minusButton) {
			isOperatorClicked=true;
			oldValue=displayJLabel.getText();
			Algorithum(Float.parseFloat(oldValue));
			currentOperator="-";
			displayJLabel.setText("");
			OperatorLabel.setText(currentOperator);
			
//			========== Clear All ===========
		}else if(e.getSource()==clearButton) {
			displayJLabel.setText("");
			OldDisplayLabel.setText("");
			OperaterResult=0;
			OperatorLabel.setText("");
			
//			========== Back/clear Button =============
		}else if(e.getSource()==BackButton) {
			if(displayJLabel.getText()=="") {
				displayJLabel.setText("");
				OldDisplayLabel.setText("");
				OperaterResult=0;
				OperatorLabel.setText("");
			}else {
				displayJLabel.setText("");
			}
			
//			========== Equal Button =============
		}else if(e.getSource()==equalButton) {
			try {
				String newValue=displayJLabel.getText();
				newValueF=Float.parseFloat(newValue);
				
				Algorithum(newValueF);
				currentOperator="";
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2);
			}
		}else if(e.getSource()==linkButton) {
			if(Desktop.isDesktopSupported()) {
				
				Desktop desktop = Desktop.getDesktop();
				try {
					desktop.browse(new URI("https://www.instagram.com/rill_wan_____/"));
				} catch (Exception ex) {
					
				}
				}
		}else {
			JOptionPane.showMessageDialog(jf,"error!","Sample Tester", JOptionPane.ERROR_MESSAGE);
		}
	} catch (Exception e2) {
		// TODO: handle exception
		JOptionPane.showMessageDialog(jf,"I don't understand what you mean..!\nPress ok \nand \nTry again...","Pwolli", JOptionPane.ERROR_MESSAGE);
	}
	
}

}
