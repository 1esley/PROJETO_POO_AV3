package br.com.catolica.gerenciamento.Modules.Games.Model.Campeonatos;

import br.com.catolica.gerenciamento.Modules.Games.Enum.EnumModalidades;
import br.com.catolica.gerenciamento.Modules.Games.Model.Abstracts.Campeonato;
import br.com.catolica.gerenciamento.Modules.Games.Model.Basics.Data;

public class Mundial extends Campeonato{
    public EnumModalidades modalidade;
    public Mundial(String nome, double premiacao, Data dataInicio, EnumModalidades modalidade) {
        super(nome, premiacao, dataInicio);
        this.modalidade = modalidade;
    }
    
}
