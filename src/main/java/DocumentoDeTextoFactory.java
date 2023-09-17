public class DocumentoDeTextoFactory implements DocumentoFactory {
    @Override
    public Documento criarDocumento() {
        return new DocumentoDeTexto();
    }
}

