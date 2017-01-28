package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class ApprovalInPrincipleFlagNodeFactory implements ChildNodeFactory<ApprovalInPrincipleFlagNode, UsageNode> {

    @Override
    public ApprovalInPrincipleFlagNode create(UsageNode parent, String name) {
        return new ApprovalInPrincipleFlagNode(parent, name);
    }
}
