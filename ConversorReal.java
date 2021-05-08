package br.com.projetos.conversor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConversorReal {
	
	public static void converter(){
		
		JFrame frame = new JFrame("CONVERTER");
		JLabel label1, label2;
		JTextField texto1, texto2;
		JButton botao1,botao2, botao3;
		
		label1 = new JLabel("Reais");
		label1.setBounds(20, 40, 60, 30);
		label2 = new JLabel("Dólar");
		label2.setBounds(170, 40, 60, 30);
		
		texto1 = new JTextField("0");
		texto1.setBounds(80, 40, 50, 30);
		texto2 = new JTextField("0");
		texto2.setBounds(240, 40, 50, 30);
		
		botao1 = new JButton("Reais");
		botao1.setBounds(60, 90, 70, 20);
		botao2 = new JButton("Dolar");
		botao2.setBounds(200, 90, 70, 20);
		botao3 = new JButton("Fechar");
		botao3.setBounds(140, 140, 90, 40);
		
		botao1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double reais = Double.parseDouble(texto1.getText());
				
				double reaisParaDolar = (reais/5.30);
				
				String string1 = String.valueOf(reaisParaDolar);
				texto2.setText(string1);
				
			}
		});

		botao2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double dolar = Double.parseDouble(texto2.getText());
				
				double dolarParaReais = (dolar * 5.30);
				
				String string2 = String.valueOf(dolarParaReais);
				texto1.setText(string2);
				
			}
		});

		botao3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

			}
		});

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		frame.add(label1);
		frame.add(texto1);
		frame.add(label2);
		frame.add(texto2);
		frame.add(botao1);
		frame.add(botao2);
		frame.add(botao3);
		
		frame.setLayout(null);
		frame.setSize(400, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		converter();
	}
}
