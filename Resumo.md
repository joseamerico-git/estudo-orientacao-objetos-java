# Assuntos

- Conceito de POO
- Pacotes e Visibilidade de recursos
- Classes e Construtores
- Java Beans e UML
- Pilares do POO
- Enums e Interfaces

# Conceitos de POO

Á medida que a tecnologia vem evoluindo, as linguagens de programação também.

Linguagem de baixo nível --> Linguagem próximo as linguagens de máquina
Linguagem de alto nível  --> Disponibiliza proposta de sintaxe (forma de escrita) mais próxima da interpretação humana. Ex: Java, JavaScript, Python e C++.

Exemplo de Hello World

Python 

```
print("Hello, world");

```

Assembly 

```
; Exemplo de um Hello World em Assembly
; ld -m elf_i386 -s -o hello hello.o
section .text align=0

global _start

mensagem db 'Hello world', 0x0a

len equ $ - mensagem

_start:
    mov eax, 4 ;SYS_write
    mov ebx, 1 ;Número do file descriptor (1=stdout)
    mov ecx, mensagem ;Ponteiro para a string.
    mov edx, len ; tamanho da mensagem
    int 0x80

    mov eax, 1
    int 0x8

```
Em uma simples linha executa uma operação que em uma outra linguagem como Assembly utilizaria-se muitas linhas e com complexidade muito maiores.

## Programação estruturada 

Paradigma da programação que visa melhor clareza, a qualidade e o tempo de desenvolvimento de um programa de computador, fazendo uso das construções de fluxo de controle estruturado (if/then/else) e repetições (while e for), com estruturas de blocos e sub-rotinas.

# A programação estruturada 

Permite implementar algoritmos com estruturas sequênciais denominados procedimentos lineares que podem afetar valores de variáveis de escopo local ou global.

# A porgramação orientada a objetos

POO é um paradigma de programação baseado em conceito de "objetos" que podem conter dados dna forma de campos, conhecidos como atributose códigos na forma de procedimentos conhecido como métodos, permite abstrair cenários do mundo real e criar e converter em algoritmos de fácil compreenção e fácil reutilização.

# Em Java 

Os arquivos são distribuídos com extensão .java denominados classe.
As classes são compostas de:
Identificador, Caracteristicas e Comportamentos

```
    
    public class nomeClasse{

    }

```

- Classe (class) Representa a criação de objetos
- Identificador (identity) Propósito existencial
- Caracteristicas (states) Representam os atributos 
- Comportamentos (behavior) Ações ou métodos 
- Instanciar (new) Ato de criar um objeto a partir da estrutura definida da classe/objeto constroi um objeto que representa o contexto da classe.

Class Students --> states(atributos) --> behaviors --> (métodos/comportamentais)
--> instancias(new Students) --> contém uma represntação completa desse mapa.

# As classes correspondem a estrutura dos objetos.

Tipos de classes

- Classe de modelo(model) representam o domínio da aplicação ex: Cliente, Pedido etc...
- Classe de serviço (service) Contém as regras de negócio e validação de nosso sistema
- Classe de repositório (repository) Contém a integração com banco de dados.
- Classes de controle (controller) Disponibilizar alguma comunicação externa http/web/webseriveces/api(s).
- Classe utilitária (util) Contém recursos comuns à toda aplicação.

# Pacotes

Os pacotes ou (packages) É uma alternativa de organização do projeto com a finalidade de facilitar a busca por arquivos durante a manutenção do projeto.

Os packages sao sub-diretórios a partir da pasta src do projeto. 

Convensão/sugestão ao criar pacotes imaginando que a empresa chama-se PowerSoft

- Comercial: com.powersoft
- Governamental: gov.powersoft
- Código aberto: org.powersoft

Mediante a finalidade da classe criamos então os pacotes model, repository, service, controller etc.
Esses sub-pacotes por convensão serão criados 
ex: 
com.powersoft.model com.posersoft.service.Usuario
com.powersoft.controller.UsuarioController

A localização de uma classe é definida pela palavra reservada:

```
    package
    import ...
    import ...

    public class MinhaClasse{
        //atributos metodos e códigos.
    }

```

# Observação para trabalhar com o eclipse

Precisamos configurar a jdk em Window-->Preferences--> JRE Definition

# Modificadores 
Os modificadores estão relacionados a visibilidade das classes em todo o projeto dependendo do contexto.

Será que a classe que vou criar deve ser pública ou privada?

Cozinheiro --> Realiza várias tarefas ou ações que podem depender de outras classes

Almoxarife --> Controla enradas e saídas e trocar o Gaz do cozinheiro pode depender de outras classes como por exemplo do atendente

Atendente --> Serve a mesa, pega o pedido, recebe pagamento, troca gaz e pega pedido do balcão

Cliente --> Escolhe o lanche, faz pedido, paga a conta  e também pega o pedido no balcão

# Cada um no senário acima tem suas responsabilidades 

Estabelecimento --> Toda jornada por meio dos mecânismos disponíveis pelas demais classes que o estabelecimento consegue interagir em nossa aplicação.

Precisamos então definir as responsábilidades e visibilidades entre os recursos de nossa lanchonete.

Neste senário nem tudo precisará estar disponível (public) a todos.

Distribuindo melhor criando pacotes temos o projeto mais organizado

    package area.cliente.Cliene
    package atendimento.cozinha.Cozinheiro
    package atendimento.cozinha.Almoxarife

    package atendimento.Atendente

Utilizando os modificadores para restringir visibilidade entre Classes

Em nosso exemplo como definição no comentário o seguinte:

```
        //ações que somente o package cozinha precisa conhecer(default)
        almoxarife.entregarIngredientes();
        almoxarife.trocarGas();

```
Com a criação de pacotes e definindo os métodos default observamos que so métodos não ficam mais disponíveis em todo o sistema deixando de maneira segura as delegações ou acesso as tarefas.

# Visibilidades private

Será que o cozinheiro precisa saber que ou como o almoxarife controla as entradas e saídas?

E o cliente prcisa saber como o atendente recebe o pedido para servir a mesa?

O antendente precisa saber que antes de pagar o Cliente consulta o saldo no app?

Diante das questões é que nossas classes precisam manter ou não métodos disponíveis impróprios em alguns níveis hierarquicos

# Observação

A visibilidade de recursos da linguagem não está relacionada a interface gráfica, mas sim, o que as classes conseguem acessar.

Alterando a classe cozinheiro tornando alguns métodos privados, que não convém estar disponível em todo o estabelecimento.

# Observar sempre quem ou qual pacote seria interessante ter visibilidade os meus métodos.


# Getters and Setters 
São usados para buscarvalores de atributos ou definir novos valores em atributos.

# Construtores

Em Java segue-se uma convensão

[nome-classe] [nome-objeto] = new [Classe()]
Classe novoObjeto = new Classe();

O método construtor deverá ter o nome igual ao nome da classe e ser do tipo void
ou seja sem retorno.

```
    public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    public Pessoa(){ --> Construtor padrão quando não criamos ele já existe por default

    }
    
    public Pessoa(String cpf, String nome){ // -->Método construtor 
        this.cpf = cpf;
        this.nome =nome;
    }



    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}

```
Parcularidades utilizar o conceito: 

[this.nome] refere-se ao atributo nome da classe em questão 
this.nome = [nome]
[nome] refere-se ao nome que foi passado como parâmetro.

Quando criamos um construtora passando parâmetros informaçõe préviamente estabelecidas para a criação do objetos no exempolo acima 

```
    Pessoa marcos = new Pessoa("1234565","Marcos");
    marcos.setEndereco("Rua das Gaivótas, 55");
```
























