package com.czbank.childrenfinancial.swagger;

import org.springframework.stereotype.Service;

/**
 * swagger配置信息
 */
@Service
public class SwaggerInfo {
    private String groupName="controller";
    private String basePackage;
    private String antPath;
    private String title="小小理财家项目开发";
    private String description="后端接口管理";
    private String license="Apache License Version 2.0";


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getBasePackage() {
        return basePackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public String getAntPath() {
        return antPath;
    }

    public void setAntPath(String ant) {
        this.antPath = antPath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }







}
