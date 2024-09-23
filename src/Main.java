package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Catalogo catalogo;

    public void assistir(){
//        for(Catalogo i:){
//            System.out.println("Você está assistindo" + i);
//        }
    }

    public static void main(String[] args) {
        ArrayList<Catalogo> catalogo = new ArrayList<Catalogo>();
        catalogo.add(new Filmes("","",""));

        catalogo.add(new Series("Aventura e Ação", "Avatar: O Último Mestre do Ar", 1, 8));
        catalogo.add(new Series("Drama Policial", "Lúcifer", 6, 16));
        catalogo.add(new Series("Comédia para TV", "Brooklyn 99", 8, 22));
        catalogo.add(new Series("Suspense Policial","La Casa de Papel", 5 , 10));
        catalogo.add(new Series("Drama, Ação e Aventura", "Perdidos no Espaço", 3, 10));
        catalogo.add(new Series("", "", 1, 1));

        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Perfis:
                1- Normal
                2- Infantil
                3- Configurações
                4- algo""");
        String option = sc.nextLine();
        switch (option) {
            case "1":
                System.out.println();
                break;
            case "2":
                break;
            default:

        }
    }
}
