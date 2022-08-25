
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class LeerFichero {

	public static void main(String [] args) {
		
		
		int c;
		String contenido = "";
		
		try (FileReader fr = new FileReader ("Fichero.txt")){
			
			while((c = fr.read()) != -1 ) {
				
				contenido+= (char)c;
				
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		}catch(IOException e1) {
			
			e1.printStackTrace();
		}
		
		JOptionPane.showMessageDialog(null, contenido);

	}

}
