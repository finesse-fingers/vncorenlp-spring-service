package com.finessefingers.vncorenlp.handlers;

import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class NerAnnotateHandler extends BaseAnnotateHandler {

    public NerAnnotateHandler() throws IOException {
        super("ner");
    }
    
}
