package lesson12.jbchapter3.task36;

import java.io.File;

//Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
//должны быть распечатаны отдельно.
public class Task36 {
    public static void main(String[] args) {
        String[] pathsFilesAndDir;
        try {
            File pathDir = new File("freeIT/src/lesson12/jbchapter3/task36");
            pathsFilesAndDir = pathDir.list();
            if (pathsFilesAndDir != null) {
                for (String path : pathsFilesAndDir) {
                    System.out.println(path);
                    File pathFiles = new File(pathDir + "/" + path);
                    if (pathFiles.isDirectory()) {
                        String[] files = pathFiles.list();
                        if (files != null) {
                            for (String file : files) {
                                System.out.println("\t" + file);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
