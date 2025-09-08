package br.com.fiap2espa;

public abstract class ObjetoInicial {           //abstract = não está mais disponível para ser construída
        //Propriedades
        private String carac1 = "Teste";
        private int carac2 = 12;
        private double carac3 = 70.5;

        //Comportamentos
        public void comportamental1() {                         //Métodos acessores e Métodos mutadores
            System.out.println("Imprimindo comportamento 1");
        }

        public void comportamento2(){
            System.out.println("imprimindo comportamento 2");
        }


        //Incapsulando informações
        //Métodos acessor
        public String getCarac1(){
            return carac1;
        }

        public int getCarac2(){
            return carac2;
        }

        public double getCarac3(){
            return carac3;
        }

        public void setCarac1(String c1){
            carac1 = c1;
        }

}

// Instanciar objeto = criar uma cópia concreta e funcional de uma classe na memória do computador