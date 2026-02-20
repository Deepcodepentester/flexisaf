// Demonstration of Nested Classes, Access Modifiers, and Anonymous Classes

class OuterClass {

    // Access modifiers
    private String privateMessage = "Private Message";
    protected String protectedMessage = "Protected Message";
    public String publicMessage = "Public Message";
    String defaultMessage = "Default Message"; // package-private

    // Static Nested Class
    static class StaticNestedClass {
        public void display() {
            System.out.println("Inside Static Nested Class");
        }
    }

    // Inner (Non-static) Class
    class InnerClass {
        public void showMessages() {
            // Inner class can access all members of outer class
            System.out.println(privateMessage);
            System.out.println(protectedMessage);
            System.out.println(publicMessage);
            System.out.println(defaultMessage);
        }
    }

    // Method that accepts a Greeting interface
    public void greet(Greeting greeting) {
        greeting.sayHello();
    }
}

// Interface for Anonymous Class
interface Greeting {
    void sayHello();
}

public class NestedClassDemo {

    public static void main(String[] args) {

        // Accessing Outer Class
        OuterClass outer = new OuterClass();

        System.out.println("Accessing public member: " + outer.publicMessage);
        System.out.println("Accessing protected member: " + outer.protectedMessage);
        System.out.println("Accessing default member: " + outer.defaultMessage);

        // Cannot access private member directly
        // System.out.println(outer.privateMessage); // ERROR

        System.out.println("\n--- Static Nested Class ---");
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.display();

        System.out.println("\n--- Inner Class ---");
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.showMessages();

        System.out.println("\n--- Anonymous Class ---");
        outer.greet(new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Class!");
            }
        });
    }
}