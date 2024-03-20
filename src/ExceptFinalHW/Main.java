package ExceptFinalHW;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ParseData parseData = new ParseData();
        WriteFile writeFile = new WriteFile();
        HashMap<String, Object> data = parseData.parseInputData();


        while (data.size() != 6) {
            try {
                throw new DataException();
            } catch (DataException e) {
                data = parseData.parseInputData();
            }
        }

        String newFileName = data.get("1") + ".txt";
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append("<").append(data.get(str)).append("> ");
        }


        System.out.println(newFileName + ": " + sb);
        writeFile.writeData(String.valueOf(sb), newFileName);

    }
}
