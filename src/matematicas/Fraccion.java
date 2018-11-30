package matematicas;

public class Fraccion {

	
	/*
	 * ATRIBUTOS
	 * 
	 */
	private int numerador;
	private int denominador;
	
	
	
	
	/*
	 * 
	 * CONSTRUCTORES
	 * 
	 */
	public Fraccion() {
		
		numerador = 0;
		denominador = 1;
	}
	
	
	
	public Fraccion(int numerador,int denominador) {
		
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	
	
	public Fraccion(Fraccion aCopiar) {
		
		this.numerador = aCopiar.numerador;
		this.denominador = aCopiar.denominador;
	}	
	
	
	
	
	
	
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
		reducir();
	}
	public int getDenominador() {
		return denominador;
	}
	public void setDenominador(int denominador) {
		
		if(denominador!=0) {
			this.denominador = denominador;
			reducir();
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
		devolver.reducir();
		
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
		devolver.reducir();
		
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
		devolver.reducir();
		
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
		devolver.reducir();
		
		return devolver;
	}	
	
	
	/*
	 * Reducción
	 * machaca los denominadores y numeradores antiguos
	 * 
	 */
	private void reducir() {

		// busco el menor de entre el numerador y el denominador
		int menor = numerador;
		if(denominador<numerador) {
			menor = denominador;
		}
		
		// recorro desde el pequeño hasta 2
		for(int i=menor;i>=2;i--) {
			
			// si encuentro un numero que divida al numerador 
			// y denominador aplico la división
			if((numerador%i==0)&(denominador%i==0)) {
				
				numerador /= i;
				denominador /= i;
			}
		}
	}
	
	
	
	
	
	
	
	
	public String toString() {
		
		return numerador+"/"+denominador;
	}
	
	
	
	
	
	
}
