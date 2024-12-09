package br.com.catolica.gerenciamento.Modules.Team.Model;

import br.com.catolica.gerenciamento.Modules.Games.Enum.EnumModalidades;
import br.com.catolica.gerenciamento.Modules.Team.Model.Abstracts.Pessoa;

public class Coach extends Pessoa{
    public EnumModalidades modalidade;
    private double salario;

    public Coach(String nome, String cpf, EnumModalidades modalidade, double salario) {
        super(nome, cpf);
        this.modalidade = modalidade;
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

}