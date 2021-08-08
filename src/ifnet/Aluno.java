package ifnet;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario {
	
	private static List<Aluno> userAluno = new ArrayList<>();
	private static ArrayList<Curso> cursos = new ArrayList<>(); 
	private static ArrayList<Relacionamento> amigos = new ArrayList<>();
	
	public Aluno(String email, String senha, String nome, String prontuario, String tipoUsuer, ArrayList<Curso> cursos, ArrayList<Relacionamento> amigos) {
	
		super(email, senha, nome, prontuario, tipoUsuer);
		Aluno.cursos = cursos;	
		Aluno.amigos = amigos;
	}
	
	public String toString() {
		return ("Nome: "+this.getNome()+"\nE-mail: "+this.getEmail()+"\nProntuário: "+this.getProntuario()+
				"\nTipo de Usuário: "+this.getTipoUser()+ "\n"+Aluno.getCursos()+ "\nAmigos: "+Aluno.getAmigos());
		
	}
	public static ArrayList<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(ArrayList<Curso> cursos) {
		Aluno.cursos = cursos;
	}
	
	public static void mostrarUsers() {
		for (int i = 0; i < getUserAluno().size(); i++) {
			System.out.println();
			System.out.print("Nome: "+getUserAluno().get(i).getNome()+" | Prontuário: "+getUserAluno().get(i).getProntuario()+
					" | Tipo de Usuário: "+getUserAluno().get(i).getTipoUser()+" | E-mail: "+getUserAluno().get(i).getEmail());
		}
	}
	public static List<Aluno> getUserAluno() {
		return userAluno;
	}
	public void setUserAluno(List<Aluno> userAluno) {
		Aluno.userAluno = userAluno;
	}
	
	public static ArrayList<Relacionamento> getAmigos() {
		return amigos;
	}
	public void setAmigos(ArrayList<Relacionamento> amigos) {
		Aluno.amigos = amigos;
	}

	
	public void mostrarUsersAlunos() {
		for (int i = 0; i < Usuario.getUsers().size(); i++) {
			System.out.println();
			System.out.print("Nome: "+Usuario.getUsers().get(i).getNome()+" | Prontuário: "+Usuario.getUsers().get(i).getProntuario()+
					" | Tipo de Usuário: "+Usuario.getUsers().get(i).getTipoUser()+" | E-mail: "+Usuario.getUsers().get(i).getEmail());
			
		}
	}
	
	public static void mostrarAmigos() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("                                                                          {Amigos}");
		for (int i = 0; i < getAmigos().size(); i++) {
			System.out.println(getAmigos().get(i).getNome()+" | " +getAmigos().get(i).getProntuario());
		}
	}

}

	


