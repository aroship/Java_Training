import java.io.IOException;

public class NotamExtractFromFile {
    public static void main(String[] args) throws IOException {
        NotamProcessor notamProcessor = new NotamProcessor();
        notamProcessor.processNotams("./output.txt");
    }
}