package tp10;
import java.awt.Color;
import java.util.Hashtable;

/**
 * @author Arnaud Dewulf
 *
 */
public class CodeCouleurs {
	private Hashtable<Color, Integer> dicoCouleurs = new Hashtable<>();
	
	public CodeCouleurs(){
		
	}
	public Hashtable<Color, Integer> getDicoCouleurs() {
		return dicoCouleurs;
	}

	public void setDicoCouleurs(Hashtable<Color, Integer> dicoCouleurs) {
		this.dicoCouleurs = dicoCouleurs;
	}
	
	public double calcul(Color dizaine, Color unite, Color puissance){
		return ((dicoCouleurs.get(dizaine)*10)+dicoCouleurs.get(unite))*Math.pow(10, dicoCouleurs.get(puissance));
	}
}
