package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ThirdPartyDisclosureFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ThirdPartyDisclosureFlagNode extends BooleanUiNode<BasePrivacyNode<?>> {

    @Inject
    protected ThirdPartyDisclosureFlagNode(@Owner BasePrivacyNode<?> parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ThirdPartyDisclosureFlagNode.class;
    }

    protected final ThirdPartyDisclosureFlagNodeComponent getComponent() {
        return component;
    }


    private ThirdPartyDisclosureFlagNodeComponent component;

    @Inject
    void createComponent(ThirdPartyDisclosureFlagNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyDisclosureFlagNodeModule(new ThirdPartyDisclosureFlagNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
