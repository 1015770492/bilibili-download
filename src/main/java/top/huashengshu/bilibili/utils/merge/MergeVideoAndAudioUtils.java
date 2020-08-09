package top.huashengshu.bilibili.utils.merge;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Timer;
import java.util.concurrent.*;

public class MergeVideoAndAudioUtils {
    static ExecutorService executorService = Executors.newFixedThreadPool(50);

    public static boolean merge(String videoPath, String audioPath, String savePath) throws ExecutionException, InterruptedException {

        File directory = new File("");//设定为当前文件夹
        String currentAbsolutePath = directory.getAbsolutePath();
//        System.out.println(currentAbsolutePath);
        Runtime runtime = Runtime.getRuntime();//获取cmd窗口

        String relativePath = "src/main/java/top/huashengshu/bilibili/utils/merge/util/ffmpeg.exe";
        String ffmpegAbsolutePath = new StringBuilder(currentAbsolutePath).append("/").append(relativePath)
                .append(" -i \"").append(videoPath)
                .append("\" -i \"").append(audioPath)
                .append("\" -c copy \"").append(savePath).append("\"")
                .toString();//合并音视频文件得命令
        System.out.println(ffmpegAbsolutePath);//打印一下命令
        CompletableFuture<Process> processFuture = CompletableFuture.supplyAsync(() -> {
            Process process = null;
            try {
                process = runtime.exec(ffmpegAbsolutePath);//执行合并命令
            } catch (IOException e) {
                e.printStackTrace();
                return process;//异常返回
            }
            return process;
        }, executorService);

        Process process = processFuture.get();//获取上一个的process对象
        CompletableFuture<Boolean> mergeScuess = CompletableFuture.supplyAsync(() -> {
            while (process.isAlive()) {}//判断合并命令是否执行完成，如果完成则会跳出循环
            clearGarbageFile(videoPath);//清理垃圾文件
            clearGarbageFile(audioPath);//清理垃圾文件
            return true;
        }, executorService);
        return mergeScuess.get();//将合并结果返回
    }

    public static boolean clearGarbageFile(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();//文件存在，删除文件
        }
        return true;
    }

}
