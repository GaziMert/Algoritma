
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
public class gazi extends JFrame {
private JPanel contentPane;
private JTextField textField;
private JLabel lblAdetSay;
private JLabel lblNewLabel;
private JLabel lblNewLabel_1;
private JLabel lblNewLabel_2;
private JLabel lblNewLabel_3;
private JLabel lblNewLabel_4;
private JButton btnNewButton;
private JButton btnNewButton_1;
private JButton btnNewButton_2;
private JButton btnNewButton_3;
private JButton btnNewButton_4;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gazi frame = new gazi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public gazi() {
		ArrayList<Double> liste = new ArrayList<>();
		ArrayList<Double> asallar = new ArrayList<>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 312);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(162, 42, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton buton = new JButton("Giris");
		buton.addActionListener(new ActionListener() {
			int counter = 0;
			int toplam = 0;
			public void actionPerformed(ActionEvent arg0) {
				liste.add((double) Integer.parseInt(textField.getText()));
					textField.setText("");
					counter++;
					if(counter==10) {
					buton.setEnabled(false);
					for(double i:liste) {
					toplam+=i;										
				}
			for(double a:liste) {
				for(double d=2; d<=a;d++) {
				if(a%d==0) {
				break;
				}asallar.add(a);
				break;
		}
	}
Collections.sort(liste);
Collections.sort(asallar);
lblNewLabel.setText("En küçük sayı: "+ Collections.min(liste));
lblNewLabel_1.setText("En büyük sayı : "+ Collections.max(liste));
lblNewLabel_2.setText("Sayıların ortalaması: "+ (toplam/liste.size()));
lblNewLabel_3.setText("Asal sayılar: "+  asallar);
lblNewLabel_4.setText("Küçükten büyüğe: "+ liste);
}
}
private int asalsayilar() {
return 0;
}	});
buton.setBounds(162, 77, 97, 25);
contentPane.add(buton);
lblAdetSay = new JLabel("10 Adet Sayı Giriniz.");
lblAdetSay.setBounds(152, 13, 131, 16);
contentPane.add(lblAdetSay);
lblNewLabel = new JLabel("En küçük sayı:");
lblNewLabel.setBounds(12, 116, 156, 16);
contentPane.add(lblNewLabel);
lblNewLabel_1 = new JLabel("En büyük sayı:");
lblNewLabel_1.setBounds(12, 145, 156, 16);
contentPane.add(lblNewLabel_1);
lblNewLabel_2 = new JLabel("Sayıların ortalaması:");
lblNewLabel_2.setBounds(12, 174, 384, 16);
contentPane.add(lblNewLabel_2);
lblNewLabel_3 = new JLabel("Asal sayılar:");
lblNewLabel_3.setBounds(12, 203, 413, 16);
contentPane.add(lblNewLabel_3);
lblNewLabel_4 = new JLabel("Küçükten Büyüğe:");
lblNewLabel_4.setBounds(12, 232, 413, 16);
contentPane.add(lblNewLabel_4);
}
}
