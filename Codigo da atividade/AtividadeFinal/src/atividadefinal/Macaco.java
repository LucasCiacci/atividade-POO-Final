package atividadefinal;

public class Macaco extends Animal implements Exibivel {
    private String dieta;

    public Macaco(String nome, int idade, String dieta) {
        super(nome, idade, "Macaco");
        this.dieta = dieta;
    }
    
    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Espécie: " + getEspecie());
        System.out.println("Dieta: " + dieta);
    }    
}
