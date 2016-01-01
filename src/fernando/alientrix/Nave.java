package fernando.alientrix;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class Nave extends Movel {

	private int dx, dy;

	private List<Missel> misseis;

	public Nave() {
		ImageIcon referencia = new ImageIcon("res/nave.png");
		imagem = referencia.getImage();
		altura = imagem.getHeight(null);
		largura = imagem.getHeight(null);

		misseis = new ArrayList<>();

		this.x = 100;
		this.y = 100;
	}

	public void mexer() {
		x += dx;
		y += dy;

		if (this.x < 1) {
			this.x = 1;
		}
		
		if (this.x > 462) {
			this.x = 462;
		}

		if (this.y < 1) {
			this.y = 1;
		}

		if (this.y > 340) {
			this.y = 340;
		}
	}

	public void atira() {
		this.misseis.add(new Missel(this.x + this.largura, this.y + this.altura
				/ 3));
	}

	public void keyPressed(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();

		if (codigo == KeyEvent.VK_SPACE) {
			atira();
		}

		if (codigo == KeyEvent.VK_UP) {
			dy = -1;

		}
		
		if (codigo == KeyEvent.VK_DOWN) {
			dy = 1;
		}

		if (codigo == KeyEvent.VK_LEFT) {
			dx = -1;

		}
		
		if (codigo == KeyEvent.VK_RIGHT) {
			dx = 1;
		}
	}

	public void keyReleased(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();

		if (codigo == KeyEvent.VK_UP) {
			dy = 0;

		}
		
		if (codigo == KeyEvent.VK_DOWN) {
			dy = 0;

		}
		
		if (codigo == KeyEvent.VK_LEFT) {
			dx = 0;

		}
		
		if (codigo == KeyEvent.VK_RIGHT) {
			dx = 0;

		}
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, largura, altura);
	}

	public boolean isVisivel() {
		return visible;
	}

	public void setVisivel(boolean visible) {
		this.visible = visible;
	}

	public List<Missel> getMisseis() {
		return misseis;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImagem() {
		return imagem;
	}

	@Override
	public int getAltura() {
		return altura;
	}

	@Override
	public int getLargura() {
		return largura;
	}
}
