package com.rudyah.service;

import org.springframework.stereotype.Service;

@Service
public class AddService {
    public int add(int t1, int t2) {
        return t1+t2;
    }
}
