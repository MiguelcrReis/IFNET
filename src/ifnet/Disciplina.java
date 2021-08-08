package ifnet;

import java.util.ArrayList;

public class Disciplina{
	private String nomeDisci;
	private String professor;
	private static ArrayList<Disciplina> disciplinas = new ArrayList<>();

	public Disciplina(String nome, String professor) {
		this.setNomeDisci(nome);
		this.setProfessor(professor);
	}
	
	
	public String getNomeDisci() {
		return nomeDisci;
	}
	public void setNomeDisci(String nome) {
		this.nomeDisci = nome;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public static ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}


	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		Disciplina.disciplinas = disciplinas;
	}


	public String toString() {
		return (getNomeDisci() +" | Professor: "+getProfessor()+"  ");
	
	}
}
