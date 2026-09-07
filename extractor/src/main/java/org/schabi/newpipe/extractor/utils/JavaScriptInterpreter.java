package org.schabi.newpipe.extractor.utils;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.ScriptableObject;

import javax.annotation.Nonnull;

public interface JavaScriptInterpreter {
    String run(@Nonnull String code);
}
