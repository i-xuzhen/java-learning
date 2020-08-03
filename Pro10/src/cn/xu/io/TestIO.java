package cn.xu.io;

/**
 * 测试IO,
 * 文件：存储数据的地方
 * 字节流、字符流
 * CommonsIO将客户需求转成代码，先将这个已有的代码拿来用
 * 学习本章：先重点关注功能（将客户需求转成代码），不要关注技术（技术属于架构师做的事）
 *
 *
 * File           文件类
 * InputStream    字节输入流
 * OutputStream   字节输出流
 * Reader         字符输入流
 * Writer         字符输出流
 * Closeable      关闭流接口  ：文件不是存到JAVA里面，而是存在硬盘上，硬盘又需要通过操作系统去操作，所以JAVA需要跟操作系统交流
 *                              JAVA告诉操作系统可以释放对文件的资源
 * Flushable      刷新流接口 : 流就类似管道，避免堵塞，需要强制刷新
 * Serializable   序列化接口 : 一切皆对象，将对象存储到文件里面称为序列化，将对象还原称为反序列化

 一切以程序为中心
 输入流：数据源到程序 InputStream   Reader
 输出流：程序到目的地 OutputStream  Writer

 节点流：直接从数据源或目的地读写数据
 处理流：不直接到数据源或目的地，是其他流进行封装。目的主要是简化操作和提高性能
 二者之间的关系：节点流处于io操作的第一线，所有操作必须通过他们进行，没有节点流就没有处理流
                 处理流可以对其他流进行处理（提高效率或操作灵活性）
 */
public class TestIO {
    public static void main(String[] args) {

    }
}
