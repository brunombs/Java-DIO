package MSN;

public class MSNMessenger {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Mensagem enviada com sucesso!");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Mensagem recebida com sucesso!");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Mensagem salva com sucesso!");
    }
}
