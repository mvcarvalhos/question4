package questao4;

public class MagicCard {

    private String nome;
    private TipoCard tipo;
    private int custo;
    private String efeito;
    
    public MagicCard(String nome, TipoCard tipo, int custo, String efeito) {
        this.nome = nome;
        this.tipo = tipo;
        this.custo = custo;
        this.efeito = efeito;
    }

    public String getNome() {
        return nome;
    }

    public TipoCard getTipo() {
        return tipo;
    }

    public int getCusto() {
        return custo;
    }

    public String getEfeito() {
        return efeito;
    }

    @Override
    public String toString() {
        return "MagicCard [nome=" + nome + ", tipo=" + tipo + ", custo=" + custo + ", efeito=" + efeito + "]";
    }
}
