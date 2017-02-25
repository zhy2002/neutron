package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;

public abstract class EmailNode<P extends ParentUiNode<?>> extends StringUiNode<P> {

    @Override
    protected abstract EmailNodeRuleProvider getRuleProvider();

    public EmailNode(@NotNull P parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setPattern("\\w+@\\w+\\.[\\w.]+");
    }

}
