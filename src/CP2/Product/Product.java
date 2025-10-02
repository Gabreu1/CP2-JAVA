package CP2.Product;

 public class Product {
    //Propriedades
    private String nomeProduto;
    private double precoProduto;
    private int quantidadeProduto;
    private int numeroItem;
    private boolean Ativo = true;

    //Construtores
    public Product() {}

    public Product(String nomeProduto, double precoProduto, int quantidadeProduto, int numeroItem){
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.numeroItem = numeroItem;

    }

    public String Status(){
        if(Ativo == true){
            return "Ativo";
        }else {
            return "Desativado";
        }
    }

    //calcula o valor do inventario
    public double ValorInventario(){
        return precoProduto * quantidadeProduto;
    }


    //behaviors
    public int getNumeroItem() {return numeroItem;}

    public void setNumeroItem(int numeroItem) {this.numeroItem = numeroItem;}

    public int getQuantidadeProduto() {return quantidadeProduto;}

    public void setQuantidadeProduto(int quantidadeProduto) {this.quantidadeProduto = quantidadeProduto;}

    public double getPrecoProduto() {return precoProduto;}

    public void setPrecoProduto(double precoProduto) {this.precoProduto = precoProduto;}

    public String getNomeProduto() {return nomeProduto;}

    public void setNomeProduto(String nomeProduto) {this.nomeProduto = nomeProduto;}

    public boolean isAtivo() {return Ativo;}

    public void setAtivo(boolean ativo) {Ativo = ativo;}


@Override
public String toString() {
    return "\nNúmero item: " + numeroItem +
            "\nNome Produto: " + nomeProduto +
            "\nPreço Produto: R$" + precoProduto +
            "\nQuantidade Produto: " + quantidadeProduto +
            "\nValor Inventario: R$" + ValorInventario() +
            "\nStatus: " + Status();

    }
}



