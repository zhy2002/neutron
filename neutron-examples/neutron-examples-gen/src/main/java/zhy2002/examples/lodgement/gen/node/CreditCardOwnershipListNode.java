package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CreditCardOwnershipListNode extends OwnershipListNode<CreditCardNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CreditCardOwnershipListNode.class;
    }

    private CreditCardOwnershipListNodeComponent component;

    @Inject
    void createComponent(CreditCardOwnershipListNodeComponent.Builder builder) {
        this.component = builder.setCreditCardOwnershipListNodeModule(new CreditCardOwnershipListNodeModule(this)).build();
    }

    private RuleProvider<CreditCardOwnershipListNode> getRuleProvider() {
        return component.getCreditCardOwnershipListNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<CreditCardOwnershipListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public CreditCardOwnershipListNode(@NotNull CreditCardNode parent, String name) {
        super(parent, name);
    }

}
