package com.cbit;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

public class Puzzle implements ActionListener {
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15,
			b16;
	Frame f;
	Label lshow, loutput;

	Puzzle() {
		f = new Frame("Ujjawal_Puzzle");

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		
		lshow = new Label("          Ujjawal's Puzzle");
		lshow.setBounds(75, 50, 150, 40);
		lshow.setBackground(Color.GREEN);
		lshow.setForeground(Color.RED);
		b1 = new Button("8");
		b1.setBounds(50, 100, 50, 50);
		b1.setBackground(Color.PINK);
		b2 = new Button("10");
		b2.setBounds(100, 100, 50, 50);
		b2.setBackground(Color.PINK);
		b3 = new Button("6");
		b3.setBounds(150, 100, 50, 50);
		b3.setBackground(Color.PINK);
		b4 = new Button("3");
		b4.setBounds(200, 100, 50, 50);
		b4.setBackground(Color.PINK);
		b5 = new Button("12");
		b5.setBounds(50, 150, 50, 50);
		b5.setBackground(Color.PINK);
		b6 = new Button("4");
		b6.setBounds(100, 150, 50, 50);
		b6.setBackground(Color.PINK);
		b7 = new Button("1");
		b7.setBounds(150, 150, 50, 50);
		b7.setBackground(Color.PINK);
		b8 = new Button("9");
		b8.setBounds(200, 150, 50, 50);
		b8.setBackground(Color.PINK);
		b9 = new Button("2");
		b9.setBounds(50, 200, 50, 50);
		b9.setBackground(Color.PINK);
		b10 = new Button("");
		b10.setBounds(100, 200, 50, 50);
		b10.setBackground(Color.PINK);
		b11 = new Button("11");
		b11.setBounds(150, 200, 50, 50);
		b11.setBackground(Color.PINK);
		b12 = new Button("14");
		b12.setBounds(200, 200, 50, 50);
		b12.setBackground(Color.PINK);
		b13 = new Button("7");
		b13.setBounds(50, 250, 50, 50);
		b13.setBackground(Color.PINK);
		b14 = new Button("5");
		b14.setBounds(100, 250, 50, 50);
		b14.setBackground(Color.PINK);
		b15 = new Button("15");
		b15.setBounds(150, 250, 50, 50);
		b15.setBackground(Color.PINK);
		b16 = new Button("13");
		b16.setBounds(200, 250, 50, 50);
		b16.setBackground(Color.PINK);
		loutput = new Label();
		loutput.setBounds(95, 305, 110, 40);
		loutput.setBackground(Color.BLACK);
		loutput.setForeground(Color.YELLOW);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		
		f.add(lshow);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		f.add(b11);
		f.add(b12);
		f.add(b13);
		f.add(b14);
		f.add(b15);
		f.add(b16);
		f.add(loutput);
		f.setSize(300, 350);
		f.setLayout(null);
		f.setResizable(false);
		f.setVisible(true);
		f.setBackground(Color.BLUE);
	}
	int clicked = 0;
	public void actionPerformed(ActionEvent e) {
		clicked++;
		loutput.setText(" No. of Clicked : "+clicked);
		if (e.getSource() == b1) {
			String label = b1.getLabel();
			if (b2.getLabel().equals("")) {
				b2.setLabel(label);
				b1.setLabel("");
			}
			if (b5.getLabel().equals("")) {
				b5.setLabel(label);
				b1.setLabel("");
			}
		}
		if (e.getSource() == b2) {
			String label = b2.getLabel();
			if (b1.getLabel().equals("")) {
				b1.setLabel(label);
				b2.setLabel("");
			}
			if (b3.getLabel().equals("")) {
				b3.setLabel(label);
				b2.setLabel("");
			}
			if (b6.getLabel().equals("")) {
				b6.setLabel(label);
				b2.setLabel("");
			}
		}
		if (e.getSource() == b3) {
			String label = b3.getLabel();
			if (b2.getLabel().equals("")) {
				b2.setLabel(label);
				b3.setLabel("");
			}
			if (b4.getLabel().equals("")) {
				b4.setLabel(label);
				b3.setLabel("");
			}
			if (b7.getLabel().equals("")) {
				b7.setLabel(label);
				b3.setLabel("");
			}
		}
		if (e.getSource() == b4) {
			String label = b4.getLabel();
			if (b3.getLabel().equals("")) {
				b3.setLabel(label);
				b4.setLabel("");
			}
			if (b8.getLabel().equals("")) {
				b8.setLabel(label);
				b4.setLabel("");
			}
		}
		if (e.getSource() == b5) {
			String label = b5.getLabel();
			if (b1.getLabel().equals("")) {
				b1.setLabel(label);
				b5.setLabel("");
			}
			if (b6.getLabel().equals("")) {
				b6.setLabel(label);
				b5.setLabel("");
			}
			if (b9.getLabel().equals("")) {
				b9.setLabel(label);
				b5.setLabel("");
			}
		}
		if (e.getSource() == b6) {
			String label = b6.getLabel();
			if (b2.getLabel().equals("")) {
				b2.setLabel(label);
				b6.setLabel("");
			}
			if (b5.getLabel().equals("")) {
				b5.setLabel(label);
				b6.setLabel("");
			}
			if (b7.getLabel().equals("")) {
				b7.setLabel(label);
				b6.setLabel("");
			}
			if (b10.getLabel().equals("")) {
				b10.setLabel(label);
				b6.setLabel("");
			}

		}
		if (e.getSource() == b7) {
			String label = b7.getLabel();
			if (b3.getLabel().equals("")) {
				b3.setLabel(label);
				b7.setLabel("");
			}
			if (b6.getLabel().equals("")) {
				b6.setLabel(label);
				b7.setLabel("");
			}
			if (b8.getLabel().equals("")) {
				b8.setLabel(label);
				b7.setLabel("");
			}
			if (b11.getLabel().equals("")) {
				b11.setLabel(label);
				b7.setLabel("");
			}
		}
		if (e.getSource() == b8) {
			String label = b8.getLabel();
			if (b4.getLabel().equals("")) {
				b4.setLabel(label);
				b8.setLabel("");
			}
			if (b7.getLabel().equals("")) {
				b7.setLabel(label);
				b8.setLabel("");
			}
			if (b12.getLabel().equals("")) {
				b12.setLabel(label);
				b8.setLabel("");
			}
		}
		if (e.getSource() == b9) {
			String label = b9.getLabel();
			if (b5.getLabel().equals("")) {
				b5.setLabel(label);
				b9.setLabel("");
			}
			if (b10.getLabel().equals("")) {
				b10.setLabel(label);
				b9.setLabel("");
			}
			if (b13.getLabel().equals("")) {
				b13.setLabel(label);
				b9.setLabel("");
			}

		}
		if (e.getSource() == b10) {
			String label = b10.getLabel();
			if (b6.getLabel().equals("")) {
				b6.setLabel(label);
				b10.setLabel("");
			}
			if (b9.getLabel().equals("")) {
				b9.setLabel(label);
				b10.setLabel("");
			}
			if (b11.getLabel().equals("")) {
				b11.setLabel(label);
				b10.setLabel("");
			}
			if (b14.getLabel().equals("")) {
				b14.setLabel(label);
				b10.setLabel("");
			}

		}
		if (e.getSource() == b11) {
			String label = b11.getLabel();
			if (b7.getLabel().equals("")) {
				b7.setLabel(label);
				b11.setLabel("");
			}
			if (b10.getLabel().equals("")) {
				b10.setLabel(label);
				b11.setLabel("");
			}
			if (b12.getLabel().equals("")) {
				b12.setLabel(label);
				b11.setLabel("");
			}
			if (b15.getLabel().equals("")) {
				b15.setLabel(label);
				b11.setLabel("");
			}

		}
		if (e.getSource() == b12) {
			String label = b12.getLabel();
			if (b8.getLabel().equals("")) {
				b8.setLabel(label);
				b12.setLabel("");
			}
			if (b11.getLabel().equals("")) {
				b11.setLabel(label);
				b12.setLabel("");
			}
			if (b16.getLabel().equals("")) {
				b16.setLabel(label);
				b12.setLabel("");
			}
		}
		if (e.getSource() == b13) {
			String label = b13.getLabel();
			if (b9.getLabel().equals("")) {
				b9.setLabel(label);
				b13.setLabel("");
			}
			if (b14.getLabel().equals("")) {
				b14.setLabel(label);
				b13.setLabel("");
			}

		}
		if (e.getSource() == b14) {
			String label = b14.getLabel();
			if (b10.getLabel().equals("")) {
				b10.setLabel(label);
				b14.setLabel("");
			}
			if (b13.getLabel().equals("")) {
				b13.setLabel(label);
				b14.setLabel("");
			}
			if (b15.getLabel().equals("")) {
				b15.setLabel(label);
				b14.setLabel("");
			}

		}
		if (e.getSource() == b15) {
			String label = b15.getLabel();
			if (b11.getLabel().equals("")) {
				b11.setLabel(label);
				b15.setLabel("");
			}
			if (b14.getLabel().equals("")) {
				b14.setLabel(label);
				b15.setLabel("");
			}
			if (b16.getLabel().equals("")) {
				b16.setLabel(label);
				b15.setLabel("");
			}

		}
		if (e.getSource() == b16) {
			String label = b16.getLabel();
			if (b12.getLabel().equals("")) {
				b12.setLabel(label);
				b16.setLabel("");
			}
			if (b15.getLabel().equals("")) {
				b15.setLabel(label);
				b16.setLabel("");
			}
		}

		// congrats code
		if (b1.getLabel().equals("1") && b2.getLabel().equals("2")
				&& b3.getLabel().equals("3") && b4.getLabel().equals("4")
				&& b5.getLabel().equals("5") && b6.getLabel().equals("6")
				&& b7.getLabel().equals("7") && b8.getLabel().equals("8")
				&& b9.getLabel().equals("9") && b10.getLabel().equals("10")
				&& b11.getLabel().equals("11") && b12.getLabel().equals("12")
				&& b13.getLabel().equals("13") && b14.getLabel().equals("14")
				&& b15.getLabel().equals("15") && b16.getLabel().equals("")) {
			JOptionPane.showMessageDialog(f, "Congratulations! You won in "+clicked+" attempts");
		}
	}

	public static void main(String[] args) {
		new Puzzle();
	}
}