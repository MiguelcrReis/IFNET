package ifnet;

import java.util.ArrayList;

public class Trabalho extends Grupo{
	
	//ATRIBUTOS DA CLASSE
	private String tema;
	
	
	//METODO CONSTRUTOR
	public Trabalho(String tipoGrupo,String tema, String nome, String disciplina, String professor,
			ArrayList<Relacionamento> integrantes) {
		super(tipoGrupo, nome, disciplina, professor, integrantes);

	}

	//GETTERS E SETTERS DA CLASSE 
	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	




	

}
