public class NotificacaoEmail implements CanalNotificacao {


    @Override
    public void enviar(String mensagem) {
        System.out.println(" Envio feito pelo Servico de Notificacao por Email. ");
    }
}
