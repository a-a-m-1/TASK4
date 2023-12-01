import java.io.*;

public class InputStream {
    public static void main(String[] args) throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("studentsEN.txt")) {
            try (FileWriter fw = new FileWriter(("studentsEN5.txt")) {
                String line;
                while((line =bufferedReader.readLine())!=null)

                {
                    String[] words = line.split("\\s+");
                    String surname = words[0].trim();
                    String name = words[1].trim();
                    String score = words[2].trim();
                    if (score.equals("5")) {
                        fw.write(surname + "\s" + name + "\s" + score + "\n");
                    }
                }
            }) {
                System.out.println("Error IO");
            }
        }




    }
}
