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
    public ThirdPartyWorkPhoneNode(@Owner RelatedPartyNode parent, @ChildName String name) {
        super(parent, name);
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

    private RuleProvider<ThirdPartyWorkPhoneNode> getRuleProvider() {
        return component.getThirdPartyWorkPhoneNodeRuleProvider();
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

    private RuleProvider<ThirdPartyWorkPhoneNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
