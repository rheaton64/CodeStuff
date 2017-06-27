package Recursion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Cell extends JPanel implements MouseListener{

	Image mCat;
	Image darl;
	public boolean inCell;
	public Color color = Color.green;
	public static boolean start = false;
	public Cell(boolean inCell1){
		try{
			mCat = ImageIO.read(new File("C:/Users/Ryan/workspace/Ryan/src/mCat.png"));
			darl = ImageIO.read(new File("C:/Users/Ryan/workspace/Ryan/src/darlington.png"));
		}
		catch(Exception e){
		}
		inCell = inCell1;
		addMouseListener(this);
	}

	public void paint(Graphics g){
		g.setColor(color);
		//System.out.println(color);
		g.fillRect(0, 0, 100, 100);
		//System.out.println("test");
		g.setColor(Color.black);
		g.drawRect(0, 0, 100, 100);
		if(color.equals(Color.red)){
			g.drawImage(darl, 0, 0, null);
		}
		if(inCell == true){
			g.drawImage(mCat, 0, 0, null);
		}
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		int inCellInt = 0;
		if(inCell == true){
			color = Color.green;
			inCellInt = 1;
			start = true;
			System.out.println("start");
		}
		if(color.equals(Color.green) && inCellInt == 0){
			color = Color.gray;
			//System.out.println("test1");
			//System.out.println(color);
		}
		else if(color.equals(Color.gray) && inCellInt == 0){
			color = Color.red;
		}
		else if(color.equals(Color.red) && inCellInt == 0){
			color = Color.green;
		}
		//System.out.println(getX());
		repaint();
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
	public void setInCell(boolean inCell1){
		inCell = inCell1;
	}
	public boolean getInCell(){
		return inCell;
	}
	public int getColor(){
		if(color.equals(Color.green)){
			return 1;
		}
		if(color.equals(Color.gray)){
			return 2;
		}
		if(color.equals(Color.red)){
			return 3;
		}
		return 0;
	}
	public boolean getStart(){
		return start;
	}
	public void setColor(Color color1){
		color = color1;
	}
}


