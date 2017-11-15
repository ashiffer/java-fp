class obstacle extends gamePiece{
	public void generatePiece(){
		xLoc = 10;
	    yLoc = (int)(Math.random() * 10);
	}

	public void movePiece(){
		xLoc -= 1; 
	}
}