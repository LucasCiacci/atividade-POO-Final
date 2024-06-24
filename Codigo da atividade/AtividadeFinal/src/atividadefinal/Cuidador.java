package atividadefinal;

public class Cuidador {
    private String nome;
    private int experiencia;

    public Cuidador(String nome, int experiencia) {
        this.nome = nome;
        this.experiencia = experiencia;
    }

    public String getNome() {
        return nome;
    }

    public int getExperiencia() {
        return experiencia;
    }
    
    public void cuidarAnimal(Animal animal) {
        System.out.println(nome + " está cuidando do animal: " + animal.getNome());
    }    
}
