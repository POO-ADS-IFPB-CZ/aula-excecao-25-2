import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Antes...");
        try{
            criarArquivo("arquivo.txt");
        }catch (IOException ex){
            System.out.println("Falha");
        }catch (ArithmeticException ex){
            System.out.println("Exceção aritimética");
        } finally{
            System.out.println("Sempre vai executar");
        }
        System.out.println("Teste");
    }

    private static void criarArquivo(String arquivo)
            throws IOException{
//        throw new IOException("Exceção");
    }

}
