package com.xmall.model;

/**
 * 
 * @author jerry.li
 *	这个类不需要吧！！！
 *	user has may orders is ok.
 */
public class ShoppingCart extends BaseModel {
	private int user_id;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
}
