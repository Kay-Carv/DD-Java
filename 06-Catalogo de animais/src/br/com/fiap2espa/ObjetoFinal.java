//>--Programação orientada a objetos--<

// OS QUATROS PILARES

//Abstração
//Herança
//Incapsulamento
//Polimorfismo

package br.com.fiap2espa;

// Class Objeto final herda a classe objeto incial
public class ObjetoFinal  extends ObjetoInicial{    //Construtor padrão = public class Objeto
    String caracEspec1 = "Especifica";

    void comportamentoEspecifico() {
        System.out.println("Comportamento específico: ");
    }
}