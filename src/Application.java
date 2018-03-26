import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Application extends JFrame {

	File[] images;
	File repertoire;
	JPanel panel,panel1, panel2, panel3;

	public Application() {
		
		
		this.setPreferredSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setTitle("Application");
		this.setLayout(new BorderLayout());
	
		this.add(new VUE_BandeauHaut(), BorderLayout.NORTH);
		this.add(new VUE_BandeauLateral(), BorderLayout.WEST);
		this.add(new VUE_BandeauCentral());
		this.pack();
		
	}
	
	public static void main(String[] args) {
		Application app = new Application();
		System.out.println(app.getSize());
		//System.out.println("projet java");
		//String configFile = "config.xml";
		//Control control = new Control(configFile);
		//Model model = new Model(control);

	}

}