public class DocumentoDePlanilha implements Documento {
    @Override
    public String abrir() {
        return "Abrindo um documento de planilha.";
    }

    @Override
    public String salvar() {
        return "Salvando um documento de planilha.";
    }

    @Override
    public String fechar() {
        return "Fechando um documento de planilha.";
    }
}


