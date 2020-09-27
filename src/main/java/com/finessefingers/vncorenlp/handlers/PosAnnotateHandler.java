package com.finessefingers.vncorenlp.handlers;

import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class PosAnnotateHandler extends BaseAnnotateHandler {

    public PosAnnotateHandler() throws IOException {
        super("pos");
    }
    
}
