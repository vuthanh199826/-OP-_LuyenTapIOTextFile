import java.io.*;

public class Manage {
    public void copyFile() throws IOException {
        File file1 = new File("D://file1.txt");
        file1.createNewFile();
        File file2 = new File("D://file2.txt");
        file2.createNewFile();
        FileWriter fileWriter1 = new FileWriter(file1.getAbsolutePath(),true);
        BufferedWriter bufferedWriter1 = new BufferedWriter(fileWriter1);
        for (int i = 0; i < 10; i++) {
            bufferedWriter1.write("" + i + "\n");
        }
        bufferedWriter1.close();
        fileWriter1.close();
        FileReader fileReader1 = new FileReader(file1.getAbsolutePath());
        BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
        FileWriter fileWriter2 = new FileWriter(file2.getAbsolutePath(),true);
        BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter2);
        String line;
        System.out.println("Data file 1:");
        while ((line = bufferedReader1.readLine())!=null){
            bufferedWriter2.write(line +"\n");
            System.out.println(line);
        }
        bufferedWriter2.close();
        fileWriter2.close();
        bufferedReader1.close();
        fileReader1.close();
        FileReader fileReader2 = new FileReader(file2.getAbsolutePath());
        BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
        String line2;
        System.out.println("Data file 2:");
        while ((line2 = bufferedReader2.readLine())!=null){
            System.out.println(line2);
        }
        bufferedReader2.close();
        fileReader2.close();
    }
}
