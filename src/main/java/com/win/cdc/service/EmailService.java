package com.win.cdc.service;

import com.win.cdc.config.EmailConfig;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;

@Service
public class EmailService {

    private static final Logger logger = LoggerFactory.getLogger(EmailService.class);

    @SneakyThrows
    public void sendEmailAttachment(String subject, final String fromEmailAddress, final String[] toEmailAddress, String body) {

        logger.info("Start send email!!");

        MimeMessage mimeMessage = new MimeMessage(EmailConfig.session);
        mimeMessage.addHeader("Content-type", "text/HTML; charset=UTF-8");
        mimeMessage.addHeader("format", "flowed");
        mimeMessage.addHeader("Content-Transfer-Encoding", "8bit");

        mimeMessage.setFrom(new InternetAddress("hotrokythuatthe@pvcombank.com.vn", "NoReply-JD"));

        mimeMessage.setReplyTo(InternetAddress.parse("hotrokythuatthe@pvcombank.com.vn", false));

        mimeMessage.setSubject(subject, "UTF-8");

        mimeMessage.setText(body, "UTF-8");

        mimeMessage.setSentDate(new Date());

        for (String emailAddress : toEmailAddress) {
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(emailAddress));
        }

        logger.info("Message is ready");
        Transport.send(mimeMessage);

        logger.info("EMail Sent Successfully!!");
    }
}
