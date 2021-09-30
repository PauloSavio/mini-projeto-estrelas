package br.com.zup;

public enum Tipo {
    FOGO, TERRA, AGUA;


    @Override
    public String toString() {
        StringBuilder retornoDados = new StringBuilder();
        retornoDados.append("Tipo: " + Tipo);
        return retornoDados.toString();
    }
}
