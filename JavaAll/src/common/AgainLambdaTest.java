package common;
class AgainLambdaTest {


	interface Game {
		public void play();
	}


	Game PlayGame = new Game() {
		public void play() {
			System.out.println("I'm playing Football!");
		}
	};




	public static void main(String ...a) {

		AgainLambdaTest pg = new AgainLambdaTest();
		System.out.println(pg.PlayGame);
	}
}
