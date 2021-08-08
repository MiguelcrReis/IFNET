package ifnet;

import java.util.ArrayList;

public class Curso {

	private String nomeCurso;
	private String periodo;
	private ArrayList<Disciplina> disciplinas = new ArrayList<>();

	public Curso(String nomeCurso, String periodo, ArrayList<Disciplina> disciplinas) {
		this.setNomeCurso(nomeCurso);
		this.setPeriodo(periodo);
		this.setDisciplinas(disciplinas);
	}

	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}


	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public String toString() {
		return ("Curso: "+ getNomeCurso() +" | Periodo: "+getPeriodo()+" | Disciplinas: "+getDisciplinas()+" |#| ");
	
	}	
}
