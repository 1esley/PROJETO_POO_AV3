package br.com.catolica.gerenciamento.Modules.Team.Enum;

public enum EnumTipoPlayer {
    CS_PLAYER(50_000),
    VALORANT_PLAYER(30_000),
    LOL_PLAYER(40_000);

    private double salario;

    private EnumTipoPlayer(double salario) {
        this.salario = salario;
    }

    public double getSalarioPorTipo() {
        return this.salario;
    }
}
