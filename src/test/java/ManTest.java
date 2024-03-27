import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ManTest {

    private static final int WALL_SIZE = 5;
    @Test
    public void testGetters() {
        int initialX = 2;
        int initialY = 3;

        Man man = new Man(initialX, initialY, WALL_SIZE);

        assertEquals(initialX, man.getPositionX(), "Initial X position is incorrect");
        assertEquals(initialY, man.getPositionY(), "Initial Y position is incorrect");
    }

    @Test
    public void testMoveUp() {
        int initialX = 2;
        int initialY = 3;

        Man man = new Man(initialX, initialY, WALL_SIZE);

        man.moveUp();
        assertEquals(initialY - 1, man.getPositionY(), "Moving up failed");
    }

    @Test
    public void testMoveDown() {
        int initialX = 2;
        int initialY = 3;
        Man man = new Man(initialX, initialY, WALL_SIZE);

        man.moveDown();
        assertEquals(initialY + 1, man.getPositionY(), "Moving down failed");
    }

    @Test
    public void testMoveLeft() {
        int initialX = 2;
        int initialY = 3;
        Man man = new Man(initialX, initialY, WALL_SIZE);

        man.moveLeft();
        assertEquals(initialX - 1, man.getPositionX(), "Moving left failed");
    }

    @Test
    public void testMoveRight() {
        int initialX = 2;
        int initialY = 3;

        Man man = new Man(initialX, initialY, WALL_SIZE);

        man.moveRight();
        assertEquals(initialX + 1, man.getPositionX(), "Moving right failed");
    }

    @Test
    public void testMoveUpWhenAtTopEdge() {
        int initialX = 2;
        int initialY = 0;
        Man man = new Man(initialX, initialY, WALL_SIZE);

        man.moveUp();
        assertEquals(initialY, man.getPositionY(), "Moving up from top edge failed");
    }

    @Test
    public void testMoveDownWhenAtBottompEdge() {
        int initialX = 2;
        int initialY = WALL_SIZE;

        Man man = new Man(initialX, initialY, WALL_SIZE);

        man.moveDown();
        assertEquals(initialY, man.getPositionY(), "Moving down from bottom edge failed");
    }

    @Test
    public void testMoveLeftWhenAtLeftEdge() {
        int initialX = 0;
        int initialY = 2;

        Man man = new Man(initialX, initialY, WALL_SIZE);

        man.moveLeft();
        assertEquals(initialX, man.getPositionX(), "Moving up from top edge failed");
    }

    @Test
    public void testMoveRightWhenAtRightEdge() {
        int initialX = WALL_SIZE;
        int initialY = 2;

        Man man = new Man(initialX, initialY, WALL_SIZE);

        man.moveRight();
        assertEquals(initialX, man.getPositionX(), "Moving up from top edge failed");
    }
}
