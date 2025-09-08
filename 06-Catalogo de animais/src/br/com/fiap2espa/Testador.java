package br.com.fiap2espa;

public class Testador {
    public static void main(String[] args) {
        ObjetoFinal of = new ObjetoFinal();         //Instanciar classe - Dimensiona a variável para caber dados do tamanho do objeto final
                                                    // new Objeto (método construtor) abre espaço na memória

        System.out.println(of.getCarac1());
        System.out.println(of.getCarac2());
        System.out.println(of.getCarac3());
        System.out.println(of.caracEspec1);

        of.comportamental1();
        of.comportamento2();
        of.comportamentoEspecifico();

        ObjetoInicial oI = new ObjetoFinal();     //Guarda uma instância dessa classe com todos os objetos (isso se chama de polimofismo)

        System.out.println(oI.getCarac1());
        //System.out.println(oI.caracEspec1);       //Não é possível trazer um objeto da classe filha para a classe pai

        oI.comportamental1();
    }
}
