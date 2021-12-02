package prueba3;

import io.reactivex.Observable;

public class prueba3 {
	
	public  static void main(String[] args) {
	
		Observable<String> messageSender = Observable.just("Mensaje 1", "Mensaje 2", "Mensaje 3");
		
		observador1 observador1 = new observador1();
		observador2 observador2 = new observador2();
		
		// Llamo metodo subscribe del observable
		messageSender.subscribe(observador1);
		messageSender.subscribe(observador2);
	}
}
