package tarefa_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> pessoas = new ArrayList<>();

        System.out.println("Digite as pessoas (nome,sexo) e pressione Enter. Digite 'fim' para finalizar:");

        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }
            pessoas.add(entrada);
        }

        // Filtrando a lista para obter apenas as mulheres
        List<String> mulheres = pessoas.stream()
                .filter(pessoa -> {
                    String[] partes = pessoa.split(",");
                    return partes.length > 1 && partes[1].trim().equalsIgnoreCase("feminino");
                })
                .collect(Collectors.toList());

        // Imprimindo a lista de mulheres
        mulheres.forEach(System.out::println);

        scanner.close();
    }
}
