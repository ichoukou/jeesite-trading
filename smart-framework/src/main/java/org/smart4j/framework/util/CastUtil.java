package org.smart4j.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * @author   李家俊(Drajun)
 * @Date     2018年3月28日下午7:54:10
 * @QQ       1071211919
 * @Emali    longlou.d@foxmail.com
 * @Describe 转型操作工具类
 */
public final class CastUtil {
	
	/**转为String类型
	 * @param obj
	 * @return
	 */
	public static String castString(Object obj) {
		return CastUtil.castString(obj,"");
	}
	
	/**转为String类型(提供默认值)
	 * @param obj
	 * @param defaultValue
	 * @return
	 */
	public static String castString(Object obj, String defaultValue) {
		return obj != null ? String.valueOf(obj) : defaultValue;
	}
	
	/**转为double类型
	 * @param obj
	 * @return
	 */
	public static double castDouble(Object obj) {
		return CastUtil.castDouble(obj,0);
	}
	
	/**转为double类型(提供默认值)
	 * @param obj
	 * @param defaultValue
	 * @return
	 */
	public static double castDouble(Object obj, double defaultValue) {
		double doubleValue = defaultValue;
		if(obj!=null) {
			String strValue = castString(obj);
			if(StringUtils.isNotEmpty(strValue)) {
				try {
					doubleValue = Double.parseDouble(strValue);
				}catch(NumberFormatException e) {
					doubleValue=defaultValue;
				}
			}
		}
		return doubleValue;
	}
	
	/**转为long类型
	 * @param obj
	 * @return
	 */
	public static long castLong(Object obj) {
		return CastUtil.castLong(obj, 0);
	}
	
	/**转为long类型(提供默认值)
	 * @param obj
	 * @param defaultValue
	 * @return
	 */
	public static long castLong(Object obj,long defaultValue) {
		long longValue = defaultValue;
		if(obj!=null) {
			String strValue = castString(obj);
			if(StringUtils.isNotEmpty(strValue)) {
				try {
					longValue = Long.parseLong(strValue);
				}catch(NumberFormatException e) {
					longValue = defaultValue;
				}
			}
		}
		return longValue;
	}

	/**转为int类型
	 * @param obj
	 * @return
	 */
	public static int castInt(Object obj) {
		return CastUtil.castInt(obj,0);
	}
	
	/**转为int类型(提供默认值)
	 * @param obj
	 * @param defaultValue
	 * @return
	 */
	public static int castInt(Object obj, int defaultValue) {
		int intValue = defaultValue;
		if(obj != null) {
			String strValue = castString(obj);
			if(StringUtils.isNotEmpty(strValue)) {
				try {
					intValue = Integer.parseInt(strValue);
				}catch(NumberFormatException e) {
					intValue = defaultValue;
				}
			}
		}
		return intValue;
	}

	public static boolean castBoolean(Object obj) {
		return CastUtil.castBoolean(obj,false);
	}
	
	public static boolean castBoolean(Object obj, boolean defaultValue) {
		boolean booleanValue = defaultValue;
		if(obj != null) {
			booleanValue = Boolean.parseBoolean(castString(obj));
		}
		return booleanValue;
	}
}