package fernando.alientrix;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Missel extends Movel {

	private static final int LARGURA_TELA = 500;
	private static final int VELOCIDADE = 2;

	public Missel(int x, int y) {
		this.x = x;
		this.y = y;

		ImageIcon referencia = new ImageIcon(Main.class.getResource("/res/missel.png"));
		imagem = referencia.getImage();

		this.largura = imagem.getWidth(null);
		this.altura = imagem.getHeight(null);

		visible = true;
	}

	public void mexer() {
		this.x += VELOCIDADE;
		if (this.x > LARGURA_TELA) {
			visible = false;
		}
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, largura, altura);

	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public Image getImagem() {
		return imagem;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public int getAltura() {
		return altura;
	}

	@Override
	public int getLargura() {
		return largura;
	}

	@Override
	public boolean isVisivel() {
		return visible;
	}

	@Override
	public void setVisivel(boolean visivel) {
		visible = visivel;
	}
}
