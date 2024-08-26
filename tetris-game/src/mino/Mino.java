package mino;

import java.awt.Color;
import java.awt.Graphics2D;

import main.KeyHandler;
import main.PlayManager;

public class Mino {
	public Block b[] = new Block[4];
	public Block tempB[] = new Block[4];
	int autoDropCounter = 0;
	
	public void create(Color c) {
		b[0] = new Block(c);
		b[1] = new Block(c);
		b[2] = new Block(c);
		b[3] = new Block(c);
		tempB[0] = new Block(c);
		tempB[1] = new Block(c);
		tempB[2] = new Block(c);
		tempB[3] = new Block(c);
	}
	
	public void setXY(int x, int y) {
	}
	public void updateXY(int direction) {
	}
	public void update() {
		
		if(KeyHandler.upPressed) {
			
		}
		if(KeyHandler.downPressed) {
			b[0].y += Block.SIZE;
			b[1].y += Block.SIZE;
			b[2].y += Block.SIZE;
			b[3].y += Block.SIZE;
			
			autoDropCounter = 0;
			
			KeyHandler.downPressed = false;
		}
		if(KeyHandler.leftPressed) {
			b[0].x -= Block.SIZE;
			b[1].x -= Block.SIZE;
			b[2].x -= Block.SIZE;
			b[3].x -= Block.SIZE;
			
			
			KeyHandler.leftPressed = false;
		}
		if(KeyHandler.rightPressed) {
			b[0].x += Block.SIZE;
			b[1].x += Block.SIZE;
			b[2].x += Block.SIZE;
			b[3].x += Block.SIZE;
			
			
			KeyHandler.rightPressed = false;
		}

		autoDropCounter++;
		if(autoDropCounter == PlayManager.dropInterval) {
			b[0].y += Block.SIZE;
			b[1].y += Block.SIZE;
			b[2].y += Block.SIZE;
			b[3].y += Block.SIZE;
			autoDropCounter = 0;
		}
	}
	
	public void draw(Graphics2D g2) {
		g2.setColor(b[0].c);
		b[0].draw(g2);
		b[1].draw(g2);
		b[2].draw(g2);
		b[3].draw(g2);
		
//		g2.fillRect(b[0].x, b[0].y, Block.SIZE, Block.SIZE);
//		g2.fillRect(b[1].x, b[1].y, Block.SIZE, Block.SIZE);
//		g2.fillRect(b[2].x, b[2].y, Block.SIZE, Block.SIZE);
//		g2.fillRect(b[3].x, b[3].y, Block.SIZE, Block.SIZE);
	}
}