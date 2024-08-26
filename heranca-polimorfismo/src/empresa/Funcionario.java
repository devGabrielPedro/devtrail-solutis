package empresa;

public abstract class Funcionario {
    protected String nome;
    protected int codigoFuncional;
    protected static final double RENDA_BASICA = 1000.0;
    protected Comissao comissao;

    public Funcionario(String nome, int codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    public abstract double calcularRenda();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public Comissao getComissao() {
        return comissao;
    }

    public void setComissao(Comissao comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        double rendaComComissao = calcularRenda() + (comissao != null ? comissao.calcularComissao() : 0);
        return "Nome: " + nome +
                "\nCódigo Funcional: " + codigoFuncional +
                "\nComissão: " + (comissao != null ? comissao.calcularComissao() : 0) +
                "\nSalário Total: " + rendaComComissao;
    }
}
