package es.cic.curso25;

public class Coche {

    private Calculadora calc;
    private int velocidad;
    public static final double MULTIPLO_CONSUMO=4.3;
    
    public Coche(){
        calc=new Calculadora();
    }

    public int getVelocidad(){
        return velocidad;
    }

    public double getConsumo(){
        calc.limpiar();
        calc.sumar(velocidad);
        calc.dividir(100);
        calc.multiplicar(MULTIPLO_CONSUMO);
        return calc.getTotal();
    }

    public void acelerar(int incrementoVelocidad){
        calc.limpiar();
        calc.sumar(incrementoVelocidad);
        velocidad=(int)Math.round(calc.getTotal());
    }

    public void frenar(int decrementoVelocidada){
        calc.limpiar();
        if(velocidad>=decrementoVelocidada){
            calc.restar(decrementoVelocidada);
            velocidad=(int)Math.round(calc.getTotal());
        } else {
            throw new UnsupportedOperationException("No puedes restar por debajo de 0");
        }
    }
    
}
