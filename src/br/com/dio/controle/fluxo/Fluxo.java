package br.com.dio.controle.fluxo;

public class Fluxo {

    public static void main(String[] args) {
        switchNumero();
        switchSemana();

    }

    private static void switchNumero(){

        int numero = 3;
        switch (numero){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
                case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor incorreto");
                break;

        }
    }
    private static void switchSemana(){

        String dia = "Quarta";
        switch (dia){
            case "Segunda":
                System.out.println(2);
                break;
            case "Terca":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sabado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
        }
    }
}
