/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.allamiflorencia.MenuRestaurante.Repository;

import com.allamiflorencia.MenuRestaurante.Model.Plato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author flopy
 */
@Repository
public interface PlatoRepository extends JpaRepository <Plato, Long> {
    
}
