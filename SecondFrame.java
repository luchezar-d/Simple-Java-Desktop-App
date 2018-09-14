import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SecondFrame {
	
	
	
	JPanel upPanel = new JPanel();
	JPanel midPanel = new JPanel();
	JPanel downPanel = new JPanel();
	
	JPanel downPanel1 = new JPanel();
	
	JPanel midPanelWest = new JPanel();
	JPanel midPanelCenter = new JPanel();
	
	JLabel centerLabel1 = new JLabel();
	JLabel centerLabel2 = new JLabel();
	JLabel centerLabel3 = new JLabel();
	JLabel westLabel = new JLabel();
	
	JPanel centerPanel1 = new JPanel();
	JPanel centerPanel2 = new JPanel();
	JPanel centerPanel3 = new JPanel();
	
	JButton next = new JButton("Напред");
	JButton previous = new JButton("Назад");
	JButton products = new JButton("Продукти");
	JButton sort = new JButton("Сортиране");
	JButton exit = new JButton("Изход");
	
	JLabel upLabel = new JLabel();
	
	String stupka0 = "0.Бисквитена торта";
	String stupka1 = "1. Топлим млчкото ";
	String stupka2 = "2. Добавяме нишестето";
	String stupka3 = "3. Бъркаме докато нишестето не започне да се сгъстява";
	String stupka4 = "4. Нареждаме бисквитите и ги заливаме с нишестето";
	String stupka5 = "5. Оставчме да изстине и е готова за ядене";
	
	String nisheste = "нишесте";
	String prqsnomlqko = "прясно мляко";
	String biskviti = "бисквити";
	String shokoladoviprachici = "шоколадови пръчици";
	String plodove = "плодове";
	
	
	
	public SecondFrame() {
		JFrame frame = new JFrame();
		frame.setSize(900,700);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		frame.setLayout(new GridLayout(3, 1));
		//upPanel
		frame.add(upPanel);
		upPanel.add(upLabel);
		
		//midPanel
		frame.add(midPanel);
		midPanel.setLayout(new BorderLayout());
		midPanel.add(midPanelWest,BorderLayout.WEST);
		midPanelWest.add(westLabel);
		midPanel.add(midPanelCenter,BorderLayout.CENTER);
		midPanelCenter.setLayout(new GridLayout(3, 1));
		midPanelCenter.add(centerPanel1);
		midPanelCenter.add(centerPanel2);
		midPanelCenter.add(centerPanel3);
		centerPanel1.add(centerLabel1);
		centerPanel2.add(centerLabel2);
		centerPanel3.add(centerLabel3);
		Image img1 = new ImageIcon(this.getClass().getResource("2.jpg")).getImage();
		westLabel.setIcon(new ImageIcon(img1));
		
		//downPanel
		frame.add(downPanel);
		downPanel.setLayout(new BorderLayout());
		downPanel.add(downPanel1,BorderLayout.SOUTH);
		downPanel1.add(next);
		downPanel1.add(previous);
		downPanel1.add(products);
		downPanel1.add(sort);
		downPanel1.add(exit);
		
		
		next.addActionListener(new ActionListener() {
			int counter = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				counter++;
				switch(counter) {
				case 1: centerLabel1.setText(stupka1);
				Image img1 = new ImageIcon(this.getClass().getResource("torta1.jpg")).getImage();
				upLabel.setIcon(new ImageIcon(img1));
				break;
				case 2: centerLabel1.setText(stupka2);
				Image img2 = new ImageIcon(this.getClass().getResource("torta2.jpg")).getImage();
				upLabel.setIcon(new ImageIcon(img2));
				break;
				case 3: centerLabel1.setText(stupka3);
				Image img3 = new ImageIcon(this.getClass().getResource("torta3.jpg")).getImage();
				upLabel.setIcon(new ImageIcon(img3));
				break;
				case 4: centerLabel1.setText(stupka4);
				Image img4 = new ImageIcon(this.getClass().getResource("torta4.jpg")).getImage();
				upLabel.setIcon(new ImageIcon(img4));
				break;
				case 5: centerLabel1.setText(stupka5);
				Image img5 = new ImageIcon(this.getClass().getResource("torta5.jpg")).getImage();
				upLabel.setIcon(new ImageIcon(img5));
				break;
				}
			}
		});
		
		previous.addActionListener(new ActionListener() {
			int counter = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				counter++;
				if(centerLabel1.getText() == stupka1) {
					centerLabel1.setText(stupka0);
				}
				if(centerLabel1.getText() == stupka2) {
					centerLabel1.setText(stupka1);
				}
				if(centerLabel1.getText() == stupka3) {
					centerLabel1.setText(stupka2);
				}
				if(centerLabel1.getText() == stupka4) {
					centerLabel1.setText(stupka3);
				}
				if(centerLabel1.getText() == stupka5) {
					centerLabel1.setText(stupka4);
				}
				if(centerLabel1.getText() == null) {
					centerLabel1.setText(stupka5);
				}
			}
		});
		
		products.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				centerLabel2.setText("Продукти : "+" "+nisheste + " ,"+prqsnomlqko+" ,"
						+plodove+" ,"+biskviti+" ,"+shokoladoviprachici);
			}
		});
		
		sort.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				List<String> list = new ArrayList<>();
				list.add(nisheste);
				list.add(prqsnomlqko);
				list.add(plodove);
				list.add(biskviti);
				list.add(shokoladoviprachici);
				
				list.sort(new StringComparator());
				centerLabel3.setText("Сортиране : "+" "+list.toString());
			}
		});
		
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
	}
}