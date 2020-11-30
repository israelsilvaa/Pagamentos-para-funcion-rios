package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O funcionário é terceirizado? [Digite (1) para SIM ou (2) para NÃO]");
        int resp = sc.nextInt();
        if (resp == 2){
            System.out.print("Informe o nome do funcionário: ");
            String nome = sc.next();
            System.out.print("Informe quantas horas de trabalho: ");
            int horas = sc.nextInt();
            System.out.print("Informe qual o valor em Reais por hora trabalhada: ");
            double valor = sc.nextDouble();

            Funcionario func = new Funcionario(nome,horas,valor);

            System.out.println("Nome do Funcionário: " + func.getNome() );
            System.out.println("Horas de trabalho: " + func.getHorasDeTrabalho() );
            System.out.println("Valor por horas trabalhadas: R$ " + func.getValorPorHora() );
            System.out.println("Valor do salário total: R$ " + func.Pagamento() );

        }
        //variação de pull request
        if (resp == 1){
            System.out.print("Informe o nome do funcionário terceirizado: ");
            String nome = sc.next();
            System.out.print("Informe quantas horas de trabalho: ");
            int horas = sc.nextInt();
            System.out.print("Informe qual o valor em Reais por hora trabalhada: ");
            double valor = sc.nextDouble();
            System.out.print("Informe qual o valor percentual do bônus de salário para funcionários terceriziados: ");
            int bn = sc.nextInt();

            Funcionario func2 = new FuncionarioTerceirizado(nome,horas,valor,bn);

            System.out.println("Nome do Funcionário terceirizado: " + func2.getNome() );
            System.out.println("Horas de trabalho: " + func2.getHorasDeTrabalho() );
            System.out.println("Valor por horas trabalhadas: R$ " + func2.getValorPorHora() );
            System.out.println("Valor do salário total: R$ " + func2.Pagamento() );

        }

    }
}
