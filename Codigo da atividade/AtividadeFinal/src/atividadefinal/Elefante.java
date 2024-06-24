package atividadefinal;

public class Elefante extends Animal implements Exibivel {
    private double peso;

    public Elefante(double peso, String nome, int idade) {
        super(nome, idade, "Elefante");
        this.peso = peso;
    }
    
    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Espécie: " + getEspecie());
        System.out.println("Peso: " + peso + " kg");
    }
}
