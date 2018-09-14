import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame {
	
	JPanel centerPanel = new JPanel();
	JPanel westPanel = new JPanel();
	JPanel eastPanel = new JPanel();
	JPanel northPanel = new JPanel();
	JPanel southPanel = new JPanel();
	
	JLabel westLabel = new JLabel();
	JLabel eastLabel = new JLabel();
	
	JLabel northLabel = new JLabel();
	
	JPanel centerPanel1 = new JPanel();
	JPanel centerPanel2 = new JPanel();
	JPanel centerPanel3 = new JPanel();
	
	/*JButton next = new JButton("Напред");
	JButton previous = new JButton("Назад");
	JButton products = new JButton("Продукти");
	JButton sort = new JButton("Сортиране");
	JButton exit = new JButton("Изход");*/
	
	JLabel centerLabel1 = new JLabel("Електронен наръчник за готвене.");
	JLabel centerLabel2 = new JLabel("Здравейте днес ще готвим две неща.");
	JLabel centerLabel3 = new JLabel("1.Лазаня \n\n 2.Бисквитена торта");
	
	JButton btn = new JButton("Към рецептата");
	
	String firstRecipeIndicator = "Рецепта за лазаня";
	String secondRecipeIndicator = "Рецепта за бисквитена торта";
	
	/*String stupka1 = "1. Запържваме каймата ";
	String stupka2 = "2. Добавяме доматения и морковите";
	String stupka3 = "3. Сваряваме блатовете";
	String stupka4 = "4. Редуваме блат и от вече готовия сос";
	String stupka5 = "5. Настъргваме кашкавал и запичаме";
	
	String kaima = "Кайма";
	String domatensok =  "доматен сок";*/
	/*Продукти: 
кайма
доматен сок
моркови
олио
блатове за лазаня*/
	public MainFrame() {
		JFrame window = new JFrame("Lets cook !");
		
		window.setSize(900,700);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		window.setLayout(new BorderLayout());
		
		//northPanel
		window.add(northPanel, BorderLayout.NORTH);
		northPanel.add(northLabel, BorderLayout.NORTH);
		Image img3 = new ImageIcon(this.getClass().getResource("wel.jpg")).getImage();
		northLabel.setIcon(new ImageIcon(img3));
		
		//southPanel
		window.add(southPanel, BorderLayout.SOUTH);
		southPanel.add(btn);
		
		//westPanel
		window.add(westPanel, BorderLayout.WEST);
		westPanel.add(westLabel);
		Image img2 = new ImageIcon(this.getClass().getResource("1.jpg")).getImage();
		westLabel.setIcon(new ImageIcon(img2));
		
		//eastPanel
		window.add(eastPanel, BorderLayout.EAST);
		eastPanel.add(eastLabel);
		Image img1 = new ImageIcon(this.getClass().getResource("2.jpg")).getImage();
		eastLabel.setIcon(new ImageIcon(img1));
		
		//centerPAnel
		window.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new GridLayout(3, 1));
		centerPanel.add(centerPanel1);
		centerPanel1.add(centerLabel1);
		
		centerPanel.add(centerPanel2);
		centerPanel2.add(centerLabel2);
		
		centerPanel.add(centerPanel3);
		centerPanel3.add(centerLabel3);
		
		
		centerLabel1.setVisible(true);
		centerLabel2.setVisible(true);
		centerLabel3.setVisible(true);
		
		btn.addActionListener(new whichRecipe());
		
		westLabel.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent arg0) {
				Image img1 = new ImageIcon(this.getClass().getResource("1.jpg")).getImage();
				northLabel.setIcon(new ImageIcon(img1));
				centerLabel1.setText(firstRecipeIndicator);
				
			}
			
		});
		
		
		eastLabel.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent arg0) {
				Image img2 = new ImageIcon(this.getClass().getResource("2.jpg")).getImage();
				northLabel.setIcon(new ImageIcon(img2));
				centerLabel1.setText(secondRecipeIndicator);
				
			}
			
		});
	}
	protected class whichRecipe implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(centerLabel1.getText() == firstRecipeIndicator) {
				FirstFrame frame = new FirstFrame();
			}else {
				SecondFrame window = new SecondFrame();
			}
		}
		
	}
}