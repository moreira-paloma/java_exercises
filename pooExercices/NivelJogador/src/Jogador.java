public class Jogador {

    private String nickName;
    private int nivel;
    private int pontosExperiencia;

    public Jogador(String nickName){
        this.nickName = nickName;
        this.nivel = 1;
        this.pontosExperiencia = 0;
    }

    public void ganharExperiencia(int pontos){
        this.pontosExperiencia += pontos;
        System.out.println("Pontuacao atual de " + getNickName() + " é de " + getPontosExperiencia() + " pontos.");
        if(this.pontosExperiencia >= 100){
            this.nivel++;
            //pontosExperiencia += nivel; meu cod
            System.out.println("Seu nivel subiu." + nivel);
            this.pontosExperiencia = 0;
            System.out.println("Agora os seus pontos  + de experiencia sao de " + getPontosExperiencia());
        }

    }

    public String getNickName() {
        return nickName;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontosExperiencia() {
        return pontosExperiencia;
    }
}
