package mino;

import java.awt.Color;

public class Mino_Bar extends Mino{
	
	public Mino_Bar() {
		b.add(new Block(Color.cyan));
		b.add(new Block(Color.cyan));
		b.add(new Block(Color.cyan));
		b.add(new Block(Color.cyan));
		tempB.add(new Block(Color.cyan));
		tempB.add(new Block(Color.cyan));
		tempB.add(new Block(Color.cyan));
		tempB.add(new Block(Color.cyan));
	}
	
	public void setXY(int x, int y) {
		b.get(0).x = x;
		b.get(0).y = y;
		b.get(1).x = b.get(0).x - Block.SIZE;
		b.get(1).y = b.get(0).y;
		b.get(2).x = b.get(0).x + Block.SIZE;
		b.get(2).y = b.get(0).y;
		b.get(3).x = b.get(0).x + Block.SIZE * 2;
		b.get(3).y = b.get(0).y;
	}
	
	public void getDirection1() {
		tempB.get(0).x = b.get(0).x;
		tempB.get(0).y = b.get(0).y;
		tempB.get(1).x = b.get(0).x - Block.SIZE;
		tempB.get(1).y = b.get(0).y;
		tempB.get(2).x = b.get(0).x + Block.SIZE;
		tempB.get(2).y = b.get(0).y;
		tempB.get(3).x = b.get(0).x + Block.SIZE * 2;
		tempB.get(3).y = b.get(0).y;
		
		updateXY(1);
	}
	public void getDirection2() {
		tempB.get(0).x = b.get(0).x;
		tempB.get(0).y = b.get(0).y;
		tempB.get(1).x = b.get(0).x;
		tempB.get(1).y = b.get(0).y - Block.SIZE;
		tempB.get(2).x = b.get(0).x;
		tempB.get(2).y = b.get(0).y + Block.SIZE;
		tempB.get(3).x = b.get(0).x;
		tempB.get(3).y = b.get(0).y + Block.SIZE * 2;
		
		updateXY(2);
	}
	public void getDirection3() {
		tempB.get(0).x = b.get(0).x;
		tempB.get(0).y = b.get(0).y;
		tempB.get(1).x = b.get(0).x + Block.SIZE;
		tempB.get(1).y = b.get(0).y;
		tempB.get(2).x = b.get(0).x - Block.SIZE;
		tempB.get(2).y = b.get(0).y;
		tempB.get(3).x = b.get(0).x - Block.SIZE * 2;
		tempB.get(3).y = b.get(0).y;
		
		updateXY(3);
	}
	public void getDirection4() {
		tempB.get(0).x = b.get(0).x;
		tempB.get(0).y = b.get(0).y;
		tempB.get(1).x = b.get(0).x;
		tempB.get(1).y = b.get(0).y + Block.SIZE;
		tempB.get(2).x = b.get(0).x;
		tempB.get(2).y = b.get(0).y - Block.SIZE;
		tempB.get(3).x = b.get(0).x;
		tempB.get(3).y = b.get(0).y - Block.SIZE * 2;
		
		updateXY(4);
	}

}
