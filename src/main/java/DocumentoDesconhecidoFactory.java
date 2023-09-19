public class DocumentoDesconhecidoFactory implements DocumentoFactory {
    @Override
    public Documento criarDocumento() {
        throw new IllegalArgumentException("Tipo de documento desconhecido");
    }
}

