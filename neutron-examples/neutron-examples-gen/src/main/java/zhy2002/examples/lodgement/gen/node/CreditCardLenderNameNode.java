package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CreditCardLenderNameNode extends StringUiNode<CreditCardNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CreditCardLenderNameNode.class;
    }

    private CreditCardLenderNameNodeComponent component;

    @Inject
    void createComponent(CreditCardLenderNameNodeComponent.Builder builder) {
        this.component = builder.setCreditCardLenderNameNodeModule(new CreditCardLenderNameNodeModule(this)).build();
    }

    private RuleProvider<CreditCardLenderNameNode> getRuleProvider() {
        return component.getCreditCardLenderNameNodeRuleProvider();
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

    private RuleProvider<CreditCardLenderNameNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public CreditCardLenderNameNode(@NotNull CreditCardNode parent, String name) {
        super(parent, name);
    }

}
