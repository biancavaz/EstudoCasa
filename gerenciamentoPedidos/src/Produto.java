public abstract class Produto {

    private int id;
    private String descricao;
    private double preco;


    public Produto (int id, String descricao, double preco){
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

    public abstract double calcularPreco(double desconto);


    public abstract String exibirDetalhes();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\nId:" + id +
                "\nDescricao: " + descricao +
                "\nPreco: " + preco;
    }
}
