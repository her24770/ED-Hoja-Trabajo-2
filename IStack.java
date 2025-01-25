/*
 * Interface para la clase Stack, que contiene los metodos push, pop y operation
 */
public interface IStack {
    void push(int value);
    int pop();
    int operation(char operator, int value1, int value2);
}