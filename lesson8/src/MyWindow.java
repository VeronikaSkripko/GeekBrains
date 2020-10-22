import javax.swing.*;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyWindow extends JFrame {
	public MyWindow(){
		setTitle("Hello World");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(400, 400, 400, 350 );

		Font font = new Font("Verdana", Font.BOLD, 25);
		Font font1 = new Font("Verdana", Font.BOLD, 15);

		JLabel label = new JLabel("Welcome");
		label.setForeground(Color.RED);
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.CENTER);
		add(label);

		JButton btn1 = new JButton("East");
		JButton btn2 = new JButton("West");
		JButton btn3 = new JButton("North");
		JButton btn4 = new JButton("South");

		add(btn1, BorderLayout.EAST);
		add(btn2, BorderLayout.WEST);
		add(btn3, BorderLayout.NORTH);
		add(btn4, BorderLayout.SOUTH);

		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				label.setText("You're going EAST!");
				label.setFont(font1);
			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				label.setText("You're going WEST!");
				label.setFont(font1);
			}
		});
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				label.setText("You're going NORTH!");
				label.setFont(font1);
			}
		});
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				label.setText("You're going SOUTH!");
				label.setFont(font1);
			}
		});

		setVisible(true);
	}
}
