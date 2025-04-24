package canete.Caneta;

public class Caneta {

    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    protected int carga;

    public Caneta(String modelo, String cor, float ponta, int carga) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampar();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void status(){
        System.out.println("Sobre minha caneta: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta() + "cm");
        System.out.println("Carga: " + this.getCarga() + "%");
        if(tampada == true){
            System.out.println("A caneta está tampada! ");
        }
        else{
            System.out.println("A caneta não está tampada!");
        }
        System.out.println();
    }

}
