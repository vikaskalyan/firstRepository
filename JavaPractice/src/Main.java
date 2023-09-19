//public class Main  {
//    public static void main(String[] args) {
//        int rows = 5;
//        for(int i = 1; i <= rows; i++){
//
//            for(int j = 1; j <= rows -i; j++){
//
//                System.out.print(" ");
//            }
//            for(int k = 1; k <= 2 * i - 1; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
import java.io.File;

public class Main {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\Admin"; // Replace with the actual directory path
        File directory = new File(directoryPath);

        if (directory.isDirectory()) {
            int fileCount = 0;
            int directoryCount = 0;

            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        fileCount++;
                    } else if (file.isDirectory()) {
                        directoryCount++;
                    }
                }
                System.out.println("Number of files: " + fileCount);
                System.out.println("Number of directories: " + directoryCount);
            }
        } else {
            System.out.println("The provided path is not a directory.");
        }
    }
}


