import java.io.UnsupportedEncodingException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

final String CHAR_SET = "UTF-8";
final String HMAC_ALGORITHM = "HmacSHA256";
        String apiKey = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOsdjkfnu32b32kjd s8dfdioEFSVE5FUiIsImV4cCI6MTU1Nzg2MzY1MX0.n1ddj6ZB2dK7pYOhs_0zsWi3fun4fdisunfjk43nfjkdsnfjkn4nfuifnsducjk4zkJBkDRdgOLKmQ";
        String apiSecret = "jw2fbI4BT7aU3i3WaCj34jknf34iundsVMZX3Uarje2y8QEKa1JkeITJhFV1SpCoONaU3M5DFy8ziKFdMp6mngreZWYs5Rnv8Hh78sdh78hdWFyCiAskrefiernff93feroeifjsldknf48onifnklsdnf48iofidlnkfMtUczABMh0g2IJ3rxAln05ipptiIahRkZQS3yCBQzxSYYhu29DzQb86lgI9H2mcojz3J8wGnPVRIsm12HfVCuHkWDL1tHkxVIJp5i";

        SecretKeySpec key;
        try {
        key = new SecretKeySpec(apiSecret.getBytes("UTF-8"), "HmacSHA256");
        } catch (UnsupportedEncodingException e1) {
        e1.printStackTrace();
        return;
        }

// POST request to create a sell limit order

// Build your query object.
        String url = "https://partner.bcm.exchange/api/v1/submit/order";
        Long stamp = System.currentTimeMillis();
        HttpHeaders headers = new HttpHeaders();
        JSONObject request = new JSONObject();
        request.put("quantity", 1.00000000);
        request.put("pricePerUnit", 5.20000000);
        request.put("marketSymbol", "ETH-BTC");
        request.put("orderSide", "SELL");
        request.put("orderType", "LIMIT");
        String body = request.toString();
        headers.setContentType(MediaType.APPLICATION_JSON);
        UriComponents builder = UriComponentsBuilder.fromHttpUrl(url)
        .queryParam("apikey", apiKey)
        .queryParam("stamp", stamp).build();


        try {
        JSONObject json = new JSONObject();
        json.put("path", builder.getPath());
        json.put("query", builder.getQuery());
        json.put("content-length", body == null ? -1 : body.length());
        String sigContent = json.toString();
        String signature;

        // Sign your query object.
        byte[] data = sigContent.getBytes(CHAR_SET);
        Mac mac = Mac.getInstance(HMAC_ALGORITHM);
        mac.init(key);
        signature = javax.xml.bind.DatatypeConverter.printBase64Binary(mac.doFinal(data));

        // Insert signature into REST header.
        headers.set("signature", signature);
        System.out.println(new RestTemplate()
        .exchange(builder.toUriString(), HttpMethod.POST, new HttpEntity<>(body, headers), String.class)
        .getBody());
        } catch (Exception e) {
        System.out.println(e);
        }



// GET request to retrieve status of a single order

        url = "https://partner.bcm.exchange/api/v1/single-order";
        stamp = System.currentTimeMillis();
        headers = new HttpHeaders();
        body = null;

        headers.setContentType(MediaType.APPLICATION_JSON);
        builder = UriComponentsBuilder.fromHttpUrl(url)
        .queryParam("marketSymbol", "ETH-BTC")
        .queryParam("orderId", "3513353")
        .queryParam("apikey", apiKey)
        .queryParam("stamp", stamp).build();

        try {
        JSONObject json = new JSONObject();
        json.put("path", builder.getPath());
        json.put("query", builder.getQuery());
        json.put("content-length", body == null ? -1 : body.length());
        String sigContent = json.toString();
        String signature;

        byte[] data = sigContent.getBytes(CHAR_SET);
        Mac mac = Mac.getInstance(HMAC_ALGORITHM);
        mac.init(key);
        signature = javax.xml.bind.DatatypeConverter.printBase64Binary(mac.doFinal(data));

        headers.set("signature", signature);
        System.out.println(builder.toUriString());
        System.out.println(headers);
        System.out.println(body);
        System.out.println(new RestTemplate()
        .exchange(builder.toUriString(), HttpMethod.GET, new HttpEntity<>("{}", headers), String.class)
        .getBody());
        } catch (Exception e) {
        System.out.println(e);
        }