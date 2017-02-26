package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;


public abstract class BaseOccupationNode<P extends ParentUiNode<?>> extends StringUiNode<P> {

    @Override
    protected abstract BaseOccupationNodeRuleProvider getRuleProvider();

    public BaseOccupationNode(@NotNull P parent, String name) {
        super(parent, name);
    }

}
