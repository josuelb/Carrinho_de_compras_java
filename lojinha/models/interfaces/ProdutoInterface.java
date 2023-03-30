package models.interfaces;

public interface ProdutoInterface {
    public abstract void verNome();
    public abstract void verMarca();
    public abstract void verPreco();
    public abstract void verDescricao();

    public abstract void altNome();
    public abstract void altMarca();
    public abstract void altPreco();
    public abstract void altDescricao();
}
