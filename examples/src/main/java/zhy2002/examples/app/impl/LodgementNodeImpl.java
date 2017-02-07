package zhy2002.examples.app.impl;

import zhy2002.examples.app.gen.LodgementNode;
import zhy2002.examples.app.gen.LodgementNodeContext;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;

public class LodgementNodeImpl extends LodgementNode {

    @Inject
    public LodgementNodeImpl(@NotNull LodgementNodeContext context) {
        super(context);
    }
}
