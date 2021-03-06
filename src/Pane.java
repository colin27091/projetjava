
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Pane extends javax.swing.JPanel implements ActionListener {

	ArrayList<Case> cases;
	ArrayList<String> filtrage;
	ArrayList<String> tri;
	ArrayList<JCheckBox> filtres;
	Control ctr;

	JButton Add_Tag;
	JButton Add_folder;
	JButton Add_folder2;
	JButton Add_file;
	JButton All_select;
	JButton Appliquer;
	JComboBox<String> Croisant_dec;
	JScrollPane Filtrage;
	JTabbedPane Filtre_tri;
	JPanel PanelCentral;
	JPanel PanelGeneral;
	JPanel PanelHaut;
	JPanel PanelHaut2;
	JPanel PanelLateral;
	JButton Remove_choice;
	JSplitPane SplitCentral;
	JButton Supp;
	JPanel Tri;
	JComboBox<String> TriPar;
	JButton All_deselect;
	JPanel All_filtrage;
	JScrollPane jScrollPane1;
	JButton nom;
	JTextField recherche;
	JButton tag;

	public Pane(Control ctr) {
		this.ctr = ctr;
		initComponents();
	}

	public void setPics(ArrayList<Pic> pics) {

		this.cases = Case.fromPics(pics);

		this.PanelGeneral.removeAll();

		if (cases.isEmpty()) {
			this.PanelGeneral.add(Add_folder2);
		} else {
			for (int i = 0; i < cases.size(); i++) {
				GridBagConstraints c = new GridBagConstraints();
				c.gridx = i % 4;
				c.gridy = i / 4;
				c.insets = new Insets(10, 10, 10, 10);

				this.PanelGeneral.add(cases.get(i), c);

			}
		}
		this.filtres = new ArrayList<JCheckBox>();
		
		/*for(Pic pic : pics) {
			if(! pic.tags.isEmpty()) {
				for(String tag : pic.tags) {
					if(!this.filtres.contains(tag)) {
						this.filtres.add(new JCheckBox(tag));
					}
				}
			}
		}*/
		
		for(JCheckBox jcb : this.filtres) {
			this.All_filtrage.add(jcb);
		}
		
		
		this.PanelGeneral.repaint();
		this.PanelGeneral.revalidate();
		super.revalidate();
		super.repaint();
	}

	private void initComponents() {

		PanelHaut = new javax.swing.JPanel();
		PanelCentral = new javax.swing.JPanel();
		PanelHaut2 = new javax.swing.JPanel();
		Add_Tag = new javax.swing.JButton();
		Supp = new javax.swing.JButton();
		All_select = new javax.swing.JButton();
		All_deselect = new javax.swing.JButton();
		Add_folder = new javax.swing.JButton();
		Add_folder2 = new javax.swing.JButton();
		Add_file = new javax.swing.JButton();
		SplitCentral = new javax.swing.JSplitPane();
		PanelLateral = new javax.swing.JPanel();
		recherche = new javax.swing.JTextField();
		nom = new javax.swing.JButton();
		tag = new javax.swing.JButton();
		Filtre_tri = new javax.swing.JTabbedPane();
		Tri = new javax.swing.JPanel();
		TriPar = new javax.swing.JComboBox<>();
		Croisant_dec = new javax.swing.JComboBox<>();
		Filtrage = new javax.swing.JScrollPane();
		All_filtrage = new javax.swing.JPanel();
		Appliquer = new javax.swing.JButton();
		Remove_choice = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jScrollPane1.getVerticalScrollBar().setUnitIncrement(15);

		PanelGeneral = new javax.swing.JPanel();

		Supp.setBackground(new Color(215, 213, 212));
		All_select.setBackground(new Color(215, 213, 212));
		Add_folder.setBackground(new Color(215, 213, 212));
		Add_file.setBackground(new Color(215, 213, 212));
		nom.setBackground(new Color(215, 213, 212));
		tag.setBackground(new Color(215, 213, 212));
		Appliquer.setBackground(new Color(215, 213, 212));
		Remove_choice.setBackground(new Color(215, 213, 212));
		Add_Tag.setBackground(new Color(215, 213, 212));
		All_deselect.setBackground(new Color(215, 213, 212));
		setPreferredSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
		setLayout(new java.awt.BorderLayout());

		PanelHaut.setBackground(new java.awt.Color(219, 109, 45));

		PanelHaut.add(new JLabel(new ImageIcon("logobis.png")));
		

		add(PanelHaut, java.awt.BorderLayout.NORTH);

		PanelCentral.setBackground(new java.awt.Color(25, 25, 25));
		PanelCentral.setLayout(new java.awt.BorderLayout());

		Add_Tag.setText("Ajouter un Tag");
		Add_Tag.addActionListener(this);
		Add_Tag.setActionCommand("Add_Tag");

		Supp.setText("Supprimer");
		Supp.addActionListener(this);
		Supp.setActionCommand("Supp");

		All_select.setText("Tout selectionner");
		All_select.addActionListener(this);
		All_select.setActionCommand("All_select");

		All_deselect.setText("Tout deselectionner");
		All_deselect.addActionListener(this);
		All_deselect.setActionCommand("All_deselect");

		Add_folder.setText("Ajouter Dossier");
		Add_folder.addActionListener(this.ctr);
		Add_folder.setActionCommand("Add_folder");
		
		Add_folder2.setText("Ajouter Dossier");
		Add_folder2.addActionListener(this.ctr);
		Add_folder2.setActionCommand("Add_folder");

		Add_file.setText("Ajouter Image");
		Add_file.addActionListener(this.ctr);
		Add_file.setActionCommand("Add_file");

		javax.swing.GroupLayout PanelHaut2Layout = new javax.swing.GroupLayout(PanelHaut2);
		PanelHaut2.setBackground(new Color(134, 129, 128));
		PanelHaut2.setLayout(PanelHaut2Layout);
		PanelHaut2Layout.setHorizontalGroup(PanelHaut2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(PanelHaut2Layout.createSequentialGroup().addContainerGap()
						.addComponent(Add_Tag, javax.swing.GroupLayout.PREFERRED_SIZE, 169,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(Supp, javax.swing.GroupLayout.PREFERRED_SIZE, 165,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(All_select, javax.swing.GroupLayout.PREFERRED_SIZE, 173,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(All_deselect, javax.swing.GroupLayout.PREFERRED_SIZE, 183,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 736, Short.MAX_VALUE)
						.addComponent(Add_folder).addComponent(Add_file).addContainerGap()));
		PanelHaut2Layout.setVerticalGroup(PanelHaut2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelHaut2Layout.createSequentialGroup()
						.addContainerGap(13, Short.MAX_VALUE)
						.addGroup(PanelHaut2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(Add_Tag).addComponent(Supp).addComponent(All_select)
								.addComponent(All_deselect).addComponent(Add_folder).addComponent(Add_file))
						.addContainerGap()));

		PanelCentral.add(PanelHaut2, java.awt.BorderLayout.NORTH);

		PanelLateral.setBackground(new java.awt.Color(219, 109, 45));
		PanelLateral.setPreferredSize(new java.awt.Dimension(100, 409));

		recherche.setText("Recherche");

		nom.setText("Par Nom");
		nom.addActionListener(this.ctr);
		nom.setActionCommand("nom");

		tag.setText("Par Tag");
		tag.addActionListener(this.ctr);
		tag.setActionCommand("nom");

		Filtre_tri.setPreferredSize(new java.awt.Dimension(100, 450));

		TriPar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "Nom" }));

		Croisant_dec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Croissant", "Decroissant" }));

		javax.swing.GroupLayout TriLayout = new javax.swing.GroupLayout(Tri);
		Tri.setLayout(TriLayout);
		TriLayout.setHorizontalGroup(TriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(TriLayout.createSequentialGroup().addContainerGap()
						.addGroup(TriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(TriPar, 0, 125, Short.MAX_VALUE)
								.addComponent(Croisant_dec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));
		TriLayout.setVerticalGroup(TriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(TriLayout.createSequentialGroup().addGap(23, 23, 23)
						.addComponent(TriPar, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(Croisant_dec, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(324, Short.MAX_VALUE)));

		Filtre_tri.addTab("Tri", Tri);

		Filtrage.setBackground(new java.awt.Color(213, 204, 188));

		All_filtrage.setPreferredSize(new java.awt.Dimension(100, 411));

		Filtrage.setViewportView(All_filtrage);

		Filtre_tri.addTab("Filtrage", Filtrage);

		Appliquer.setText("Appliquer");
		Appliquer.addActionListener(this);
		Appliquer.setActionCommand("Appliquer");

		
		Remove_choice.setText("Annuler");
		Remove_choice.addActionListener(this.ctr);
		Remove_choice.setActionCommand("Annuler");
		

		javax.swing.GroupLayout PanelLateralLayout = new javax.swing.GroupLayout(PanelLateral);
		PanelLateral.setLayout(PanelLateralLayout);
		PanelLateralLayout.setHorizontalGroup(PanelLateralLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(PanelLateralLayout.createSequentialGroup().addContainerGap()
						.addGroup(PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(tag, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(Filtre_tri, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
								.addComponent(nom, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(recherche, javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(PanelLateralLayout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
										.addComponent(Remove_choice).addGap(11, 11, 11).addComponent(Appliquer)))
						.addContainerGap()));
		PanelLateralLayout
				.setVerticalGroup(PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(PanelLateralLayout.createSequentialGroup().addContainerGap()
								.addComponent(recherche, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(nom)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(tag)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(Filtre_tri, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(PanelLateralLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(Appliquer).addComponent(Remove_choice))
								.addContainerGap()));

		SplitCentral.setLeftComponent(PanelLateral);

		PanelGeneral.setBackground(new java.awt.Color(219, 109, 45));
		PanelGeneral.setLayout(new java.awt.GridBagLayout());
		jScrollPane1.setViewportView(PanelGeneral);

		SplitCentral.setRightComponent(jScrollPane1);

		PanelCentral.add(SplitCentral, java.awt.BorderLayout.CENTER);

		add(PanelCentral, java.awt.BorderLayout.CENTER);
	}// </editor-fold>//GEN-END:initComponents

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "All_select") {
			for (int i = 0; i < cases.size(); i++) {
				this.PanelGeneral.remove(cases.get(i));
				cases.get(i).selection.setSelected(true);
				GridBagConstraints c = new GridBagConstraints();
				c.gridx = i % 4;
				c.gridy = i / 4;
				c.insets = new Insets(10, 10, 10, 10);

				this.PanelGeneral.add(cases.get(i), c);

			}
			repaint();
		}
		if (e.getActionCommand() == "All_deselect") {
			for (int i = 0; i < cases.size(); i++) {
				this.PanelGeneral.remove(cases.get(i));
				cases.get(i).selection.setSelected(false);
				GridBagConstraints c = new GridBagConstraints();
				c.gridx = i % 4;
				c.gridy = i / 4;
				c.insets = new Insets(10, 10, 10, 10);

				this.PanelGeneral.add(cases.get(i), c);

			}
			repaint();
		}
		
		if(e.getActionCommand() == "Supp") {
			ArrayList<Pic> pics = new ArrayList<Pic>();
			for(int i = 0; i< cases.size(); i++) {
				if(cases.get(i).selection.isSelected()) {
					pics.add(cases.get(i).pic);
				}
			}
			this.ctr.removePic(pics);
			
		}
		
		if(e.getActionCommand() == "Appliquer") {
			ArrayList<String> tri = new ArrayList<String>();
			ArrayList<String> filtre = new ArrayList<String>();
			tri.add((String) this.TriPar.getSelectedItem());
			tri.add((String) this.Croisant_dec.getSelectedItem());
			this.ctr.setParam(tri, filtre);
		}
		
		if(e.getActionCommand() == "nom") {
			ArrayList<Pic> pics = new ArrayList<>();
			for(Pic pic : this.ctr.model.data) {
				if(pic.name == this.recherche.getText()) {
					pics.add(pic);
				}
			}
			this.ctr.model.setData(pics);
		}
		
		if(e.getActionCommand() == "tag") {
			ArrayList<Pic> pics = this.ctr.model.tags.get(this.recherche.getText());
			this.ctr.model.setData(pics);
			
		}

		if(e.getActionCommand() == "Add_Tag") {
			ArrayList<Pic> pics = new ArrayList<Pic>();
			for(int i = 0; i< cases.size(); i++) {
				if(cases.get(i).selection.isSelected()) {
					pics.add(cases.get(i).pic);
				}
			}
			if(!pics.isEmpty()) {
				new AjoutTagbis(pics, this.ctr);
			}else {
				System.out.println("Pas de selection");
			}
			
		}

	}

}
