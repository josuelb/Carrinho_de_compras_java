package funcoes;

import models.Usuario;

public class Verifica {
    String varTest1, varTest2;
    public boolean verifUsuer(String user, String password, Usuario usuario){
        varTest1 = usuario.verUser();
        varTest2 = usuario.verPasswordIntern();

        if (user == varTest1 && password == varTest2){
            return true;
        } else {
            return false;
        }
    }

    public boolean verifPassword(String password, Usuario usuario){
        if (password == usuario.verPasswordIntern()){
            return true;
        } else {
            return false;
        }
    }

    public boolean verifVericidade(String user, String dataNasc, Usuario usuario){
        if (user == usuario.verUser() && dataNasc == usuario.verDataNasc()){
            return true;
        }else {
            return false;
        }
    }
}
