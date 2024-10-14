public class DadosPessoa {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        eu.setName("Bruno");
        eu.setAge(27);

        System.out.println("Meu nome é " + eu.getName() + " e a minha idade é " + eu.getAge());


    }

    public static class Pessoa {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
