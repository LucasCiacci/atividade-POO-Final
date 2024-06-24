package atividadefinal;

public class AtividadeFinal {

    public static void main(String[] args) {
       Zoologico zoologico = new Zoologico();
       
       Animal leao = new Leao("Simba", 5, "África");
       Animal elefante = new Elefante("Dumbo", 10, 1200.5);
       Animal macaco = new Macaco("George", 3, "Banana e Maçã");
       
       Cuidador c1 = new Cuidador("João", 8);
       Cuidador c2 = new Cuidador("Maria", 5);
       Cuidador c3 = new Cuidador("Pedro", 6);
       
       zoologico.adicionarAnimal(leao);
       zoologico.adicionarAnimal(elefante);
       zoologico.adicionarAnimal(macaco);
       
       zoologico.adicionarCuidador(c1);
       zoologico.adicionarCuidador(c2);
       zoologico.adicionarCuidador(c3);
       
       
        System.out.println("Informações dos Animais:");
        zoologico.exibirInformacoes();
        
        System.out.println("Lista de Cuidadores:");
        zoologico.listarCuidadores();
        
        System.out.println();
        
        c1.cuidarAnimal(leao);
        c2.cuidarAnimal(elefante);
        c3.cuidarAnimal(macaco);
    }
    
}
