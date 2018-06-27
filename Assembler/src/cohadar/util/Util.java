package cohadar.util;

import java.util.List;

public class Util {
	public static String replicate(String separator, List<?> arguments) {
		if (arguments == null || arguments.size() == 0) {
			return "";
		}
		if (separator == null) {
			separator = "";
		}

		int n = arguments.size();

		if (n == 1) {
			return arguments.get(0).toString();
		}

		StringBuilder buff = new StringBuilder();
		for (int i = 0; i < n - 1; i++) {
			buff.append(arguments.get(i));
			buff.append(separator);
		}
		buff.append(arguments.get(n - 1));
		return buff.toString();
	}

	public static String replicate(String separator, Object[] arguments) {
		if (arguments == null || arguments.length == 0) {
			return "";
		}
		if (separator == null) {
			separator = "";
		}

		int n = arguments.length;

		if (n == 1) {
			return arguments[0].toString();
		}

		StringBuilder buff = new StringBuilder();
		for (int i = 0; i < n - 1; i++) {
			buff.append(arguments[i]);
			buff.append(separator);
		}
		buff.append(arguments[n - 1]);
		return buff.toString();
	}

	private static char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

	private static int getHexDigit(char c) {
		for (int i = 0; i < 16; i++) {
			if (c == digits[i]) {
				return i;
			}
		}
		return -1;
	}

	// created because Integer.parseInt(hex, 16) does not work for
	// implicit negatives, for example 0xFFFFFFFF
	public static int parseHex(String hex) {
		int ret = 0;
		hex = hex.toUpperCase();
		if (hex.length() > 8) {
			throw new NumberFormatException(hex);
		}
		for (int i = 0; i < hex.length(); i++) {
			int digit = getHexDigit(hex.charAt(i));
			if (digit < 0) {
				throw new NumberFormatException(hex);
			}
			ret = ret * 16 + digit;
		}
		return ret;
	}
}
