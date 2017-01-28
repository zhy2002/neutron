package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class UsedAsSecurityFlagNodeFactory implements ChildNodeFactory<UsedAsSecurityFlagNode, UsageNode> {

    @Override
    public UsedAsSecurityFlagNode create(UsageNode parent, String name) {
        return new UsedAsSecurityFlagNode(parent, name);
    }
}
