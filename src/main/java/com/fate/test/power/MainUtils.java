package com.fate.test.power;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.MimeMultipart;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import java.util.Date;
import java.util.Properties;

public class MainUtils {
    /**

     * 发送邮件
     * @param to 接收邮件的地址

     * @param subject 邮件主题
     * @param msgText 邮件内容
     * @param mm

     */

    public static void send(String to, String subject, String msgText, MimeMultipart mm) {
//发邮件的地址

        //String from = "2082196859@qq.com";
        //String from = "2082196859@qq.com";
        String from = "jjc@bbkk.com";

//邮件发送服务器地址

       // String host = "smtp.qq.com";
        String host = "127.0.0.1";

//是否开启debug模式

        boolean debug = true;

// 设置发送邮件的配置信息

        Properties props = new Properties();

        props.put("mail.smtp.host", host);

        if (debug) {
            props.put("mail.debug", debug);
           // props.put("mail.smtp.auth",debug);
        }

//邮件会话

        Session session = Session.getInstance(props,null);

      //  Session session = Session.getDefaultInstance(props, new Authenticator() {
       //     @Override
        //    protected PasswordAuthentication getPasswordAuthentication() {
        //        return new PasswordAuthentication(from, "jbseacgldrjqhdhh");
       //     }
     //   });

        session.setDebug(debug);

        try {
//创建邮件

            MimeMessage msg = new MimeMessage(session);

            msg.setFrom(new InternetAddress(from));

            InternetAddress[] address = { new InternetAddress(to) };

            msg.setRecipients(Message.RecipientType.TO, address);

//设置主题

            msg.setSubject(subject);

//设置发送时间

            msg.setSentDate(new Date());

// If the desired charset is known, you can use

// setText(text, charset)

//设置邮件的内容

            msg.setContent(mm);

           // msg.setText(msgText);

//发送邮件

            Transport.send(msg);

        } catch (Exception mex) {
            mex.printStackTrace();

        }

    }

    public static void main(String[] args) throws MessagingException {
        String to = "saber@bbkk.com";

        String subject = "如何学习?";




        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        DataHandler dh = new DataHandler(new FileDataSource("C:\\Users\\Ziroom\\Desktop\\test.png"));

        // 将图片数据添加到"节点"
        mimeBodyPart.setDataHandler(dh);
        // 为"节点"设置一个唯一编号（在文本"节点"将引用该ID）
        mimeBodyPart.setContentID("mailTestPic");

        // 6. 创建文本"节点"
        MimeBodyPart text = new MimeBodyPart();
        // 这里添加图片的方式是将整个图片包含到邮件内容中, 实际上也可以以 http 链接的形式添加网络图片
        text.setContent("这是一张图片<br/><a href='http://www.cnblogs.com/ysocean/p/7666061.html'><img src='cid:mailTestPic'/></a>", "text/html;charset=UTF-8");

        // 7. （文本+图片）设置 文本 和 图片"节点"的关系（将 文本 和 图片"节点"合成一个混合"节点"）
        MimeMultipart mm_text_image = new MimeMultipart();
        mm_text_image.addBodyPart(text);
        mm_text_image.addBodyPart(mimeBodyPart);
        mm_text_image.setSubType("related");    // 关联关系

        // 8. 将 文本+图片 的混合"节点"封装成一个普通"节点"
        // 最终添加到邮件的 Content 是由多个 BodyPart 组成的 Multipart, 所以我们需要的是 BodyPart,
        // 上面的 mailTestPic 并非 BodyPart, 所有要把 mm_text_image 封装成一个 BodyPart
        MimeBodyPart text_image = new MimeBodyPart();
        text_image.setContent(mm_text_image);

        // 10. 设置（文本+图片）和 附件 的关系（合成一个大的混合"节点" / Multipart ）
        MimeMultipart mm = new MimeMultipart();
        mm.addBodyPart(text_image);
        mm.setSubType("mixed");         // 混合关系


        String msgText = "解决学习困扰,就是天天晚上熬夜学习";

        MainUtils.send(to, subject, msgText,mm);

    }

}