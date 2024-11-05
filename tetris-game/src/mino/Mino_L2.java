package mino;

import java.awt.Color;

public class Mino_L2 extends Mino{
	
	public Mino_L2() {
		b.add(new Block(Color.blue));
		b.add(new Block(Color.blue));
		b.add(new Block(Color.blue));
		b.add(new Block(Color.blue));
		tempB.add(new Block(Color.blue));
		tempB.add(new Block(Color.blue));
		tempB.add(new Block(Color.blue));
		tempB.add(new Block(Color.blue));
	}
	
	public void setXY(int x, int y) {
		b.get(0).x = x;
		b.get(0).y = y;
		b.get(1).x = b.get(0).x;
		b.get(1).y = b.get(0).y - Block.SIZE;
		b.get(2).x = b.get(0).x;
		b.get(2).y = b.get(0).y + Block.SIZE;
		b.get(3).x = b.get(0).x - Block.SIZE;
		b.get(3).y = b.get(0).y + Block.SIZE;
	}
	
	public void getDirection1() {
		tempB.get(0).x = b.get(0).x;
		tempB.get(0).y = b.get(0).y;
		tempB.get(1).x = b.get(0).x;
		tempB.get(1).y = b.get(0).y - Block.SIZE;
		tempB.get(2).x = b.get(0).x;
		tempB.get(2).y = b.get(0).y + Block.SIZE;
		tempB.get(3).x = b.get(0).x - Block.SIZE;
		tempB.get(3).y = b.get(0).y + Block.SIZE;
		
		updateXY(1);
	}
	public void getDirection2() {
		tempB.get(0).x = b.get(0).x;
		tempB.get(0).y = b.get(0).y;
		tempB.get(1).x = b.get(0).x + Block.SIZE;
		tempB.get(1).y = b.get(0).y;
		tempB.get(2).x = b.get(0).x - Block.SIZE;
		tempB.get(2).y = b.get(0).y;
		tempB.get(3).x = b.get(0).x - Block.SIZE;
		tempB.get(3).y = b.get(0).y - Block.SIZE;
		
		updateXY(2);
	}
	public void getDirection3() {
		tempB.get(0).x = b.get(0).x;
		tempB.get(0).y = b.get(0).y;
		tempB.get(1).x = b.get(0).x;
		tempB.get(1).y = b.get(0).y + Block.SIZE;
		tempB.get(2).x = b.get(0).x;
		tempB.get(2).y = b.get(0).y - Block.SIZE;
		tempB.get(3).x = b.get(0).x + Block.SIZE;
		tempB.get(3).y = b.get(0).y - Block.SIZE;
		
		updateXY(3);
	}
	public void getDirection4() {
		tempB.get(0).x = b.get(0).x;
		tempB.get(0).y = b.get(0).y;
		tempB.get(1).x = b.get(0).x - Block.SIZE;
		tempB.get(1).y = b.get(0).y;
		tempB.get(2).x = b.get(0).x + Block.SIZE;
		tempB.get(2).y = b.get(0).y;
		tempB.get(3).x = b.get(0).x + Block.SIZE;
		tempB.get(3).y = b.get(0).y + Block.SIZE;
		
		updateXY(4);
	}
}
