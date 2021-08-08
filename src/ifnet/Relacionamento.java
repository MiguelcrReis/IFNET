package ifnet;

import java.util.ArrayList;

public class Relacionamento extends Usuario{
	private static ArrayList<Relacionamento> amigos = new ArrayList<>();
	
	public Relacionamento(String nome, String prontuario, String tipoUser, String email) {
		super(nome, prontuario, tipoUser, email);
	}
	
	public Relacionamento(String nome, String prontuario, String email) {
		super(nome, prontuario, email);
	}
	
	public static void mostrarUsers() {
		
		for (int i = 0; i < Usuario.getUsers().size(); i++) {
			System.out.println();
			System.out.print("Nome: "+Usuario.getUsers().get(i).getNome()+" | Prontuário: "+Usuario.getUsers().get(i).getProntuario()+
					" | Tipo de Usuário: "+Usuario.getUsers().get(i).getTipoUser()+" | E-mail: "+Usuario.getUsers().get(i).getEmail());
		}
	}
	
	public static ArrayList<Relacionamento> adicionarAmigos(String name, String prontuario, String tipoUser, String email) {
		amigos.add(new Relacionamento(name, prontuario, tipoUser, email));
		System.out.println("{AMIGO ADICIONADO COM SUCESSO!}");
		return amigos;
		
		
		  
	}
	public static void mostrarAmigos() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("                                                                          {Amigos}");
		for (int i = 0; i < getAmigos().size(); i++) {
			System.out.println(getAmigos().get(i).getNome()+" / ");
		}
	}


	public static ArrayList<Relacionamento> getAmigos() {
		return amigos;
	}

	public void setAmigos(ArrayList<Relacionamento> amigos) {
		Relacionamento.amigos = amigos;
	}
	
	
	public String toString() {
		return ("Nome: "+ getNome() +" | E-mail: "+getEmail()+" | Prontuário: "+ getProntuario() +
				" | Tipo de Usuário: "+getTipoUser()+"\n");
	}
	
	
}
