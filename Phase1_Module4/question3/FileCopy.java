package question3;

import java.io.*;
import java.util.concurrent.Callable;

public class FileCopy implements Callable<Void> {

    private File sourcePath;
    private File targetPath;

    public FileCopy(File sourcePath, File targetPath) {
        this.sourcePath = sourcePath;
        this.targetPath = targetPath;
    }


    @Override
    public Void call() throws Exception {
        copyDirectory(sourcePath, targetPath);
        return null;
    }


    public void copyDirectory(File sourcePath, File targetPath) throws IOException {

        if (sourcePath.isDirectory()) {
            if (! targetPath.exists()) {
                targetPath.mkdir();
            }
            System.out.println("当前扫描" + sourcePath.toString());

            // iterate all subfiles in sourcePath
            String[] subDirs = sourcePath.list();
            for (String subdir: subDirs) {
                // copy directory
                copyDirectory(new File(sourcePath,subdir), new File(targetPath, subdir));
                System.out.println("当前复制路径： " + subdir.toString());
            }

        } else {
            InputStream in = new FileInputStream(sourcePath);
            OutputStream out = new FileOutputStream(targetPath);
            // copy  text
            byte[] buf = new byte[1024];
            int length;
            while ((length = in.read(buf)) > 0) {
                out.write(buf, 0, length);
            }
            System.out.println("当前复制内容： " + sourcePath.toString());
            out.close();
            in.close();


        }
    }


}
