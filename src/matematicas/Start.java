package matematicas;


public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Fraccion unaFraccion = new Fraccion(3,7);
		System.out.println(unaFraccion);
		
		Fraccion otraFraccion = new Fraccion(unaFraccion);
		System.out.println(otraFraccion);
		
		
		System.out.println("cambios__________");
		otraFraccion.setNumerador(2000);
		
		
		System.out.println(unaFraccion);
		System.out.println(otraFraccion);

		


	}

}
