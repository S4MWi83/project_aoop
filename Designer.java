import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class Designer {

	public abstract JPanel createBackComponent();
	public abstract JLayeredPane createPicturePane();
	
	public abstract void saveButtonPressed();	
	public abstract void loadButtonPressed();
	
	public abstract void bedButtonPressed();
	
	public Designer() {
	
		JButton saveButton 	= new JButton("Save design");
		JButton loadButton 	= new JButton("Load design");
		
		JButton bedButton = new JButton("Bed");
		JButton tableButton = new JButton("Table");
		JButton sofaButton = new JButton("Sofa");
		JButton refrigeratorButton = new JButton("Refrigerator");
		JButton chairButton = new JButton("Chair");
		JButton bedsideTableButton = new JButton("Bedside table");
		JButton wardrobeButton = new JButton("Wardrobe");
		JButton stoveButton = new JButton("Stove");
		JButton countertopButton = new JButton("Countertop");
		JButton deskButton = new JButton("Desk");
		JButton coffeTableButton = new JButton("Coffe table");
		JButton toiletButton = new JButton("Toilet");
		JButton showerButton = new JButton("Shower");
		JButton bathtubButton = new JButton("Bathtub");
		JButton sinkButton = new JButton("Sink");
		
		saveButton.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				
				saveButtonPressed();				
				
			}
		});
		
		loadButton.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				loadButtonPressed();
			}
		});
		
		bedButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				bedButtonPressed();
				
			}
		});
	
		panel.add(saveButton);
		panel.add(loadButton);
		panel.add(bedButton);
		panel.add(tableButton);
		panel.add(sofaButton);	
		panel.add(refrigeratorButton);
		panel.add(chairButton);	
		panel.add(bedsideTableButton);
		panel.add(wardrobeButton);
		panel.add(stoveButton);
		panel.add(countertopButton);	
		panel.add(deskButton);
		panel.add(coffeTableButton);
		panel.add(toiletButton);
		panel.add(showerButton);	
		panel.add(bathtubButton);
		panel.add(sinkButton);
		
		comp.setPreferredSize(new Dimension(800, 500));
		
		panel.setLayout(new FlowLayout());
		panel.setPreferredSize(new Dimension(781, 200));
		frame.add(comp);
		frame.add(new PicturePane());
		frame.add(panel);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 650);
		frame.setVisible(true);
		
	}
	
	private JComponent comp = createBackComponent();
	private JComponent pics = createPicturePane();
	private JPanel panel	= new JPanel();
	private JFrame frame 	= new JFrame("Room Sketcher");
	private JTextField textField = new JTextField(20);
	private DesignProject[] dpa = new DesignProject[10];
	
}