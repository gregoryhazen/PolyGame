package PolyGame.src;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Application extends JFrame{

	public Application(){
		
		initUI();

	}

	public void initUI(){

		add(new Board());

		setSize(500, 500);
		setResizable(false);

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