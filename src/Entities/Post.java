package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private Date momento;
	private String titulo;
	private String comentario;
	private Integer curtidas;

	List<Comentario> lista = new ArrayList<>();
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public Post() {
	}

	public Post(Date momento, String titulo, String comentario, Integer curtidas) {
		this.momento = momento;
		this.titulo = titulo;
		this.comentario = comentario;
		this.curtidas = curtidas;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Integer getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(Integer curtidas) {
		this.curtidas = curtidas;
	}

	public List<Comentario> getLista() {
		return lista;
	}

	public void adcComentario(Comentario coment) {
		lista.add(coment);
	}

	public void removerComentario(Comentario coment) {
		lista.remove(coment);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Titulo: " + titulo);
		sb.append("\nCurtidas: " + curtidas);
		sb.append("\n" + sdf.format(momento));
		sb.append("\nComentário: \n");
		for (Comentario c : lista) {
			sb.append(c.getTexto() + "\n");
		}
		return sb.toString();
	}
}
