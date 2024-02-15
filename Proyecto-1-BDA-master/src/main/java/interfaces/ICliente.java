/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import excepciones.PersistenciaException;
import objetos.Cliente;

/**
 *
 * @author labcisco
 */
public interface ICliente {
    
    Cliente registrarCliente(Cliente c) throws PersistenciaException;
}
