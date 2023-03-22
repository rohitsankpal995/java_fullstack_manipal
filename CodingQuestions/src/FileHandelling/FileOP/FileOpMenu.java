package FileHandelling.FileOP;

import java.util.Scanner;

import static FileHandelling.FileOP.FileOperations.*;

public class FileOpMenu {
    public void performAction() {
        Scanner scanner = new Scanner(System.in);
        FileOperations op = new FileOperations();
        int choice;
        do {
            System.out.println("Select an option:");
            System.out.println("1. Rename");
            System.out.println("2. Copy");
            System.out.println("3. List Content");
            System.out.println("4. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter file path to be renamed:");
                    String filePath = scanner.nextLine();
                    System.out.println("Enter new file name:");
                    String newFileName = scanner.nextLine();
                    op.renameFile(filePath, newFileName);
                    break;
                case 2:
                    System.out.println("Enter source file path:");
                    String sourcePath = scanner.nextLine();
                    System.out.println("Enter destination file path:");
                    String destPath = scanner.nextLine();
                    op.copyFile(sourcePath, destPath);
                    break;
                case 3:
                    System.out.println("Enter directory path:");
                    String dirPath = scanner.nextLine();
                    op.listContents(dirPath);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }


        }while (choice != 4);
            scanner.close();
    }

}
