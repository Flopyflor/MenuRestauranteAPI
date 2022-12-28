/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.allamiflorencia.MenuRestaurante.Service;

import com.allamiflorencia.MenuRestaurante.Model.Plato;
import java.util.List;

/**
 *
 * @author flopy
 */
public interface IMenuService {
    public void addPlato(Plato plato);
    public List<Plato> getMenu();
    public Plato getPlato(Long id);
    public Plato deletePlato(Long id);
    public List<Plato> getMenuCeliaco();
}
