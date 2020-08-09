package top.huashengshu.bilibili.utils.merge;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeVideoAndAudioUtils {
    static ExecutorService executorService = Executors.newFixedThreadPool(50);

    public static boolean merge(Future<Boolean> vflag, Future<Boolean> aflag, String videoPath, String audioPath, String savePath) {

        try {
            if (vflag.get() == true && aflag.get() == true) {//判断视频和音频是否下载完成
                System.out.println("开始合并" + videoPath + " 与 " + audioPath);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        File directory = new File("");//设定为当前文件夹
        String currentAbsolutePath = directory.getAbsolutePath();
        System.out.println(currentAbsolutePath);
        Runtime runtime = Runtime.getRuntime();

        String relativePath = "src/main/java/top/huashengshu/bilibili/utils/merge/util/ffmpeg.exe";
        String ffmpegAbsolutePath = new StringBuilder(currentAbsolutePath).append("/").append(relativePath)
                .append(" -i ").append(videoPath)
                .append(" -i ").append(audioPath)
                .append(" -c copy ").append(savePath)
                .toString();
        System.out.println(ffmpegAbsolutePath);
        Future<Boolean> booleanFuture = executorService.submit(() -> {
            try {
                Process process = runtime.exec(ffmpegAbsolutePath);//执行合并命令
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
            while (true) {
                File file = new File(savePath);
                if (file.exists()) {
                    System.out.println("合并成功");

                    File vfile = new File(videoPath);
                    File afile = new File(audioPath);

                    if (vfile.exists()) {
                        vfile.delete();
                    }
                    if (afile.exists()) {
                        afile.delete();
                    }
                    break;
                }
            }
            return true;
        });

        Boolean aBoolean = null;
        try {
            aBoolean = booleanFuture.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return aBoolean;

    }

    public static boolean clearGarbageFile() {

        return true;
    }

}
