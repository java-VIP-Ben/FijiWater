public class BufferTester {
    public static void main(String[] args) {
        BufferWriter.writeString("hello World");
        BufferWriter.saveAndClose();

        //Read in the file 
        System.out.println(BufferWriter.readString());
    }
}
