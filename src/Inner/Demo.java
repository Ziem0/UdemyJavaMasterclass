package Inner;

import java.util.ArrayList;

public class Demo {
    private Setup ann;
    private Part part;
    private static ArrayList<Setup> list = new ArrayList<>();
    private static ArrayList<Part> list2 = new ArrayList<>();

    //constructor
    private Demo(Setup ann) {
        this.ann = ann;
        this.part = createPart();
    }

///////////////////////////////////////////////////////////////////////////////////////////


    //interface
    public interface Setup {
        void print();
    }

    //method with anonymous class with interface
    private Setup someMethod() {
        Setup setup = new Setup() {     // might be just "new setup" if is attached to container
            @Override
            public void print() {
                System.out.println("This is an anonymous class");
            }
        };
        list.add(setup);   // treats like SETUP class
        return setup;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////

    //nonstatic inner class private
    private class Part {

        private boolean on;
        private String name;

        public Part(String name) {
            this.name = name;
            this.on = true;
        }
    }

    //create object with nonstatic inner class
    private Part createPart() {
        return new Part("First");
    }

    //method with inner local class
    private void forLocal() {
        class Local extends Part {
            public Local(String name) {
                super(name);
            }
        }
        Local local = new Local("lokalna");
        list2.add(local);   // local inner cant be used as a type for list, if the list is outside of this method;type extends
    }

    //method with inner anonymous class with another class extends
    private void forAnonymous() {
        Part part = new Part("PartAsExtend");
        System.out.println(part.name);
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Tool createTool() {
        return new Tool("Tool");
    }

    //nonstatic inner class private static
    private static class Tool {

        private boolean on;
        private String name;

        public Tool(String name) {
            this.name = name;
            this.on = true;
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////

    //main
    public static void main(String[] args) {
        Demo demo = new Demo(new Setup() {
            @Override
            public void print() {
                System.out.println("hello");
            }
        });
        demo.ann.print();
        Setup set = demo.someMethod();
        set.print();

        Demo.Part singlePart = demo.new Part("second");
        System.out.println(singlePart.on);
    }

}
