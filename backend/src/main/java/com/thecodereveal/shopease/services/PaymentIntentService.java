package com.thecodereveal.shopease.services;

import com.thecodereveal.shopease.auth.entities.User;
import com.thecodereveal.shopease.entities.Order;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Component
public class PaymentIntentService {

    public Map<String, String> createPaymentIntent(Order order) {
        User user = order.getUser();
        Map<String, String> metaData = new HashMap<>();
//
        return metaData;
    }
}
