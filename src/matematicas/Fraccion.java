package matematicas;

public class Fraccion {

	
	/*
	 * ATRIBUTOS
	 * 
	 */
	private int numerador;
	private int denominador;
	
	
	
	/*
	 * SETTERS Y GETTERS
	 * 
	 * 
	 */
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public int getDenominador() {
		return denominador;
	}
	public void setDenominador(int denominador) {
		
		if(denominador!=0) {
			this.denominador = denominador;
		}
	}
	
	
	/*
	 * 
	 * OPERACION DE MULTIPLICAR
	 * 
	 */
	public Fraccion multiplicar(Fraccion otra) {
		
		int nuevoNumerador = this.numerador * otra.numerador;
		int nuevoDenominador = this.denominador * otra.denominador;

		Fraccion devolver = new Fraccion();
		devolver.numerador = nuevoNumerador;
		devolver.denominador = nuevoDenominador;
		
		return devolver;
	}
	
	
	/*
	 * 
	 * OPERACION DE MULTIPLICAR
	 * 
	 */
	public Fraccion dividir(Fraccion otra) {
		
		int nuevoNumerador = this.numerador * otra.denominador;
		int nuevoDenominador = this.denominador * otra.numerador;

		Fraccion devolver = new Fraccion();
		devolver.numerador = nuevoNumerador;
		devolver.denominador = nuevoDenominador;
		
		return devolver;
	}	
	
	
	
	
	
	/*
	 * 
	 * OPERACION DE SUMAR
	 * 
	 */
	public Fraccion suma(Fraccion otra) {
		
		int nuevoNumerador = this.numerador*otra.denominador + otra.numerador*this.denominador;
		int nuevoDenominador = this.denominador * otra.denominador;

		Fraccion devolver = new Fraccion();
		devolver.numerador = nuevoNumerador;
		devolver.denominador = nuevoDenominador;
		
		return devolver;
	}	
	
	
	
	
	/*
	 * 
	 * OPERACION DE RESTA
	 * 
	 */
	public Fraccion resta(Fraccion otra) {
		
		int nuevoNumerador = this.numerador*otra.denominador - otra.numerador*this.denominador;
		int nuevoDenominador = this.denominador * otra.denominador;

		Fraccion devolver = new Fraccion();
		devolver.numerador = nuevoNumerador;
		devolver.denominador = nuevoDenominador;
		
		return devolver;
	}	
	
	
	
	private void reducir() {
		

		
		
		
		
	}
	
	
	
	
	
	
	
	
	public String toString() {
		
		return numerador+"/"+denominador;
	}
	
	
	
	
	
	
}
