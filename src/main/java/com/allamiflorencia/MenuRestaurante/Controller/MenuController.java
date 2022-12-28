/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.allamiflorencia.MenuRestaurante.Controller;

import com.allamiflorencia.MenuRestaurante.Model.Plato;
import com.allamiflorencia.MenuRestaurante.Service.IMenuService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author flopy
 */
@RestController
public class MenuController {
    
    @Autowired
    private IMenuService menu;
    
    @GetMapping("/plato/{id}")
    public Plato getPlato(@PathVariable Long id){
        return menu.getPlato(id);
    }
    
    @PostMapping("/agregar")
    public String addPlato(@RequestBody Plato plato){
        menu.addPlato(plato);
        return "Plato agregado correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public Plato deletePlato(@PathVariable Long id){
        return menu.deletePlato(id);
    }
    
    @GetMapping("/menu")
    public List<Plato> getMenu(){
        return menu.getMenu();
    }
    
    @GetMapping("/menu/celiaco")
    public List<Plato> getMenuCeliaco(){
        return menu.getMenuCeliaco();
    }
}
