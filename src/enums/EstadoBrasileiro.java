package enums;

public enum EstadoBrasileiro {
    //Determinamos quais alternativas e valores 
    //Criando uma constante objeto denominada SAO_PAULO onde o nome desse estado é SÃO PAULO E SUA SIGLA É SP.
    SAO_PAULO ("SP", "São Paulo",11),
    RIO_JANEIRO("RJ","Rio de Janeiro",12);
    //continua....

    private String nome;
    private String sigla;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome,int ibge){
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;

    }
   
    public int getIbge(){
        return this.ibge;
    }

    public String getSigla(){
        return this.sigla;
    }

    public String getNome(){
        return this.nome;
    }

    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
