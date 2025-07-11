package es.cic.curso25;

public class Vehiculo {

    public static final double MULTIPLO_CONSUMO=4.3;
    protected Calculadora calc;
    protected int velocidad;

    public Vehiculo (){
        calc=new Calculadora();
    }

    public void acelerar(int incrementoVelocidad){
        calc.limpiar();
        if((velocidad+incrementoVelocidad)<=300){
            calc.sumar(incrementoVelocidad);
            velocidad+=(int)Math.round(calc.getTotal());
        } else {
            throw new UnsupportedOperationException("No puedes restar por debajo de 0");
        }
    }

    public void frenar(int decrementoVelocidada){
        calc.limpiar();
        if((velocidad-decrementoVelocidada)>=0){
            calc.sumar(velocidad);
            calc.restar(decrementoVelocidada);
            velocidad-=(int)Math.round(calc.getTotal());
        } else {
            throw new UnsupportedOperationException("No puedes restar por debajo de 0");
        }
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


}
