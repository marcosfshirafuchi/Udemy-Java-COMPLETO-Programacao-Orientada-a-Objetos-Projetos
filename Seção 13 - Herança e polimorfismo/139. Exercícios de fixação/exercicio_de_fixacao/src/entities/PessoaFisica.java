package entities;

public class PessoaFisica extends Pessoa{
    private Double gastosComSaude;

    public PessoaFisica(){
    }

    @Override
    public Double calculaImposto() {
        return (this.getRendaAnual() * 0.25) - (this.getGastosComSaude() * 0.5);
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }


}
