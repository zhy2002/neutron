package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ThirdPartyWorkPhoneNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ThirdPartyWorkPhoneNode extends TelephoneNode<RelatedPartyNode> {

    @Inject
    protected ThirdPartyWorkPhoneNode(@Owner RelatedPartyNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ThirdPartyWorkPhoneNode.class;
    }

    protected final ThirdPartyWorkPhoneNodeComponent getComponent() {
        return component;
    }


    private ThirdPartyWorkPhoneNodeComponent component;

    @Inject
    void createComponent(ThirdPartyWorkPhoneNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyWorkPhoneNodeModule(new ThirdPartyWorkPhoneNodeModule(this)).build();
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
