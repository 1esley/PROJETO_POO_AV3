package br.com.catolica.gerenciamento.Modules.Games.Model.Abstracts;

import br.com.catolica.gerenciamento.Modules.Games.Model.Basics.Data;

public abstract class Campeonato {
    public String nome;
    public double premiacao;
    public Data dataInicio;

    public Campeonato(String nome, double premiacao, Data dataInicio) {
        this.nome = nome;
        this.premiacao = premiacao;
        this.dataInicio = dataInicio;
    }
}