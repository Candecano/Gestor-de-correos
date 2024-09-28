package com.example.gestordecorreo;
import java.util.ArrayList;

public class EmailManager {
    private ArrayList<Email> bandejaEntrada = new ArrayList<>();
    private ArrayList<Email> bandejaEnviados = new ArrayList<>();

    public void enviarEmail(Email email, Contacto persona){
        bandejaEnviados.add(email);
    }

    public ArrayList<Email> getBandejaEnviados(Contacto persona){
        return bandejaEnviados;
    }

    public void recibirEmail(Email email, Contacto persona){
        bandejaEntrada.add(email);
    }

    public ArrayList<Email> getBandejaEntrada(Contacto persona){
        return bandejaEntrada;
    }

    public void setBandejaEnviados(ArrayList<Email> bandejaEnviados) {
        this.bandejaEnviados = bandejaEnviados;
    }

    public void setBandejaEntrada(ArrayList<Email> bandejaEntrada) {
        this.bandejaEntrada = bandejaEntrada;
    }
    
}
