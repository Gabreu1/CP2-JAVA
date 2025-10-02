package CP2.Product;
import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maxSize;


        Product Produto1 = new Product();
        Product Produto2 = new Product();
        Product Produto3 = new Product("Beemovie", 13.00, 5, 1);
        Product Produto4 = new Product("Gato de Botas", 9.0, 10, 2);
        Product Produto5 = new Product("Os incriveis", 15.99, 13, 3);
        Product Produto6 = new Product("Meu Malvado Favorito", 3.50, 24, 4);


        do{
            System.out.println("Insira o número de produtos que gostaria de adicionar: ");
            System.out.println("Insira “0” (zero) se não quiser adicionar mais produtos");
            maxSize = sc.nextInt();

            if(maxSize < 0){
                System.out.println("Valor incorreto inserido,insira um valor maior que 0!");
            }
        } while(maxSize < 0);

        //se o valor zero for inserido nenhum produto será adicionado
        if(maxSize == 0){
            System.out.println("Nenhum produto será adicionado.");
        } else{
            //array de produtos
            Product[] produtos = new Product[maxSize];

            for(int i = 0; i < maxSize; i++){
                System.out.println("\nProduto " + (i + 1) + ":");
                sc.nextLine();
                System.out.println("Digite o nome do produto: ");
                String tempName =  sc.nextLine();
                System.out.println("Digite o valor do produto: ");
                double tempPrice = sc.nextDouble();
                System.out.println("Digite a quantidade do produto: ");
                int tempQty = sc.nextInt();
                System.out.println("Digite o Numero do produto: ");
                int tempNumber = sc.nextInt();

                produtos[i] = new Product(tempName, tempPrice, tempQty, tempNumber);

                for(Product produto : produtos){
                    System.out.println("\nSeus Produtos:" + produto);
                }

                //Product p1 = new Product(tempName, tempPrice, tempQty, tempNumber);
                //p1.setAtivo(false);


                //Product p2 = new Product(tempName, tempPrice, tempQty, tempNumber);
                //System.out.println(p2);


            }

        }
        sc.close();
    }
}
