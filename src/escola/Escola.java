package escola;

public class Escola {
    public static void main(String[] args) {
        // Sem getters and setters
        System.out.println("**********SEM USO GETTERS AND SETTERS*******");
        Aluno aluno = new Aluno(); // --> Definição de uma instância aluno
        aluno.nome = "JOSE AMERICO"; // --> Propriedades do aluno
        aluno.idade = 40;

        System.out.println(aluno.nome);
        System.out.println(aluno.idade);

        // Com getters and seters
        System.out.println("**********COM USO GETTERS AND SETTERS*******");
        AlunoGetSeters alunoGetSeters = new AlunoGetSeters();
        alunoGetSeters.setNome("SET DE JOSE AMERICO");

        alunoGetSeters.setIdade(40);
        System.out.println(alunoGetSeters.getNome());
        System.out.println(alunoGetSeters.getIdade());

    }
}
