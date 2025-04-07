package Practice;

class Demo {
    static int x = initializeX();

    static {
        System.out.println("😎 1st Static block executed");
    }
    static {
        System.out.println("😎 2nd Static block executed");
    }

    static int initializeX() {
        System.out.println("🥲 Static variable initialized");
        return 42;
    }

    public static void main(String[] args) {
        System.out.println("❤️ Main method runs");
    }
}
