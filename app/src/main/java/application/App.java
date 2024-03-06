package application;

import application.model.Tarefa;

public class App {
    public static void main(String[] args) {
        Tarefa t = new Tarefa();
        t.setDescricao("Teste de Tarefa");
        t.setConcluido(false);

        System.out.println(t.getDescricao());
        System.out.println(t.getConcluido());

    }
}
//estudar isso depois//