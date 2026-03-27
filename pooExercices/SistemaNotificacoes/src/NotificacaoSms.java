public class NotificacaoSms implements CanalNotificacao {


    @Override
    public void enviar(String mensagem) {
        System.out.println(" Envio feito pelo Servico de Notificacao SMS. ");
    }
}
