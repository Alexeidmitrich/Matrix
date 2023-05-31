package demo.demostrings;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class StringHomeWork {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Введите номер билета ");
        //String number = sc.nextLine();
        //sumTicket(number);
        //String n = sc.nextLine();
        //deleteZero(n);
        //System.out.println("Введите путь к файлу ");
        //String directory = "./"; /// sc.nextLine();
        //printDirectoryContent(directory);
        /*String file = sc.nextLine();
        String copyFile = "C:/Users/alexe/Downloads/Задание_12_1.pdf";
        try {
            fileCopy(file, copyFile);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/
       /* System.out.println("Введите текст ");
        String text = sc.nextLine();
        try {
            makeFileWriteWithFileOutputStream(text);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/
        readFile("plan.txt");
    }

    public static boolean sumTicket(String number) {
        if (number == null || number == " ") {
            return false;
        }
        int sumleft = 0;
        int sumRight = 0;
        String[] st = number.split(" ");
        for (String s : st) {
            StringBuilder sr = new StringBuilder(s);
            for (int i = 0; i < sr.length() / 2; i++) {
                sumleft += sr.charAt(i) - '0';
            }
            for (int i = sr.length() / 2; i < sr.length(); i++) {
                sumRight += sr.charAt(i) - '0';
            }
        }
        if (sumleft == sumRight) {
            System.out.println(" Этот билет счастливый");
        } else {
            System.out.println("Повезет в следующий раз");
            return false;
        }
        return true;
    }

    public static String deleteZero(String n) {
        if (n == null) {
            return "";
        }
        String result = n.replaceAll("0", "");
        System.out.println(result);
        return result;
    }

    public static void printDirectoryContent(String directory) {
        File f = new File(directory);
        String[] filesInDirectory = f.list();
        for (String name : filesInDirectory) {
            String innerFileName = directory + "/" + name;
            File innerFile = new File(innerFileName);
            if (innerFile.isDirectory()) {
                System.out.println(innerFileName);
                printDirectoryContent(innerFileName);
            } else {
                System.out.println(" ----- " + innerFile.getName());
            }
        }
    }

    public static void fileCopy(String file, String copyFile) throws Exception {
        File f = new File(file);
        File copyF = new File(copyFile);
        if (!f.exists()) {
            f.createNewFile();
            System.out.println("Файл создан!");
        } else {
            Files.copy(f.toPath(), copyF.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Файл скопирован успешно");
        }
    }

    public static void makeFileWriteWithFileOutputStream(String fileName, String text) throws Exception {
        File file = new File(fileName);
        FileOutputStream out = new FileOutputStream(file);
        if (Objects.nonNull(text)) {
            out.write(text.getBytes());
        } else {
            System.out.println("Text is null");
        }
        out.close();

    }

    public static void makeFileWriteWithByteArrayOutStream(String fileName, String text) {
        File file = new File(fileName);
        try (ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
             FileOutputStream fos = new FileOutputStream(file)) {
            byteOut.write(text.getBytes());
            fos.write(byteOut.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFile(String fileName) {
        File file = new File(fileName);
        try (InputStream is = new FileInputStream(file)) {
            int k = is.available() / 4;
            printByte(is, k * 2, k / 4, k);
            printByte(is, k * 4, k / 4, k);
            System.out.printf("Доступно для чтения %d байт  \nБудем сейчас циклом %d байт\n"
                    , is.available(), k);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printByte(InputStream is, int start, int end, int k) throws IOException {
        byte[] b = new byte[k];
        start = k * start;
        end = k / end;
        if ((is.read(b, start, end) != k)) {
            for (int i = 0; i < b.length; i++) {
                System.out.println((char) (b[i]));
            }
        }
    }
}