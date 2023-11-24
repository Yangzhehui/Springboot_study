package com.yzh.study.controller;

import org.springframework.boot.SpringBootVersion;

public class Test {
    public static void main(String[] args) {
        String version = SpringBootVersion.getVersion();
        System.out.println(version);
    }
}
