package com.company;

public class Funcionario {
    private String Nome;
    protected int HorasDeTrabalho;
    protected double ValorPorHora;

    public void setNome(String Nome){
        this.Nome = Nome;
    }
    public String getNome(){
        return Nome;
    }

    public void setHorasDeTrabalho(int HorasDeTrabalho){
        this.HorasDeTrabalho = HorasDeTrabalho;
    }
    public int getHorasDeTrabalho(){
        return HorasDeTrabalho;
    }

    public void setValorPorHora(double ValorPorHora){
        this.ValorPorHora = ValorPorHora;
    }
    public double getValorPorHora(){
        return ValorPorHora;
    }

    public Funcionario(String Nome, int HorasDeTrabalho, double ValorPorHora){
        this.Nome = Nome;
        this.HorasDeTrabalho = HorasDeTrabalho;
        this.ValorPorHora = ValorPorHora;
    }

    public double Pagamento(){
        return ValorPorHora * HorasDeTrabalho;
    }
}
