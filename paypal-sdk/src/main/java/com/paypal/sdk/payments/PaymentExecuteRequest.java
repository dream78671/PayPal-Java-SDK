// This class was generated on Mon, 22 Jan 2018 14:30:02 PST by version 0.1.0-dev+8c35d5 of Braintree SDK Generator
// PaymentExecuteRequest.java
// @version 0.1.0-dev+8c35d5
// @type request
// @data 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
// DO NOT EDIT
package com.paypal.sdk.payments;

import com.braintreepayments.http.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Executes a PayPal payment that the customer has approved. You can optionally update one or more transactions when you execute the payment.<blockquote><strong>Important:</strong> This call works only after a customer has approved the payment. For more information, learn about [PayPal payments](/docs/integration/direct/payments/paypal-payments/).</blockquote>
 */
public class PaymentExecuteRequest extends HttpRequest<Payment> {

    public PaymentExecuteRequest(String paymentId) {
        super("/v1/payments/payment/{payment_id}/execute?", "POST", Payment.class);
        try {
            path(path().replace("{payment_id}", URLEncoder.encode(String.valueOf(paymentId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    

    public PaymentExecuteRequest requestBody(PaymentExecution paymentExecution) {
        super.requestBody(paymentExecution);
        return this;
    }
}
