package com.zy.utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.zy.utils.Tools;
import com.zy.model.MetaDomain;

@Component
public class AdminCommons {
	public static boolean exist_cat(MetaDomain category, String cats) {
		String[] arr = StringUtils.split(cats,",");
		if(null != arr && arr.length > 0) {
			for(String c : arr) {
				if(c.trim().equals(category.getName())) {
					return true;
				}
			}
		}
		return false;
	}

	 /**
     * 定义颜色样式数组
     */
    private static final String[] COLORS = {"default", "primary", "success", "info", "warning", "danger", "inverse", "purple", "pink"};

    /**
     * 随机样式
     * @return
     */
    public static String rand_color() {
        int r = Tools.rand(0, COLORS.length - 1);
        return COLORS[r];
    }

}
