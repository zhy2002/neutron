package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ThirdPartyDobNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ThirdPartyDobNode extends DobNode<RelatedPartyNode> {

    @Inject
    protected ThirdPartyDobNode(@Owner RelatedPartyNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ThirdPartyDobNode.class;
    }

    protected final ThirdPartyDobNodeComponent getComponent() {
        return component;
    }


    private ThirdPartyDobNodeComponent component;

    @Inject
    void createComponent(ThirdPartyDobNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyDobNodeModule(new ThirdPartyDobNodeModule(this)).build();
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
