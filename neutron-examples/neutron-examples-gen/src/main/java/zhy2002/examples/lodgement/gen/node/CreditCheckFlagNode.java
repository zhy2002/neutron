package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CreditCheckFlagNode extends BooleanUiNode<BasePrivacyNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return CreditCheckFlagNode.class;
    }

    private CreditCheckFlagNodeComponent component;

    @Inject
    void createComponent(CreditCheckFlagNodeComponent.Builder builder) {
        this.component = builder.setCreditCheckFlagNodeModule(new CreditCheckFlagNodeModule(this)).build();
    }

    private CreditCheckFlagNodeRuleProvider getRuleProvider() {
        return component.getCreditCheckFlagNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public CreditCheckFlagNode(@NotNull BasePrivacyNode<?> parent, String name) {
        super(parent, name);
    }

}
