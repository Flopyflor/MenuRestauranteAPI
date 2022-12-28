/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.allamiflorencia.MenuRestaurante.Service;

import com.allamiflorencia.MenuRestaurante.Model.Plato;
import com.allamiflorencia.MenuRestaurante.Repository.PlatoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author flopy
 */
@Service
public class MenuService implements IMenuService{
    
    @Autowired
    private PlatoRepository repo;
    
    @Override
    public void addPlato(Plato plato){
        repo.save(plato);
    }
    
    @Override
    public List<Plato> getMenu(){
        return repo.findAll();
    }
    
    @Override
    public Plato getPlato(Long id){
        return repo.findById(id).orElse(null);
    }
    
    @Override
    public Plato deletePlato(Long id){
        Plato plato = repo.findById(id).orElse(null);
        repo.delete(plato);
        return plato;
    }
    
    @Override
    public List<Plato> getMenuCeliaco(){
        return repo.findByApto_celiacos(true);
    }
}
