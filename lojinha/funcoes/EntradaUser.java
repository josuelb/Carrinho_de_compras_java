package funcoes;
import java.util.Scanner;

public class EntradaUser {
    String userInput, passwordInput, dataNascInput, novoDado;
    String dados[] = new String[2];
    Scanner input = new Scanner(System.in);

    public String recebeNovoDado(String msg){
        System.out.printf("%f", msg);
        this.novoDado = input.nextLine();
        return this.novoDado;
    }

    public String[] userAtual(){
        System.out.print("User: ");
        this.userInput = input.nextLine();
        System.out.print("Password: ");
        this.passwordInput = input.nextLine();

        this.dados[0] = this.userInput;
        this.dados[1] = this.passwordInput;

        return this.dados;
    }

    public String[] veracidade(){
        System.out.print("User: ");
        this.userInput = input.nextLine();
        System.out.print("Data de nascimento: ");
        this.dataNascInput = input.nextLine();

        this.dados[0] = this.userInput;
        this.dados[1] = this.dataNascInput;

        return this.dados;
    }

    public String[] password(){
        System.out.print("Password atual: ");
        this.passwordInput = input.nextLine();

        this.dados[0] = this.passwordInput;

        return this.dados;
    }


}
