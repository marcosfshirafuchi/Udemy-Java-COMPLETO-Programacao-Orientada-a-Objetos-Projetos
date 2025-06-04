package entities;

public class PessoaJuridica extends Pessoa{
    private Integer numeroDeFuncionarios;
    public PessoaJuridica(){
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public Double calculaImposto() {
        if (numeroDeFuncionarios > 10){
            return getRendaAnual() * 0.14;
        }
        return getRendaAnual() * 0.16;
    }

    public Integer getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }
}
