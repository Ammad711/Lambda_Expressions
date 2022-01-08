package work;

@FunctionalInterface                // This is optional to write functional interface.
public interface MyInterface {
    public abstract void  sayHello();
}


// Ways of implementing functional interface:-
// 1) Create separate class and implements this interface
// 2) Anonymous class for implementing interface
// 3) By using lambda expressions