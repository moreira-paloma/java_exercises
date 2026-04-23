public class Main {

        public static void main(String[] args) {


            SenhaAtendimento senhaAtendimento = new SenhaAtendimento("Clínico");
            SenhaAtendimento senhaAtendimento1 = new SenhaAtendimento("Odontologia");


            senhaAtendimento.exibirPainel();
            senhaAtendimento1.exibirPainel();


            senhaAtendimento.chamar("Guiche 3");
            senhaAtendimento.exibirPainel();


            senhaAtendimento.finalizar();
            senhaAtendimento.exibirPainel();


            System.out.println("Chamando senha finalizada:");
            senhaAtendimento.chamar("Guichê 1");


            System.out.println("Tentando finalizar senha não chamada:");
            senhaAtendimento1.finalizar();
            senhaAtendimento1.exibirPainel();


            System.out.println("Próximo número disponível: " + SenhaAtendimento.getProximaSenha());
        }
    }
