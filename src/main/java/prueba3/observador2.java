package prueba3;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class observador2 implements Observer<String>{

	@Override
	public void onSubscribe(Disposable d) {
		System.out.println("Observer.onSubscribe 2");
		
	}

	@Override
	public void onNext(String t) {
		System.out.println("Observer.onNext 2");
		
	}

	@Override
	public void onError(Throwable e) {
		System.out.println("Observer.onError 2");
		
	}

	@Override
	public void onComplete() {
		System.out.println("Observer.onComplete 2");
		
	}



}
