import java.util.Scanner;

public class TestSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number > 7) {
            System.out.println("Hello");
        }

        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        if ("John".equalsIgnoreCase(name)) {
            System.out.println("Hello, John");
        } else {
            System.out.println("There is no such name");
        }

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Array elements that are multiples of 3:");
        for (int element : array) {
            if (element % 3 == 0) {
                System.out.print(element + " ");
            }
        }
    }
}

// Answer Task 2.
// No. All brackets should be closed I think that the correct answer is [((())()(()))] or [[(())()(())]]