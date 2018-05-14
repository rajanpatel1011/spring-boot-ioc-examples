package entry.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Account {
	
	@Value("239492889")
	private int acountNumber;
	@Value("ABC1412ZXE")
	private String ifsc;
	
	@Override
	public String toString() {
		return "Account [acountNumber=" + acountNumber + ", ifsc=" + ifsc + ", getAccountNumber=" + getAccountNumber
				+ "]";
	}
	private int getAccountNumber;
	public int getAcountNumber() {
		return acountNumber;
	}
	public void setAcountNumber(int acountNumber) {
		this.acountNumber = acountNumber;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public int getGetAccountNumber() {
		return getAccountNumber;
	}
	public void setGetAccountNumber(int getAccountNumber) {
		this.getAccountNumber = getAccountNumber;
	}
	
	
	
}
