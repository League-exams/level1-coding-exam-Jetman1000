import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level1CodingExam implements ActionListener {
	
	JFrame frame=new JFrame();
	JPanel panel= new JPanel();
	JButton button1=new JButton();

	JButton button2=new JButton();
	
	JButton button3=new JButton();
	
	JButton button4=new JButton();

	Level1CodingExam(){
		
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		button1.addActionListener(null);
		button1.setBackground(Color.yellow);
		button1.setOpaque(true);
		button2.addActionListener(null);
		button2.setBackground(Color.red);
		button2.setOpaque(true);
		button3.addActionListener(null);
		button3.setBackground(Color.blue);
		button3.setOpaque(true);
		button4.addActionListener(null);
		button4.setBackground(Color.green);
		button4.setOpaque(true);
		frame.setVisible(true);
		frame.pack();
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	}
public static void main(String[] args) {
	Level1CodingExam v=new Level1CodingExam();
	
	}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if(button1==arg0.getSource()) {
		speak("yellow");
	}
	if(button2==arg0.getSource()) {
	speak("red");

	}
	if(button3==arg0.getSource()) {
		speak("blue");

	}
	if(button4==arg0.getSource()) {
		speak("green");
	}

	
	
	
	
}
void speak(String words) {
try {
        Runtime.getRuntime().exec("say " + words);
} catch (IOException e) {
        e.printStackTrace();
}
}
}
