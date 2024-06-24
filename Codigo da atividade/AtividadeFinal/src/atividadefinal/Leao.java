package atividadefinal;

public class Leao extends Animal implements Exibivel {
    private String origem;

    public Leao(String origem, String nome, int idade) {
        super(nome, idade, "Leão");
        this.origem = origem;
    }
    
    @Override
    public void exibirInformacoes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Espécie: " + getEspecie());
        System.out.println("Origem: " + origem);
    }
}
