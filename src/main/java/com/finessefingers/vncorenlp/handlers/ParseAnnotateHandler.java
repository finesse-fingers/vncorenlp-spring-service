package com.finessefingers.vncorenlp.handlers;

import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class ParseAnnotateHandler extends BaseAnnotateHandler {

    public ParseAnnotateHandler() throws IOException {
        super("parse");
    }
    
}
