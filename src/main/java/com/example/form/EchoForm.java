package com.example.form;


import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class EchoForm implements Serializable {
	private static final long serialVersionUID = 1L;
//	最小2文字の入力を受け付けるフォームの作成
	@NotBlank
	@Size(min = 2)
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}