package question2;


/*实现将指定目录中的所有内容删除，包含子目录中的内容都要全部删除。 */

import java.io.File;
import java.io.IOException;

public class Question2 {

    /**
     * The proposed folder structure
     * folder0  ___ file1.txt
     *         |
     *         |___ folder1  ___ folder2  ___ file2.txt
     *
     */


    // init a directory with files and subdirectories
    public static File initDir(String path) throws IOException {
        File file1 = new File(path + "/folder1/folder2/");
        File file2 = new File(path + "/file1.txt");
        File file3 = new File(path + "/folder1/folder2/file2.txt");

        if (file1.exists()) {
            file1.delete();
        }
        file1.mkdirs();
        if (file2.exists()) {
            file2.delete();
        }
        file2.createNewFile();
        if (file3.exists()) {
            file3.delete();
        }
        file3.createNewFile();

        return new File(path);
    }


    // delete files recursively
    public static void deleteDir(File file) throws IOException {
        if (file.isFile()) {
            if (file.delete()) {
                System.out.println("文件" + file.getName() + "已被删除");
            }
        }

        if (file.isDirectory()) {
            File[] subfiles = file.listFiles();

            for (File subfile : subfiles) {
                deleteDir(subfile);
            }
            if (file.delete()) {
                System.out.println("文件夹" + file.getName() + "已被删除");
            }
        }
    }


    public static void main(String[] args) {
        String path = "./folder0";
        File myFolder = null;
        try {
            myFolder = initDir(path);
            deleteDir(myFolder);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // recover the most outside folder
        File fileNew = new File(path);
        fileNew.mkdir();

    }
}
