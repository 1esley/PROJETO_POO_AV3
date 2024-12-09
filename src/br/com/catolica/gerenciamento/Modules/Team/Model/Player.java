package br.com.catolica.gerenciamento.Modules.Team.Model;

import br.com.catolica.gerenciamento.Modules.Team.Enum.EnumFuncaoPlayer;
import br.com.catolica.gerenciamento.Modules.Team.Enum.EnumTipoPlayer;
import br.com.catolica.gerenciamento.Modules.Team.Model.Abstracts.Pessoa;

public class Player extends Pessoa{
    
    private EnumTipoPlayer tipoPlayer;
    private EnumFuncaoPlayer funcao;
    private double salario;
    private boolean treinado;

    public Player(String nome, String cpf, EnumTipoPlayer tipoPlayer, EnumFuncaoPlayer funcao) {
        super(nome, cpf);
        this.tipoPlayer = tipoPlayer;
        this.salario = this.tipoPlayer.getSalarioPorTipo();
        this.funcao = funcao;
        this.treinado = false;
    }

    public EnumTipoPlayer getTipoPlayer() {
        return this.tipoPlayer;
    }

    public EnumFuncaoPlayer getFuncao() {
        return this.funcao;
    }

    public double getSalario() {
        return this.salario;
    }

    public boolean getTreinado() {
        return this.treinado;
    }

    public void setTreinado(boolean treinado) {
        this.treinado = treinado;
    }

    @Override
    public String toString() {
        return String.format("<Player: nome -> %s, tipo -> %s, função -> %s>", this.getNome(), this.tipoPlayer, this.funcao);
    }
}