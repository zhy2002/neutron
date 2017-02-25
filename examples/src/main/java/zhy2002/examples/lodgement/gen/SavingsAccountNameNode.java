package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class SavingsAccountNameNode extends StringUiNode<SavingsAccountNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return SavingsAccountNameNode.class;
    }

    private SavingsAccountNameNodeComponent component;

    @Inject
    void createComponent(SavingsAccountNameNodeComponent.Builder builder) {
        this.component = builder.setSavingsAccountNameNodeModule(new SavingsAccountNameNodeModule(this)).build();
    }

    @Override
    protected SavingsAccountNameNodeRuleProvider getRuleProvider() {
        return component.getSavingsAccountNameNodeRuleProvider();
    }

    public SavingsAccountNameNode(SavingsAccountNode parent, String name) {
        super(parent, name);
    }

}
