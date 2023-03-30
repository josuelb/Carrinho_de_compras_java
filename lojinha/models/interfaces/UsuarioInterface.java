package models.interfaces;

import models.Carrinho;
import models.Usuario;

public interface UsuarioInterface {
    public abstract String verNome();
    public abstract String verSexo();
    public abstract String verDataNasc();
    public abstract String verCpf(Usuario instancia);
    public abstract String verIdUsuario();
    public abstract String verUser();
    public abstract String verPassword();
    public abstract Carrinho verCarrinho();

    public abstract void altNome();
    public abstract void altSexo();
    public abstract void altDataNasc();
    public abstract void altCpf();
    public abstract void altIdUsuario();
    public abstract void altUser();
    public abstract void altPassword();
    
}
