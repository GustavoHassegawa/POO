import java.util.Scanner;

abstract class Tarefa {
    abstract void executar();
}

class TarefaSimples extends Tarefa {
    private String tarefa;
    
    public TarefaSimples(String tarefa) {
        this.tarefa = tarefa;
    }
    
    @Override
    void executar() {
        System.out.println(tarefa + " concluída");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner  teclado = new Scanner(System.in);
        String entrada = teclado.nextLine().trim();
        TarefaSimples tarefa = new TarefaSimples(entrada);
        
        tarefa.executar();
        teclado.close();
    }
}