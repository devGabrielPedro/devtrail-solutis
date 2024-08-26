package empresa;

public class FuncionarioEnsinoMedio extends Funcionario {
    protected String escolaMedio;

    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escolaMedio) {
        super(nome, codigoFuncional);
        this.escolaMedio = escolaMedio;
    }

    @Override
    public double calcularRenda() {
        double rendaBasica = RENDA_BASICA * 1.1; // Renda com ensino básico
        return rendaBasica * 1.5; // Acrescentando 50%
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nRenda Total: " + calcularRenda();
    }
}
