package Spiele;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.security.PublicKey;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class VierGewinnt extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnA5;
	private JButton btnB5;
	private JButton btnC5;
	private JButton btnD5;
	private JButton btnE5;
	private JButton btnF5;
	private JButton btnG5;
	private JButton btnA4;
	private JButton btnB4;
	private JButton btnC4;
	private JButton btnD4;
	private JButton btnE4;
	private JButton btnF4;
	private JButton btnG4;
	private JButton btnA3;
	private JButton btnB3;
	private JButton btnC3;
	private JButton btnD3;
	private JButton btnE3;
	private JButton btnF3;
	private JButton btnG3;
	private JButton btnA2;
	private JButton btnB2;
	private JButton btnC2;
	private JButton btnD2;
	private JButton btnE2;
	private JButton btnF2;
	private JButton btnG2;
	private JButton btnA1;
	private JButton btnB1;
	private JButton btnC1;
	private JButton btnD1;
	private JButton btnE1;
	private JButton btnF1;
	private JButton btnG1;
	private JButton btnA0;
	private JButton btnB0;
	private JButton btnC0;
	private JButton btnD0;
	private JButton btnE0;
	private JButton btnF0;
	private JButton btnG0;
	int CounterRoteSteine = 21;
	int	CounterGelbeSteine= 21;
	int CounterRunde=0;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblAnzahlRoteSteine;
	private JLabel lblAnzahlGelbeSteine;
	String a0="empty";
	String b0="empty";
	String c0="empty";
	String d0="empty";
	String e0="empty";
	String f0="empty";
	String g0="empty";
	String a1="empty";
	String b1="empty";
	String c1="empty";
	String d1="empty";
	String e1="empty";
	String f1="empty";
	String g1="empty";
	String a2="empty";
	String b2="empty";
	String c2="empty";
	String d2="empty";
	String e2="empty";
	String f2="empty";
	String g2="empty";
	String a3="empty";
	String b3="empty";
	String c3="empty";
	String d3="empty";
	String e3="empty";
	String f3="empty";
	String g3="empty";
	String a4="empty";
	String b4="empty";
	String c4="empty";
	String d4="empty";
	String e4="empty";
	String f4="empty";
	String g4="empty";
	String a5="empty";
	String b5="empty";
	String c5="empty";
	String d5="empty";
	String e5="empty";
	String f5="empty";
	String g5="empty";
	private JTextPane tPAusgabe;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VierGewinnt frame = new VierGewinnt();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VierGewinnt() {
		CounterRunde ++;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 862, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnA5 = new JButton("");
		btnA5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnA5.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnA5.setEnabled(false);
					a5="RED";
					gewonnen();
				}
				else {
					btnA5.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnA5.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					a5="YELLOW";
					gewonnen();
			}
			}
		});
		btnA5.setEnabled(false);
		btnA5.setBounds(39, 32, 89, 23);
		contentPane.add(btnA5);
		
		btnB5 = new JButton("");
		btnB5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnB5.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnB5.setEnabled(false);
					b5="RED";
					gewonnen();
				}
				else {
					btnB5.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnB5.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					b5="YELLOW";
					gewonnen();
			}
			}
		});
		btnB5.setEnabled(false);
		btnB5.setBounds(155, 32, 89, 23);
		contentPane.add(btnB5);
		
		btnC5 = new JButton("");
		btnC5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnC5.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnC5.setEnabled(false);
					c5="RED";
					gewonnen();
				}
				else {
					btnC5.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnC5.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					c5="YELLOW";
					gewonnen();
			}
			}
		});
		btnC5.setEnabled(false);
		btnC5.setBounds(277, 32, 89, 23);
		contentPane.add(btnC5);
		
		btnD5 = new JButton("");
		btnD5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnD5.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnD5.setEnabled(false);
					d5="RED";
					gewonnen();
				}
				else {
					btnD5.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnD5.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					d5="YELLOW";
					gewonnen();
			}
			}
		});
		btnD5.setEnabled(false);
		btnD5.setBounds(396, 32, 89, 23);
		contentPane.add(btnD5);
		
		btnE5 = new JButton("");
		btnE5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnE5.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnE5.setEnabled(false);
					e5="RED";
					gewonnen();
				}
				else {
					btnE5.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnE5.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					e5="YELLOW";
					gewonnen();
			}
			}
		});
		btnE5.setEnabled(false);
		btnE5.setBounds(511, 32, 89, 23);
		contentPane.add(btnE5);
		
		btnF5 = new JButton("");
		btnF5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnF5.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnF5.setEnabled(false);
					f5="RED";
					gewonnen();
				}
				else {
					btnF5.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnF5.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					f5="YELLOW";
					gewonnen();
			}
			}
		});
		btnF5.setEnabled(false);
		btnF5.setBounds(624, 32, 89, 23);
		contentPane.add(btnF5);
		
		btnG5 = new JButton("");
		btnG5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnG5.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnG5.setEnabled(false);
					g5="RED";
					gewonnen();
				}
				else {
					btnG5.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnG5.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					g5="YELLOW";
					gewonnen();
			}
			}
		});
		btnG5.setEnabled(false);
		btnG5.setBounds(747, 32, 89, 23);
		contentPane.add(btnG5);
		
		btnA4 = new JButton("");
		btnA4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnA4.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnA5.setEnabled(true);
					btnA4.setEnabled(false);
					a4="RED";
					gewonnen();
				}
				else {
					btnA4.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnA5.setEnabled(true);
					btnA4.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					a4="YELLOW";
					gewonnen();
			}
			}
		});
		btnA4.setEnabled(false);
		btnA4.setBounds(39, 80, 89, 23);
		contentPane.add(btnA4);
		
		btnB4 = new JButton("");
		btnB4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnB4.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnB5.setEnabled(true);
					btnB4.setEnabled(false);
					b4="RED";
					gewonnen();
				}
				else {
					btnB4.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnB5.setEnabled(true);
					btnB4.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					b4="YELLOW";
					gewonnen();
			}
			}
		});
		btnB4.setEnabled(false);
		btnB4.setBounds(155, 80, 89, 23);
		contentPane.add(btnB4);
		
		btnC4 = new JButton("");
		btnC4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnC4.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnC5.setEnabled(true);
					btnC4.setEnabled(false);
					c4="RED";
					gewonnen();
				}
				else {
					btnC4.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnC5.setEnabled(true);
					btnC4.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					c4="YELLOW";
					gewonnen();
			}
			}
		});
		btnC4.setEnabled(false);
		btnC4.setBounds(277, 80, 89, 23);
		contentPane.add(btnC4);
		
		btnD4 = new JButton("");
		btnD4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnD4.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnD5.setEnabled(true);
					btnD4.setEnabled(false);
					d4="RED";
					gewonnen();
				}
				else {
					btnD4.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnD5.setEnabled(true);
					btnD4.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					d4="YELLOW";
					gewonnen();
			}
			}
		});
		btnD4.setEnabled(false);
		btnD4.setBounds(396, 80, 89, 23);
		contentPane.add(btnD4);
		
		btnE4 = new JButton("");
		btnE4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnE4.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnE5.setEnabled(true);
					btnE4.setEnabled(false);
					e4="RED";
					gewonnen();
				}
				else {
					btnE4.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnE5.setEnabled(true);
					btnE4.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					e4="YELLOW";
					gewonnen();
			}
			}
		});
		btnE4.setEnabled(false);
		btnE4.setBounds(511, 80, 89, 23);
		contentPane.add(btnE4);
		
		btnF4 = new JButton("");
		btnF4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnF4.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnF5.setEnabled(true);
					btnF4.setEnabled(false);
					f4="RED";
					gewonnen();
				}
				else {
					btnF4.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnF5.setEnabled(true);
					btnF4.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					f4="YELLOW";
					gewonnen();
			}
			}
		});
		btnF4.setEnabled(false);
		btnF4.setBounds(624, 80, 89, 23);
		contentPane.add(btnF4);
		
		btnG4 = new JButton("");
		btnG4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnG4.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnG5.setEnabled(true);
					btnG4.setEnabled(false);
					g4="RED";
					gewonnen();
				}
				else {
					btnG4.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnG5.setEnabled(true);
					btnG4.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					g4="YELLOW";
					gewonnen();
			}
			}
		});
		btnG4.setEnabled(false);
		btnG4.setBounds(747, 80, 89, 23);
		contentPane.add(btnG4);
		
		btnA3 = new JButton("");
		btnA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
				btnA3.setBackground(Color.RED);;
				CounterRunde++;
				CounterRoteSteine --;
				lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
				btnA4.setEnabled(true);
				btnA3.setEnabled(false);
				a3="RED";
				gewonnen();
			}
			else {
				btnA3.setBackground(Color.YELLOW);
				CounterRunde++;
				CounterGelbeSteine --;
				btnA4.setEnabled(true);
				btnA3.setEnabled(false);
				lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
				a3="YELLOW";
				gewonnen();
		}
			}
		});
		btnA3.setEnabled(false);
		btnA3.setBounds(39, 135, 89, 23);
		contentPane.add(btnA3);
		
		btnB3 = new JButton("");
		btnB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnB3.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnB4.setEnabled(true);
					btnB3.setEnabled(false);
					b3="RED";
					gewonnen();
				}
				else {
					btnB3.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnB4.setEnabled(true);
					btnB3.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					b3="YELLOW";
					gewonnen();
			}
				
			}
		});
		btnB3.setEnabled(false);
		btnB3.setBounds(155, 135, 89, 23);
		contentPane.add(btnB3);
		
		btnC3 = new JButton("");
		btnC3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnC3.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnC4.setEnabled(true);
					btnC3.setEnabled(false);
					c3="RED";
					gewonnen();
				}
				else {
					btnC3.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnC4.setEnabled(true);
					btnC3.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					c3="YELLOW";
					gewonnen();
			}
			}
		});
		btnC3.setEnabled(false);
		btnC3.setBounds(277, 135, 89, 23);
		contentPane.add(btnC3);
		
		btnD3 = new JButton("");
		btnD3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnD3.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnD4.setEnabled(true);
					btnD3.setEnabled(false);
					d3="RED";
					gewonnen();
				}
				else {
					btnD3.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnD4.setEnabled(true);
					btnD3.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					d3="YELLOW";
					gewonnen();
			}
			}
		});
		btnD3.setEnabled(false);
		btnD3.setBounds(396, 135, 89, 23);
		contentPane.add(btnD3);
		
		btnE3 = new JButton("");
		btnE3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnE3.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnE4.setEnabled(true);
					btnE3.setEnabled(false);
					e3="RED";
					gewonnen();
				}
				else {
					btnE3.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnE4.setEnabled(true);
					btnE3.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					e3="YELLOW";
					gewonnen();
			}
			}
		});
		btnE3.setEnabled(false);
		btnE3.setBounds(511, 135, 89, 23);
		contentPane.add(btnE3);
		
		btnF3 = new JButton("");
		btnF3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnF3.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnF4.setEnabled(true);
					btnF3.setEnabled(false);
					f3="RED";
					gewonnen();
				}
				else {
					btnF3.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnF4.setEnabled(true);
					btnF3.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					f3="YELLOW";
					gewonnen();
			}
			}
		});
		btnF3.setEnabled(false);
		btnF3.setBounds(624, 135, 89, 23);
		contentPane.add(btnF3);
		
		btnG3 = new JButton("");
		btnG3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnG3.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnG4.setEnabled(true);
					btnG3.setEnabled(false);
					g3="RED";
					gewonnen();
				}
				else {
					btnG3.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnG4.setEnabled(true);
					btnG3.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					g3="YELLOW";
					gewonnen();
			}
			}
		});
		btnG3.setEnabled(false);
		btnG3.setBounds(747, 135, 89, 23);
		contentPane.add(btnG3);
		
		btnA2 = new JButton("");
		btnA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if (CounterRunde%2!=0) {
				btnA2.setBackground(Color.RED);;
				CounterRunde++;
				CounterRoteSteine --;
				lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
				btnA3.setEnabled(true);
				btnA2.setEnabled(false);
				a2="RED";
				gewonnen();
			}
			else {
				btnA2.setBackground(Color.YELLOW);
				CounterRunde++;
				CounterGelbeSteine --;
				btnA3.setEnabled(true);
				btnA2.setEnabled(false);
				lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
				a2="YELLOW";
				gewonnen();
		}
			}
		});
		btnA2.setEnabled(false);
		btnA2.setBounds(39, 190, 89, 23);
		contentPane.add(btnA2);
		
		btnB2 = new JButton("");
		btnB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnB2.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnB3.setEnabled(true);
					btnB2.setEnabled(false);
					b2="RED";
					gewonnen();
				}
				else {
					btnB2.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnB3.setEnabled(true);
					btnB2.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					b2="YELLOW";
					gewonnen();
			}
				}
							
			
		});
		btnB2.setEnabled(false);
		btnB2.setBounds(155, 190, 89, 23);
		contentPane.add(btnB2);
		
		btnC2 = new JButton("");
		btnC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnC2.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnC3.setEnabled(true);
					btnC2.setEnabled(false);
					c2="RED";
					gewonnen();
				}
				else {
					btnC2.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnC3.setEnabled(true);
					btnC2.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					c2="YELLOW";
					gewonnen();
			
				}
			}
		});
		btnC2.setEnabled(false);
		btnC2.setBounds(277, 190, 89, 23);
		contentPane.add(btnC2);
		
		btnD2 = new JButton("");
		btnD2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnD2.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnD3.setEnabled(true);
					btnD2.setEnabled(false);
					d2="RED";
					gewonnen();
				}
				else {
					btnD2.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnD3.setEnabled(true);
					btnD2.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					d2="YELLOW";
					gewonnen();
			
				}
			}
		});
		btnD2.setEnabled(false);
		btnD2.setBounds(396, 190, 89, 23);
		contentPane.add(btnD2);
		
		btnE2 = new JButton("");
		btnE2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnE2.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnE3.setEnabled(true);
					btnE2.setEnabled(false);
					e2="RED";
					gewonnen();
				}
				else {
					btnE2.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnE3.setEnabled(true);
					btnE2.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					e2="YELLOW";
					gewonnen();
			
				}
			}
		});
		btnE2.setEnabled(false);
		btnE2.setBounds(511, 190, 89, 23);
		contentPane.add(btnE2);
		
		btnF2 = new JButton("");
		btnF2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnF2.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnF3.setEnabled(true);
					btnF2.setEnabled(false);
					f2="RED";
					gewonnen();
				}
				else {
					btnF2.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnF3.setEnabled(true);
					btnF2.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					f2="YELLOW";
					gewonnen();
			}
				
			}
		});
		btnF2.setEnabled(false);
		btnF2.setBounds(624, 190, 89, 23);
		contentPane.add(btnF2);
		
		btnG2 = new JButton("");
		btnG2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnG2.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnG3.setEnabled(true);
					btnG2.setEnabled(false);
					g2="RED";
					gewonnen();
				}
				else {
					btnG2.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnG3.setEnabled(true);
					btnG2.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					g2="YELLOW";
					gewonnen();
			}
			}
		});
		btnG2.setEnabled(false);
		btnG2.setBounds(747, 190, 89, 23);
		contentPane.add(btnG2);
		
		btnA1 = new JButton("");
		btnA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnA1.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnA2.setEnabled(true);
					btnA1.setEnabled(false);
					a1="RED";
					gewonnen();
				}
				else {
					btnA1.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnA2.setEnabled(true);
					btnA1.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					a1="YELLOW";
					gewonnen();
			}
			}
		});
		btnA1.setEnabled(false);
		btnA1.setBounds(39, 241, 89, 23);
		contentPane.add(btnA1);
		
		btnB1 = new JButton("");
		btnB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnB1.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnB2.setEnabled(true);
					btnB1.setEnabled(false);
					b1="RED";
					gewonnen();
				}
				else {
					btnB1.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnB2.setEnabled(true);
					btnB1.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					b1="YELLOW";
					gewonnen();
			}
			}
		});
		btnB1.setEnabled(false);
		btnB1.setBounds(155, 241, 89, 23);
		contentPane.add(btnB1);
		
		btnC1 = new JButton("");
		btnC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnC1.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnC2.setEnabled(true);
					btnC1.setEnabled(false);
					c1="RED";
					gewonnen();
				}
				else {
					btnC1.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnC2.setEnabled(true);
					btnC1.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					c1="YELLOW";
					gewonnen();
			}
			}
		});
		btnC1.setEnabled(false);
		btnC1.setBounds(277, 241, 89, 23);
		contentPane.add(btnC1);
		
		btnD1 = new JButton("");
		btnD1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnD1.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnD2.setEnabled(true);
					btnD1.setEnabled(false);
					d1="RED";
					gewonnen();
				}
				else {
					btnD1.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnD2.setEnabled(true);
					btnD1.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					d1="YELLOW";
					gewonnen();
			}
			}
		});
		btnD1.setEnabled(false);
		btnD1.setBounds(396, 241, 89, 23);
		contentPane.add(btnD1);
		
		btnE1 = new JButton("");
		btnE1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnE1.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " Steine ueber!");
					btnE2.setEnabled(true);
					btnE1.setEnabled(false);
					e1="RED";
					gewonnen();
				}
				else {
					btnE1.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnE2.setEnabled(true);
					btnE1.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					e1="YELLOW";
					gewonnen();
			}
			}
		});
		btnE1.setEnabled(false);
		btnE1.setBounds(511, 241, 89, 23);
		contentPane.add(btnE1);
		
		btnF1 = new JButton("");
		btnF1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnF1.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " ueber!");
					btnF2.setEnabled(true);
					btnF1.setEnabled(false);
					f1="RED";
					gewonnen();
				}
				else {
					btnF1.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnF2.setEnabled(true);
					btnF1.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					f1="YELLOW";
					gewonnen();
			}
			}
		});
		btnF1.setEnabled(false);
		btnF1.setBounds(624, 241, 89, 23);
		contentPane.add(btnF1);
		
		btnG1 = new JButton("");
		btnG1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnG1.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " ueber!");
					btnG2.setEnabled(true);
					btnG1.setEnabled(false);
					g1="RED";
					gewonnen();
				}
				else {
					btnG1.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnG2.setEnabled(true);
					btnG1.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					g1="YELLOW";
					gewonnen();
			}
			}
		});
		btnG1.setEnabled(false);
		btnG1.setBounds(747, 241, 89, 23);
		contentPane.add(btnG1);
		
		btnA0 = new JButton("");
		btnA0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnA0.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " ueber!");
					btnA1.setEnabled(true);
					btnA0.setEnabled(false);
					a0="RED";
					gewonnen();
				}
				else {
					btnA0.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					btnA1.setEnabled(true);
					btnA0.setEnabled(false);
					a0="YELLOW";
					gewonnen();
				}
			
			}});
		btnA0.setBounds(39, 291, 89, 23);
		contentPane.add(btnA0);
		
		btnB0 = new JButton("");
		btnB0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnB0.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " ueber!");
					btnB1.setEnabled(true);
					btnB0.setEnabled(false);
					b0="RED";
					gewonnen();
				}
				else {
					btnB0.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnB1.setEnabled(true);
					btnB0.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					b0="YELLOW";
					gewonnen();
				}
			}
		});
		btnB0.setBounds(155, 291, 89, 23);
		contentPane.add(btnB0);
		
		btnC0 = new JButton("");
		btnC0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnC0.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " ueber!");
					btnC1.setEnabled(true);
					btnC0.setEnabled(false);
					c0="RED";
					gewonnen();
				}
				else {
					btnC0.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnC1.setEnabled(true);
					btnC0.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					c0="YELLOW";
					gewonnen();
				}
			}
		});
		btnC0.setBounds(277, 291, 89, 23);
		contentPane.add(btnC0);
		
		btnD0 = new JButton("");
		btnD0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnD0.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " ueber!");
					btnD1.setEnabled(true);
					btnD0.setEnabled(false);
					d0="RED";
					gewonnen();
				}
				else {
					btnD0.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnD1.setEnabled(true);
					btnD0.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					d0="YELLOW";
					gewonnen();
			}
			}
		});
		btnD0.setBounds(396, 291, 89, 23);
		contentPane.add(btnD0);
		
		btnE0 = new JButton("");
		btnE0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnE0.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " ueber!");
					btnE1.setEnabled(true);
					btnE0.setEnabled(false);
					e0="RED";
					gewonnen();
				}
				else {
					btnE0.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnE1.setEnabled(true);
					btnE0.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					e0="YELLOW";
					gewonnen();
				}
			}
		});
		btnE0.setBounds(511, 291, 89, 23);
		contentPane.add(btnE0);
		
		btnF0 = new JButton("");
		btnF0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnF0.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " ueber!");
					btnF1.setEnabled(true);
					btnF0.setEnabled(false);
					f0="RED";
					gewonnen();
				}
				else {
					btnF0.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnF1.setEnabled(true);
					btnF0.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					f0="YELLOW";
					gewonnen();
			}
			}
		});
		btnF0.setBounds(624, 291, 89, 23);
		contentPane.add(btnF0);
		
		btnG0 = new JButton("");
		btnG0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CounterRunde%2!=0) {
					btnG0.setBackground(Color.RED);;
					CounterRunde++;
					CounterRoteSteine --;
					lblAnzahlRoteSteine.setText("Rot hat noch " + CounterRoteSteine + " ueber!");
					btnG1.setEnabled(true);
					btnG0.setEnabled(false);
					g0="RED";
					gewonnen();
				}
				else {
					btnG0.setBackground(Color.YELLOW);
					CounterRunde++;
					CounterGelbeSteine --;
					btnG1.setEnabled(true);
					btnG0.setEnabled(false);
					lblAnzahlGelbeSteine.setText("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
					g0="YELLOW";
					gewonnen();
			}
			
			}
		});
		btnG0.setBounds(747, 291, 89, 23);
		contentPane.add(btnG0);
		
		btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(719, 459, 106, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Neue Runde");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main(null);
			}
		});
		btnNewButton_1.setBounds(719, 412, 106, 23);
		contentPane.add(btnNewButton_1);
		
		lblAnzahlRoteSteine = new JLabel("Rot hat noch " + CounterRoteSteine + " Steine ueber!" );
		lblAnzahlRoteSteine.setBounds(39, 373, 172, 14);
		contentPane.add(lblAnzahlRoteSteine);
		
		lblAnzahlGelbeSteine = new JLabel("Gelb hat noch " + CounterGelbeSteine + " Steine ueber!");
		lblAnzahlGelbeSteine.setBounds(39, 398, 172, 14);
		contentPane.add(lblAnzahlGelbeSteine);
		
		tPAusgabe = new JTextPane();
		tPAusgabe.setText("Rot beginnt!" + "\n" + "Es werden abweschelnd Steine gesetzt." + "\n" + "Es ist nur möglich in AKTIVEN Feldern zu setzen!" + "\n" +
		"Wer vier Felder in einer Reihe Horizontal, Vertikal oder Digaonal besetzt gewinnt!" + "\n" +"Der Gewinner wird hier stehen !");
		tPAusgabe.setBounds(287, 349, 254, 133);
		contentPane.add(tPAusgabe);
		
		
	}
	
	//Methode zur Gewinnprüfung bauen..
	public void gewonnen() {
		if(
		   a0.contains("RED")&b0.contains("RED")&c0.contains("RED")&d0.contains("RED")||
		   a1.contains("RED")&b1.contains("RED")&c1.contains("RED")&d1.contains("RED")||
		   a2.contains("RED")&b2.contains("RED")&c2.contains("RED")&d2.contains("RED")||
		   a3.contains("RED")&b3.contains("RED")&c3.contains("RED")&d3.contains("RED")||
		   a4.contains("RED")&b4.contains("RED")&c4.contains("RED")&d4.contains("RED")||
		   a5.contains("RED")&b5.contains("RED")&c5.contains("RED")&d5.contains("RED")||
		   b0.contains("RED")&c0.contains("RED")&d0.contains("RED")&e0.contains("RED")||
		   b1.contains("RED")&c1.contains("RED")&d1.contains("RED")&e1.contains("RED")||
		   b2.contains("RED")&c2.contains("RED")&d2.contains("RED")&e2.contains("RED")||
		   b3.contains("RED")&c3.contains("RED")&d3.contains("RED")&e3.contains("RED")||
		   b4.contains("RED")&c4.contains("RED")&d4.contains("RED")&e4.contains("RED")||
		   b5.contains("RED")&c5.contains("RED")&d5.contains("RED")&e5.contains("RED")||
		   c0.contains("RED")&d0.contains("RED")&e0.contains("RED")&f0.contains("RED")||
		   c1.contains("RED")&d1.contains("RED")&e1.contains("RED")&f1.contains("RED")||
		   c2.contains("RED")&d2.contains("RED")&e2.contains("RED")&f2.contains("RED")||
		   c3.contains("RED")&d3.contains("RED")&e3.contains("RED")&f3.contains("RED")||
		   c4.contains("RED")&d4.contains("RED")&e4.contains("RED")&f4.contains("RED")||
		   c5.contains("RED")&d5.contains("RED")&e5.contains("RED")&f5.contains("RED")||
		   d0.contains("RED")&e0.contains("RED")&f0.contains("RED")&g0.contains("RED")||
		   d1.contains("RED")&e1.contains("RED")&f1.contains("RED")&g1.contains("RED")||
		   d2.contains("RED")&e2.contains("RED")&f2.contains("RED")&g2.contains("RED")||
		   d3.contains("RED")&e3.contains("RED")&f3.contains("RED")&g3.contains("RED")||
		   d4.contains("RED")&e4.contains("RED")&f4.contains("RED")&g4.contains("RED")||
		   d5.contains("RED")&e5.contains("RED")&f5.contains("RED")&g5.contains("RED")||
		   g0.contains("RED")&f0.contains("RED")&e0.contains("RED")&d0.contains("RED")||
		   g1.contains("RED")&f1.contains("RED")&e1.contains("RED")&d1.contains("RED")||
		   g2.contains("RED")&f2.contains("RED")&e2.contains("RED")&d2.contains("RED")||
		   g3.contains("RED")&f3.contains("RED")&e3.contains("RED")&d3.contains("RED")||
		   g4.contains("RED")&f4.contains("RED")&e4.contains("RED")&d4.contains("RED")||
		   g5.contains("RED")&f5.contains("RED")&e5.contains("RED")&d5.contains("RED")||
		   f0.contains("RED")&e0.contains("RED")&d0.contains("RED")&c0.contains("RED")||
		   f1.contains("RED")&e1.contains("RED")&d1.contains("RED")&c1.contains("RED")||
		   f2.contains("RED")&e2.contains("RED")&d2.contains("RED")&c2.contains("RED")||
		   f3.contains("RED")&e3.contains("RED")&d3.contains("RED")&c3.contains("RED")||
		   f4.contains("RED")&e4.contains("RED")&d4.contains("RED")&c4.contains("RED")||
		   f5.contains("RED")&e5.contains("RED")&d5.contains("RED")&c5.contains("RED")||
		   e0.contains("RED")&d0.contains("RED")&c0.contains("RED")&b0.contains("RED")||
		   e1.contains("RED")&d1.contains("RED")&c1.contains("RED")&b1.contains("RED")||
		   e2.contains("RED")&d2.contains("RED")&c2.contains("RED")&b2.contains("RED")||
		   e3.contains("RED")&d3.contains("RED")&c3.contains("RED")&b3.contains("RED")||
		   e4.contains("RED")&d4.contains("RED")&c4.contains("RED")&b4.contains("RED")||
		   e5.contains("RED")&d5.contains("RED")&c5.contains("RED")&b5.contains("RED")||
		   d0.contains("RED")&c0.contains("RED")&b0.contains("RED")&a0.contains("RED")||
		   d1.contains("RED")&c1.contains("RED")&b1.contains("RED")&a1.contains("RED")||
		   d2.contains("RED")&c2.contains("RED")&b2.contains("RED")&a2.contains("RED")||
		   d3.contains("RED")&c3.contains("RED")&b3.contains("RED")&a3.contains("RED")||
		   d4.contains("RED")&c4.contains("RED")&b4.contains("RED")&a4.contains("RED")||
		   d5.contains("RED")&c5.contains("RED")&b5.contains("RED")&a5.contains("RED")||
		   a0.contains("RED")&a1.contains("RED")&a2.contains("RED")&a3.contains("RED")||
		   b0.contains("RED")&b1.contains("RED")&b2.contains("RED")&b3.contains("RED")||
		   c0.contains("RED")&c1.contains("RED")&c2.contains("RED")&c3.contains("RED")||
		   d0.contains("RED")&d1.contains("RED")&d2.contains("RED")&d3.contains("RED")||
		   e0.contains("RED")&e1.contains("RED")&e2.contains("RED")&e3.contains("RED")||
		   f0.contains("RED")&f1.contains("RED")&f2.contains("RED")&f3.contains("RED")||
		   g0.contains("RED")&g1.contains("RED")&g2.contains("RED")&g3.contains("RED")||
		   a1.contains("RED")&a2.contains("RED")&a3.contains("RED")&a4.contains("RED")||
		   b1.contains("RED")&b2.contains("RED")&b4.contains("RED")&b4.contains("RED")||
		   c1.contains("RED")&c2.contains("RED")&c3.contains("RED")&c4.contains("RED")||
		   d1.contains("RED")&d2.contains("RED")&d3.contains("RED")&d4.contains("RED")||
		   e1.contains("RED")&e2.contains("RED")&e3.contains("RED")&e4.contains("RED")||
		   f1.contains("RED")&f2.contains("RED")&f3.contains("RED")&f4.contains("RED")||
		   g1.contains("RED")&g2.contains("RED")&g3.contains("RED")&g4.contains("RED")||
		   a2.contains("RED")&a3.contains("RED")&a4.contains("RED")&a5.contains("RED")||
		   b2.contains("RED")&b3.contains("RED")&b4.contains("RED")&b5.contains("RED")||
		   c2.contains("RED")&c3.contains("RED")&c4.contains("RED")&c5.contains("RED")||
		   d2.contains("RED")&d3.contains("RED")&d4.contains("RED")&d5.contains("RED")||
		   e2.contains("RED")&e3.contains("RED")&e4.contains("RED")&e5.contains("RED")||
		   f2.contains("RED")&f3.contains("RED")&f4.contains("RED")&f5.contains("RED")||
		   g2.contains("RED")&g3.contains("RED")&g4.contains("RED")&g5.contains("RED")||
		   a5.contains("RED")&a4.contains("RED")&a3.contains("RED")&a2.contains("RED")||
		   b5.contains("RED")&b4.contains("RED")&b3.contains("RED")&b2.contains("RED")||
		   c5.contains("RED")&c4.contains("RED")&c3.contains("RED")&c2.contains("RED")||
		   d5.contains("RED")&d4.contains("RED")&d3.contains("RED")&d2.contains("RED")||
		   e5.contains("RED")&e4.contains("RED")&e3.contains("RED")&e2.contains("RED")||
		   f5.contains("RED")&f4.contains("RED")&f3.contains("RED")&f2.contains("RED")||
		   g5.contains("RED")&g4.contains("RED")&g3.contains("RED")&g2.contains("RED")||
		   a4.contains("RED")&a3.contains("RED")&a2.contains("RED")&a1.contains("RED")||
		   b4.contains("RED")&b3.contains("RED")&b2.contains("RED")&b1.contains("RED")||
		   c4.contains("RED")&c3.contains("RED")&c2.contains("RED")&c1.contains("RED")||
		   d4.contains("RED")&d3.contains("RED")&d2.contains("RED")&d1.contains("RED")||
		   e4.contains("RED")&e3.contains("RED")&e2.contains("RED")&e1.contains("RED")||
		   f4.contains("RED")&f3.contains("RED")&f2.contains("RED")&f1.contains("RED")||
		   g4.contains("RED")&g3.contains("RED")&g2.contains("RED")&g1.contains("RED")||
		   a3.contains("RED")&a2.contains("RED")&a1.contains("RED")&a0.contains("RED")||
		   b3.contains("RED")&b2.contains("RED")&b1.contains("RED")&b0.contains("RED")||
		   c3.contains("RED")&c2.contains("RED")&c1.contains("RED")&c0.contains("RED")||
		   d3.contains("RED")&d2.contains("RED")&d1.contains("RED")&d0.contains("RED")||
		   e3.contains("RED")&e2.contains("RED")&e1.contains("RED")&e0.contains("RED")||
		   f3.contains("RED")&f2.contains("RED")&f1.contains("RED")&f0.contains("RED")||
		   g3.contains("RED")&g2.contains("RED")&g1.contains("RED")&g0.contains("RED")||
		   a0.contains("RED")&b1.contains("RED")&c2.contains("RED")&d3.contains("RED")||
		   b0.contains("RED")&c1.contains("RED")&d2.contains("RED")&e3.contains("RED")||
		   c0.contains("RED")&d1.contains("RED")&e2.contains("RED")&f3.contains("RED")||
		   d0.contains("RED")&e1.contains("RED")&f2.contains("RED")&g3.contains("RED")||
		   g0.contains("RED")&f1.contains("RED")&e2.contains("RED")&d3.contains("RED")||
		   f0.contains("RED")&e1.contains("RED")&d2.contains("RED")&c3.contains("RED")||
		   d0.contains("RED")&c1.contains("RED")&a2.contains("RED")&a3.contains("RED")||
		   a1.contains("RED")&b2.contains("RED")&c3.contains("RED")&d4.contains("RED")||
		   b1.contains("RED")&c2.contains("RED")&d3.contains("RED")&e4.contains("RED")||
		   c1.contains("RED")&d2.contains("RED")&e3.contains("RED")&f4.contains("RED")||
		   d1.contains("RED")&e2.contains("RED")&f3.contains("RED")&g4.contains("RED")||
		   g1.contains("RED")&f2.contains("RED")&e3.contains("RED")&d4.contains("RED")||
		   f1.contains("RED")&e2.contains("RED")&d3.contains("RED")&c4.contains("RED")||
		   e1.contains("RED")&d2.contains("RED")&c3.contains("RED")&b4.contains("RED")||
		   d1.contains("RED")&c2.contains("RED")&b3.contains("RED")&a4.contains("RED")||
		   a2.contains("RED")&b3.contains("RED")&c4.contains("RED")&d5.contains("RED")||
		   b2.contains("RED")&c3.contains("RED")&d4.contains("RED")&e5.contains("RED")||
		   c2.contains("RED")&d3.contains("RED")&e4.contains("RED")&f5.contains("RED")||
		   d2.contains("RED")&e3.contains("RED")&f4.contains("RED")&g5.contains("RED")||
		   g2.contains("RED")&f3.contains("RED")&e4.contains("RED")&d5.contains("RED")||
		   f2.contains("RED")&e3.contains("RED")&d4.contains("RED")&c5.contains("RED")||
		   e2.contains("RED")&d3.contains("RED")&c4.contains("RED")&b5.contains("RED")||
		   d2.contains("RED")&c3.contains("RED")&b4.contains("RED")&a5.contains("RED")||
		   a3.contains("RED")&b2.contains("RED")&c1.contains("RED")&d0.contains("RED")||
		   b3.contains("RED")&c2.contains("RED")&d1.contains("RED")&e0.contains("RED")||
		   c3.contains("RED")&d2.contains("RED")&e1.contains("RED")&f0.contains("RED")||
		   d3.contains("RED")&e2.contains("RED")&f1.contains("RED")&g0.contains("RED")||
		   g3.contains("RED")&f2.contains("RED")&e1.contains("RED")&d0.contains("RED")||
		   f3.contains("RED")&e2.contains("RED")&d1.contains("RED")&c0.contains("RED")||
		   e3.contains("RED")&d2.contains("RED")&c1.contains("RED")&b0.contains("RED")||
		   d3.contains("RED")&c2.contains("RED")&b1.contains("RED")&a0.contains("RED")||
		   a4.contains("RED")&b3.contains("RED")&c2.contains("RED")&d1.contains("RED")||
		   b4.contains("RED")&c3.contains("RED")&d2.contains("RED")&e1.contains("RED")||
		   c4.contains("RED")&d3.contains("RED")&e2.contains("RED")&f1.contains("RED")||
		   d4.contains("RED")&e3.contains("RED")&f2.contains("RED")&g1.contains("RED")||
		   g4.contains("RED")&f3.contains("RED")&e2.contains("RED")&d1.contains("RED")||
		   f4.contains("RED")&e3.contains("RED")&d2.contains("RED")&c1.contains("RED")||
		   e4.contains("RED")&d3.contains("RED")&c2.contains("RED")&b1.contains("RED")||
		   d4.contains("RED")&c3.contains("RED")&b2.contains("RED")&a1.contains("RED")||
		   a5.contains("RED")&b4.contains("RED")&c3.contains("RED")&d2.contains("RED")||
		   b5.contains("RED")&c4.contains("RED")&d3.contains("RED")&e2.contains("RED")||
		   c5.contains("RED")&d4.contains("RED")&e3.contains("RED")&f2.contains("RED")||
		   d5.contains("RED")&e4.contains("RED")&f3.contains("RED")&g2.contains("RED")||
		   g5.contains("RED")&f4.contains("RED")&e3.contains("RED")&d2.contains("RED")||
		   f5.contains("RED")&e4.contains("RED")&d3.contains("RED")&c2.contains("RED")||
		   e5.contains("RED")&d4.contains("RED")&c3.contains("RED")&b2.contains("RED")||
		   d5.contains("RED")&c4.contains("RED")&b3.contains("RED")&a2.contains("RED")
		  )
		{
			tPAusgabe.setText("ROT hat gewonnen!!!!");
			
		}
		else if(
				   a0.contains("YELLOW")&b0.contains("YELLOW")&c0.contains("YELLOW")&d0.contains("YELLOW")||
				   a1.contains("YELLOW")&b1.contains("YELLOW")&c1.contains("YELLOW")&d1.contains("YELLOW")||
				   a2.contains("YELLOW")&b2.contains("YELLOW")&c2.contains("YELLOW")&d2.contains("YELLOW")||
				   a3.contains("YELLOW")&b3.contains("YELLOW")&c3.contains("YELLOW")&d3.contains("YELLOW")||
				   a4.contains("YELLOW")&b4.contains("YELLOW")&c4.contains("YELLOW")&d4.contains("YELLOW")||
				   a5.contains("YELLOW")&b5.contains("YELLOW")&c5.contains("YELLOW")&d5.contains("YELLOW")||
				   b0.contains("YELLOW")&c0.contains("YELLOW")&d0.contains("YELLOW")&e0.contains("YELLOW")||
				   b1.contains("YELLOW")&c1.contains("YELLOW")&d1.contains("YELLOW")&e1.contains("YELLOW")||
				   b2.contains("YELLOW")&c2.contains("YELLOW")&d2.contains("YELLOW")&e2.contains("YELLOW")||
				   b3.contains("YELLOW")&c3.contains("YELLOW")&d3.contains("YELLOW")&e3.contains("YELLOW")||
				   b4.contains("YELLOW")&c4.contains("YELLOW")&d4.contains("YELLOW")&e4.contains("YELLOW")||
				   b5.contains("YELLOW")&c5.contains("YELLOW")&d5.contains("YELLOW")&e5.contains("YELLOW")||
				   c0.contains("YELLOW")&d0.contains("YELLOW")&e0.contains("YELLOW")&f0.contains("YELLOW")||
				   c1.contains("YELLOW")&d1.contains("YELLOW")&e1.contains("YELLOW")&f1.contains("YELLOW")||
				   c2.contains("YELLOW")&d2.contains("YELLOW")&e2.contains("YELLOW")&f2.contains("YELLOW")||
				   c3.contains("YELLOW")&d3.contains("YELLOW")&e3.contains("YELLOW")&f3.contains("YELLOW")||
				   c4.contains("YELLOW")&d4.contains("YELLOW")&e4.contains("YELLOW")&f4.contains("YELLOW")||
				   c5.contains("YELLOW")&d5.contains("YELLOW")&e5.contains("YELLOW")&f5.contains("YELLOW")||
				   d0.contains("YELLOW")&e0.contains("YELLOW")&f0.contains("YELLOW")&g0.contains("YELLOW")||
				   d1.contains("YELLOW")&e1.contains("YELLOW")&f1.contains("YELLOW")&g1.contains("YELLOW")||
				   d2.contains("YELLOW")&e2.contains("YELLOW")&f2.contains("YELLOW")&g2.contains("YELLOW")||
				   d3.contains("YELLOW")&e3.contains("YELLOW")&f3.contains("YELLOW")&g3.contains("YELLOW")||
				   d4.contains("YELLOW")&e4.contains("YELLOW")&f4.contains("YELLOW")&g4.contains("YELLOW")||
				   d5.contains("YELLOW")&e5.contains("YELLOW")&f5.contains("YELLOW")&g5.contains("YELLOW")||
				   g0.contains("YELLOW")&f0.contains("YELLOW")&e0.contains("YELLOW")&d0.contains("YELLOW")||
				   g1.contains("YELLOW")&f1.contains("YELLOW")&e1.contains("YELLOW")&d1.contains("YELLOW")||
				   g2.contains("YELLOW")&f2.contains("YELLOW")&e2.contains("YELLOW")&d2.contains("YELLOW")||
				   g3.contains("YELLOW")&f3.contains("YELLOW")&e3.contains("YELLOW")&d3.contains("YELLOW")||
				   g4.contains("YELLOW")&f4.contains("YELLOW")&e4.contains("YELLOW")&d4.contains("YELLOW")||
				   g5.contains("YELLOW")&f5.contains("YELLOW")&e5.contains("YELLOW")&d5.contains("YELLOW")||
				   f0.contains("YELLOW")&e0.contains("YELLOW")&d0.contains("YELLOW")&c0.contains("YELLOW")||
				   f1.contains("YELLOW")&e1.contains("YELLOW")&d1.contains("YELLOW")&c1.contains("YELLOW")||
				   f2.contains("YELLOW")&e2.contains("YELLOW")&d2.contains("YELLOW")&c2.contains("YELLOW")||
				   f3.contains("YELLOW")&e3.contains("YELLOW")&d3.contains("YELLOW")&c3.contains("YELLOW")||
				   f4.contains("YELLOW")&e4.contains("YELLOW")&d4.contains("YELLOW")&c4.contains("YELLOW")||
				   f5.contains("YELLOW")&e5.contains("YELLOW")&d5.contains("YELLOW")&c5.contains("YELLOW")||
				   e0.contains("YELLOW")&d0.contains("YELLOW")&c0.contains("YELLOW")&b0.contains("YELLOW")||
				   e1.contains("YELLOW")&d1.contains("YELLOW")&c1.contains("YELLOW")&b1.contains("YELLOW")||
				   e2.contains("YELLOW")&d2.contains("YELLOW")&c2.contains("YELLOW")&b2.contains("YELLOW")||
				   e3.contains("YELLOW")&d3.contains("YELLOW")&c3.contains("YELLOW")&b3.contains("YELLOW")||
				   e4.contains("YELLOW")&d4.contains("YELLOW")&c4.contains("YELLOW")&b4.contains("YELLOW")||
				   e5.contains("YELLOW")&d5.contains("YELLOW")&c5.contains("YELLOW")&b5.contains("YELLOW")||
				   d0.contains("YELLOW")&c0.contains("YELLOW")&b0.contains("YELLOW")&a0.contains("YELLOW")||
				   d1.contains("YELLOW")&c1.contains("YELLOW")&b1.contains("YELLOW")&a1.contains("YELLOW")||
				   d2.contains("YELLOW")&c2.contains("YELLOW")&b2.contains("YELLOW")&a2.contains("YELLOW")||
				   d3.contains("YELLOW")&c3.contains("YELLOW")&b3.contains("YELLOW")&a3.contains("YELLOW")||
				   d4.contains("YELLOW")&c4.contains("YELLOW")&b4.contains("YELLOW")&a4.contains("YELLOW")||
				   d5.contains("YELLOW")&c5.contains("YELLOW")&b5.contains("YELLOW")&a5.contains("YELLOW")||
				   a0.contains("YELLOW")&a1.contains("YELLOW")&a2.contains("YELLOW")&a3.contains("YELLOW")||
				   b0.contains("YELLOW")&b1.contains("YELLOW")&b2.contains("YELLOW")&b3.contains("YELLOW")||
				   c0.contains("YELLOW")&c1.contains("YELLOW")&c2.contains("YELLOW")&c3.contains("YELLOW")||
				   d0.contains("YELLOW")&d1.contains("YELLOW")&d2.contains("YELLOW")&d3.contains("YELLOW")||
				   e0.contains("YELLOW")&e1.contains("YELLOW")&e2.contains("YELLOW")&e3.contains("YELLOW")||
				   f0.contains("YELLOW")&f1.contains("YELLOW")&f2.contains("YELLOW")&f3.contains("YELLOW")||
				   g0.contains("YELLOW")&g1.contains("YELLOW")&g2.contains("YELLOW")&g3.contains("YELLOW")||
				   a1.contains("YELLOW")&a2.contains("YELLOW")&a3.contains("YELLOW")&a4.contains("YELLOW")||
				   b1.contains("YELLOW")&b2.contains("YELLOW")&b4.contains("YELLOW")&b4.contains("YELLOW")||
				   c1.contains("YELLOW")&c2.contains("YELLOW")&c3.contains("YELLOW")&c4.contains("YELLOW")||
				   d1.contains("YELLOW")&d2.contains("YELLOW")&d3.contains("YELLOW")&d4.contains("YELLOW")||
				   e1.contains("YELLOW")&e2.contains("YELLOW")&e3.contains("YELLOW")&e4.contains("YELLOW")||
				   f1.contains("YELLOW")&f2.contains("YELLOW")&f3.contains("YELLOW")&f4.contains("YELLOW")||
				   g1.contains("YELLOW")&g2.contains("YELLOW")&g3.contains("YELLOW")&g4.contains("YELLOW")||
				   a2.contains("YELLOW")&a3.contains("YELLOW")&a4.contains("YELLOW")&a5.contains("YELLOW")||
				   b2.contains("YELLOW")&b3.contains("YELLOW")&b4.contains("YELLOW")&b5.contains("YELLOW")||
				   c2.contains("YELLOW")&c3.contains("YELLOW")&c4.contains("YELLOW")&c5.contains("YELLOW")||
				   d2.contains("YELLOW")&d3.contains("YELLOW")&d4.contains("YELLOW")&d5.contains("YELLOW")||
				   e2.contains("YELLOW")&e3.contains("YELLOW")&e4.contains("YELLOW")&e5.contains("YELLOW")||
				   f2.contains("YELLOW")&f3.contains("YELLOW")&f4.contains("YELLOW")&f5.contains("YELLOW")||
				   g2.contains("YELLOW")&g3.contains("YELLOW")&g4.contains("YELLOW")&g5.contains("YELLOW")||
				   a5.contains("YELLOW")&a4.contains("YELLOW")&a3.contains("YELLOW")&a2.contains("YELLOW")||
				   b5.contains("YELLOW")&b4.contains("YELLOW")&b3.contains("YELLOW")&b2.contains("YELLOW")||
				   c5.contains("YELLOW")&c4.contains("YELLOW")&c3.contains("YELLOW")&c2.contains("YELLOW")||
				   d5.contains("YELLOW")&d4.contains("YELLOW")&d3.contains("YELLOW")&d2.contains("YELLOW")||
				   e5.contains("YELLOW")&e4.contains("YELLOW")&e3.contains("YELLOW")&e2.contains("YELLOW")||
				   f5.contains("YELLOW")&f4.contains("YELLOW")&f3.contains("YELLOW")&f2.contains("YELLOW")||
				   g5.contains("YELLOW")&g4.contains("YELLOW")&g3.contains("YELLOW")&g2.contains("YELLOW")||
				   a4.contains("YELLOW")&a3.contains("YELLOW")&a2.contains("YELLOW")&a1.contains("YELLOW")||
				   b4.contains("YELLOW")&b3.contains("YELLOW")&b2.contains("YELLOW")&b1.contains("YELLOW")||
				   c4.contains("YELLOW")&c3.contains("YELLOW")&c2.contains("YELLOW")&c1.contains("YELLOW")||
				   d4.contains("YELLOW")&d3.contains("YELLOW")&d2.contains("YELLOW")&d1.contains("YELLOW")||
				   e4.contains("YELLOW")&e3.contains("YELLOW")&e2.contains("YELLOW")&e1.contains("YELLOW")||
				   f4.contains("YELLOW")&f3.contains("YELLOW")&f2.contains("YELLOW")&f1.contains("YELLOW")||
				   g4.contains("YELLOW")&g3.contains("YELLOW")&g2.contains("YELLOW")&g1.contains("YELLOW")||
				   a3.contains("YELLOW")&a2.contains("YELLOW")&a1.contains("YELLOW")&a0.contains("YELLOW")||
				   b3.contains("YELLOW")&b2.contains("YELLOW")&b1.contains("YELLOW")&b0.contains("YELLOW")||
				   c3.contains("YELLOW")&c2.contains("YELLOW")&c1.contains("YELLOW")&c0.contains("YELLOW")||
				   d3.contains("YELLOW")&d2.contains("YELLOW")&d1.contains("YELLOW")&d0.contains("YELLOW")||
				   e3.contains("YELLOW")&e2.contains("YELLOW")&e1.contains("YELLOW")&e0.contains("YELLOW")||
				   f3.contains("YELLOW")&f2.contains("YELLOW")&f1.contains("YELLOW")&f0.contains("YELLOW")||
				   g3.contains("YELLOW")&g2.contains("YELLOW")&g1.contains("YELLOW")&g0.contains("YELLOW")||
				   a0.contains("YELLOW")&b1.contains("YELLOW")&c2.contains("YELLOW")&d3.contains("YELLOW")||
				   b0.contains("YELLOW")&c1.contains("YELLOW")&d2.contains("YELLOW")&e3.contains("YELLOW")||
				   c0.contains("YELLOW")&d1.contains("YELLOW")&e2.contains("YELLOW")&f3.contains("YELLOW")||
				   d0.contains("YELLOW")&e1.contains("YELLOW")&f2.contains("YELLOW")&g3.contains("YELLOW")||
				   g0.contains("YELLOW")&f1.contains("YELLOW")&e2.contains("YELLOW")&d3.contains("YELLOW")||
				   f0.contains("YELLOW")&e1.contains("YELLOW")&d2.contains("YELLOW")&c3.contains("YELLOW")||
				   d0.contains("YELLOW")&c1.contains("YELLOW")&a2.contains("YELLOW")&a3.contains("YELLOW")||
				   a1.contains("YELLOW")&b2.contains("YELLOW")&c3.contains("YELLOW")&d4.contains("YELLOW")||
				   b1.contains("YELLOW")&c2.contains("YELLOW")&d3.contains("YELLOW")&e4.contains("YELLOW")||
				   c1.contains("YELLOW")&d2.contains("YELLOW")&e3.contains("YELLOW")&f4.contains("YELLOW")||
				   d1.contains("YELLOW")&e2.contains("YELLOW")&f3.contains("YELLOW")&g4.contains("YELLOW")||
				   g1.contains("YELLOW")&f2.contains("YELLOW")&e3.contains("YELLOW")&d4.contains("YELLOW")||
				   f1.contains("YELLOW")&e2.contains("YELLOW")&d3.contains("YELLOW")&c4.contains("YELLOW")||
				   e1.contains("YELLOW")&d2.contains("YELLOW")&c3.contains("YELLOW")&b4.contains("YELLOW")||
				   d1.contains("YELLOW")&c2.contains("YELLOW")&b3.contains("YELLOW")&a4.contains("YELLOW")||
				   a2.contains("YELLOW")&b3.contains("YELLOW")&c4.contains("YELLOW")&d5.contains("YELLOW")||
				   b2.contains("YELLOW")&c3.contains("YELLOW")&d4.contains("YELLOW")&e5.contains("YELLOW")||
				   c2.contains("YELLOW")&d3.contains("YELLOW")&e4.contains("YELLOW")&f5.contains("YELLOW")||
				   d2.contains("YELLOW")&e3.contains("YELLOW")&f4.contains("YELLOW")&g5.contains("YELLOW")||
				   g2.contains("YELLOW")&f3.contains("YELLOW")&e4.contains("YELLOW")&d5.contains("YELLOW")||
				   f2.contains("YELLOW")&e3.contains("YELLOW")&d4.contains("YELLOW")&c5.contains("YELLOW")||
				   e2.contains("YELLOW")&d3.contains("YELLOW")&c4.contains("YELLOW")&b5.contains("YELLOW")||
				   d2.contains("YELLOW")&c3.contains("YELLOW")&b4.contains("YELLOW")&a5.contains("YELLOW")||
				   a3.contains("YELLOW")&b2.contains("YELLOW")&c1.contains("YELLOW")&d0.contains("YELLOW")||
				   b3.contains("YELLOW")&c2.contains("YELLOW")&d1.contains("YELLOW")&e0.contains("YELLOW")||
				   c3.contains("YELLOW")&d2.contains("YELLOW")&e1.contains("YELLOW")&f0.contains("YELLOW")||
				   d3.contains("YELLOW")&e2.contains("YELLOW")&f1.contains("YELLOW")&g0.contains("YELLOW")||
				   g3.contains("YELLOW")&f2.contains("YELLOW")&e1.contains("YELLOW")&d0.contains("YELLOW")||
				   f3.contains("YELLOW")&e2.contains("YELLOW")&d1.contains("YELLOW")&c0.contains("YELLOW")||
				   e3.contains("YELLOW")&d2.contains("YELLOW")&c1.contains("YELLOW")&b0.contains("YELLOW")||
				   d3.contains("YELLOW")&c2.contains("YELLOW")&b1.contains("YELLOW")&a0.contains("YELLOW")||
				   a4.contains("YELLOW")&b3.contains("YELLOW")&c2.contains("YELLOW")&d1.contains("YELLOW")||
				   b4.contains("YELLOW")&c3.contains("YELLOW")&d2.contains("YELLOW")&e1.contains("YELLOW")||
				   c4.contains("YELLOW")&d3.contains("YELLOW")&e2.contains("YELLOW")&f1.contains("YELLOW")||
				   d4.contains("YELLOW")&e3.contains("YELLOW")&f2.contains("YELLOW")&g1.contains("YELLOW")||
				   g4.contains("YELLOW")&f3.contains("YELLOW")&e2.contains("YELLOW")&d1.contains("YELLOW")||
				   f4.contains("YELLOW")&e3.contains("YELLOW")&d2.contains("YELLOW")&c1.contains("YELLOW")||
				   e4.contains("YELLOW")&d3.contains("YELLOW")&c2.contains("YELLOW")&b1.contains("YELLOW")||
				   d4.contains("YELLOW")&c3.contains("YELLOW")&b2.contains("YELLOW")&a1.contains("YELLOW")||
				   a5.contains("YELLOW")&b4.contains("YELLOW")&c3.contains("YELLOW")&d2.contains("YELLOW")||
				   b5.contains("YELLOW")&c4.contains("YELLOW")&d3.contains("YELLOW")&e2.contains("YELLOW")||
				   c5.contains("YELLOW")&d4.contains("YELLOW")&e3.contains("YELLOW")&f2.contains("YELLOW")||
				   d5.contains("YELLOW")&e4.contains("YELLOW")&f3.contains("YELLOW")&g2.contains("YELLOW")||
				   g5.contains("YELLOW")&f4.contains("YELLOW")&e3.contains("YELLOW")&d2.contains("YELLOW")||
				   f5.contains("YELLOW")&e4.contains("YELLOW")&d3.contains("YELLOW")&c2.contains("YELLOW")||
				   e5.contains("YELLOW")&d4.contains("YELLOW")&c3.contains("YELLOW")&b2.contains("YELLOW")||
				   d5.contains("YELLOW")&c4.contains("YELLOW")&b3.contains("YELLOW")&a2.contains("YELLOW")
				   ) 
				{
					tPAusgabe.setText("GELB hat gewonnen!!!!");
				}
		else if (CounterGelbeSteine==0 && CounterRoteSteine==0){
					tPAusgabe.setText("Unentschieden!!!");
		}
		else {
			tPAusgabe.setText("Runde " + CounterRunde);
		}
			
		
	}
}



