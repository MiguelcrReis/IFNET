package ifnet;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	//ATRIBUTOS DA CLASSE
	
	private String nome;
	private String prontuario;
	private String email;
	private String senha;
	private int categoriaDeConfiabilidade;
	private String tipoUser;
	private static List<Usuario> users = new ArrayList<>();
	
 	public Usuario(String email, String senha, String nome, String prontuario, String tipoUser) {
		super();
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.prontuario = prontuario;
		this.tipoUser = tipoUser;
		

	}
	public Usuario( String nome, String prontuario, String tipoUser, String email) {
		super();
		this.nome = nome;
		this.prontuario = prontuario;
		this.tipoUser = tipoUser;
		this.email = email;
		
	}
	public Usuario( String nome, String prontuario, String email) {
		super();
		this.nome = nome;
		this.prontuario = prontuario;
		this.email = email;
		
	}
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProntuario() {
		return prontuario;
	}
	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCategoriaDeConfiabilidade() {
		return categoriaDeConfiabilidade;
	}
	public void setCategoriaDeConfiabilidade(int categoriaDeConfiabilidade) {
		this.categoriaDeConfiabilidade = categoriaDeConfiabilidade;
	}
	public String getTipoUser() {
		return tipoUser;
	}
	public void setTipoUser(String tipoUser) {
		this.tipoUser = tipoUser;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public static List<Usuario> getUsers() {
		return users;
	}
	public void setUsers(List<Usuario> users) {
		Usuario.users = users;
	}
	
	
	public static void AtualizarUsers() {
		
		for (int i = 0; i < getUsers().size(); i++) {
			
			for (int a = 0; a < Aluno.getUserAluno().size(); a++ ) {
				
				if (!getUsers().get(i).getEmail().contentEquals(Aluno.getUserAluno().get(a).getEmail())) {
					
					System.out.println();
					users.add(new Usuario(
						Aluno.getUserAluno().get(a).getNome(), 
						Aluno.getUserAluno().get(a).getProntuario(),
						Aluno.getUserAluno().get(a).getTipoUser(),
						Aluno.getUserAluno().get(a).getEmail()));
				}
			}
		}
		for(int i = 0; i < getUsers().size(); i++ ){
			
			for(int p = 0; p < Professor.getUserProfessor().size(); p++ ) {
			
				if (!getUsers().get(i).getEmail().contentEquals(Professor.getUserProfessor().get(p).getEmail())) {
					
					System.out.println();
					users.add(new Usuario(
							Professor.getUserProfessor().get(i).getNome(), 
							Professor.getUserProfessor().get(i).getProntuario(),
							Professor.getUserProfessor().get(i).getTipoUser(),
							Professor.getUserProfessor().get(i).getEmail()));
				
				}
			}
		}	
	}
}
