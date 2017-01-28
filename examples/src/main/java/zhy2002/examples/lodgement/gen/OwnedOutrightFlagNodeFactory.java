package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class OwnedOutrightFlagNodeFactory implements ChildNodeFactory<OwnedOutrightFlagNode, UsageNode> {

    @Override
    public OwnedOutrightFlagNode create(UsageNode parent, String name) {
        return new OwnedOutrightFlagNode(parent, name);
    }
}
