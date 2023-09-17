public class DocumentoDeTexto implements Documento {

    @Override
    public String abrir() {
        return "Abrindo um documento de texto.";
    }

    @Override
    public String salvar() {
        return "Salvando um documento de texto.";
    }

    @Override
    public String fechar() {
        return "Fechando um documento de texto.";
    }
}



