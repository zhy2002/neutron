package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ThirdPartyAddressNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ThirdPartyAddressNode extends AddressNode<RelatedPartyNode> {

    @Inject
    public ThirdPartyAddressNode(@Owner RelatedPartyNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ThirdPartyAddressNode.class;
    }

    protected final ThirdPartyAddressNodeComponent getComponent() {
        return component;
    }


    private ThirdPartyAddressNodeComponent component;

    @Inject
    void createComponent(ThirdPartyAddressNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyAddressNodeModule(new ThirdPartyAddressNodeModule(this)).build();
    }

    private RuleProvider<ThirdPartyAddressNode> getRuleProvider() {
        return component.getThirdPartyAddressNodeRuleProvider();
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

    private RuleProvider<ThirdPartyAddressNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
