package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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

    @Override
    protected CreditCardLenderNameNodeRuleProvider getRuleProvider() {
        return component.getCreditCardLenderNameNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public CreditCardLenderNameNode(@NotNull CreditCardNode parent, String name) {
        super(parent, name);
    }

}
