package gameProject;
//GET ANOTHER ENEMY GIF IN AND REPLACE IT IN CASE 9
//test change

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage; 
import java.awt.event.*; 


public class Game  extends JPanel implements Runnable, KeyListener, MouseListener, MouseMotionListener{

	
	private BufferedImage back; 
	private ImageIcon background, background2, alien, heart, enemy,enemy2, fight, proj;
	private Picture solosis;
	private int key, dx, dx2, dy, rx, ry, lives, event, sx, sy, enx1, enx2, enx3, enx4, enx5, enx6, enx7, enx8, enx9, mousey; 
	private Boolean movetrue, screen, clear, event1, screentrue, shoottrue, en1, en2, en3, en4, en5 , en6, en7, en8, en9;
	
	
	
	public Game() {
		new Thread(this).start();	
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addKeyListener(this);
		key =-1; 
		alien = new ImageIcon("idlealien.gif");
		enemy = new ImageIcon("enemy.gif");
		enemy2 = new ImageIcon("enemy.gif");

		fight = new ImageIcon("fight.gif");
		proj = new ImageIcon("projectile.png");
		

		background= new ImageIcon("backg.png");
		background2= new ImageIcon("backg2.png");

		heart = new ImageIcon("heart.png");
		solosis = new Picture(100, 100, 1500, 1500);
		dx = 0;
		dx2 = 0;
		sx = 0;
		sy = 0;
		dy = 0;
		rx = 200;
		ry = 500;
		enx1 = 1000;
		enx2 = 1000;
		enx3 = 800;
		enx4 = 1000;
		enx5 = 1000;
		enx6 = 1000;
		enx7 = 1000;
		enx8 = 1000;
		enx9 = 1000;
		lives = 3;
		event = 0;
		movetrue = true;
		screen = false;
		clear = false;
		event1 = false;
		screentrue = false;
		shoottrue = false;
		en1 = true;
		en2 = true;
		en3 = true;
		en4 = true;
		en5 = true;
		en6 = true;
		en7 = true;
		en8 = true;
		en9 = true;
	}

	
	
	public void run()
	   {
	   	try
	   	{
	   		while(true)
	   		{
	   		   Thread.currentThread().sleep(5);
	            repaint();
	         }
	      }
	   		catch(Exception e)
	      {
	      }
	  	}
	

	
	
	
	public void paint(Graphics g){
		
		Graphics2D twoDgraph = (Graphics2D) g; 
		if( back ==null)
			back=(BufferedImage)( (createImage(getWidth(), getHeight()))); 
		

		Graphics g2d = back.createGraphics();
	




		

		
		g2d.clearRect(0,0,getSize().width, getSize().height);
		g2d.setColor(Color.WHITE);

		g2d.drawString("ALIEN ATTACK", 750, 66);
		g2d.setColor(Color.BLACK);

		if(dx == -510){
			event = 1;
			dx = dx + 1;
		}

		if (dx == -1514){

			event = 3;
			dx = dx + 1;
			}
		if (dx == -3238){

			event = 5;
			dx = dx + 1;
			}
		if (dx == -4092){

				event = 7;
				dx = dx + 1;
				}

		if(dx < -4215) {
			//stop lateral movement
			//world limits
				movetrue = false;
		}
	


		g2d.drawImage(background.getImage(), dx ,dy, 6000, 1000, this); 
		g2d.drawImage(alien.getImage(), rx, ry, 100,100,this); 	

		drawHUD(g2d);

		if(shoottrue == true){
			shoot(g2d);
		}

		switch(lives){
			case 3:
		g2d.drawImage(heart.getImage(), 20, 15, 100,100,this); 	

			
			case 2:

		g2d.drawImage(heart.getImage(), 70, 15, 100,100,this); 	

			
			case 1:
		g2d.drawImage(heart.getImage(), 120, 15, 100,100,this); 	

			break;
		}

		if(screen == true){
			g2d.drawImage(fight.getImage(), 0, 0, 1800,1000,this); 	
		}

		switch(event){
			case 1:
screen = true;
			break;
			
			case 2:
			screen = false;

			clear(g2d);
			drawHUD(g2d);
			if(shoottrue == true){
				shoot(g2d);
			}
			if (en1 == true){
				g2d.drawImage(enemy.getImage(), enx1, 350, 150,150,this); 	

			}

			if (en2 == true){
				g2d.drawImage(enemy2.getImage(), enx2, 750, 150,150,this); 	

			}

			if (sx > enx1 && sy > 350 && sy < 500){
				en1 = false;
			
			}
			
			if (sx > enx2 && sy > 600 && sy < 800){
				en2 = false;
			
			}
 if(en1 == false && en2 == false){

movetrue = true;



 }
 else{
	movetrue = false;

}

			break;

			
			case 3:
			screen = true;

			break;

			case 4:

			screen = false;

			clear(g2d);
			drawHUD(g2d);
			if(shoottrue == true){
				shoot(g2d);
			}
			if (en3 == true){
				g2d.drawImage(enemy.getImage(), enx3, 250, 150,150,this); 	

			}

			if (en4 == true){
				g2d.drawImage(enemy2.getImage(), enx4, 500, 150,150,this); 	

			}

			if (en5 == true){
				g2d.drawImage(enemy.getImage(), enx5, 750, 150,150,this); 	

			}



			if (sx > enx3 && sy > 250 && sy < 400){
				en3 = false;
			
			}
			
			if (sx > enx4 && sy > 500 && sy < 650){
				en4 = false;
			
			}
			
			if (sx > enx5 && sy > 750 && sy < 900){
				en5 = false;
			
			}
			
			if(en3 == false && en4 == false && en5 == false){

				movetrue = true;
				
				
				
				 }
				 else{
					movetrue = false;
				
				}

			break;
			case 5:

screen = true;


			break;

			case 6:

			screen = false;

			clear(g2d);
			drawHUD(g2d);
			if(shoottrue == true){
				shoot(g2d);
			}
			if (en6 == true){
				g2d.drawImage(enemy.getImage(), enx6, 250, 150,150,this); 	

			}

			if (en7 == true){
				g2d.drawImage(enemy2.getImage(), enx7, 500, 150,150,this); 	

			}

			if (en8 == true){
				g2d.drawImage(enemy.getImage(), enx8, 750, 150,150,this); 	

			}

			if (en9 == true){
				g2d.drawImage(enemy.getImage(), enx9, 750, 150,150,this); 	

			}

			if (sx > enx6 && sy > 250 && sy < 400){
				en6 = false;
			
			}
			
			if (sx > enx7 && sy > 500 && sy < 650){
				en7 = false;
			
			}
			
			if (sx > enx8 && sy > 750 && sy < 900){
				en8 = false;
			
			}
			if (sx > enx9 && sy > 750 && sy < 900){
				en9 = false;
			
			}
			

			if(en7 == false && en8 == false && en9 == false){

				movetrue = true;
				
				
				
				 }
				 else{
					movetrue = false;
				
				}

			break;
			
				case 7:

				endScreen1(g2d);
				dx = 0;
				rx = 200;
				ry = 500;

				en1 = true;
				en2 = true;
				en3 = true;
				en4 = true;
				en5 = true;
				en6 = true;
				en7 = true;
				en8 = true;
				en9 = true;

				break;

				case 8:
				g2d.clearRect(0,0,getSize().width, getSize().height);

				g2d.drawImage(background2.getImage(), dx , dy, 6000, 1000, this); 
				g2d.drawImage(alien.getImage(), rx, ry, 100,100,this); 	



				break;

				case 9:

				screen = false;

				clear(g2d);
				drawHUD2(g2d);
				if(shoottrue == true){
					shoot(g2d);
				}
				if (en1 == true){
					g2d.drawImage(enemy.getImage(), enx1, 350, 150,150,this); 	
	
				}
	
				if (en2 == true){
					g2d.drawImage(enemy2.getImage(), enx2, 750, 150,150,this); 	
	
				}
	
				if (sx > enx1 && sy > 350 && sy < 500){
					en1 = false;
				
				}
				
				if (sx > enx2 && sy > 600 && sy < 800){
					en2 = false;
				
				}
	 if(en1 == false && en2 == false){
	
	movetrue = true;
	
	
	
	 }
	 else{
		movetrue = false;
	
	}
	

				break;


				case 10:


				
				break;

				case 11:


				
				break;

				case 12:


				
				break;


		}








//560, 900

		//make it so this happens after you press space, removing the animation at the same time



	
		

			

		twoDgraph.drawImage(back, null, 0, 0);





		
	}


	public void drawHUD(Graphics g2d){
		g2d.setFont(new Font ("Consolas", Font.PLAIN, 40));
		g2d.drawImage(background.getImage(), dx ,dy, 6000, 1000, this); 
		g2d.drawImage(alien.getImage(), 100, ry, 100,100,this); 	
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 0, 2000, 100);
		g2d.setColor(Color.WHITE);

		g2d.drawString("ALIEN ATTACK", 750, 66);


		switch(lives){
			case 3:
		g2d.drawImage(heart.getImage(), 20, 15, 100,100,this); 	

			
			case 2:

		g2d.drawImage(heart.getImage(), 70, 15, 100,100,this); 	

			
			case 1:
		g2d.drawImage(heart.getImage(), 120, 15, 100,100,this); 	

			break;
		}

	}

	public void drawHUD2(Graphics g2d){
		g2d.setFont(new Font ("Consolas", Font.PLAIN, 40));
		g2d.drawImage(background2.getImage(), dx ,dy, 6000, 1000, this); 
		g2d.drawImage(alien.getImage(), 100, ry, 100,100,this); 	
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 0, 2000, 100);
		g2d.setColor(Color.WHITE);

		g2d.drawString("ALIEN ATTACK", 750, 66);


		switch(lives){
			case 3:
		g2d.drawImage(heart.getImage(), 20, 15, 100,100,this); 	

			
			case 2:

		g2d.drawImage(heart.getImage(), 70, 15, 100,100,this); 	

			
			case 1:
		g2d.drawImage(heart.getImage(), 120, 15, 100,100,this); 	

			break;
		}

	}

	public void endScreen1(Graphics g2d){

		g2d.clearRect(0,0,getSize().width, getSize().height);
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 0, 2000, 2000);
		g2d.setColor(Color.WHITE);

		g2d.drawString("LEVEL 1 COMPLETE", 700, 500);
	}

	public void clear(Graphics g2d){
		g2d.clearRect(0,0,getSize().width, getSize().height);
		drawHUD(g2d);


	}

	public void shoot(Graphics g2d){
		g2d.drawImage(proj.getImage(), sx, ry, 200,100,this); 	
		sy = ry;

		for (int i = 0; i < 10; i++) {
			sx = sx + 5;
		  }

		

		System.out.println("works");
	}




	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if (key == 32){
			shoottrue = true;
		}
		
	}





	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		key= e.getKeyCode();
		System.out.println(key);
		if (movetrue == true){


			
			if (key == 65) {
				//move left
				dx = dx + 15;
				//rx = rx - 1;

			}
			if (key == 68) {
				//move right
				//rx = rx + 20;
				dx = dx - 15;

				
	
			}

		}
		if (key == 83) {
			//move down
			ry = ry + 20;
			System.out.println(screen);

		}
		if (key == 87) {
			//move up
			ry = ry - 20;
			System.out.println(screen);

		}

		if (key == 17){

			lives--;
		}



		if (key == 16){
			event++;
		}






		
	}



	@Override
	public void keyReleased(KeyEvent e) {
	
		
		if (key == 32){
			shoottrue = false;
			sx = rx;

		}

		
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(mousey);
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(dx);
		
	}



	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	

	
}
