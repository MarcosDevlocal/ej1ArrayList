/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Categoria;
import Modelo.Usuario;
import java.util.ArrayList;

/**
 *
 * @author dam
 */
public class Empresa {

    ArrayList<Usuario> usuarios;
    ArrayList<Categoria> categorias;

    public Empresa() {
        usuarios = new ArrayList<>();
        categorias = new ArrayList<>();
    }
    /**
     * Informacion a añadir
     */
    public void añadir() {
        categorias.add(new Categoria("1", "Deportes"));
        categorias.add(new Categoria("2", "Politica"));
        categorias.add(new Categoria("3", "Economia"));
    }

}
