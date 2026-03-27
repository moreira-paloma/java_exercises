package PooExtras;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    //metodo contrustor tem o mesmo nome da classe
    public Caneta(String modelo,String cor,float ponta){
        this.tampar();
        this.cor = cor;
        this.modelo= modelo;
        this.ponta = ponta;

    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo =m;
    }
    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta =p;
    }

    public void tampar(){
        this.tampada =true;
    }

    public void destampar(){
        this.tampada =false;
    }
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo : " + this.modelo);
        System.out.println("Ponta : " + this.ponta);
        System.out.println("Cor : " + this.cor);
    }


}
