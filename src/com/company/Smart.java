package com.company;

public class Smart{
    public static void main(String [] args){
        SmartPhone samsungA = new SmartPhone("Samsung a31", "Azul", 14,"Rectangular", 2, 120,false);
        SmartWatch cassio = new SmartWatch("Cassio 5","Negro", 3, "Circular", true);

        System.out.println(samsungA.getMarca());
        System.out.println(cassio.getMarca());
    }
}

class SmartDevice{
    // Atributos
    private String marca;
    private String color;
    private double tamanio;
    private String forma;
    private int bateria = 100;
    // Constructor
    public SmartDevice(){}
    public SmartDevice(String marca, String color, double tamanio, String forma){
        this.marca = marca;
        this.color = color;
        this.tamanio = tamanio;
        this.forma = forma;
    }
    // Metodos
    // Setters
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setTamanio(double tamanio){
        this.tamanio = tamanio;
    }
    public void setForma(String forma){
        this.forma = forma;
    }
    public void setBateria(int bateria){
        this.bateria = bateria;
    }
    // Getters
    public String getMarca(){
        return this.marca;
    }
    public String getColor(){
        return this.color;
    }
    public double getTamanio(){
        return this.tamanio;
    }
    public String getForma(){
        return this.forma;
    }
    public int getBateria(){
        return this.bateria;
    }
}
class SmartWatch extends SmartDevice{
    private boolean correa;

    public SmartWatch(){}
    public SmartWatch(String marca, String color, double tamanio, String forma, boolean correa){
        super(marca, color, tamanio, forma);
        this.correa = correa;
    }
    public void setCorrea(){
        if(this.correa== true){
            this.correa = false;
            System.out.println("Quitaste la correa");
        }else{
            this.correa=true;
            System.out.println("Agregaste la correa");
        }
    }
    public boolean getCorrea(){
        return this.correa;
    }

}
class SmartPhone extends SmartDevice{
    // Atributos
    private int memoriaRam;
    private int memoriaInterna;
    private boolean memoriaExterna;
    private Double capacidadMemoriaExterna = null;

    // Constructor
    public SmartPhone(){}
    public SmartPhone(String marca, String color, double tamanio, String forma, int memoriaRam, int memoriaInterna, boolean memoriaExterna){
        super(marca, color, tamanio, forma);
        this.memoriaRam = memoriaRam;
        this.memoriaInterna = memoriaInterna;
        this.memoriaExterna = memoriaExterna;
    }
    // Metodos

    // Setters
    public void setMemoriaRam(int memoriaRam){
        this.memoriaRam = memoriaRam;
    }
    public void setMemoriaInterna(int memoriaInterna){
        this.memoriaInterna = memoriaInterna;
    }
    public void setMemoriaExterna(){
        if (memoriaExterna == false){
            memoriaExterna = true;
            System.out.println("Agregaste una memoria externa");
        }else{
            System.out.println("Quitaste la memoria externa");
            memoriaExterna = false;
        }
    }
    public boolean getMemoriaExterna(){
        return this.memoriaExterna;
    }
    public void MemoriaExterna(Double memoria){
        if(this.memoriaExterna){
            capacidadMemoriaExterna = memoria;
        } else {
            System.out.println("Primero debe ingresar una memoria externa");
            capacidadMemoriaExterna = 0d;
        }
    }
}
