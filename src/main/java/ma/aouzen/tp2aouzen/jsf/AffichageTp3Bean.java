/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ma.aouzen.tp2aouzen.jsf;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
@Named(value = "affichageTp3Bean")
@RequestScoped
public class AffichageTp3Bean {
    private int nombre;
    public int getNombre(){
        return this.nombre;
    }
    public void setNombre(int n){
        this.nombre = n;
    }
    public List<Integer> getNombresSuivants(){
        List<Integer> res = new ArrayList<Integer>(5);
        for(int i=nombre;i<nombre+5;i++){
            res.add(i);
        }
        return res;
    }
    public String afficher(){
        return "affichage__4?nb="+nombre+"&amp;faces-redirect=true";
    }

    /**
     * Creates a new instance of AffichageTp3Bean
     */
    public AffichageTp3Bean() {
    }
    
}
