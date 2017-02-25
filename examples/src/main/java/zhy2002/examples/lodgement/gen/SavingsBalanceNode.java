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

public class SavingsBalanceNode extends BaseCurrencyNode<SavingsAccountNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return SavingsBalanceNode.class;
    }

    private SavingsBalanceNodeComponent component;

    @Inject
    void createComponent(SavingsBalanceNodeComponent.Builder builder) {
        this.component = builder.setSavingsBalanceNodeModule(new SavingsBalanceNodeModule(this)).build();
    }

    @Override
    protected SavingsBalanceNodeRuleProvider getRuleProvider() {
        return component.getSavingsBalanceNodeRuleProvider();
    }

    public SavingsBalanceNode(SavingsAccountNode parent, String name) {
        super(parent, name);
    }

}
