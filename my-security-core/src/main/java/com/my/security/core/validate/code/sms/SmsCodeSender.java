/**
 * 
 */
package com.my.security.core.validate.code.sms;

/**
 * @author xiaoyuan
 *
 */
public interface SmsCodeSender {
	
	void send(String mobile, String code);

}
