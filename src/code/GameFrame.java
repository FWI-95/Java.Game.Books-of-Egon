package code;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements WindowListener{
	
	public GameFrame(){
		this.addWindowListener(this);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setSize(100,100);
	}

	@Override
	public void windowClosing(WindowEvent we) {
		Egon.ChangeFrame("Startmenu", true);
		Egon.KillEngine();
	}
	
	@Override
	public void windowOpened(WindowEvent we) {
	}
	@Override
	public void windowClosed(WindowEvent we) {	
	}
	@Override
	public void windowIconified(WindowEvent we) {	
	}
	@Override
	public void windowDeiconified(WindowEvent we) {	
	}
	@Override
	public void windowActivated(WindowEvent we) {	
	}
	@Override
	public void windowDeactivated(WindowEvent we) {	
	}
}
