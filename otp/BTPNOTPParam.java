package com.btpn.authetication.module.otp;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class BTPNOTPParam {
	private final String gatewaySMSImplClass;
	private final long codeValidityDuration;
	private final String telephoneLdapAttributeName;
	private final String carrierLdapAttributeName;
	private final String emailLdapAttributeName;
	private final String codeDelivery;
	private final Map<?, ?> config;
	private final int codeLength;
	private final String messageSubject;
	private final String messageContent;
	private final String fromAddressAttributeName;
	private final Set<String> userSearchAttributes;

	
	  public BTPNOTPParam(String gatewaySMSImplClass, long
	  codeValidityDuration, String telephoneLdapAttributeName, String
	  carrierLdapAttributeName, String emailLdapAttributeName, String
	  codeDelivery, Map<?, ?> config, int codeLength, String messageSubject,
	  String messageContent, String fromAddressAttributeName) {
	  this(gatewaySMSImplClass, codeValidityDuration,
	  telephoneLdapAttributeName, carrierLdapAttributeName,
	  emailLdapAttributeName, codeDelivery, config, codeLength, messageSubject,
	  messageContent, fromAddressAttributeName, Collections.EMPTY_SET); }
	 
		
	  public BTPNOTPParam(String gatewaySMSImplClass, long
	  codeValidityDuration, String telephoneLdapAttributeName, String
	  carrierLdapAttributeName, String emailLdapAttributeName, String
	  codeDelivery, Map<?, ?> config, int codeLength, String messageSubject,
	  String messageContent, String fromAddressAttributeName, Set<String>
	  userSearchAttributes) { this.gatewaySMSImplClass = gatewaySMSImplClass;
	  this.codeValidityDuration = codeValidityDuration;
	  this.telephoneLdapAttributeName = telephoneLdapAttributeName;
	  this.carrierLdapAttributeName = carrierLdapAttributeName;
	  this.emailLdapAttributeName = emailLdapAttributeName; this.codeDelivery =
	  codeDelivery; this.config = config; this.codeLength = codeLength;
	  this.messageSubject = messageSubject; this.messageContent =
	  messageContent; this.fromAddressAttributeName = fromAddressAttributeName;
	  this.userSearchAttributes = userSearchAttributes; }
	 

	
	public String getGatewaySMSImplClass() {
		return this.gatewaySMSImplClass;
	}

	public long getCodeValidityDuration() {
		return this.codeValidityDuration;
	}

	public String getTelephoneLdapAttributeName() {
		return this.telephoneLdapAttributeName;
	}

	public String getCarrierLdapAttributeName() {
		return this.carrierLdapAttributeName;
	}

	public String getEmailLdapAttributeName() {
		return this.emailLdapAttributeName;
	}

	public String getCodeDelivery() {
		return this.codeDelivery;
	}

	public Map<?, ?> getConfig() {
		return this.config;
	}

	public int getCodeLength() {
		return this.codeLength;
	}

	public String getMessageSubject() {
		return this.messageSubject;
	}

	public String getMessageContent() {
		return this.messageContent;
	}

	public String getFromAddressAttributeName() {
		return this.fromAddressAttributeName;
	}

	public Set<String> getUserSearchAttributes() {
		return Collections.unmodifiableSet(this.userSearchAttributes);
	}

	}
