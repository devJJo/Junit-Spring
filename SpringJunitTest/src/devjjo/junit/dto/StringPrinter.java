package devjjo.junit.dto;

import org.springframework.stereotype.Component;

@Component//Defaultf로 클래스명(앞자리 소문자)
public class StringPrinter implements Printer {
	private StringBuffer buffer = new StringBuffer();

	public void print(String message) {
		this.buffer.append(message);
	}

	public String toString() {
		return this.buffer.toString();
	}
}
