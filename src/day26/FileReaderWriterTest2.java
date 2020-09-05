package day26;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 一、流的分类：
 * 1.操作数据单位：字节流、字符流
 * 2.数据的流向：输入流、输出流
 * 3.流的角色：节点流、处理流
 *
 * 二、流的体系结构
 * 抽象基类          节点流（或文件流）                                   缓冲流（处理流的一种）Buffere
 * InputStream      FileInputStream   (read(byte[] buffer))           BufferedInputStream (read(byte[] buffer))
 * OutputStream     FileOutputStream  (write(byte[] buffer,0,len)     BufferedOutputStream (write(byte[] buffer,0,len) / flush()
 * Reader           FileReader (read(char[] cbuf))                    BufferedReader (read(char[] cbuf) / readLine())
 * Writer           FileWriter (write(char[] cbuf,0,len)              BufferedWriter (write(char[] cbuf,0,len) / flush()
 *
 *  File类的获取功能
 *  public String getAbsolutePath():获取绝对路径
 *  public String getPath() :获取路径
 *  public String getName() :获取名称
 *  public String getParent():获取上层文件目录路径。若无，返回null
 *  public long length() :获取文件长度(即:字节数)。不能获取目录的长度。
 *  public long lastModified() :获取最后一次的修改时间，毫秒值
 *  public String[] list() :获取指定目录下的所有文件或者文件目录的名称数组
 *  public File[] listFiles() :获取指定目录下的所有文件或者文件目录的File数组
 *
 * File类的判断功能
 *  public boolean isDirectory():判断是否是文件目录  public boolean isFile() :判断是否是文件
 *  public boolean exists() :判断是否存在
 *  public boolean canRead() :判断是否可读
 *  public boolean canWrite() :判断是否可写  public boolean isHidden() :判断是否隐藏
 *
 *      File 类的使用:常用方法
 *
 * File类的创建功能
 *  public boolean createNewFile() :创建文件。若文件存在，则不创建，返回false  public boolean mkdir() :创建文件目录。如果此文件目录存在，就不创建了。
 * 如果此文件目录的上层目录不存在，也不创建。
 *  public boolean mkdirs() :创建文件目录。如果上层文件目录不存在，一并创建
 *
 * File类的删除功能
 *  public boolean delete():删除文件或者文件夹
 * 删除注意事项:
 * Java中的删除不走回收站。 要删除一个文件目录，请注意该文件目录内不能包含文件或者文件目录
 */
public class FileReaderWriterTest2 {

    public static void main(String[] args) {
        File file = new File("hello.txt"); //相较于当前工程
        System.out.println(file.getAbsolutePath());

        File file1 = new File("day23\\hello.txt");
        System.out.println(file1.getAbsolutePath());


    }


    @Test
    public void testFileReader() throws IOException {
        //1.实例化File类的对象，指明要操作的文件
        File file= new File("day26\\hello.txt"); //相较于当前Module
        //2.提供具体的流
//        FileReader fr = new FileReader(file);
        FileReader fr = new FileReader(file);

        //3.数据的读入

        int data = fr.read();
        while (data != -1){
            System.out.println((char)data);
            data =fr.read();
        }
        fr.close();
    }


    @Test
    public void testFileWriter() throws IOException{
        //1.提供File类的对象，指明写出到的文件
        File file = new File("hello.txt");

        //2.提供FileWriter的对象，用于数据的写出
        FileWriter fw = new FileWriter(file);

        //3.写出的操作
        fw.write("I have a dream!\n");
        fw.write("you need to have a dream!\n");
    }


}
