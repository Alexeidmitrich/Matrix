package demo.demostrings;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        //readFile("plan.txt");
        //readBuffered("testHomeWork","перевод строки в байты 1111111");
        /*try {
            fileWrite("testHomeWork","перевод строки в байты");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/
        //charWrite("testHomeWork","перевод строки в байты !!!!!");
        //bufferedWrite("testHomeWork", "перевод строки в байты !!!!!");
        //printWrite("testHomeWork", "перевод строки в байты !!!!!+++++");

        //readStringAnyFormat();
        /*try {
            SequenceRead();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
        try {
            enterFileNameAndData("9;a;8;b;9;c;8 test.txt test1.txt");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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

    public static void readBuffered(String fileName, String text) {
        File file = new File(fileName);
        try (FileOutputStream out = new FileOutputStream(file);
             BufferedOutputStream bos = new BufferedOutputStream(out)) {
            bos.write(text.getBytes());
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void fileWrite(String fileName, String text) throws Exception {
        File f = new File(fileName);
        if (!f.exists()) {
            f.createNewFile();
        }
        FileWriter fWriter = new FileWriter(f);
        fWriter.write(text);
        fWriter.close();
    }

    public static void charWrite(String fileName, String text) {
        File file = new File(fileName);
        try (CharArrayWriter cWriter = new CharArrayWriter();
             FileWriter fw = new FileWriter(file)) {
            cWriter.append(text);
            fw.write(cWriter.toCharArray());
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void bufferedWrite(String fileName, String text) {
        File file = new File(fileName);
        try (FileWriter fw = new FileWriter(file.getAbsoluteFile());
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(text);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void printWrite(String fileName, String text) {
        File file = new File(fileName);
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void readStringAnyFormat() {
        File file = new File("readString.txt");
        StringBuilder sb = new StringBuilder();
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file));

            ) {
                String line;
                String dateRegex = "(^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)|" +
                        "(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))|(((19|2[0-9])[0-9]{2})-(0[13578]|" +
                        "10|12)-(0[1-9]|[12][0-9]|3[01]))|(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))T(2[0-3]|" +
                        "[01][0-9]):([0-5][0-9]):([0-5][0-9])(\\.[0-9]+)?(Z|[-+][0-9]{2}:[0-9]{2})$)";
                //String regex2 = "^([0-9]+){2,4}(;[A-Za-z]{3}|[0-9]{2})?;" + dateRegex + ";[A-Za-z0-9]*[0-9]{2,}[A-Za-z0-9]*?$"
                String regex2 = "^(\\d{2,4})(?:;|^)((\\w{3}|\\d{2})(?:;|^))?" + dateRegex + "(?:;|^)([A-Za-z0-9]*[0-9]{2,}[A-Za-z0-9]*?)$";
                while ((line = br.readLine()) != null) {
                    final Pattern pattern = Pattern.compile(regex2, Pattern.MULTILINE);
                    final Matcher matcher = pattern.matcher(line);
                    if (matcher.find()) {
                        System.out.println(line);
                        sb.append(line);
                        sb.append(System.lineSeparator());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (sb.length() > 0) {
                try (FileWriter fWriter = new FileWriter("readStringCopy.txt", true)) {
                    fWriter.write(sb.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("file doesn't exist");
        }
    }


    public static void readFile(String fileName) {
        File file = new File(fileName);
        try (InputStream is = new FileInputStream(file)) {
            int k = is.available() / 4;
            printByte(is, k * 2, k / 4);
            System.out.printf("Доступно для чтения %d байт  \nБудем сейчас циклом %d байт\n"
                    , is.available(), k);
            printByte(is, k * 4, k / 4);
            System.out.printf("Доступно для чтения %d байт  \nБудем сейчас циклом %d байт\n"
                    , is.available(), k);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void SequenceRead() throws IOException {
        File file = new File("readString.txt");
        File file1 = new File("readStringCopy.txt");
        File file2 = new File("Third.txt");
        SequenceInputStream sis = null;
        FileInputStream fs = new FileInputStream(file);
        FileInputStream fs1 = new FileInputStream(file1);
        FileInputStream fs2 = new FileInputStream(file2);
        Vector<FileInputStream> vector = new Vector<FileInputStream>();
        vector.add(fs);
        vector.add(fs1);
        vector.add(fs2);
        Enumeration<FileInputStream> enu = vector.elements();
        sis = new SequenceInputStream(enu);
        int i = 0;
        while ((i = sis.read()) != -1) {
            System.out.print((char) i);
        }
    }

    private static void printByte(InputStream is, int start, int end) throws IOException {
        int k = is.available() / 4;
        byte[] b = new byte[k];
        if ((is.read(b, k * start, k / end) != k)) {
            for (int i = 0; i < b.length; i++) {
                System.out.println((char) (b[i]));
            }
        }
    }

    public static void enterFileNameAndData(String data) throws Exception {
        String regex = "^([;\\d|\\w]+\\s+)([a-z0-9.a-z\\s]*||[\\\\s+a-z0-9.a-z]*)$";
        final Pattern pat = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher mat = pat.matcher(data);
        if (mat.find()) {
            String bb = mat.group(1);
            String s = bb.replaceAll("\\D+", "\n");
            System.out.println(s);
            String b = bb.replaceAll("[;0-9]+", "\n");
            System.out.println(b);
            String hh = mat.group(2);
            String[] bn = hh.split("\s");
            for (int i = 0; i < bn.length / 2; i++) {
                String mk = bn[i];
                FileWriter fWriter = new FileWriter(mk);
                fWriter.write(s);
                fWriter.close();
            }
            for (int i = bn.length / 2; i < bn.length; i++) {
                String ko = bn[i];
                FileWriter fWriter = new FileWriter(ko);
                fWriter.write(b);
                fWriter.close();
                }
            }
        }
}