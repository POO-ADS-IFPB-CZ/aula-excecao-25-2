import exceptions.LimiteExcedidoException;
import exceptions.SaldoInsuficienteException;
import model.ContaCorrente;

public class Main {

    public static void main(String[] args) {

        ContaCorrente contaCorrente =
                new ContaCorrente(123,"João", 0);

        try{
            if(contaCorrente.depositar(500)){
                System.out.println("Depositado com sucesso...");
            }
        }catch (LimiteExcedidoException ex){
            System.out.println(ex.getMessage());
        }

        try{
            if(contaCorrente.sacar(100)){
                System.out.println("Sacado com sucesso");
            }
        }catch (SaldoInsuficienteException | LimiteExcedidoException ex){
            System.out.println(ex.getMessage());
        }

    }
}
