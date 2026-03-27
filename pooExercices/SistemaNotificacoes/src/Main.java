public class Main {
    public static void main(String[] args) {

        NotificacaoEmail notificacaoEmail = new NotificacaoEmail();
        NotificacaoSms notificacaoSms = new NotificacaoSms();
        ServicoNotificacao servicoNotificacao = new ServicoNotificacao();

        notificacaoEmail.enviar("Notificacao enviada por Email");
        notificacaoSms.enviar("Notificacao enviada por SMS");
        
    }
}
