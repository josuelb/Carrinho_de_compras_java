package funcoes;

import models.Usuario;

public class Verifica {
    public static boolean verifUsuer(String user, String password, Usuario usuario){
        if (usuario.verUser().equals(user) && usuario.verPasswordIntern().equals(password)){
            return true;
        } else {
            return false;
        }
    }

    public static boolean verifPassword(String password, Usuario usuario){
        if (usuario.verPasswordIntern().equals(password)){
            return true;
        } else {
            return false;
        }
    }

    public static boolean verifVericidade(String user, String dataNasc, Usuario usuario){
        if (usuario.verUser().equals(user) && usuario.verDataNasc().equals(dataNasc)){
            return true;
        }else {
            return false;
        }
    }
}
