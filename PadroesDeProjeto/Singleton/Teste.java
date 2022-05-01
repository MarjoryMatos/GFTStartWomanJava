package Singleton;

public class Teste {

	public static void main(String[] args) {		
		//Testes relacionados ao Desigin Patter Singleton
		
		Singleton lazy = Singleton.getInstancia();
		System.out.println(lazy);
		lazy = Singleton.getInstancia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);


		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);

		
	}

}
