package empresa;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        // Criar funcionários e adicionar suas comissões
        funcionarios[0] = new FuncionarioEnsinoBasico("Pedro", 1, "Escola 1");
        funcionarios[0].setComissao(new ComissaoVendedor());

        funcionarios[1] = new FuncionarioEnsinoBasico("João", 2, "Escola 2");
        funcionarios[1].setComissao(new ComissaoVendedor());

        funcionarios[2] = new FuncionarioEnsinoBasico("Matheus", 3, "Escola 3");
        funcionarios[2].setComissao(new ComissaoVendedor());

        funcionarios[3] = new FuncionarioEnsinoMedio("Lucas", 4, "Escola 4");
        funcionarios[3].setComissao(new ComissaoSupervisor());

        funcionarios[4] = new FuncionarioEnsinoMedio("Ana", 5, "Escola 5");
        funcionarios[4].setComissao(new ComissaoSupervisor());

        funcionarios[5] = new FuncionarioEnsinoMedio("Maria", 6, "Escola 6");
        funcionarios[5].setComissao(new ComissaoVendedor());

        funcionarios[6] = new FuncionarioEnsinoMedio("Clara", 7, "Escola 7");
        funcionarios[6].setComissao(new ComissaoVendedor());

        funcionarios[7] = new FuncionarioEnsinoMedio("Alice", 8, "Escola 8");
        funcionarios[7].setComissao(new ComissaoVendedor());

        funcionarios[8] = new FuncionarioGraduacao("Gabriel", 9, "Universidade 1");
        funcionarios[8].setComissao(new ComissaoGerente());

        funcionarios[9] = new FuncionarioGraduacao("Letícia", 10, "Universidade 2");
        funcionarios[9].setComissao(new ComissaoGerente());

        double custoTotal = 0;
        double custoBasico = 0;
        double custoMedio = 0;
        double custoGraduacao = 0;

        System.out.println("========== Relatório de Funcionários ==========");
        System.out.println("------------------------------------------------");

        for (Funcionario func : funcionarios) {
            double rendaComComissao = func.calcularRenda() + (func.comissao != null ? func.comissao.calcularComissao() : 0);
            custoTotal += rendaComComissao;

            if (func instanceof FuncionarioEnsinoBasico) {
                custoBasico += rendaComComissao;
            } else if (func instanceof FuncionarioEnsinoMedio) {
                custoMedio += rendaComComissao;
            } else if (func instanceof FuncionarioGraduacao) {
                custoGraduacao += rendaComComissao;
            }

            // Imprimindo os dados do funcionário
            System.out.println(func);
            System.out.println("------------------------------------------------");
        }

        System.out.println("Custo Total: " + custoTotal);
        System.out.println("Custo Ensino Básico: " + custoBasico);
        System.out.println("Custo Ensino Médio: " + custoMedio);
        System.out.println("Custo Graduação: " + custoGraduacao);
        System.out.println("================================================");
    }
}
