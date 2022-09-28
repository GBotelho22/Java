/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaula2;

/**
 *
 * @author ferauche
 */
public class Carro {
    
    float odometro = 0;
    float tanque = 0;
    float consumoMedio = 0;
    
    public Carro(float consumo, float litros) {
        this.consumoMedio = consumo;
        this.tanque = litros;
    }
    
    public void setarVelocidade(float vm, float tempo) {
        float distancia = vm * tempo;
        float litros = distancia / this.consumoMedio;
        
        this.odometro += distancia;
        this.tanque -= litros;
    }
    
}
