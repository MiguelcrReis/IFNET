package ifnet;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Usuario {
	
	//ATRIBUTOS DA CLASSE
	
	private String area;
	static List<Professor> userProf = new ArrayList<>();
	private static ArrayList<Disciplina> disciplinas = new ArrayList<>();
	private static ArrayList<Relacionamento> amigos = new ArrayList<>();

	//CONSTRUTOR DA CLASSE
	public Professor(String email, String senha, String nome, String prontuario, String tipoUser, 
			String area, ArrayList<Disciplina> disciplinas) {
		super(email, senha, nome, prontuario, tipoUser);
		Professor.disciplinas = disciplinas;
	}
	
	//METODOS DA CLASSE
	
	public String toString() {
		return ("Nome: "+this.getNome()+"\nE-mail: "+this.getEmail()+"\nProntuário: "+this.getProntuario()+
				"\nTipo de Usuário: "+this.getTipoUser()+"\nArea: "+this.getArea()+"\nDisciplinas: "+Professor.getDisciplinas()+
				"\nAmigos: "+ Professor.getAmigos());
	}
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public static ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		Professor.disciplinas = disciplinas;
	}


	
	public static List<Professor> getUserProfessor() {
		return userProf;
	}
	public void setUserProfessor(List<Professor> userProf) {
		Professor.userProf = userProf;
	}


	public static void mostrarUsers() {
		for (int i = 0; i < getUserProfessor().size(); i++) {
			System.out.println();
			System.out.print("#Nome: "+getUserProfessor().get(i).getNome()+" | Prontuário: "+getUserProfessor().get(i).getProntuario()+
					" | Tipo de Usuário: "+getUserProfessor().get(i).getTipoUser()+" | E-mail: "+getUserProfessor().get(i).getEmail());
		}
	}

	public static ArrayList<Relacionamento> getAmigos() {
		return amigos;
	}


	public static void setAmigos(ArrayList<Relacionamento> amigos) {
		Professor.amigos = amigos;
	}

	public static void mostrarAmigos() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("                                                                          {Amigos}");
		for (int i = 0; i < getAmigos().size(); i++) {
			System.out.println(getAmigos().get(i).getNome()+" | " +getAmigos().get(i).getProntuario());
		}
	}

}
