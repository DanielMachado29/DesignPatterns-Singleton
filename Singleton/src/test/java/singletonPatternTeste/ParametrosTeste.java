package singletonPatternTeste;

import org.junit.jupiter.api.Test;
import singletonPattern.Parametros;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParametrosTeste {


    @Test
    public void deveRetornarNomeCliente() {
        Parametros.getInstance().setNomeCliente("Cliente 1");
        assertEquals("Cliente 1", Parametros.getInstance().getNomeCliente());
    }

    @Test
    public void deveRetornarAdvogadoLogado() {
        Parametros.getInstance().setAdvogadoLogado("Advogado 1");
        assertEquals("Advogado 1", Parametros.getInstance().getAdvogadoLogado());
    }
}
