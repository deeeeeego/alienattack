package gameProject;

public class Picture {
	
	private String background, background2, image, heart, enemy, enemy2, fight, proj;
	private int x, y, w, h;
	private int dx, dy;
	
	public Picture() {
		background = "backg.png";
		background2 = "backg2.png";

		image = "idlealien.gif";
		heart = "heart.png";
		enemy = "enemy.gif";
		enemy2 = "enemy.gif";

		fight = "fight.gif";
		proj = "projectile.png";

		x=50;
		y=100;
		w=50;
		h=50;
		dx=1;
		dy=-1;
	}
	
	
	public Picture(int posx, int posy, int velx, int vely) {
		image = "idlealien.gif";
		heart = "heart.png";
		enemy = "enemy.gif";
		fight = "fight.gif";
		proj = "projectile.png";
		enemy2 = "enemy.gif";


		x=posx;
		y=posy;
		w=100;
		h=50;
		dx=velx;
		dy=vely;
		
		
	}
	public String getBckImage() {
		return background;
	}
	
	public String getBckImage2() {
		return background2;
	}

	public String getImage() {
		return image;
	}

	public String getheart() {
		return heart;
	}
	
	public String getEnemy() {
		return enemy;
	}

	public String getEnemy2() {
		return enemy2;
	}
	
	public String getFight() {
		return fight;
	}

	public String getProj(){
		return proj;


	}
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	public int getW() {
		return w;
	}
	public int getH() {
		return h;
	}




}