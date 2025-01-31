import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;

/**
 * 
 */
public class StackTest {
    private Stack stack;
    
    @Before
    public void setUp(){
        stack = new Stack<>();       
    }

    @Test
    public void shouldBeAbleToPush(){
        stack.push(11);
        assertEquals(stack.getLast().getValue(), 11);
    }

    @Test
    public void shouldBeAbleToPop(){
        stack.push(11);
        stack.push(5);
        assertEquals(stack.pop(), 5);
    }

    @Test
    public void shoulNotBeAbleToPop(){
        assertEquals(stack.pop(), null);
    }

    @Test
    public void shouldBeAbleToAdd(){
        assertEquals(stack.operation('+', 5, 10), 15);
    }
    
    @Test
    public void shouldBeAbleToRest(){
        assertEquals(stack.operation('-', 5, 10), -5);
    }

    @Test
    public void shouldBeAbleToMultiply(){
        assertEquals(stack.operation('*', 5, 10), 50);
    }

    @Test
    public void shouldBeAbleToDivide(){
        assertEquals(stack.operation('/', 10, 5), 2);
    }

    @Test
    public void shouldBeAbleToMod(){
        assertEquals(stack.operation('%', 10, 7), 3);
    }

}
