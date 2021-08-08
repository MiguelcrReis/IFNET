package ifnet;

import java.util.ArrayList;

public class Pesquisa extends Grupo{
	
	//ATRIBUTOS DA CLASSE
	private String titulo;
	
	//METODO CONSTRUTOR DA CLASSE
	public Pesquisa(String tipoGrupo, String titulo, String nome, String disciplina, String professor,
			ArrayList<Relacionamento> integrantes) {
		super(tipoGrupo, nome, disciplina, professor, integrantes);
	}

	
	//GETTERS E SETTERS DA CLASSE
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}





	
}
