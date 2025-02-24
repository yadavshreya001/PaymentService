package com.paymentservice.controllers;

import com.paymentservice.dtos.GeneratePaymentLinkRequestDto;
import com.paymentservice.services.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(@Qualifier("razorpayPaymentGateway") PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("Added print statement to test git");
    }

    //POST -> http://localhost:8080/payments
    @PostMapping()
    public String generatePaymentLink(@RequestBody GeneratePaymentLinkRequestDto requestDto) throws RazorpayException, StripeException {
        //Ideally we should handle the exception in the Controller using Controller Advices.
        return paymentService.generatePaymentLink(requestDto.getOrderId());
    }

    @PostMapping("/webhook")
    public void handleWebhookEvent(@RequestBody Object object) {
        System.out.println("Webhook triggered");
    }

}
