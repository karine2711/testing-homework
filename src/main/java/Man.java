public class Man {
    private final int squareGridWallSize;
    private int positionX;
    private int positionY;

    public Man(int positionX, int positionY, int squareGridWallSize) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.squareGridWallSize = squareGridWallSize;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void moveUp() {
        this.positionY = positionY == 0 ? 0 : positionY - 1;
    }

    public void moveDown() {
        this.positionY = positionY == squareGridWallSize ? squareGridWallSize : positionY + 1;
    }

    public void moveLeft() {
        this.positionX = positionX == 0 ? 0 : positionX - 1;
    }

    public void moveRight() {
        this.positionX = positionX == squareGridWallSize ? squareGridWallSize: positionX + 1;
    }

}