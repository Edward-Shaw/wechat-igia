package com.cloume.shaw.igia.wx.resoure;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import com.cloume.shaw.igia.common.utils.Cloner;

import me.chanjar.weixin.mp.bean.result.WxMpUser;

/**
 * @deprecated
 *
 */
public class WxUser extends WxMpUser {
	private static final long serialVersionUID = -3478956786407923371L;
	
	@Id @Field("id")
	private String openId;
	
	public WxUser(WxMpUser wxObject) {
		new Cloner<WxMpUser>(this).clone(wxObject);
	}
}
