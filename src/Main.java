import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) {
        String str = "Hello world!";

        byte key = 12;

        byte[] bytesStr = str.getBytes();
        byte[] bytesStrNew = coding(bytesStr, key);

        try {
            String strN = new String(bytesStrNew, "UTF-8");
            System.out.println(strN);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        try {
            String strN = new String(decoding(bytesStrNew, key), "UTF-8");
            System.out.println(strN);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private static byte[] coding(byte[] data, byte key){
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (data[i]+key);
        }
        return data;
    }

    private static byte[] decoding(byte[] data, byte key){
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (data[i]-key);
        }
        return data;
    }
}


