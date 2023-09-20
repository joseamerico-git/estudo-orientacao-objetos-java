package enums;

public class SistemaIbge {
    public static void main(String[] args) {
        // Para saber os estados cadastrados na minha aplicação.
        System.out.println("*******Imprimindo o conjunto enum *******");
        for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome() + " - " + e.getIbge());
        }

        // Selecionando um estado enum
        System.out.println("*******Selecionando um objeto de um enum*******");
        EstadoBrasileiro sp = EstadoBrasileiro.SAO_PAULO;
        System.out.println("Estado: " + sp.getNome() + "\nSigla: " + sp.getSigla() + "\nIBGE: " + sp.getIbge());
    }
}
