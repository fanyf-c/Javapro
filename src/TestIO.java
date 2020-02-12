import jdk.internal.util.xml.impl.Input;

import java.io.*;


/**
 * Created by yufeng on 2020/2/12.
 */
public class TestIO {
    public static void main(String[] args){
        File file=new File("d:/TestIO.java");
        /*
        OutputStream outputStream= null;
        String a="abcd";
        try {
            outputStream = new FileOutputStream(file,true);
            outputStream.write(a.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        InputStream inputStream=null;
        try {
            inputStream=new FileInputStream(file);
            byte[] a=new byte[2];
            int b=inputStream.read(a);
            while (b!=-1){
                System.out.println("读取字节数"+b);
                System.out.println( new String(a,0,b));
                b=inputStream.read(a);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(inputStream!=null){
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        char [] chars=new char[5];
        Reader reader= null;
        BufferedReader bufferedReader=null;
        try {
            reader=new FileReader(file);
            bufferedReader=new BufferedReader(reader);
            String str =bufferedReader.readLine();
            while (str!=null){
                System.out.println( str);
                str=bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(bufferedReader!=null){
                    bufferedReader.close();
                }
                if(reader!=null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        Writer writer=null;
        try {
            writer=new FileWriter(file,true);
            writer.write("abcd");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(writer!=null){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
