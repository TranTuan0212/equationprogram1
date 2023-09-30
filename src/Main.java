package equationprogram;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager(); // Create an instance of the Manager class
        while (true) {
            int choice = manager.menu();
            switch (choice) {
                case 1:
                    manager.superlativeEquation();
                    break;
                case 2:
                    manager.quadraticEquation();
                    break;
                case 3:
                    return;
            }
        }
    }
}
