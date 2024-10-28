package com.accenture.lkm.exception;

public class NoBlogPostsForEmailException extends Exception {
	public NoBlogPostsForEmailException(){
		super("Post does not exists for entered email");
	}
}
