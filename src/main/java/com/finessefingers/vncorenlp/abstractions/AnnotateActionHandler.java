package com.finessefingers.vncorenlp.abstractions;

import java.io.IOException;
import java.util.List;

import vn.pipeline.Sentence;

public interface AnnotateActionHandler {

    public List<Sentence> Handle(String text) throws IOException;
}