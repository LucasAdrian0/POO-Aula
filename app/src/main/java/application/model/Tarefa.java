package application.model;

public class Tarefa extends AbstractAtividade{
    private boolean concluido;

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public boolean getConcluido(){
        return this.concluido;
    }

    @Override
    public String getDetalhe(){
        return "[T]" + this.getDescricao();
    }
}
