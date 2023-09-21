package EncapsulamentoJava;

public class Carro {
   public void ligar(){
      confereCambio();
      confereCombustivel();
    System.out.println("VEÍCULO LIGADO");
   }
   private void confereCombustivel(){
    System.out.println("CONFERINDO COMBUSTÍVEL");
   }
   private void confereCambio(){
    System.out.println("CONFERINDO CÂMBIO EM P");
   }

}
