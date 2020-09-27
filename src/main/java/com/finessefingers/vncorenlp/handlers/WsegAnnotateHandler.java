package com.finessefingers.vncorenlp.handlers;

import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class WsegAnnotateHandler extends BaseAnnotateHandler {

    public WsegAnnotateHandler() throws IOException {
        super("wseg");
    }

}