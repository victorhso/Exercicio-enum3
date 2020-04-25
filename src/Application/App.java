package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Entities.Comentario;
import Entities.Post;

public class App {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Parabéns, felicidades!!!");
		Comentario c2 = new Comentario("Que Deus possa lhe abençoar!!!");
		
		Post p1 = new Post(sdf.parse("25/04/2020 19:08:30"), "Meu aniversário", "Que eu possa ter mais e mais datas como essa!", 50);
		p1.adcComentario(c1);
		p1.adcComentario(c2);
		
		Comentario c3 = new Comentario("O maior de Minas!!!");
		Comentario c4 = new Comentario("A minha seleção azul é HEXA!!!");
		
		Post p2 = new Post(sdf.parse("17/04/2020 15:02:56"), "Cruzeiro cabuloso!!!", "Vamo time!!!", 1000);		
		p2.adcComentario(c3);
		p2.adcComentario(c4);
		
		
		System.out.print(p1);
		System.out.println("-----------------------------------------");
		System.out.print(p2);
	}
}