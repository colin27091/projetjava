import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelCentralHaut extends JPanel implements ActionListener {
	
<<<<<<< Updated upstream
	String[] affichages = {"Petites icones", "Grande icones", "Mosa�que"};

	private ArrayList<Pic> images = null;

=======
>>>>>>> Stashed changes
	String[] tri = {"Date", "Taille", "Extension", "Nom"};
	String[] crois = {"Croissant", "Decroissant"};
	
	private static final long serialVersionUID = 1L;

	PanelCentralHaut(){
		super();
		
		this.setBackground(new Color(255, 223, 183));
		this.setLayout(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(10,10,10,10);
<<<<<<< Updated upstream
=======
		
>>>>>>> Stashed changes
		
		JButton fromfolder = new JButton("Charger un dossier");
		
<<<<<<< Updated upstream
		JButton fromfolder = new JButton("Charger un dossier");
		
		this.add(fromfolder, c);
		
		JButton zoomIn = new JButton("");
		JButton zoomOut = new JButton("");
		zoomIn.setIcon(new ImageIcon("zoom-in.png"));
		zoomOut.setIcon( new ImageIcon("zoom-out.png"));
		zoomIn.setPreferredSize(new Dimension(25,25));
		zoomOut.setPreferredSize(new Dimension(25,25));
		zoomIn.setBounds(1094,0,25,26);
		zoomOut.setBounds(1120,0,30,26);
		zoomIn.setBackground(new Color(236, 193,119));
		zoomOut.setBackground(new Color(236, 193,119));
		c.gridy ++ ;
		
		JLabel TrierPar = new JLabel("Afficher par :");
		
		JComboBox<String> aff = new JComboBox<String>(tri);
		aff.setSelectedIndex(0);
		aff.setBackground(new Color(236, 193,119));
		this.setBackground(new Color(236, 193,119));
		//this.add(AffichePar,BorderLayout.EAST);
		//this.add(zoomIn, BorderLayout.EAST);
		//this.add(zoomOut, BorderLayout.EAST);
		//this.add(aff, BorderLayout.EAST);
		/*zoomIn.addActionListener(new ZoomInListener());*/
	}
		
		/* Marche pas :'( 
		 * *class ZoomInListener implements ActionListener {
		    public void actionPerformed(ActionEvent e) {

			PanelCentralGeneral pan = new PanelCentralGeneral();				
			pan.images = Pic.fromFiles(new File("images/").listFiles());
			pan.setLayout(new GridBagLayout());
				
			pan.setBackground(Color.white);

			pan.setBorder(BorderFactory.createLineBorder(Color.black));
				
			for(int i = 0; i < images.size(); i++) {
				
				GridBagConstraints c = new GridBagConstraints();
				c.gridx = i%3;
				c.gridy = i/3;
				c.insets = new Insets(10,10,10,10);
					
				pan.add(new Case(images.get(i)), c);
					
				}
				
=======
		this.add(fromfolder, c);
		
		c.gridy ++ ;
		
		JLabel TrierPar = new JLabel("Afficher par :");
		
		JComboBox<String> aff = new JComboBox<String>(tri);
		aff.setSelectedIndex(0);
>>>>>>> Stashed changes
		aff.setBackground(null);
		
		JComboBox<String> croissant = new JComboBox<String>(crois);
		
		
		JButton trier = new JButton("Trier");
		
		this.add(TrierPar, c);
		this.add(aff, c);
		this.add(croissant,c);
		this.add(trier, c);
		
	}

		}
*/
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}

}
