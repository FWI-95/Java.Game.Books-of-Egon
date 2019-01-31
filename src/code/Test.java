package code;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test extends JFrame implements ActionListener{
	JLabel jlblAnimation;
	JLabel label;
	JButton jbtnAnimation;
	BoxLayout layoutMgr;
	java.net.URL imageURL;
	ImageIcon imicLabel;
	ImageIcon imicButton;
	ClassLoader cldr;
	URL url;
	Icon icon;

	public Test() {
		this.setSize(100,200);
		this.setTitle("Test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    cldr = this.getClass().getClassLoader();
	    
		JPanel panel = new JPanel();
		jlblAnimation = new JLabel();
	    label = new JLabel("Loading...");
		jbtnAnimation = new JButton();

	    imageURL = cldr.getResource("gfx/chars/Player.gif");	    
	    imicLabel = new ImageIcon(imageURL);
	    imicButton = new ImageIcon(imageURL);
	    
	    layoutMgr = new BoxLayout(panel, BoxLayout.PAGE_AXIS);	    
	    
	    jlblAnimation.setIcon(imicLabel);
	    jbtnAnimation.setIcon(imicButton);
	    
	    imicLabel.setImageObserver(jlblAnimation);
	    imicButton.setImageObserver(jbtnAnimation);
	    
	    jbtnAnimation.addActionListener(this);
	    
	    panel.setLayout(layoutMgr);

	    panel.add(jlblAnimation);
	    panel.add(jbtnAnimation);
	    panel.add(label);
		
	    this.getContentPane().add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==jbtnAnimation)System.exit(0);
	}
}
