import java.util.*;
import java.lang.*;
import java.io.*;


class Veiculo {
    // Atributos
    private String marca;
    private String modelo;
    private String ano;

    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    // Construct
    public Veiculo(String marca, String modelo, String ano){

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Metodos
    public void exibirDetalhes(String marca, String modelo, String ano){

        System.out.println("A Marca: " + marca + ", possui o Modelo: " + modelo + ", fabricado no Ano: " + ano + ".");
        
    }


}

class Carro extends Veiculo{

    // Atributos
    private String numeroPortas;
    
    // Construct
    public Carro(String marca, String modelo, String ano, String numeroPortas){

        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    // Metodos
    public void exibirDetalhes(){

        
        System.out.println("A Marca: " + getMarca() + ", possui o Modelo: " + getModelo() + ", Ano: " + getAno() + 
                           ", e possui: " + numeroPortas + " portas.");
        
    }
    
}


class Moto extends Veiculo{

    // Atributos
    private String cilindradas;
    
    // Construct
    public Moto(String marca, String modelo, String ano, String cilindradas){

        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    // Metodos
    public void exibirDetalhes(){

        System.out.println("A Marca: " + getMarca() + ", possui o Modelo: " + getModelo() + ", Ano: " + getAno() + 
                           ", e possui: " + cilindradas + " cilindradas.");
        
    }
    
}



// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {

        System.out.println("Informações do Carro.");
        Carro carro = new Carro("Chevrolet","Chevete","2010","2");
        Carro carro1 = new Carro("Fiat","Palio","2015","4");
        carro.exibirDetalhes();
        carro1.exibirDetalhes();

        System.out.println("Informações da Moto.");
        Moto moto = new Moto("Honda","XRE","2018","300");
        Moto moto1 = new Moto("Harley Davidson","DYNA SUPER","2013","1600");        
        moto.exibirDetalhes();
        moto1.exibirDetalhes();











        
    }
}