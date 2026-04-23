class VarArgsExample1 {
    static void display(int... numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        display(1, 2, 3);
        display(10, 20);
        display(); 
    }
}


class VarArgsExample2{
    static int sum(int... nums) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));       
        System.out.println(sum(5, 10, 15, 20)); 
    }
}

class VarArgsExample3 {
    static void show(String name, int... marks) {
        System.out.print(name + " marks: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        show("Varad", 80, 85, 90);
        show("Rahul", 70, 75);
    }
}

class VarArgsOverload {
    static void fun(int... a) {
        System.out.println("Varargs method");
    }

    static void fun(int a, int b) {
        System.out.println("Normal method");
    }

    public static void main(String[] args) {
        fun(10, 20); 
        fun(1, 2, 3); 
    }
}