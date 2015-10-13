import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

//  Les cartes graphiques utilisees sont tirees de :
// 	https://fr.wikipedia.org/wiki/Jeu_de_52_cartes

public class TableDeJeu extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JLabel imageCarte1 = new JLabel();
	private JLabel imageCarte2 = new JLabel();

	
	public TableDeJeu () {
		this.setPreferredSize(new java.awt.Dimension(400,300));
		this.add(imageCarte1);
		this.add(imageCarte2);
		
	}
	
	public void afficherCartes(int carte1, int carte2) {
		
		imageCarte1.setIcon( new ImageIcon(getClass().getResource("52Cartes/"+carte1 + ".png")));
		imageCarte2.setIcon( new ImageIcon(getClass().getResource("52Cartes/"+carte2 + ".png")));
		
	}
	

}
