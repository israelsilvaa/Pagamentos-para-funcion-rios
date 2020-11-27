package com.company;

public class FuncionarioTerceirizado extends Funcionario{
    private double Bonus;

    public void setBonus(int Bonus){
        this.Bonus = Bonus;
    }
    public double getBonus(){
        return Bonus;
    }

    public FuncionarioTerceirizado(String Nome, int HorasDeTrabalho, double ValorPorHora, double Bonus){
        super(Nome, HorasDeTrabalho, ValorPorHora);
        this.Bonus = Bonus;
    }
    @Override
    public double Pagamento(){
        super.Pagamento();
        return ValorPorHora * HorasDeTrabalho + (ValorPorHora * HorasDeTrabalho * Bonus / 100);
    }
}
