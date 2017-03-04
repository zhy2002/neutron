package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ThirdPartyWorkPhoneNode extends TelephoneNode<RelatedPartyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ThirdPartyWorkPhoneNode.class;
    }

    private ThirdPartyWorkPhoneNodeComponent component;

    @Inject
    void createComponent(ThirdPartyWorkPhoneNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyWorkPhoneNodeModule(new ThirdPartyWorkPhoneNodeModule(this)).build();
    }

    @Override
    protected ThirdPartyWorkPhoneNodeRuleProvider getRuleProvider() {
        return component.getThirdPartyWorkPhoneNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ThirdPartyWorkPhoneNode(@NotNull RelatedPartyNode parent, String name) {
        super(parent, name);
    }

}
