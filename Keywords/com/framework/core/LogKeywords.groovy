package com.framework.core

import com.kms.katalon.core.logging.KeywordLogger

public class LogKeywords {

	private static KeywordLogger logger = KeywordLogger.getInstance(LogKeywords.class)

	static void info(String message) {
		logger.logInfo(message)
	}

	static void warn(String message) {
		logger.logWarning(message)
	}

	static void error(String message) {
		logger.logError(message)
	}

	static void pass(String message) {
		logger.logPassed(message)
	}

	static void fail(String message) {
		logger.logFailed(message)
	}
}
