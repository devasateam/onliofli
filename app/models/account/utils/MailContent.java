package models.account.utils;


import java.io.ByteArrayOutputStream;
import java.util.Date;
import java.util.List;

public class MailContent {

	private String subject;
	private String message;
	private List<String> toEmails;
	private List<String> ccEmails;
	private List<String> bccEmails;
	private List<ByteArrayOutputStream> attachments;
	private String signature;
	private Date creationTime = new Date();

	public MailContent(String subject, String message, List<String> toEmails,
			List<String> ccEmails, List<String> bccEmails,
			List<ByteArrayOutputStream> attachments) {
		super();
		this.subject = subject;
		this.message = message;
		this.toEmails = toEmails;
		this.ccEmails = ccEmails;
		this.bccEmails = bccEmails;
		this.attachments = attachments;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getToEmails() {
		return toEmails;
	}

	public void setToEmails(List<String> toEmails) {
		this.toEmails = toEmails;
	}

	public List<String> getCcEmails() {
		return ccEmails;
	}

	public void setCcEmails(List<String> ccEmails) {
		this.ccEmails = ccEmails;
	}

	public List<String> getBccEmails() {
		return bccEmails;
	}

	public void setBccEmails(List<String> bccEmails) {
		this.bccEmails = bccEmails;
	}

	public List<ByteArrayOutputStream> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<ByteArrayOutputStream> attachments) {
		this.attachments = attachments;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public Date getCreationTime() {
		return creationTime;
	}

}
