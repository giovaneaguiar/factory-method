public class DocumentoDePlanilhaFactory implements DocumentoFactory {
    @Override
    public Documento criarDocumento() {
        return new DocumentoDePlanilha();
    }

}
