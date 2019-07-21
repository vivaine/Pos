public class Main {

    public static void main(String[] args){
        Funcionario coordenador = new Funcionario("Joao da Silva", TipoCargo.ADMINISTRATIVO);
        coordenador.setNumeroDependentes(3);
        coordenador.setHorasTrabalhada(40);
        coordenador.setSalarioHora(80.00);

        Funcionario professor = new Funcionario("Joao da Silva", TipoCargo.ACADEMICO);
        professor.setNumeroDependentes(3);
        professor.setHorasTrabalhada(40);
        professor.setSalarioHora(120.00);

        Funcionarios funcionarios = new Funcionarios();
        funcionarios.addCoordenador(coordenador);
        funcionarios.addProfessor(professor);

        System.out.println("TOTAL DE FOLHAS DE PAGAMENTO: " + funcionarios.totalFolhaDePagamento());

        for(BonificacaoVO bonificacaoVO : funcionarios.listaBonificacao()){
            System.out.println("FUNCIONARIO: " + bonificacaoVO.getNome());
            System.out.println("VALOR BONUS: " + bonificacaoVO.getValorBonus());
        }
    }
}