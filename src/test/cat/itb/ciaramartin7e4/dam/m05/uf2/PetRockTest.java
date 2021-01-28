package cat.itb.ciaramartin7e4.dam.m05.uf2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetRockTest {
    PetRock rocky = new PetRock("Rocky");

    @Test
    public void getName() throws Exception {
        assertEquals("Rocky",rocky.getName());
    }
    @Test
    public void testUnhappyToStart() throws Exception{
        assertFalse(rocky.isHappy());
    }
    @Test
    public void testHappAfterPlay() throws Exception{
        rocky.playWithRocky();
        assertTrue(rocky.isHappy());
    }

}