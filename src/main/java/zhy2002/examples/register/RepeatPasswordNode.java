package zhy2002.examples.register;

import zhy2002.examples.register.rule.RepeatPasswordRule;
import zhy2002.neutron.StringUiNode;

public class RepeatPasswordNode extends StringUiNode<RegisterNode> {

    protected RepeatPasswordNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void doLoad() {
        super.doLoad();

        getContext().getInstance(RepeatPasswordRule.Factory.class).create(this).addToOwner();
    }
}
