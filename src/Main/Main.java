/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import Modelo.Medico;
import Modelo.Paciente;
import Modelo.DadosMedicos;
import Modelo.Consulta;
import Modelo.Secretaria;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

/**
 *
 * @author thiago
 */
public class Main {
    public static void main(String[] args) {
        // Criando médicos
        Medico medico1 = new Medico("Cardiologia", 12345, "Dr. João", LocalDate.of(1975, 6, 15),
                "Rua das Flores, 123", "(11) 9999-8888", "joao@example.com");
        Medico medico2 = new Medico("Pediatria", 54321, "Dra. Maria", LocalDate.of(1980, 9, 20),
                "Av. Central, 456", "(11) 8888-7777", "maria@example.com");
        Medico medico3 = new Medico("Ortopedia", 67890, "Dr. Carlos", LocalDate.of(1985, 4, 10),
                "Rua dos Pinheiros, 789", "(11) 7777-6666", "carlos@example.com");
        Medico medico4 = new Medico("Dermatologia", 24680, "Dra. Ana", LocalDate.of(1990, 7, 25),
                "Av. Independência, 321", "(11) 6666-5555", "ana@example.com");
        Medico medico5 = new Medico("Neurologia", 13579, "Dr. Pedro", LocalDate.of(1982, 3, 12),
                "Rua da Praia, 1010", "(11) 5555-4444", "pedro@example.com");

        // Criando pacientes
        Paciente paciente1 = new Paciente(1, Paciente.tipoConvenio.PARTICULAR,
                new DadosMedicos(false, false, "Normal", false, false,
                        Arrays.asList("Cirurgia de apendicite"), Arrays.asList("Penicilina")),
                "Maria Silva", LocalDate.of(1980, 3, 25), "Av. Paulista, 456", "(11) 9876-5432", "maria@example.com");
        Paciente paciente2 = new Paciente(2, Paciente.tipoConvenio.PLANOSAUDE,
                new DadosMedicos(false, true, "Alto", true, false,
                        Arrays.asList("Cirurgia de joelho"), Arrays.asList("Aspirina", "Ibuprofeno")),
                "José Santos", LocalDate.of(1978, 7, 10), "Rua das Oliveiras, 789", "(11) 8765-4321", "jose@example.com");
        Paciente paciente3 = new Paciente(3, Paciente.tipoConvenio.PARTICULAR,
                new DadosMedicos(true, false, "Alto", false, true,
                        Arrays.asList("Cirurgia de catarata"), Arrays.asList("Nenhum")),
                "Ana Lima", LocalDate.of(1985, 12, 15), "Rua dos Girassóis, 321", "(11) 7654-3210", "ana@example.com");
        Paciente paciente4 = new Paciente(4, Paciente.tipoConvenio.PARTICULAR,
                new DadosMedicos(false, false, "Normal", false, false,
                        Arrays.asList("Nenhuma"), Arrays.asList("Amendoim")),
                "Carlos Oliveira", LocalDate.of(1982, 5, 8), "Av. das Acácias, 654", "(11) 6543-2109", "carlos@example.com");
        Paciente paciente5 = new Paciente(5, Paciente.tipoConvenio.PLANOSAUDE,
                new DadosMedicos(false, false, "Baixo", false, false,
                        Arrays.asList("Nenhuma"), Arrays.asList("Nenhum")),
                "Juliana Costa", LocalDate.of(1976, 9, 30), "Rua das Palmeiras, 987", "(11) 5432-1098", "juliana@example.com");
        Paciente paciente6 = new Paciente(6, Paciente.tipoConvenio.PLANOSAUDE,
                new DadosMedicos(true, true, "Alto", true, true,
                        Arrays.asList("Cirurgia de apendicite"), Arrays.asList("Amoxicilina", "Dipirona")),
                "Rafaela Santos", LocalDate.of(1990, 2, 18), "Av. dos Ipês, 234", "(11) 4321-0987", "rafaela@example.com");
        Paciente paciente7 = new Paciente(7, Paciente.tipoConvenio.PARTICULAR,
                new DadosMedicos(false, true, "Normal", false, false,
                        Arrays.asList("Nenhuma"), Arrays.asList("Nenhum")),
                "Fernando Souza", LocalDate.of(1988, 11, 5), "Rua das Azaleias, 876", "(11) 3210-9876", "fernando@example.com");
        Paciente paciente8 = new Paciente(8, Paciente.tipoConvenio.PLANOSAUDE,
                new DadosMedicos(false, false, "Normal", false, false,
                        Arrays.asList("Nenhuma"), Arrays.asList("Nenhum")),
                "Carolina Oliveira", LocalDate.of(1984, 4, 12), "Av. das Bromélias, 567", "(11) 2109-8765", "carolina@example.com");
        Paciente paciente9 = new Paciente(9, Paciente.tipoConvenio.PARTICULAR,
                new DadosMedicos(false, true, "Baixo", false, false,
                        Arrays.asList("Nenhuma"), Arrays.asList("Nenhum")),
                "Rodrigo Lima", LocalDate.of(1987, 6, 28), "Rua das Violetas, 543", "(11) 0987-6543", "rodrigo@example.com");
        Paciente paciente10 = new Paciente(10, Paciente.tipoConvenio.PARTICULAR,
                new DadosMedicos(false, false, "Normal", false, false,
                        Arrays.asList("Nenhuma"), Arrays.asList("Nenhum")),
                "Patrícia Almeida", LocalDate.of(1983, 8, 14), "Av. das Margaridas, 432", "(11) 8765-4321", "patricia@example.com");

        // Criando consultas
        Consulta consulta1 = new Consulta(1, LocalDate.of(2024, 7, 5), LocalTime.of(10, 0),
                medico1, paciente1);
        Consulta consulta2 = new Consulta(2, LocalDate.of(2024, 7, 6), LocalTime.of(14, 30),
                medico2, paciente2);
        Consulta consulta3 = new Consulta(3, LocalDate.of(2024, 7, 7), LocalTime.of(9, 0),
                medico3, paciente3);
        Consulta consulta4 = new Consulta(4, LocalDate.of(2024, 7, 8), LocalTime.of(11, 0),
                medico4, paciente4);
        Consulta consulta5 = new Consulta(5, LocalDate.of(2024, 7, 9), LocalTime.of(15, 0),
                medico5, paciente5);

        // Criando secretárias
        Secretaria secretaria1 = new Secretaria(1, Arrays.asList(medico1, medico2),
                "Ana Souza", LocalDate.of(1990, 8, 20), "Rua das Palmeiras, 789",
                "(11) 8765-4321", "ana@example.com");
        Secretaria secretaria2 = new Secretaria(2, Arrays.asList(medico3, medico4, medico5),
                "Pedro Alves", LocalDate.of(1987, 5, 15), "Av. das Flores, 567",
                "(11) 7654-3210", "pedro@example.com");

        // Exibindo informações para verificar se os objetos foram criados corretamente
        System.out.println("Médicos:");
        System.out.println("1. " + medico1.getNome() + " - " + medico1.getEspecialidade());
        System.out.println("2. " + medico2.getNome() + " - " + medico2.getEspecialidade());
        System.out.println("3. " + medico3.getNome() + " - " + medico3.getEspecialidade());
        System.out.println("4. " + medico4.getNome() + " - " + medico4.getEspecialidade());
        System.out.println("5. " + medico5.getNome() + " - " + medico5.getEspecialidade());
        System.out.println();

        System.out.println("Pacientes:");
        System.out.println("1. " + paciente1.getNome() + " - Convênio: " + paciente1.getTipoConvenio());
        System.out.println("2. " + paciente2.getNome() + " - Convênio: " + paciente2.getTipoConvenio());
        System.out.println("3. " + paciente3.getNome() + " - Convênio: " + paciente3.getTipoConvenio());
        System.out.println("4. " + paciente4.getNome() + " - Convênio: " + paciente4.getTipoConvenio());
        System.out.println("5. " + paciente5.getNome() + " - Convênio: " + paciente5.getTipoConvenio());
        System.out.println("6. " + paciente6.getNome() + " - Convênio: " + paciente6.getTipoConvenio());
        System.out.println("7. " + paciente7.getNome() + " - Convênio: " + paciente7.getTipoConvenio());
        System.out.println("8. " + paciente8.getNome() + " - Convênio: " + paciente8.getTipoConvenio());
        System.out.println("9. " + paciente9.getNome() + " - Convênio: " + paciente9.getTipoConvenio());
        System.out.println("10. " + paciente10.getNome() + " - Convênio: " + paciente10.getTipoConvenio());
        System.out.println();

        System.out.println("Consultas:");
        exibirConsulta(consulta1);
        exibirConsulta(consulta2);
        exibirConsulta(consulta3);
        exibirConsulta(consulta4);
        exibirConsulta(consulta5);
        System.out.println();

        System.out.println("Secretárias:");
        exibirSecretaria(secretaria1);
        exibirSecretaria(secretaria2);
    }

    private static void exibirConsulta(Consulta consulta) {
        System.out.println("Consulta ID: " + consulta.getId());
        System.out.println("Data: " + consulta.getData());
        System.out.println("Horário: " + consulta.getHorario());
        System.out.println("Médico: " + consulta.getMedico().getNome());
        System.out.println("Paciente: " + consulta.getPaciente().getNome());
        System.out.println();
    }

    private static void exibirSecretaria(Secretaria secretaria) {
        System.out.println("Secretária ID: " + secretaria.getId());
        System.out.println("Nome: " + secretaria.getNome());
        System.out.println("Data de nascimento: " + secretaria.getDataNascimento());
        System.out.println("Endereço: " + secretaria.getEndereco());
        System.out.println("Telefone: " + secretaria.getTelefone());
        System.out.println("E-mail: " + secretaria.getEmail());
        System.out.println("Médicos associados:");
        for (Medico medico : secretaria.getMedicos()) {
            System.out.println("- " + medico.getNome() + " (" + medico.getEspecialidade() + ")");
        }
        System.out.println();
    }
}
