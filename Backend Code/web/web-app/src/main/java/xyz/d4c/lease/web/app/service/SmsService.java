package xyz.d4c.lease.web.app.service;

public interface SmsService {
    void sendCode(String phone,String code);
}
