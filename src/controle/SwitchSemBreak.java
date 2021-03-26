package controle;

public class SwitchSemBreak {

    public static void switchSemBreak(String[] args) {

        String faixa = "amarela";

        /*
        Sem 'break', caso o sistema caia em algum 'case', ele irá executar todos
        os seus sucessores.
         */
        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sabe o Bassai-Dai...");
            case "marro":
                System.out.println("Sabe o Tekki Shodan");
            case "roxa":
                System.out.println("Sabe o Heian Godan");
            case "verde":
                System.out.println("Sabe o Heian Yodan");
            case "laranja":
                System.out.println("Sabe o Heian Sandan");
            case "vermelha":
                System.out.println("Sabe o Heian Nidan");
            case "amarela":
                System.out.println("Sabe o Heian Shodan");
//            default:
//                System.out.println("Não sabe de nada");

        }
    }
}
