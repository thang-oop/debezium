package com.win.cdc.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.win.cdc.entity.Customer;
import io.debezium.data.Envelope.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class CustomerService {

    @Autowired
    private EmailService emailService;

    @Value("${email.fromEmailAddress}")
    private String fromEmailAddress;

    @Value("${email.toEmailAddress}")
    private String[] toEmailAddress;

    public void replicateData(Map<String, Object> customerData, Operation operation) {
        final Customer customer = new ObjectMapper().convertValue(customerData, Customer.class);

        if (operation.equals(Operation.CREATE)) {
            if (customer.getCHANNEL().equals("SVNG")) {
                String body = "Dear anh/chị,\n" +
                        "Có xảy ra lỗi với nội dung: " + customer.getDESC_() +". Tại thời điểm: " + customer.getTIME_START() +
                        "\n" +
                        "Trân trọng!";
//                emailService.sendEmailAttachment("Cảnh báo lỗi SVNG!!!", fromEmailAddress, toEmailAddress, body);
                System.out.println("Log: " + customer.getDESC_());
            }
            if (customer.getCHANNEL().equals("ATM")) {
                String body = "Dear anh/chị,\n" +
                        "Có xảy ra lỗi với nội dung: " + customer.getDESC_() +". Tại thời điểm: " + customer.getTIME_START() +
                        "\n" +
                        "Trân trọng!";
//                emailService.sendEmailAttachment("Cảnh báo lỗi ATM!!!", fromEmailAddress, toEmailAddress, body);
                System.out.println("Log: " + customer.getDESC_());
            }
        }
    }
}