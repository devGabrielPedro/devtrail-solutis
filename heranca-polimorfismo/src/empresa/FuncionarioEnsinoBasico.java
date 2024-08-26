package empresa;

public class FuncionarioEnsinoBasico extends Funcionario {
    protected String escolaBasico;

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String escolaBasico) {
        super(nome, codigoFuncional);
        this.escolaBasico = escolaBasico;
    }

    @Override
    public double calcularRenda() {
        return RENDA_BASICA * 1.1; // Renda básica acrescentada em 10%
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nRenda Total: " + calcularRenda();
    }
}
