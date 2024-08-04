package tarefa_annotation;

import java.lang.annotation.Annotation;

@Tabela(nome = "minha_tabela")
public class MinhaClasse {
	public static void main(String[] args) {
        Class<MinhaClasse> obj = MinhaClasse.class;

        if (obj.isAnnotationPresent(Tabela.class)) {

            Annotation annotation = obj.getAnnotation(Tabela.class);
            Tabela tabela = (Tabela) annotation;

            System.out.println("Nome da Tabela: " + tabela.nome());
        }
    }
}
