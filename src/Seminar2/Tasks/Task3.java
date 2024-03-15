package Seminar2.Tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\GB_GIT\\Exceptions_Seminar\\src\\Seminar2\\Tasks\\1.txt"));
        List<String> sb = new ArrayList();
        String content = br.readLine();
        while (content != null){
            sb.add(content);
            content = br.readLine();
        }
        br.close();
// ["Анна=4", "Елена=5", "Марина=6", ...]
        HashMap<String, Integer> map = new HashMap<>();
        for (String i: sb){
            String[] parts = i.split("=");
// parts = ["Анна", "4"]
            map.put(parts[0], parts[0].length());
        }
        StringBuilder output = new StringBuilder();
        FileWriter file = new FileWriter("C:\\GB_GIT\\Exceptions_Seminar\\src\\Seminar2\\Tasks\\1.txt");
        for (String name: map.keySet()){
            output.append(name).append("=").append(map.get(name)).append("\n");
        }
        file.write(String.valueOf(output));
        file.flush();
        file.close();
    }
}
