package models.interfaces;
import models.Produto;

public interface CarrinhoInterface {
    public abstract void adicionar(Produto produto);
    public abstract void deletar(Produto produto);
    public abstract void listar();
}
