package code;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Einstellungen extends JFrame implements ActionListener, MouseListener{
	
	JLabel jlblInstallPath;
	JLabel jlblResolution;
	
	JTextField jtfInstallPath;
	JTextField jtfResolution;
	
	JButton jbtnSave;
	JButton jbtnClose;
	
	public Einstellungen(){
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		this.getContentPane().setLayout(new GridLayout(0,2));
		
		jlblInstallPath = new JLabel("Dateipfad");
		jlblResolution = new JLabel("Auflösung");
		
		jtfInstallPath = new JTextField();
		jtfResolution = new JTextField();
				
		jbtnSave = new JButton("Speichern");
		jbtnClose = new JButton("Schließen");
		
		jbtnSave.addActionListener(this);
		jbtnClose.addActionListener(this);
		
		jbtnSave.addMouseListener(this);
		jbtnClose.addMouseListener(this);
		
		
		this.getContentPane().add(jlblInstallPath);
		this.getContentPane().add(jtfInstallPath);
		this.getContentPane().add(jlblResolution);
		this.getContentPane().add(jtfResolution);
		this.getContentPane().add(jbtnSave);
		this.getContentPane().add(jbtnClose);
	}
	
	private static void Save(){
		//Optionen speichern
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==jbtnClose)Egon.ChangeFrame("Settings", false);
		if(ae.getSource()==jbtnSave)Save();
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent me) {
		if(me.getSource()== jbtnSave)System.out.println("jbtnSave_hover");
		
	}

	@Override
	public void mouseExited(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}

}
