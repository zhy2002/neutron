package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ThirdPartyAddressNode extends AddressNode<RelatedPartyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ThirdPartyAddressNode.class;
    }

    private ThirdPartyAddressNodeComponent component;

    @Inject
    void createComponent(ThirdPartyAddressNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyAddressNodeModule(new ThirdPartyAddressNodeModule(this)).build();
    }

    @Override
    protected ThirdPartyAddressNodeRuleProvider getRuleProvider() {
        return component.getThirdPartyAddressNodeRuleProvider();
    }

    public ThirdPartyAddressNode(@NotNull RelatedPartyNode parent, String name) {
        super(parent, name);
    }

}
