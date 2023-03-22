package FileHandelling.FileOP;
import java.io.*;
public class FileOperations {
    public  void renameFile(String filePath, String newFileName) {
        File fileToRename = new File(filePath);
        String parentDir = fileToRename.getParent();
        String newFilePath = parentDir + File.separator + newFileName;
        File renamedFile = new File(newFilePath);

        if (renamedFile.exists()) {
            System.out.println("File with the same name already exists.");
        } else {
            if (fileToRename.renameTo(renamedFile)) {
                System.out.println("File renamed successfully.");
            } else {
                System.out.println("Error renaming file.");
            }
        }
    }

    public  void copyFile(String sourcePath, String destPath) {
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        if (destFile.exists()) {
            System.out.println("Destination file already exists.");
        } else {
            try {
                java.nio.file.Files.copy(sourceFile.toPath(), destFile.toPath());
                System.out.println("File copied successfully.");
            } catch (IOException e) {
                System.out.println("Error copying file.");
                e.printStackTrace();
            }
        }
    }

    public  void listContents(String dirPath) {
        File dir = new File(dirPath);
        File[] files = dir.listFiles();

        if (files == null) {
            System.out.println("Invalid directory path.");
            return;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("📂 " + file.getName());
            } else {
                System.out.println("📝 " + file.getName());
            }
        }
    }
}


