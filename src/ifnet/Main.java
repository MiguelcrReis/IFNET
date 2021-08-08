package ifnet;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//LISTS'S		
		ArrayList<Curso> cursos = new ArrayList<>();
		ArrayList<Disciplina> disciplinas = new ArrayList<>();
		ArrayList<Relacionamento> amigos = new ArrayList<>();
		ArrayList<Grupo> grupos  = new ArrayList<>();
		ArrayList<Relacionamento> integrantes = new ArrayList<>();
		
		//ADICIONANDO ADM'S
		Professor.getUserProfessor().add(new Professor("ADM@PROF", "ADM_PROF", "ADMINISTRADOR PROFESSOR", "BPADM02", "Professor", "ADM PROF", disciplinas));
		Usuario.getUsers().add(new Usuario("ADMINISTRADOR PROFESSOR", "BPADM02", "Professor", "ADM@PROF"));

		Aluno.getUserAluno().add(new Aluno("ADM@ALUNO", "ADM_ALUNO", "ADMINISTRADOR ALUNO", "BPADM01", "Aluno", cursos, amigos));
		Usuario.getUsers().add(new Usuario("ADMINISTRADOR ALUNO", "BPADM01", "Aluno", "ADM@ALUNO"));
		
		//ADICIONANDO USUARIOS PARA BANCO
		Aluno.getUserAluno().add(new Aluno("miguel@gmail.com", "123", "Miguel Reis", "BP3008509", "Aluno", cursos, amigos));
		Usuario.getUsers().add(new Usuario("Miguel Reis", "BP3008509", "Aluno", "miguel@gmail.com"));

		Aluno.getUserAluno().add(new Aluno("lucas@gmail.com", "456", "Lucas Domicci", "BP3001234", "Aluno", cursos, amigos));
		Usuario.getUsers().add(new Usuario("Lucas Dominicci", "BP3001234", "Aluno", "lucas@gmail.com"));
		
		Aluno.getUserAluno().add(new Aluno("augusto@gmail.com", "789", "Augusto César", "BP3004321", "Aluno", cursos, amigos));
		Usuario.getUsers().add(new Usuario( "Augusto César", "BP3004321", "Aluno", "augusto@gmail.com"));	
		
		Aluno.getUserAluno().add(new Aluno("rafael@gmail.com", "147", "Rafael Silva", "BP3001235", "Aluno", cursos, amigos));
		Usuario.getUsers().add(new Usuario( "Rafael Silva", "BP3001235", "Aluno", "rafael@gmail.com"));	

		Aluno.getUserAluno().add(new Aluno("aline@gmail.com", "258", "Aline Moraes", "BP3001236", "Aluno", cursos, amigos));
		Usuario.getUsers().add(new Usuario( "Aline Moraes", "BP3001236", "Aluno", "aline@gmail.com"));	
		
		Professor.getUserProfessor().add(new Professor("talita@gmail.com", "369", "Talita Moreira", "BP3001237", "Professor", "Matemática", disciplinas));
		Usuario.getUsers().add(new Usuario("Talita Moreira", "BP3001237", "Professor", "talita@gmail.com"));
		
		Professor.getUserProfessor().add(new Professor("Rosalvo@gmail.com", "741", "Rosalvo Soares Cavalcante Filho", "BP3001238", "Professor", "Redes", disciplinas));
		Usuario.getUsers().add(new Usuario("Rosalvo Soares Cavalcante Filho", "BP3001238", "Professor", "rosalvo@gmail.com"));
		
		Professor.getUserProfessor().add(new Professor("emilio@gmail.com", "001", "Emílio Carlos Rodrigues", "BP3001239", "Professor", "Linguagem e Banco de dados", disciplinas));
		Usuario.getUsers().add(new Usuario("Emílio Carlos Rodrigues", "BP3001239", "Professor", "emilio@gmail.com"));
		
		Professor.getUserProfessor().add(new Professor("elisandra@gmail.com", "002", "Elisandra Aparecida Alves da Silva", "BP3001230", "Professor", "Linguagem e Banco de dados", disciplinas));
		Usuario.getUsers().add(new Usuario("Elisandra Aparecida Alves da Silva", "BP3001230", "Professor", "elisandra@gmail.com"));
		
		Professor.getUserProfessor().add(new Professor("flavio@gmail.com", "852", "Flávio Cesar Amate", "BP3001231", "Professor", "Redes", disciplinas));
		Usuario.getUsers().add(new Usuario("Flávio Cesar Amate", "BP3001231", "Professor", "flavio@gmail.com"));
		
		
		
		int escolha = 0, i = 0, logado = -1, opcao = 0, tipo = 0, opcao1 = 0, t1, t2 = -1, t4 = -1, t3 = -1, t5 = -1, t6 = -1, op = 0, p = 0, tipoGp = 0, opcao5 = 0;
		String resp, removerAmigo, periodo = null, resposta = null, tipoGrupo = null, decisao = null;
		boolean delete = false; 
		while(true) {
			
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
			System.out.println("     IFNET     IFNETIFNET     IFNETIFNET      IFNET     IFNETIFNET     IFNETIFNETIFNET");
			System.out.println("     IFNET     IFNET          IFNET IFNET     IFNET     IFNET               IFNET");
			System.out.println("     IFNET     IFNET          IFNET  IFNET    IFNET     IFNET               IFNET");
			System.out.println("     IFNET     IFNETIFNET     IFNET   IFNET   IFNET     IFNETIFNET          IFNET");
			System.out.println("     IFNET     IFNET          IFNET    IFNET  IFNET     IFNET               IFNET");
			System.out.println("     IFNET     IFNET          IFNET     IFNET IFNET     IFNET               IFNET");
			System.out.println("     IFNET     IFNET          IFNET      IFNETIFNET     IFNETIFNET          IFNET");
			System.out.println();
			System.out.println("                              IFNET - Rede Social Acadêmica                          ");
			System.out.println();
			do {
				System.out.println("  [1] - ___NOVA CONTA___   |   [2] -  ___LOGIN___");
				System.out.print("-$ ");
				escolha = scan.nextInt();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println();
				switch (escolha) {
				
				case 1:
					scan.nextLine();
					System.out.println("___N O V A  C O N T A___");
					System.out.print("E-MAIL: ");
					String email = scan.nextLine();
					System.out.print("SENHA: ");
					String senha = scan.nextLine();
					System.out.print("NOME COMPLETO: ");
					String nome = scan.nextLine();
					System.out.print("PRONTUÁRIO: ");
					String prontuario = scan.nextLine();
					
					System.out.print("_TIPO DE USUARIO_\n[1] - PROFESSOR   |   [2] - ALUNO \n~$: ");
					int num = scan.nextInt();
					if (num == 1) {
						String tipoUser = "Professor";
						System.out.println("___PROFESSOR___");
						System.out.print("ÁREA: ");
						String area = scan.nextLine();
						scan.nextLine();
						do {
							System.out.print("NOME DA DISCIPLINA: ");
							String disciplina = scan.nextLine();
							disciplinas.add(new Disciplina(disciplina, nome));
							System.out.print("Deseja adicionar outra disciplina? \n~$ (S/N): ");
							resp = scan.nextLine();
						}while(resp.equals("S") || resp.equals("s"));
						Professor.getUserProfessor().add(new Professor(email, senha, nome, prontuario, tipoUser, area, disciplinas));
						Usuario.getUsers().add(new Usuario(nome, prontuario, tipoUser, email));
						System.out.println("Conta criada com sucesso!!!");
						
					}else if (num == 2){
						String tipoUser = "Aluno";
						System.out.println("_ALUNO_");
						scan.nextLine();
						do{
							System.out.print("NOME DO CURSO: ");
							String curso = scan.nextLine();
							do {
								System.out.println("PERIODO DO CURSO: ");
								System.out.print("[1] - Manhã | [2] - Tarde | [3] - Noturno \n~$ ");
								p = scan.nextInt();
								if (p == 1) {
									 periodo = "Manhã";
								}else if(p == 2) {
									 periodo = "Tarde";
								}else if(p == 3) {
									 periodo = "Manhã";
								}
								else {
									System.out.println("Comando Inválido!");
								}
							}while(periodo.equals(null));
							do {
								scan.nextLine();
								System.out.print("DISCIPLINA: ");
								String disciplina = scan.nextLine();
								System.out.print("PROFESSOR: ");
								String professor = scan.nextLine();
								disciplinas.add(new Disciplina(disciplina, professor));
								System.out.print("Deseja adicionar outra disciplina \n~$ (S/N): ");
								resp = scan.nextLine();
							}while (resp.equals("S") || resp.equals("s"));
							cursos.add(new Curso(curso, periodo, disciplinas));
							
							System.out.print("Deseja adicionar outro curso? \n~$ (S/N): ");
							resp = scan.nextLine();
						}while(resp.equals("S") || resp.equals("s"));
						Aluno.getUserAluno().add(new Aluno(email, senha, nome, prontuario, tipoUser, cursos, amigos));
						Usuario.getUsers().add(new Usuario(nome, prontuario, tipoUser, email));
						System.out.println("CONTA CRIADA COM SUCESSO!!!\n");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

					}
					break;
					
				case 2:	
					scan.nextLine();
					do {
						logado = -1;
						System.out.println("___L O G I N___");
						System.out.print("E-MAIL: ");
						String emailCheck = scan.nextLine();
						System.out.print("SENHA: ");
						String senhaCheck = scan.nextLine();
						System.out.println();
						
						for (i = 0; i < Aluno.getUserAluno().size(); i++) {
							if (Aluno.getUserAluno().get(i).getEmail().contentEquals(emailCheck) &&
									Aluno.getUserAluno().get(i).getSenha().contentEquals(senhaCheck)) {
								System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								logado = i; 
								tipo = 1;
								break;
							}
						}
						for (i = 0; i < Professor.getUserProfessor().size(); i++) {
							if (Professor.getUserProfessor().get(i).getEmail().contentEquals(emailCheck) &&
									Professor.getUserProfessor().get(i).getSenha().contentEquals(senhaCheck)) {
								System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								logado = i; 
								tipo = 2;
								break;
							}
						}
						if (logado < 0){
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("### USUÁRIO NÃO ENCONSTRADO OU DADOS INCORRETOS ###\n");
						}
					}while (logado < 0);
				}
			} while (logado < 0);
			do {
				if (delete == true) {
					break;
				}
				//NÃO ESQUECER DE CRIAR IF COM DUAS OPÇÕES DE MENU, UMA PARA ALUNO E OUTRA PARA PROFESSOR
				System.out.println();
				System.out.println("     IFNET     IFNETIFNET     IFNETIFNET      IFNET     IFNETIFNET     IFNETIFNETIFNET");
				System.out.println("     IFNET     IFNET          IFNET IFNET     IFNET     IFNET               IFNET ");
				System.out.println("     IFNET     IFNET          IFNET  IFNET    IFNET     IFNET               IFNET ");
				System.out.println("     IFNET     IFNETIFNE      IFNET   IFNET   IFNET     IFNETIFNET          IFNET");
				System.out.println("     IFNET     IFNET          IFNET    IFNET  IFNET     IFNET               IFNET");
				System.out.println("     IFNET     IFNET          IFNET     IFNET IFNET     IFNET               IFNET");
				System.out.println("     IFNET     IFNET          IFNET      IFNETIFNET     IFNETIFNET          IFNET");
				System.out.println();
				System.out.println("                              IFNET - Rede Social Acadêmica                          ");
				System.out.println();
				if (tipo == 1) {
					System.out.println("                                 {Bem-Vindo(a) "+Aluno.getUserAluno().get(logado).getNome()+"}\n");
				}else if (tipo == 2) {
					System.out.println("                                 {Bem-Vindo(a) "+Professor.getUserProfessor().get(logado).getNome()+"}\n");
				}
			
				
				System.out.println();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("_____MENU PRINCIPAL______");
				System.out.println("___[1] - Editar Perfil");
				System.out.println("___[2] - Amigos");
				System.out.println("___[3] - Menu Grupos");
				System.out.println("___[4] - Sair");
				System.out.print("~$ ");
				opcao5 = scan.nextInt();
				
				switch (opcao5) {
				
				
				case 1:
					scan.nextLine();
					// CONFIGURAÇÕES DE PERFIL DO ALUNO
					if (tipo == 1) {
						do {
							if (delete == true) {
								break;
							}
							System.out.println();
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("_____CONFIGURAÇÕES DE PERFIL______");
							System.out.println("___[1] - Nome: "+Aluno.getUserAluno().get(logado).getNome());
							System.out.println("___[2] - Senha: "+Aluno.getUserAluno().get(logado).getSenha());
							System.out.println("___[3] - E-mail: "+Aluno.getUserAluno().get(logado).getEmail());
							System.out.println("___[4] - Prontuário: "+Aluno.getUserAluno().get(logado).getProntuario());
							Aluno.getUserAluno().get(logado);
							System.out.println("___[5] - Lista de Cursos: "+Aluno.getCursos());
							System.out.println("___[6] - Excluir Conta");
							System.out.println("___[7] - Voltar para o Menu Principal");
						
							System.out.print("Qual item deseja editar? \n~$ ");
							opcao = scan.nextInt();
							scan.nextLine();
							switch (opcao) {
							
							case 1:
								System.out.print("Novo Nome: ");
								String nome = scan.nextLine();
								Aluno.getUserAluno().get(logado).setNome(nome);
								Usuario.getUsers().get(logado).setNome(nome);
								System.out.println("Alterado com Sucesso!");
								break;
								
							case 2:
								System.out.print("Nova Senha: ");
								String senha = scan.nextLine();
								Aluno.getUserAluno().get(logado).setSenha(senha);
								System.out.println("Alterado com Sucesso!");
								break;
								
							case 3:
								System.out.print("Novo E-mail: ");
								String email = scan.nextLine();
								Aluno.getUserAluno().get(logado).setEmail(email);
								Usuario.getUsers().get(logado).setEmail(email);
								System.out.println("Alterado com Sucesso!");
								break;
							case 4:
								System.out.print("Novo Prontuário: ");
								String prontuario = scan.nextLine();
								Aluno.getUserAluno().get(logado).setProntuario(prontuario);
								Usuario.getUsers().get(logado).setProntuario(prontuario);
								System.out.println("Alterado com Sucesso!");
								break;
							case 5:
								
								do {
									
									System.out.println("___Cursos___");
									System.out.println("[1] - Remover Curso");
									System.out.println("[2] - Adicionar Curso");
									System.out.print("[3] - Voltar \n~$ ");
									op = scan.nextInt();
									
									switch (op) {
									
									case 1:
										scan.nextLine();
										System.out.print("Nome do Curso que deseja remover: ");
										String nomeCurso = scan.nextLine();
										Aluno.getUserAluno().get(logado);
										
										for (i = 0; i < Aluno.getCursos().size(); i++) {
											if (Aluno.getCursos().get(i).getNomeCurso().contentEquals(nomeCurso)) {
												Aluno.getCursos().remove(i);
												System.out.println("Removido com sucesso!\n");
												t4 = i;
											}
										}
										if (t4 < 0) {
											System.out.println("Curso não encontrado!\n");
										}
								
										break;
									case 2:
										scan.nextLine();
										do{
											System.out.print("NOME DO CURSO: ");
											String curso = scan.nextLine();
											do {
												System.out.println("PERIODO DO CURSO: ");
												System.out.print("[1] - Manhã | [2] - Tarde | [3] - Noturno \n~$ ");
												p = scan.nextInt();
												if (p == 1) {
													 periodo = "Manhã";
												}else if(p == 2) {
													 periodo = "Tarde";
												}else if(p == 3) {
													 periodo = "Manhã";
												}
												else {
													System.out.println("Comando Inválido!");
												}
											}while(periodo.equals(null));
											do {
												scan.nextLine();
												System.out.print("DISCIPLINA: ");
												String disciplina = scan.nextLine();
												System.out.print("PROFESSOR: ");
												String professor = scan.nextLine();
												disciplinas.add(new Disciplina(disciplina, professor));
												System.out.print("Deseja adicionar outra disciplina \n~$ (S/N): ");
												resp = scan.nextLine();
											}while (resp.equals("S") || resp.equals("s"));
											
											Aluno.getCursos().add(new Curso(curso, periodo, disciplinas));
											
											System.out.print("Deseja adicionar outro curso? \n~$ (S/N): ");
											resp = scan.nextLine();
										}while(resp.equals("S") || resp.equals("s"));
										
										break;
									}
								}while (op != 3 );	
								break;
								
							case 6:
								System.out.print("Tem certeza que deseja excluir sua conta? \n~$ (S/N): ");
								resposta = scan.nextLine();
								if (resposta.equals("S") || resposta.equals("s")) {
									Aluno.getUserAluno().remove(logado);
									Usuario.getUsers().remove(logado);
									System.out.println("Conta excluida com sucesso!");
									delete = true;
									break;
								}
							
							}
						}while (opcao != 7);
						break;
						
						
						//CONFIGURAÇÕES DE PERFIL DO PROFESSOR
					}else if (tipo == 2) {
						do {
							if (delete == true) {
								break;
							}
							System.out.println();
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("_____CONFIGURAÇÕES DE PERFIL______");
							System.out.println("___[1] - Nome: "+Professor.getUserProfessor().get(logado).getNome());
							System.out.println("___[2] - Senha: "+Professor.getUserProfessor().get(logado).getSenha());
							System.out.println("___[3] - E-mail: "+Professor.getUserProfessor().get(logado).getEmail());
							System.out.println("___[4] - Prontuário: "+Professor.getUserProfessor().get(logado).getProntuario());
							Professor.getUserProfessor().get(logado);
							System.out.println("___[5] - Lista de Disciplinas: "+Professor.getDisciplinas());
							System.out.println("___[6] - Excluir Conta");
							System.out.println("___[7] - Voltar para o Menu Principal");
						
							System.out.print("Qual item deseja editar? \n~$ ");
							opcao = scan.nextInt();
							scan.nextLine();
							switch (opcao) {
							
							case 1:
								System.out.print("Novo Nome: ");
								String nome = scan.nextLine();
								Professor.getUserProfessor().get(logado).setNome(nome);
								Usuario.getUsers().get(logado).setNome(nome);
								System.out.println("Alterado com Sucesso!");
								break;
								
							case 2:
								System.out.print("Nova Senha: ");
								String senha = scan.nextLine();
								Professor.getUserProfessor().get(logado).setSenha(senha);
								System.out.println("Alterado com Sucesso!");
								break;
								
							case 3:
								System.out.print("Novo E-mail: ");
								String email = scan.nextLine();
								Professor.getUserProfessor().get(logado).setEmail(email);
								Usuario.getUsers().get(logado).setEmail(email);
								System.out.println("Alterado com Sucesso!");
								break;
							case 4:
								System.out.print("Novo Prontuário: ");
								String prontuario = scan.nextLine();
								Professor.getUserProfessor().get(logado).setProntuario(prontuario);
								Usuario.getUsers().get(logado).setProntuario(prontuario);
								System.out.println("Alterado com Sucesso!");
								break;
							case 5:
								
								do {
									
									System.out.println("___Disciplinas___");
									System.out.println("[1] - Remover Disciplina");
									System.out.println("[2] - Adicionar Disciplina");
									System.out.print("[3] - Voltar \n~$ ");
									op = scan.nextInt();
									
									switch (op) {
									
									case 1:
										scan.nextLine();
										System.out.print("Nome da Disciplina que deseja remover: ");
										String nomeDisci = scan.nextLine();
										Professor.getUserProfessor().get(logado);
										
										for (i = 0; i < Professor.getDisciplinas().size(); i++) {
											if (Professor.getDisciplinas().get(i).getNomeDisci().contentEquals(nomeDisci)) {
												Professor.getDisciplinas().remove(i);
												System.out.println("Removido com sucesso!\n");
												t4 = i;
											}
										}
										if (t4 < 0) {
											System.out.println("Disciplina não encontrada!\n");
										}
								
										break;
									case 2:
										scan.nextLine();
										do {
											System.out.print("NOME DA DISCIPLINA: ");
											String disciplina = scan.nextLine();
											disciplinas.add(new Disciplina(disciplina, Professor.getUserProfessor().get(logado).getNome()));
											System.out.print("Deseja adicionar outra disciplina? \n~$ (S/N): ");
											resp = scan.nextLine();
										}while(resp.equals("S") || resp.equals("s"));
										
										break;
									}
								}while (op != 3 );	
								break;
								
							case 6:
								System.out.print("Tem certeza que deseja excluir sua conta? \n~$ (S/N): ");
								resposta = scan.nextLine();
								if (resposta.equals("S") || resposta.equals("s")) {
									Aluno.getUserAluno().remove(logado);
									Usuario.getUsers().remove(logado);
									System.out.println("Conta excluida com sucesso!");
									delete = true;
									break;
								}
							
							}
						}while (opcao != 7);
						break;
					}
				case 2:
					do {
						scan.nextLine();
						
						System.out.println();
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("_____MENU AMIGOS_____");
						System.out.println("___[1] - Adicionar novo amigo");
						System.out.println("___[2] - Remover amigo");
						System.out.println("___[3] - Mostrar amigos");
						System.out.println("___[4] - Ver Perfil dos Amigos");
						System.out.println("___[5] - Voltar para o Menu Principal");
						System.out.print("~$ ");
						opcao1 = scan.nextInt();
						
						switch(opcao1) {
						case 1:
							scan.nextLine();
							do {
								t1 = -1;
								System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								System.out.println("___Adicionar novo amigo___");
								System.out.println("\n___Usuários disponíveis para adicionar:");
								
								Relacionamento.mostrarUsers();
								System.out.println();
								
								System.out.print("\nDigite o Prontuário do Usuário que deseja adicionar como amigo: \n~$ ");
								String novoAmigo = scan.nextLine();
								
								for(i = 0; i < Usuario.getUsers().size(); i++) {
									
									if (Usuario.getUsers().get(i).getProntuario().contentEquals(novoAmigo)) {
										
										if (tipo == 1) {
											Aluno.getUserAluno().get(logado);
											Aluno.getAmigos().add(new Relacionamento(
													Usuario.getUsers().get(i).getNome(),
													Usuario.getUsers().get(i).getProntuario(), 
													Usuario.getUsers().get(i).getTipoUser(), 
													Usuario.getUsers().get(i).getEmail()));
											System.out.println("Amigo adicionado com sucesso!");
											//System.out.println(Aluno.getUserAluno().get(logado));
											t1 = i;
											System.out.print("\n");
											break;
											
										}else if (tipo == 2) {
											Professor.getUserProfessor().get(logado);
											Professor.getAmigos().add(new Relacionamento(
													Usuario.getUsers().get(i).getNome(),
													Usuario.getUsers().get(i).getProntuario(), 
													Usuario.getUsers().get(i).getTipoUser(), 
													Usuario.getUsers().get(i).getEmail()));
											System.out.println("Amigo adicionado com sucesso!");
											//System.out.println(Professor.getUserProfessor().get(logado));
											t1 = i;
											System.out.print("\n");
											break;
											
										}
									}
								}
								if(t1 < 0) {
									System.out.println("\n");
									System.out.println("Prontuário inválido!");
									
								}

							}while(t1 < 0);
							break;
						
						case 2:
							scan.nextLine();
							do {
								System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								System.out.println("___Remover Amigo___");
								System.out.println();
								
								if (tipo == 1) {
									
									Aluno.getUserAluno().get(logado);
									Aluno.mostrarAmigos();
									System.out.println();
									System.out.print("Digite o prontutário do amigo que deseja remover: \n~$ ");
									removerAmigo = scan.nextLine();
									Aluno.getUserAluno().get(logado);
									for (i = 0; i < Aluno.getAmigos().size(); i++) {
										
										if (Aluno.getAmigos().get(i).getProntuario().contentEquals(removerAmigo)) {
											Aluno.getAmigos().remove(i);
											System.out.println("Amigo removido com sucesso!");
											t2 = i;
											break;
										}
									}
								}else if(tipo == 2) {
									
									Professor.getUserProfessor().get(logado);
									Professor.mostrarAmigos();
									System.out.println();
									System.out.print("Digite o prontutário do amigo que deseja remover: \n~$ ");
									removerAmigo = scan.nextLine();
									Professor.getUserProfessor().get(logado);
									for (i = 0; i < Professor.getAmigos().size(); i++) {
										
										if (Professor.getAmigos().get(i).getProntuario().contentEquals(removerAmigo)) {
											Professor.getAmigos().remove(i);
											System.out.println("Amigo removido com sucesso!");
											t2 = i;
											break;
										}
									}
								}
								if (t2 < 0) {
									System.out.println("Amigo não encontrado!");
								}
							}while(t2 < 0);
							break;
						
						case 3:
							do {
								if (tipo == 1) {
									Aluno.getUserAluno().get(logado);
									Aluno.mostrarAmigos();
									System.out.println();
									if (Aluno.getAmigos().size() == 0) {
										System.out.println("Você ainda não possue amigos!");
										System.out.println();
									}
								
								}else if (tipo == 2){
									Professor.getUserProfessor().get(logado);
									Professor.mostrarAmigos();
									System.out.println();
									if (Professor.getAmigos().size() == 0) {
										System.out.println("Você ainda não possue amigos!");
										System.out.println();
									}
								}
								System.out.print("Pressione 0 para voltar: \n~$ ");
								t3 = scan.nextInt();
							}while (t3 != 0);	
						
						
						case 4:
							
							
							
						case 5:
							break;
							
						}	
											
					}while(opcao1 != 5);
					break;
				
				/*case 3:
					scan.nextLine();
					do {
						System.out.println();
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("_____MENU DISCIPLINAS______");
						System.out.println("___[1] - Adicionar Disciplina");
						System.out.println("___[2] - Remover Disciplina");
						System.out.println("___[4] - Mostrar suas Disciplinas");
						System.out.println("___[5] - Voltar para o Menu Principal");
						System.out.print("~$ ");
						opcao = scan.nextInt();
			
						switch (opcao) {
						case 1:
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("___Adicionar Disciplina___");
							System.out.print("Nome Disciplina: ");
							String nomeDisci = scan.nextLine();
							System.out.print("Período: ");
							periodo = scan.nextLine();
							Aluno.getUserAluno().get(logado);
							
						case 5:
							break;
						}
					}while(opcao != 5);
					break;
					*/
				
					/*case 4:
					do {
						System.out.println();
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("_____MENU CONTEÚDOS______");
						System.out.println("___[1] - Adicionar Conteúdo");
						System.out.println("___[2] - Remover Conteúdo");
						System.out.println("___[3] - Mostrar seus Conteúdos");
						System.out.println("___[4] - Conteúdo de Amigos");
						System.out.println("___[5] - Voltar para o Menu Principal");
						System.out.print("~$ ");
						opcao = scan.nextInt();
						
						switch (opcao) {
						
						case 5:
							break;
						}
					}while(opcao != 5);
					break;
				*/	
				case 3:
					if (tipo == 1) {
						scan.nextLine();
						do {
							System.out.println();
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("_____MENU GRUPOS______");
							System.out.println("___[1] - Mostrar grupos");
							System.out.println("___[2] - Voltar para o Menu Principal");
							System.out.print("~$ ");
							opcao = scan.nextInt();
							
							switch (opcao) {
							
							case 1:
								Grupo.mostrarGrupo();
								break;
							case 2:
								break;
							}
							
						}while (opcao != 2);
					}
					if(tipo == 2) {
						scan.nextLine();
						do {
							System.out.println();
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("_____MENU GRUPOS______");
							System.out.println("___[1] - Mostrar grupos");
							System.out.println("___[2] - Criar grupo");
							System.out.println("___[3] - Deletar grupo");
							System.out.println("___[4] - Voltar para o Menu Principal");
							System.out.print("~$ ");
							opcao = scan.nextInt();
							
							switch (opcao) {
							
							case 1:
								scan.nextLine();
								if(Grupo.getGrupos().size() == 0) {
									System.out.println("Nenhum grupo encontrado!");
								}else {
									Grupo.mostrarGrupo();
								}
								break;
							
							case 2:
								
								System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								System.out.println("___Criar Grupo___");
								scan.nextLine();
								do{
									System.out.print("Tipo de Grupo:\n[1] - Grupo de Trabalho | [2] - Grupo de Pesquisa \n~$ ");
									tipoGp = scan.nextInt();
									
									if (tipoGp == 1) {
										scan.nextLine();
										tipoGrupo = "Grupo de Trabalho";
										System.out.print("Tema do Trabalho: ");
										String tema = scan.nextLine();
										System.out.print("Nome do Grupo: ");
										String nomeGrupo = scan.nextLine();
										System.out.print("Disciplina: ");
										String disciplina = scan.nextLine();
										String professor = Professor.getUserProfessor().get(logado).getNome();
										do {
											t5 = -1;
											Aluno.mostrarUsers();
											System.out.println();
											System.out.println();
											System.out.print("Digite o prontuario do aluno que deseja adicionar ao grupo: ");
											String novoIntegrante = scan.nextLine();
											
											for(i = 0; i < Aluno.getUserAluno().size(); i++) {
												
												if (Aluno.getUserAluno().get(i).getProntuario().contentEquals(novoIntegrante)) {
													
													integrantes.add(new Relacionamento(Aluno.getUserAluno().get(i).getNome(), Aluno.getUserAluno().get(i).getProntuario(), 
															Aluno.getUserAluno().get(i).getEmail()));
													System.out.println("Aluno adicionado com sucesso!");
													t5 = i;
												}
											}
											if (t5 < 0) {
												System.out.println("Aluno não encontrado!");
											}else {
												
												System.out.print("\nDeseja Adicionar mais um aluno? (S/N): \n~$ ");
												decisao = scan.nextLine();
											}
											
										}while(decisao.equals("S") || decisao.equals("s"));
										
										Grupo.getGrupos().add(new Trabalho(tipoGrupo, tema, nomeGrupo, disciplina, professor, integrantes));
										System.out.println("Grupo criado com sucesso!");
										
									}else if (tipoGp == 2){
										scan.nextLine();
										tipoGrupo = "Grupo de Pesquisa";
										System.out.print("Título da Pesquisa: ");
										String tema = scan.nextLine();
										System.out.print("Nome do Grupo: ");
										String nomeGrupo = scan.nextLine();
										System.out.print("Disciplina: ");
										String disciplina = scan.nextLine();
										String professor = Professor.getUserProfessor().get(logado).getNome();
										do {
											t5 = -1;
											Aluno.mostrarUsers();
											System.out.println();
											System.out.println();
											System.out.print("Digite o prontuario do aluno que deseja adicionar ao grupo: ");
											String novoIntegrante = scan.nextLine();
											
											for(i = 0; i < Aluno.getUserAluno().size(); i++) {
												
												if (Aluno.getUserAluno().get(i).getProntuario().contentEquals(novoIntegrante)) {
													
													integrantes.add(new Relacionamento(Aluno.getUserAluno().get(i).getNome(), Aluno.getUserAluno().get(i).getProntuario(), 
															Aluno.getUserAluno().get(i).getEmail()));
													System.out.println("Aluno adicionado com sucesso!");
													t5 = i;
												}
											}
											if (t5 < 0) {
												System.out.println("Aluno não encontrado!");
											}else {
												
												System.out.print("\nDeseja Adicionar mais um aluno? (S/N): \n~$ ");
												decisao = scan.nextLine();
											}
											
										}while(decisao.equals("S") || decisao.equals("s"));
										
										Grupo.getGrupos().add(new Pesquisa(tipoGrupo, tema, nomeGrupo, disciplina, professor, integrantes));
										System.out.println("Grupo criado com sucesso!");
									}
								}while(tipoGrupo == null);
								
								break;
							
							case 3:
								scan.nextLine();
								t6 = -1;
								do {
									System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("___Deletar Grupo___");
									System.out.println();
									Grupo.mostrarGrupo();
									System.out.println("Nome do Grupo que deseja Deletar: ");
									String nomeDel = scan.nextLine();
									for (int k = 0; k < Grupo.getGrupos().size() ;k++) {
										if (Grupo.getGrupos().get(k).getNome().equals(nomeDel)) {
											Grupo.getGrupos().remove(k);
											t6 = k;
										}
									}
									if (t6 < 0) {
										System.out.println("Grupo não encotrado!");
									}
									
								}while(t6 < 0);
							case 4:
								break;
							}
						}while(opcao != 4);
					}
					break;
				case 4:
					
					break;
					
				}	
			}while(opcao5 != 4);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		
		}
	}
}
		
	
