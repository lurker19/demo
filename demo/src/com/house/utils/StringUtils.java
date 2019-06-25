package com.house.utils;

import java.io.UnsupportedEncodingException;

public class StringUtils {

	public static String format(String str){
		
		try {
			return new String(str.getBytes("iso-8859-1"),"gbk") ;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return str ;
	}
//	public static String format3(String str){
//		
//		try {
//			return new String(str.getBytes("gbk"),"utf-8") ;
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
//		return str ;
//	}
//	public static String format6(String str){
//		
//		try {
//			return new String(str.getBytes(),"gbk") ;
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
//		return str ;
//	}
//	public static String format4(String str){
//		
//		try {
//			return new String(str.getBytes("iso-8859-1"),"gbk") ;
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
//		return str ;
//	}
//	public static String format5(String str){
//		
//		try {
//			return new String(str.getBytes("utf-8"),"gbk") ;
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
//		return str ;
//	}
}
