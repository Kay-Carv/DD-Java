//Interfaces

//Diferente da herança a interface eu posso importar quantas eu quiser para a classe
//Gera uma maior flexibilidade de códigos
package br.com.fiap2espa.animal;

public interface Aerial {
    //public abstract void fly();           Os métodos concretos em uma interface por padrão já são abstratos
    void fly();                             //Para abrir um bloco de código é preciso usar default
}
