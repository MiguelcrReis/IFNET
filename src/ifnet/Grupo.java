package ifnet;

import java.util.ArrayList;

public class Grupo {
	
	
	//ATRIBUTOS DA CLASSE
	private String tipoGrupo;
	private String nome;
	private String disciplina;
	private String professor;
	private static ArrayList<Grupo> grupos = new ArrayList<>();
	private static ArrayList<Relacionamento> integrantes = new ArrayList<>();
	
	
	//METODO CONSTRUTOR DA CLASSE
	public Grupo(String tipoGrupo, String nome, String disciplina, String professor, ArrayList<Relacionamento> integrantes) {
		super();
		this.setTipoGrupo(tipoGrupo);
		this.setNome(nome);
		this.setDisciplina(disciplina);
		this.setProfessor(professor);
		this.setIntegrantes(integrantes);
	}
	
	public Grupo(String nomeIntegrante, String prontuario, String email) {
		
	}
	
    // GETTERS E SETTERS DA CLASSE
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}


	public static ArrayList<Relacionamento> getIntegrantes() {
		return integrantes;
	}


	public void setIntegrantes(ArrayList<Relacionamento> integrantes) {
		Grupo.integrantes = integrantes;
	}


	public static ArrayList<Grupo> getGrupos() {
		return grupos;
	}


	public void setGrupos(ArrayList<Grupo> grupos) {
		Grupo.grupos = grupos;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoGrupo() {
		return tipoGrupo;
	}


	public void setTipoGrupo(String tipoGrupo) {
		this.tipoGrupo = tipoGrupo;
	}
	
	//MÉTODOS DA CLASSE 
	public static void mostrarGrupo(){
		for (int i = 0; i < getGrupos().size(); i++) {
			System.out.println();
			System.out.println("\nNome: "+Grupo.getGrupos().get(i).nome+"\n"+Grupo.getGrupos().get(i).tipoGrupo+"\nProfessor: "+Grupo.getGrupos().get(i).professor+
					"\nDisciplina: "+Grupo.getGrupos().get(i).disciplina);
			Grupo.getGrupos().get(i);
			for (int j = 0; j < Grupo.getIntegrantes().size(); j++) {
				System.out.println("Integrantes: \nNome: "+Grupo.getIntegrantes().get(j).getNome()+" | Prontuário: "+Grupo.getIntegrantes().get(j).getProntuario()+
					" | E-mail: "+Grupo.getIntegrantes().get(j).getEmail());
				
			}
		}
	}
	public void maisIntegrantes() {
		
	}
	public void menosIntegrantes() {
		
	}



}
