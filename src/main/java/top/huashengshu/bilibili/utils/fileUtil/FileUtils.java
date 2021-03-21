package top.huashengshu.bilibili.utils.fileUtil;

import java.io.File;

public class FileUtils {


    public static void main(String[] args) {
        String sourceDir = "D:/尚硅谷";
        String delStr = "尚硅谷2020最新版宋红康JVM教程更新至中篇(java虚拟机详解，jvm从入门到精通)-pn204-p200-";
        String contain="-80";
        renameFile(sourceDir, delStr, contain);

    }

    private static void renameFile(String sourceDir, String delStr, String contain) {
        File dir = new File(sourceDir);
        File[] files=dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            File f=files[i];
            String name = f.getName();
            String substring = name.substring(delStr.length());
            String finalname = substring.replaceAll(contain, "");
            String finalNameWithDir=sourceDir+"\\"+finalname;//新的路径

            f.renameTo(new File(finalNameWithDir));//重命名
        }
    }

}
