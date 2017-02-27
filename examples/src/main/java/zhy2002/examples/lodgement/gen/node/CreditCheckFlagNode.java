package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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

    @Override
    protected CreditCheckFlagNodeRuleProvider getRuleProvider() {
        return component.getCreditCheckFlagNodeRuleProvider();
    }

    public CreditCheckFlagNode(@NotNull BasePrivacyNode<?> parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setFixedValue(true);
    }

}
