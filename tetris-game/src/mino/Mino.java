package mino;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

import main.KeyHandler;
import main.PlayManager;

public class Mino {
	public ArrayList<Block> b = new ArrayList<>();
	public ArrayList<Block> tempB = new ArrayList<>();
	int autoDropCounter = 0;
	public int direction = 1;
	boolean leftCollision, rightCollision, bottomCollision;
	public boolean active = true;
	public boolean deactivating;
	int deactivateCounter = 0;
	
	public void create(Color c) {
	}
	
	public void setXY(int x, int y) {
	}
	public void updateXY(int direction) {
		
		checkRotationCollision();
		
		if(!leftCollision && !rightCollision && !bottomCollision) {
			this.direction = direction;
			for(int i = 0; i< b.size(); i++) {
				b.get(i).x = tempB.get(i).x;
				b.get(i).y = tempB.get(i).y;
			}
		}
		
	}
	public void getDirection1() {
	}
	public void getDirection2() {
	}
	public void getDirection3() {
	}
	public void getDirection4() {
	}
	
	public void checkMovementCollision() {
		leftCollision = false;
		rightCollision = false;
		bottomCollision = false;
		
		checkStaticBlockCollision();
		
		for(int i = 0; i < b.size(); i++) {
			if(b.get(i).x <= PlayManager.left_x) {
				leftCollision = true;
			}
			if(b.get(i).x + Block.SIZE >= PlayManager.right_x) {
				rightCollision = true;
			}
			if(b.get(i).y + Block.SIZE >= PlayManager.bottom_y) {
				bottomCollision = true;
			}
		}
	}
	public void checkRotationCollision() {
		leftCollision = false;
		rightCollision = false;
		bottomCollision = false;
		
		checkStaticBlockCollision();
		
		for(int i = 0; i < tempB.size(); i++) {
			if(tempB.get(i).x < PlayManager.left_x) {
				leftCollision = true;
			}
			if(tempB.get(i).x + Block.SIZE > PlayManager.right_x) {
				rightCollision = true;
			}
			if(tempB.get(i).y + Block.SIZE > PlayManager.bottom_y) {
				bottomCollision = true;
			}
		}
	}
	private void checkStaticBlockCollision() {
		for(int i = 0;i<PlayManager.staticBlocks.size();i++) {
			int targetX = PlayManager.staticBlocks.get(i).x;
			int targetY = PlayManager.staticBlocks.get(i).y;
			
			for(int j = 0; j<b.size();j++) {
				if(b.get(j).y+ Block.SIZE == targetY && b.get(j).x == targetX) {
					bottomCollision = true;
				}
				if(b.get(j).x+ Block.SIZE == targetX && b.get(j).y == targetY) {
					rightCollision = true;
				}
				if(b.get(j).x- Block.SIZE == targetX && b.get(j).y == targetY) {
					leftCollision = true;
				}
			}
		}
	}
	private void deactivating() {
		deactivateCounter++;
		if(deactivateCounter >= 45) {
			deactivateCounter = 0;
			checkMovementCollision();
			if(bottomCollision) {
				active = false;
			}
		}
	}
	public void update() {
		
		if(deactivating) {
			deactivating();
		}
		
		if(KeyHandler.upPressed) {
			switch(direction){
			case 1: getDirection2();break;
			case 2: getDirection3();break;
			case 3: getDirection4();break;
			case 4: getDirection1();break;
			}
			KeyHandler.upPressed = false;
		}
		
		checkMovementCollision();
		
		if(KeyHandler.downPressed) {
			
			if(!bottomCollision) {
				for(int i = 0;i<b.size();i++) {
					b.get(i).y += Block.SIZE;
				}
			}

			
			autoDropCounter = 0;
			
			KeyHandler.downPressed = false;
		}
		if(KeyHandler.leftPressed) {
			if(!leftCollision) {
				for(int i = 0;i<b.size();i++) {
					b.get(i).x -= Block.SIZE;
				}			
			}

			
			
			KeyHandler.leftPressed = false;
		}
		if(KeyHandler.rightPressed) {
			if(!rightCollision) {
				for(int i = 0;i<b.size();i++) {
					b.get(i).x += Block.SIZE;
				}			
			}

			
			
			KeyHandler.rightPressed = false;
		}
		if(bottomCollision) {
			deactivating = true;
		} else {
			autoDropCounter++;
			if(autoDropCounter == PlayManager.dropInterval) {
				
				for(int i = 0;i<b.size();i++) {
					b.get(i).y += Block.SIZE;
				}

				autoDropCounter = 0;
			}
		}
		
	}
	
	public void draw(Graphics2D g2) {
		g2.setColor(b.get(0).c);
		for(int i = 0; i<b.size(); i++) {
			b.get(i).draw(g2);
		}
		
//		g2.fillRect(b[0].x, b[0].y, Block.SIZE, Block.SIZE);
//		g2.fillRect(b[1].x, b[1].y, Block.SIZE, Block.SIZE);
//		g2.fillRect(b[2].x, b[2].y, Block.SIZE, Block.SIZE);
//		g2.fillRect(b[3].x, b[3].y, Block.SIZE, Block.SIZE);
	}
}
