// This class was generated on Mon, 22 Jan 2018 14:30:02 PST by version 0.1.0-dev+8c35d5 of Braintree SDK Generator
// CaptureGetRequest.java
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
 * Shows details for a captured payment, by ID.
 */
public class CaptureGetRequest extends HttpRequest<Capture> {

    public CaptureGetRequest(String captureId) {
        super("/v1/payments/capture/{capture_id}?", "GET", Capture.class);
        try {
            path(path().replace("{capture_id}", URLEncoder.encode(String.valueOf(captureId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    
}
