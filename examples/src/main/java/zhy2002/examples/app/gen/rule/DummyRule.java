package zhy2002.examples.app.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.app.gen.*;


public abstract class DummyRule extends UiNodeRule<LodgementNode> {

    public DummyRule(LodgementNode owner) {
        super(owner);
    }

    protected LodgementNode getLodgementNode() {
        return getOwner();
    }
}
