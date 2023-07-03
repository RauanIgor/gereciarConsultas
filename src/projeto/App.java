package projeto;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			boolean sair = false;

			while (!sair) {
			    exibirMenu();
			    int opcao = sc.nextInt();
			    sc.nextLine();

			    switch (opcao) {
			        case 1:
			            cadastrarMedico();
			            break;
			        case 2:
			            visualizarAgendaMedico();
			            break;
			        case 3:
			            cancelarConsulta();
			            break;
			        case 4:
			            cadastrarAssistente();
			            break;
			        case 5:
			            cadastrarPaciente();
			            break;
			        case 6:
			            cadastrarConsulta();
			            break;
			        case 7:
			            sair = true;
			            break;
			        default:
			            System.out.println("Opção inválida. Digite novamente.");
			            break;
			    }
			}
		}
        System.out.println("Saindo do sistema...");
	}


    public static void exibirMenu() {
        System.out.println("===== Menu =====");
        System.out.println("1. Cadastrar Médico");
        System.out.println("2. Visualizar Agenda do Médico");
        System.out.println("3. Cancelar Consulta");
        System.out.println("4. Cadastrar Assistente");
        System.out.println("5. Cadastrar Paciente");
        System.out.println("6. Cadastrar Consulta");
        System.out.println("7. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void cadastrarMedico() {
    	 Scanner scanner = new Scanner(System.in);

         System.out.println("===== Cadastro de Médico =====");
         System.out.print("Número do CRM: ");
         String numCRM = scanner.nextLine();

         System.out.print("Nome: ");
         String nome = scanner.nextLine();

         System.out.print("CPF: ");
         String cpf = scanner.nextLine();

         System.out.print("Idade: ");
         int idade = scanner.nextInt();
         scanner.nextLine();

         System.out.print("Sexo: ");
         String sexo = scanner.nextLine();

         System.out.print("E-mail: ");
         String email = scanner.nextLine();

         System.out.print("Telefone: ");
         String telefone = scanner.nextLine();

         // Criar um objeto Agenda
         System.out.println("=== Cadastro da Agenda ===");
         System.out.print("Data: ");
         String data = scanner.nextLine();

         System.out.print("Quantidade de vagas: ");
         int quantidadeVagas = scanner.nextInt();

         // Criar o objeto Médico
         Medico medico = new Medico(numCRM, new Agenda(quantidadeVagas, data), nome, cpf, idade, sexo, email, telefone);

        
        System.out.println("Cadastro de Médico");
    }

    public static void visualizarAgendaMedico() {
        // Lógica para visualizar a agenda de um médico
        System.out.println("Agenda do Médico");
    }

    public static void cancelarConsulta() {
        // Lógica para cancelar uma consulta
        System.out.println("Cancelamento de Consulta");
    }

    public static void cadastrarAssistente() {
        // Lógica para cadastrar um assistente
        System.out.println("Cadastro de Assistente");
    }

    public static void cadastrarPaciente() {
        // Lógica para cadastrar um paciente
        System.out.println("Cadastro de Paciente");
    }

    public static void cadastrarConsulta() {
        // Lógica para cadastrar uma consulta
        System.out.println("Cadastro de Consulta");
    }
}

