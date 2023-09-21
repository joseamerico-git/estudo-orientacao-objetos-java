package HerancaJava;

public class Role {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setChassi("88888");
        carro.ligar();

        Moto moto = new Moto();
        moto.setChassi("99999");
        moto.ligar();

        // Junto com a abstração
        //Abaixo a concepção do polimorfismo 
        //Pois a classe mais genérica que existe não sabe como isso será implementado
        
        Veiculo coringa = carro;
        coringa.ligar();

    }
}
