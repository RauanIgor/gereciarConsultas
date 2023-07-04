package projeto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	private static ArrayList<Medico> medicos = new ArrayList<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean sair = false;

		while (!sair) {
			exibirMenu();
			try {
				int opcao = sc.nextInt();
				sc.nextLine();

				switch (opcao) {
				case 1:
					cadastrarMedico();
					break;
				case 2:
					cadastrarConsulta(medicos);
					break;
				case 3:
					visualizarAgendaMedico(medicos);
					break;
				case 4:
					cancelarConsulta();
					break;
				case 5:
					sair = true;
					break;
				default:
					System.out.println("Opção inválida. Digite novamente.");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Erro: Entrada inválida. Digite novamente.");
				sc.nextLine();
			}
		}
		System.out.println("Saindo do sistema...");
	}

	public static void exibirMenu() {
		System.out.println("===== Menu =====");
		System.out.println("1. Cadastrar Médico");
		System.out.println("2. Cadastrar Consulta");
		System.out.println("3. Visualizar Agenda Médico");
		System.out.println("4. Cancelar Consulta");
		System.out.println("5. Sair");
		System.out.print("Escolha uma opção: ");
	}

	public static void cadastrarMedico() {

		String numCRM = null;
		String nome = null;
		String cpf = null;
		int idade = 0;
		String sexo = null;
		String email = null;
		String telefone = null;
		int quantidadeVagas = 0;
		String data = null;

		Scanner scanner = new Scanner(System.in);

		System.out.println("===== Cadastro de Médico =====");
		boolean dadosValidos = false;
		while (!dadosValidos) {
			try {
				System.out.print("Número do CRM: ");
				numCRM = scanner.nextLine();

				System.out.print("Nome: ");
				nome = scanner.nextLine();

				System.out.print("CPF: ");
				cpf = scanner.nextLine();

				System.out.print("Idade: ");
				idade = scanner.nextInt();
				scanner.nextLine();

				System.out.print("Sexo: ");
				sexo = scanner.nextLine();

				System.out.print("E-mail: ");
				email = scanner.nextLine();

				System.out.print("Telefone: ");
				telefone = scanner.nextLine();

				// Criar Agenda
				System.out.println("=== Cadastro da Agenda ===");
				System.out.print("Data: ");
				data = scanner.nextLine();

				System.out.print("Quantidade de vagas: ");
				quantidadeVagas = scanner.nextInt();
				scanner.nextLine();
				dadosValidos = true;
			} catch (InputMismatchException e) {
				System.out.println("Erro: Entrada inválida. Digite novamente.");
				scanner.nextLine();
			}
		}
		// cadastrando Medicos
		adicionarMedico(new Medico(numCRM, new Agenda(quantidadeVagas, data), nome, cpf, idade, sexo, email, telefone));
		System.out.println();
	}

	public static void adicionarMedico(Medico medico) {
		if (medicos.isEmpty()) {
			medicos.add(medico);
			System.out.println("Médico adicionado com sucesso.");
		} else {
			boolean medicoExistente = false;
			for (Medico med : medicos) {
				if (med.getNumCRM().equals(medico.getNumCRM())) {
					medicoExistente = true;
					break;
				}
			}

			if (medicoExistente) {
				System.out.println("CADASTRO CANCELADO!!! Já existe um médico com o mesmo número CRM.");
			} else {
				medicos.add(medico);
				System.out.println("Médico adicionado com sucesso.");
			}
		}

	}

	public static void visualizarAgendaMedico(ArrayList<Medico> medicos) {
		if (medicos.isEmpty()) {
			System.out.println("Não existe nenhum médico cadastrado no sistema atualmente.");
		} else {
			Scanner scan = new Scanner(System.in);
			System.out.print("Informe o Número do CRM: ");
			String CRM = scan.nextLine();
			boolean medicoExistente = false;
			Medico medicoatual = null;
			for (Medico med : medicos) {
				if (med.getNumCRM().equals(CRM)) {
					medicoExistente = true;
					medicoatual = med;
					break;
				}
			}
			if (medicoExistente) {
				System.out.println("===== Agenda do Médico " + medicoatual.getNome() + "=====");
				System.out.println(medicoatual.getAgenda().toString());
			} else {
				System.out.println("Não foi encontrado nenhum Médico com o CRM informado.");
			}

		}
	}

	public static void cancelarConsulta() {
		// Lógica para cancelar uma consulta
		System.out.println("Cancelamento de Consulta");
	}

	public static void cadastrarConsulta(ArrayList<Medico> medicos) {
		if (medicos.isEmpty()) {
			System.out.println("Não existe nenhum médico cadastrado no sistema atualmente.");
		} else {
			Scanner scan = new Scanner(System.in);
			System.out.print("Informe o Número do CRM do médico que realizará a consulta: ");
			String CRM = scan.nextLine();
			boolean medicoExistente = false;
			Medico medicoatual = null;
			for (Medico med : medicos) {
				if (med.getNumCRM().equals(CRM)) {
					medicoExistente = true;
					medicoatual = med;
					break;
				}
			}
			if (medicoExistente && medicoatual.getAgenda().getQtdVagas() > 0) {
				System.out.println("===== AGENDAR CONSULTA PARA O MÉDICO " + medicoatual.getNome() + " =====");

				boolean gestante = false;
				boolean pne = false;
				String nome = null;
				String cpf = null;
				int idade = 0;
				String sexo = null;
				String email = null;
				String telefone = null;
				String sintomas = null;

				Scanner scanner = new Scanner(System.in);

				System.out.println("===== CADASTRO DO PACIENTE =====");
				boolean dadosValidos = false;
				while (!dadosValidos) {
					try {
						System.out.print("Gestante (true/false): ");
						gestante = scanner.nextBoolean();
						scanner.nextLine();

						System.out.print("Necessidade Especial (true/false): ");
						pne = scanner.nextBoolean();
						scanner.nextLine();

						System.out.print("Nome: ");
						nome = scanner.nextLine();

						System.out.print("CPF: ");
						cpf = scanner.nextLine();

						System.out.print("Idade: ");
						idade = scanner.nextInt();
						scanner.nextLine();

						System.out.print("Sexo: ");
						sexo = scanner.nextLine();

						System.out.print("E-mail: ");
						email = scanner.nextLine();

						System.out.print("Telefone: ");
						telefone = scanner.nextLine();

						System.out.print("Sintomas: ");
						sintomas = scanner.nextLine();

						dadosValidos = true;
					} catch (InputMismatchException e) {
						System.out.println("Erro: Entrada inválida. Digite novamente.");
						scanner.nextLine();
					}
				}
				// verificando choque nas consultas
				if (medicoatual.getAgenda().getConsultas().isEmpty()) {
					medicoatual.getAgenda().getConsultas().add(new Consulta(sintomas, cpf,
							new Paciente(gestante, pne, nome, cpf, idade, sexo, email, telefone)));
					medicoatual.getAgenda().setQtdVagas();
					System.out.println("CONSULTA CADASTRADA com sucesso.");

				} else {
					boolean pacienteCadastrado = false;
					for (Consulta con : medicoatual.getAgenda().getConsultas()) {
						if (con.getIdentificadorPaciente().equals(cpf)) {
							pacienteCadastrado = true;
							break;
						}
					}

					if (pacienteCadastrado) {
						System.out.println("CADASTRO CANCELADO!!! Já existe uma consulta para esse paciente.");
					} else {
						medicoatual.getAgenda().getConsultas().add(new Consulta(sintomas, cpf,
								new Paciente(gestante, pne, nome, cpf, idade, sexo, email, telefone)));
						medicoatual.getAgenda().setQtdVagas();
						System.out.println("CONSULTA CADASTRADA com sucesso.");
					}
				}

			} else {
				System.out.println("Agenda LOTADA, OU NÃO FOI ENCONTRADO O MEDICO ESPECIFICO!.");
			}

		}
	}

}
