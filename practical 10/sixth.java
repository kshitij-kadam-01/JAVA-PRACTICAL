//demonstrating this and super class
class College {
    int strength = 1000;
}

class Classes extends College {
    int strength = 50;

    void show() {
        System.out.println(this.strength);  // child variable
        System.out.println(super.strength); // parent variable
    }
}

class Main {
    public static void main(String[] args) {
        Classes obj = new Classes();
        obj.show();
    }
}