package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ThirdPartyDisclosureFlagNode extends BooleanUiNode<BasePrivacyNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return ThirdPartyDisclosureFlagNode.class;
    }

    private ThirdPartyDisclosureFlagNodeComponent component;

    @Inject
    void createComponent(ThirdPartyDisclosureFlagNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyDisclosureFlagNodeModule(new ThirdPartyDisclosureFlagNodeModule(this)).build();
    }

    @Override
    protected ThirdPartyDisclosureFlagNodeRuleProvider getRuleProvider() {
        return component.getThirdPartyDisclosureFlagNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ThirdPartyDisclosureFlagNode(@NotNull BasePrivacyNode<?> parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setFixedValue(true);
    }

}
