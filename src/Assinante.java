package src;

import java.util.Scanner;

public class Assinante {
    private String tipoAssinatura;

    public Assinante(String tipoAssinatura){
        this.tipoAssinatura = "Básico - 1 tela";
    }

    public void trocarAssinatura(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Escolha o novo plano de Assinatura\n" +
                "Seu plano atual é:" + getTipoAssinatura() +
                "\n 1- Básico - 1 tela" +
                "\n 2- Intermediário - 2 telas" +
                "\n 3- Avançado - 3 telas");
        String plano = sc.nextLine();
        switch (plano){
            case "1":
                setTipoAssinatura("Básico - 1 tela");
                break;
            case"2":
                setTipoAssinatura("Intermediário - 2 telas");
                break;
            case "3":
                setTipoAssinatura("Avançado - 3 telas");
                break;
            default:
                System.out.println("Opção inválida!");
        }
        System.out.println("Seu plano foi atualizado com sucesso!\n" +
                "Seu plano atual é " + getTipoAssinatura());
    }




    public String getTipoAssinatura() {
        return tipoAssinatura;
    }

    public void setTipoAssinatura(String tipoAssinatura) {
        this.tipoAssinatura = tipoAssinatura;
    }
}
