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

public class SavingsBsbNoNode extends StringUiNode<SavingsAccountNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return SavingsBsbNoNode.class;
    }

    private SavingsBsbNoNodeComponent component;

    @Inject
    void createComponent(SavingsBsbNoNodeComponent.Builder builder) {
        this.component = builder.setSavingsBsbNoNodeModule(new SavingsBsbNoNodeModule(this)).build();
    }

    @Override
    protected SavingsBsbNoNodeRuleProvider getRuleProvider() {
        return component.getSavingsBsbNoNodeRuleProvider();
    }

    public SavingsBsbNoNode(SavingsAccountNode parent, String name) {
        super(parent, name);
    }

}
