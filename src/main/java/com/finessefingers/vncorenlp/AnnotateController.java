package com.finessefingers.vncorenlp;

import java.util.List;

import com.finessefingers.vncorenlp.handlers.NerAnnotateHandler;
import com.finessefingers.vncorenlp.handlers.ParseAnnotateHandler;
import com.finessefingers.vncorenlp.handlers.PosAnnotateHandler;
import com.finessefingers.vncorenlp.handlers.WsegAnnotateHandler;
import com.finessefingers.vncorenlp.models.AnnotateRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import vn.pipeline.Sentence;

@RestController
public class AnnotateController {

    private final WsegAnnotateHandler wsegHandler;
    private final PosAnnotateHandler posHandler;
    private final NerAnnotateHandler nerHandler;
    private final ParseAnnotateHandler parseHandler;

    @Autowired
    public AnnotateController(WsegAnnotateHandler wsegHandler, PosAnnotateHandler posHandler,
            NerAnnotateHandler nerHandler, ParseAnnotateHandler parseHandler) {
        this.wsegHandler = wsegHandler;
        this.posHandler = posHandler;
        this.nerHandler = nerHandler;
        this.parseHandler = parseHandler;
    }

    @GetMapping("/annotate/wseg")
    public List<Sentence> annotateWseg(@RequestBody AnnotateRequest request) {
        return wsegHandler.Handle(request.getText());
    }

    @GetMapping("/annotate/pos")
    public List<Sentence> annotatePos(@RequestBody AnnotateRequest request) {
        return posHandler.Handle(request.getText());
    }

    @GetMapping("/annotate/ner")
    public List<Sentence> annotateNer(@RequestBody AnnotateRequest request) {
        return nerHandler.Handle(request.getText());
    }

    @GetMapping("/annotate/parse")
    public List<Sentence> annotateParse(@RequestBody AnnotateRequest request) {
        return parseHandler.Handle(request.getText());
    }

}
