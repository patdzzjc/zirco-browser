/*
 * Zirco Browser for Android
 * 
 * Copyright (C) 2010 - 2011 J. Devauchelle and contributors.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * version 3 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

package com.polysaas.browser;

import android.text.TextUtils;


public class UrlAccessUtils {

	public static boolean isBlockedUrl(String url) {
		if(TextUtils.isEmpty(url)) {
			return false;
		}
		
		if(url.contains("baidu.com")) {
			return true;
		}
		
		return false;
	}
}
