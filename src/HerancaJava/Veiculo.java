package HerancaJava;

public abstract class Veiculo {
    private String chassi;
    private String placa;

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public abstract void ligar();
    
    
}
