import exceptions.LimiteExcedidoException;
import model.ContaCorrente;

public class Main {

    public static void main(String[] args) {

        ContaCorrente contaCorrente =
                new ContaCorrente(123,"João", 0);

        try{
            if(contaCorrente.depositar(1000000)){
                System.out.println("Depositado com sucesso...");
            }
        }catch (LimiteExcedidoException ex){
            System.out.println(ex.getMessage());
        }

    }
}
