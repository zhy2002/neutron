package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;


public abstract class BaseMobileNumberNode<P extends ParentUiNode<?>> extends StringUiNode<P> {

    @Override
    protected abstract BaseMobileNumberNodeRuleProvider<?> getRuleProvider();

    public BaseMobileNumberNode(@NotNull P parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setPattern("^(\\+\\d{1,3}[- ]?)?\\d{10}$");
        setPatternMessage("Invalid mobile number.");
    }

}
