package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class FileReader {

    public void readFile() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        Enumeration<URL> resources = classLoader.getResources("");
        while (resources.hasMoreElements()) {
            URL url = resources.nextElement();
            System.out.println(url);
        }
        File file = new File(classLoader.getResource("file/names.txt").getFile());



      /*  ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names.txt").getFile());
        // System.out.println(file.getPath());
        // Path path = Paths.get(file.getPath());
        // Path path = Paths.get("file/nofile.txt");

        try(Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))) {
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("something is wrong! Error: " + e);
        }
        finally {
            System.out.println("I am gonna be here.. always!");
        }*/

        }


}
