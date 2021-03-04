package question3;
/*
3. 编程题
  使用线程池将一个目录中的所有内容拷贝到另外一个目录中，包含子目录中的内容。 
*/


import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        File sourcePath = new File("./src/");
        File targetPath = new File( "./target_folder");

        // create thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(new FileCopy(sourcePath, targetPath));
        executorService.shutdown();
//        System.out.println(sourcePath.list());
    }
}
