package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PrimarySecurityFlagNodeFactory implements ChildNodeFactory<PrimarySecurityFlagNode, UsageNode> {

    @Override
    public PrimarySecurityFlagNode create(UsageNode parent, String name) {
        return new PrimarySecurityFlagNode(parent, name);
    }
}
