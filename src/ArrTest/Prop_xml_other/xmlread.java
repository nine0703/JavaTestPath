package Made_in_Fri_Mar.Prop_xml_other;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;


public class xmlread {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(xmlread.class);
        logger.info("hello world!");
        String filePath = "src/Made_in_Fri_Mar/Prop_xml_other/user.xml1";
        try (
            FileReader frd = new FileReader(filePath);
            ) {
            SAXReader srd = new SAXReader();
            Document read = srd.read(frd);  // 获取document对象
            Element root = read.getRootElement();   // 获取根对象
            List<Element> list =  root.elements();  // 储存根下的全部标签元素
            for (Element j : list){
                String s1 = j.elementText("name");
                String s2 = j.elementText("age");
                String s3 = j.elementText("sex");
                System.out.println(s1+s2+s3);
            }
        } catch (DocumentException e) {
            logger.error("读取xml文件出错");
        } catch (IOException e) {
            logger.error("FileReader对象创建失败");
        }


    }   //  method main end.

}   // class end.
