package br.com.catolica.gerenciamento.Modules.Team.Model.Abstracts;

import java.util.UUID;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String id;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = UUID.randomUUID().toString();
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getId() {
        return this.id;
    }

}