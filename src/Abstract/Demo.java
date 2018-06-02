package Abstract;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    private String name;
    private List<Sub> box;
    private List<Iadd> Ibox;

    private Demo(String name) {
        this.name = name;
        this.box = new ArrayList<>();
    }

    public void create() {
        for (int i = 0; i < 5; i++) {
            box.add(new Sub(i + ""));
        }
    }


    public class Sub implements Iadd{
        private String text;

        private Sub(String text) {
            this.text = text;
        }

        public String toString() {
            print();
            return text;
        }

        @Override
        public void print() {
            System.out.println("Sub with Iadd");
        }
    }


    public interface Iadd {
        String Iname = "Iname";

        void print();
    }

    public static void main(String[] args) {
        Demo demo = new Demo("demko");
        demo.create();

        for (Sub sub : demo.box) {
            System.out.println(sub);
        }
    }
}
