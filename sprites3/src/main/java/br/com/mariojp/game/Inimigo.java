package br.com.mariojp.game;

public class Inimigo extends Sprite implements GameObjectInterface {

	private int initX;
	
	public Inimigo(int x, int y) {
		super(x, y);
		this.initX = x;
		initInimigo();
	}

	private void initInimigo() {
		carregarImagem("/imagens/alien.png");
		getImageDimensions();
	}

	@Override
	public void init() {
		initInimigo();
	}

	public void move() {
		if (x < 0) {
			x = initX;
		}
		x -= 1;
	}

}
