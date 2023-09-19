import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class DocumentoFactoryTest {

    @Test
    public void testDocumentoDeTexto() {
        DocumentoFactory textoFactory = new DocumentoDeTextoFactory();
        Documento documentoDeTexto = textoFactory.criarDocumento();

        assertEquals("Abrindo um documento de texto.", documentoDeTexto.abrir());
        assertEquals("Salvando um documento de texto.", documentoDeTexto.salvar());
        assertEquals("Fechando um documento de texto.", documentoDeTexto.fechar());
    }

    @Test
    public void testDocumentoDePlanilha() {
        DocumentoFactory planilhaFactory = new DocumentoDePlanilhaFactory();
        Documento documentoDePlanilha = planilhaFactory.criarDocumento();

        assertEquals("Abrindo um documento de planilha.", documentoDePlanilha.abrir());
        assertEquals("Salvando um documento de planilha.", documentoDePlanilha.salvar());
        assertEquals("Fechando um documento de planilha.", documentoDePlanilha.fechar());
    }

    @Test
    public void testDocumentoDesconhecido() {
        DocumentoFactory desconhecidaFactory = new DocumentoDesconhecidoFactory();

        assertThrows(IllegalArgumentException.class, () -> {
            Documento documentoDesconhecido = desconhecidaFactory.criarDocumento();
        });
    }

}