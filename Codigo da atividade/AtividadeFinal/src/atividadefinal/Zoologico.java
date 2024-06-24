package atividadefinal;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animais;
    private List<Cuidador> cuidadores;
    
    public Zoologico() {
        animais = new ArrayList<>();
        cuidadores = new ArrayList<>();
    }
    
    public void adicionarAnimal (Animal animal) {
        animais.add(animal);
    }
    
    public void adicionarCuidador (Cuidador cuidador) {
        cuidadores.add(cuidador);
    }
    
    public void exibirInformacoes() {
        for (Animal animal : animais) {
            animal.exibirInformacoes();
            System.out.println();
        }
    }
    
    public void listarCuidadores() {
        for (Cuidador cuidador : cuidadores) {
            System.out.println("Cuidador: " + cuidador.getNome() + ", Experiência: " + cuidador.getExperiencia() + " anos");
        }
    }
}
