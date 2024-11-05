package mino;

import java.awt.Color;

public class FiveTest extends Mino{
	public FiveTest() {
		b.add(new Block(Color.yellow));
		b.add(new Block(Color.yellow));
		b.add(new Block(Color.yellow));
		b.add(new Block(Color.yellow));
		b.add(new Block(Color.yellow));
		tempB.add(new Block(Color.yellow));
		tempB.add(new Block(Color.yellow));
		tempB.add(new Block(Color.yellow));
		tempB.add(new Block(Color.yellow));
		tempB.add(new Block(Color.yellow));
	}
	
	public void setXY(int x, int y) {
		b.get(0).x = x;
		b.get(0).y = y;
		b.get(1).x = b.get(0).x;
		b.get(1).y = b.get(0).y + Block.SIZE;
		b.get(2).x = b.get(0).x + Block.SIZE;
		b.get(2).y = b.get(0).y;
		b.get(3).x = b.get(0).x + Block.SIZE;
		b.get(3).y = b.get(0).y + Block.SIZE;
		b.get(4).x = b.get(0).x + 2 * Block.SIZE;
		b.get(4).y = b.get(0).y;
	}
	
	public void getDirection1() {
	}
	public void getDirection2() {
	}
	public void getDirection3() {
	}
	public void getDirection4() {
	}

}
