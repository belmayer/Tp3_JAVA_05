
public class Main{
    public static void main(String[] args){
        Produto produto = new Produto("café", 42.99, 70);

        System.out.println("informacoes do produto");
        produto.informacoes();


        produto.setNome("Arroz Integral");
        produto.setPreco(25.75);
        produto.setQuantidade(150);

        System.out.println("atualizacoes das informacoes do produto");
        produto.informacoes();
    }
}


