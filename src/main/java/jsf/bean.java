/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package jsf;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
@Named(value = "bean")
@RequestScoped
public class bean {
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

    /**
     * Creates a new instance of bean
     */
    public bean() {
    }
    
}
