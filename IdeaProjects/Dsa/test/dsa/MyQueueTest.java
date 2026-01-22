package dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyQueueTest {

    @Test
    public void testThatQueue_isEmpty() {
        MyQueue queue = new MyQueue();
        assertEquals(0, queue.size());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testThatYouCanAddOneElementToQueue_andQueueIsNotEmpty() {
        MyQueue queue = new MyQueue();
        assertEquals(1,queue.size());
        assertFalse(queue.isEmpty());
    }


}
