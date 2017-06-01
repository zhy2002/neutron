package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CreditCardTypeNode extends StringUiNode<CreditCardNode> {

    @Inject
    public CreditCardTypeNode(@Owner CreditCardNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CreditCardTypeNode.class;
    }

    private CreditCardTypeNodeComponent component;

    @Inject
    void createComponent(CreditCardTypeNodeComponent.Builder builder) {
        this.component = builder.setCreditCardTypeNodeModule(new CreditCardTypeNodeModule(this)).build();
    }

    private RuleProvider<CreditCardTypeNode> getRuleProvider() {
        return component.getCreditCardTypeNodeRuleProvider();
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

    private RuleProvider<CreditCardTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
