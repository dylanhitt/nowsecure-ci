package com.nowsecure.ci.domain;

import java.io.File;

public interface NSAutoParameters {
    String getDescription();

    String getApiUrl();

    String getApiKey();

    String getGroup();

    File getArtifactsDir();

    File getFile();

    String getUsername();

    String getPassword();

    int getWaitMinutes();

    int getScoreThreshold();

    boolean isShowStatusMessages();

    String getStopTestsForStatusMessage();

    boolean isDebug();

    boolean isProxyEnabled();

    boolean isValidateDnsUrlConnectionEnabled();

    ProxySettings getProxySettings();
}