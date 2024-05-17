package com.example.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class EchoForm implements Serializable {
	private static final long serialVersionUID = 1L;
//	最小4文字の英数字のみ入力を受け付けるフォームの作成
	@NotBlank
	@Size(min = 4)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}