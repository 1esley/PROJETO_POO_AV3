package br.com.catolica.gerenciamento.Modules.Team.Model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import br.com.catolica.gerenciamento.Modules.Games.Enum.EnumModalidades;
import br.com.catolica.gerenciamento.Modules.Games.Model.Basics.Data;

public class Time {
    
    public String nome;
    public Data fundacao;
    private Set<Player> jogadores = new HashSet<>();
    private Map<EnumModalidades, Coach> treinadores = new HashMap<>();

    public Time(String nome, Data fundacao) {
        this.nome = nome;
        this.fundacao = fundacao;

    }

    public Set<Player> getJogadores() {
        return this.jogadores;
    }

    public Map<EnumModalidades, Coach> getTreinadores() {
        return this.treinadores;
    }

}
