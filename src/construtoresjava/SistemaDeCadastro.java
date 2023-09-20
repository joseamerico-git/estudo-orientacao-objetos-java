package construtoresjava;

public class SistemaDeCadastro {

    public static void main(String[] args) {
        // Os atributos relevantes para a criação do objeto são passadas diretamente nos
        //Para criar um construtor com parâmetros deve se perguntar quais atributos que precisamos informar.
        //Evitar passar todos os parâmetros para o construtor
        //Podemos ter mais de um construtor 
        // construtores
        Pessoa pessoa = new Pessoa("311.105.048-37", "JOSÉ A JUNIOR");
        System.out.println("Nome " + pessoa.getNome());
        System.out.println(pessoa.getCpf());

    }

}
