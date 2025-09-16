package br.com.unicuritiba;

import br.com.unicuritiba.views.GameView;

public class Game {
	
	private GameView gameView;
	
	public void start() {
		gameView = new GameView();
		gameView.showWelcomeMesage();
	}
	
	private void getPlayerName() {}
	
	private void selectWord() {}
	
	private boolean validateWord() {
		return true;
	}
	
	private boolean validateLetter() {
		return true;
	}
}
