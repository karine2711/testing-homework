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
        if (positionY == 0) {
            System.out.println("I can't go there, the wall is blocking me!");
        } else {
            positionY = positionY - 1;
        }
    }

    public void moveDown() {
        if (positionY == squareGridWallSize) {
            System.out.println("I can't go there, the wall is blocking me!");
        } else {
            positionY = positionY + 1;
        }
    }

    public void moveLeft() {
        if (positionX == 0) {
            System.out.println("I can't go there, the wall is blocking me!");
        } else {
            positionX = positionX - 1;
        }
    }

    public void moveRight() {
        if (positionX == squareGridWallSize) {
            System.out.println("I can't go there, the wall is blocking me!");
        } else {
            positionX = positionX + 1;
        }
    }
}