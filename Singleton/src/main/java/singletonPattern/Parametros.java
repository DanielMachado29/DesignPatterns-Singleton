package singletonPattern;

public class Parametros {
    private Parametros() {};
    private static Parametros instance = new Parametros();
    public static Parametros getInstance() {
        return instance;
    }

    private String nomeCliente;
    private String advogadoLogado;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getAdvogadoLogado() {
        return advogadoLogado;
    }

    public void setAdvogadoLogado(String advogadoLogado) {
        this.advogadoLogado = advogadoLogado;
    }
}
