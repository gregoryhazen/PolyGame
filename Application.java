package PolyGame;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Application extends JFrame{

	public Application(){
		
		initUI();
		Control controls = new Control();

	}

	public void initUI(){

		add(new Board());

		setResizable(false);
		pack();

		setTitle("Application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

	}

	public static void main(String[] args){

		EventQueue.invokeLater(() -> {
			Application poly = new Application();
			poly.setVisible(true);
		});
		
	}

}