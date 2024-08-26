package empresa;

public class FuncionarioGraduacao extends Funcionario {
    protected String universidade;

    public FuncionarioGraduacao(String nome, int codigoFuncional, String universidade) {
        super(nome, codigoFuncional);
        this.universidade = universidade;
    }

    @Override
    public double calcularRenda() {
        double rendaMedio = RENDA_BASICA * 1.1 * 1.5; // Renda com ensino médio
        return rendaMedio * 2; // Acrescentando 100%
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nRenda Total: " + calcularRenda();
    }
}
