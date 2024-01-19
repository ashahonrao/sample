package org.example;

import java.io.*;


public class App {
    public static void main(String[] args) {
        // read a file
        App app = new App();
        String content = null;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Test Projects\\Test\\input.txt"));
            FileWriter fileWriter = new FileWriter("C:\\Test Projects\\Test\\output.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line;
            String reversedStr="";
            while((line=reader.readLine()) != null){
                reversedStr = app.reverseString(line);
                if(reversedStr!=null && !reversedStr.isEmpty()){
                    bufferedWriter.write(reversedStr);
                    bufferedWriter.newLine();
                }

            }
            bufferedWriter.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public String reverseString(String str){
        if(str == null || str.isEmpty()){
            throw new IllegalArgumentException("invalid input...");
        }
        if(str.length() == 1){
            return str;
        }
        char[] arr = str.toCharArray();
        int start = 0;
        int end = str.length()-1;
        char temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(arr);
    }

}
