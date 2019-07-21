import java.util.ArrayList;
import java.util.List;

public class Funcionarios {

    private List<Funcionario> listaProfessores = new ArrayList<Funcionario>();
    private List<Funcionario> listaCoordenadores = new ArrayList<Funcionario>();

    public Funcionarios () {
        
    }

    public void addProfessor(Funcionario funcionario) {
    	listaProfessores.add(funcionario);
    }
    
    public void addCoordenador(Funcionario funcionario) {
    	listaCoordenadores.add(funcionario);
    }

    public double totalFolhaDePagamento(){
        double total = 0.0;
        FolhaPagamento calculoFolha;
        
        for(Funcionario funcionario : listaProfessores){
        	calculoFolha = new FolhaPagamento(funcionario);
            total += calculoFolha.calculoSalarioLiquido();
        }

        for(Funcionario funcionario : listaCoordenadores){
        	calculoFolha = new FolhaPagamento(funcionario);
            total += calculoFolha.calculoSalarioLiquido();
        }        
        
        return total;
    }

    public List<BonificacaoVO> listaBonificacao(){

        FolhaPagamentoProfessor folhaPagamentoProfessor;
    	List<BonificacaoVO> valores = new ArrayList<BonificacaoVO>();
        
        for(Funcionario funcionario : listaProfessores){
            folhaPagamentoProfessor = new FolhaPagamentoProfessor(funcionario);
            Double bonificacao = folhaPagamentoProfessor.calculoBonus();
            valores.add(new BonificacaoVO(funcionario.getNome(), bonificacao));
        }

        return valores;
    }

}