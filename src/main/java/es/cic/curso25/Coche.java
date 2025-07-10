package es.cic.curso25;

public class Coche {

    private Calculadora calc;
    public static final double MULTIPLO_CONSUMO=4.3;
    
    public Coche(){
        calc=new Calculadora();
    }

    public int getVelocidad(){
        return (int)calc.getTotal();
    }

    public double getConsumo(){
        return calc.getTotal()/100*MULTIPLO_CONSUMO;
    }

    public void acelerar(int incrementoVelocidad){
        calc.sumar(incrementoVelocidad);
    }

    public void frenar(int decrementoVelocidada){
        if(calc.getTotal()>=decrementoVelocidada){
            calc.restar(decrementoVelocidada);
        } else {
            throw new UnsupportedOperationException("No puedes restar por debajo de 0");
        }
    }
    
}
