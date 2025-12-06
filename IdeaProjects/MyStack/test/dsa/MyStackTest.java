package dsa;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class MyStackTest {

    @Test
    public void testThatStackIsEmpty() {
        MyStack stack = new MyStack();
        assertEquals(0, stack.size());
        assertTrue(stack.isEmpty());
    }
    @Test
    public void testThatYouCanAddElement() {
        MyStack stack = new MyStack();
        stack.push("Apple");
        assertEquals(1, stack.size());
        assertFalse(stack.isEmpty());
    }
    @Test
    public void testThatYouAddTwoElements() {
        MyStack stack = new MyStack();
        stack.push("Dog");
        stack.push("Cat");
        assertEquals(2, stack.size());
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testThatYouCanRemoveElement() {
        MyStack stack = new MyStack();
        stack.push("Apple");
        stack.push("Dog");
        stack.pop("Dog");
        assertEquals(1, stack.size());
        assertFalse(stack.isEmpty());
    }
    @Test
    public void testThatYouPeekElement() {
        MyStack stack = new MyStack();
        stack.push("Apple");
        stack.push("Dog");
        stack.peek("Apple");
        assertEquals(2, stack.size());
        assertFalse(stack.isEmpty());
    }
    @Test
    public void testThatMyStackIsFull() {
        MyStack stack = new MyStack();
        stack.push("Apple");
        stack.push("Dog");
        stack.push("Cat");
        stack.push("Banana");
        stack.push("Goat");
        assertEquals(5, stack.size());
        assertTrue(stack.isFull());
    }
}

