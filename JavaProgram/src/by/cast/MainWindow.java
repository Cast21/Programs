package by.cast;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {
	private JLabel l3;
	private JButton b;
	private JLabel l2;
	private JLabel l1;
	private JTextField t1;
	private JTextField t2;
	private double c, d, e;
	private String f;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton button;
	public MainWindow() {
		setTitle("Calculator for Dad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(256, 256);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(154, 10, 86, 20);
		getContentPane().add(t1);
		t1.setColumns(10);
		
		l1 = new JLabel("Введите первое число:");
		l1.setBounds(10, 10, 144, 20);
		getContentPane().add(l1);
		
		t2 = new JTextField();
		t2.setBounds(154, 40, 86, 20);
		getContentPane().add(t2);
		t2.setColumns(10);
		
		l2 = new JLabel("Введите второе число:");
		l2.setBounds(10, 40, 144, 20);
		getContentPane().add(l2);
		
		b = new JButton("Сложить");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
				c = Double.parseDouble(t1.getText());
				d = Double.parseDouble(t2.getText());
				e = c + d;
				f = Double.toString(e);
				l3.setText(f);
				}catch(Exception ex){}
			}
		});
		b.setBounds(136, 72, 104, 23);
		getContentPane().add(b);
		
		l3 = new JLabel("");
		l3.setBounds(10, 72, 116, 91);
		getContentPane().add(l3);
		
		b2 = new JButton("Умножить");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae2) {
				try {
				c = Double.parseDouble(t1.getText());
				d = Double.parseDouble(t2.getText());
				e = c * d;
				f = Double.toString(e) ;
				l3.setText(f);
				}catch(Exception ex){}
			}
		});
		b2.setBounds(136, 174, 104, 23);
		getContentPane().add(b2);
		
		b3 = new JButton("Разделить");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae4) {
				try {
					c = Double.parseDouble(t1.getText());
					d = Double.parseDouble(t2.getText());
					e = c / d;
					f = Double.toString(e);
					l3.setText(f);
					}catch(Exception ex){}
			}
		});
		b3.setBounds(136, 140, 104, 23);
		getContentPane().add(b3);
		
		b4 = new JButton("Вычесть");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae3) {
				try {
					c = Double.parseDouble(t1.getText());
					d = Double.parseDouble(t2.getText());
					e = c - d;
					f = Double.toString(e);
					l3.setText(f);
					}catch(Exception ex){}
			}
		});
		b4.setBounds(136, 106, 104, 23);
		getContentPane().add(b4);
		
		button = new JButton("Очистить");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l3.setText(null);
			}
		});
		button.setBounds(10, 174, 116, 23);
		getContentPane().add(button);
		setVisible(true);
		
	}
}
