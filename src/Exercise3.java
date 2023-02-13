
public class Exercise3 {

    static class Pair<E> {
        E element1, element2;

        public Pair(E e1, E e2) {
            element1 = e1;
            element2 = e2;
        }

        public void changeOrder() {
            E temp = this.element1;
            element1 = this.element2;
            element2 = temp;
        }

        @Override
        public String toString() {
            return "(" + element1.toString() + ", " + element2.toString() + ")";
        }
    }

    public static void main(String[] args) {
        Pair<String> pair = new Pair<String>("aaaa", "bbbb");
        pair.changeOrder();
        System.out.println(pair);
    }
}
