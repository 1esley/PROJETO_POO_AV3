package br.com.catolica.gerenciamento.Modules.Games.Enum;

public enum EnumModalidades {
    FPS(3),
    FUTEBOL(1),
    RPG(2);

    int horasDeDuracaoMD3;

    private EnumModalidades(int horasDeDuracaoMD3) {
        this.horasDeDuracaoMD3 = horasDeDuracaoMD3;
    }

    public int getHorasDeDuracaoMD3() {
        return this.horasDeDuracaoMD3;
    }
    
}