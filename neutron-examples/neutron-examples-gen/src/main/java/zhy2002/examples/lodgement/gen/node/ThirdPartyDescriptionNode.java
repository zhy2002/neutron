package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ThirdPartyDescriptionNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ThirdPartyDescriptionNode extends StringUiNode<RelatedPartyNode> {

    @Inject
    protected ThirdPartyDescriptionNode(@Owner RelatedPartyNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ThirdPartyDescriptionNode.class;
    }

    protected final ThirdPartyDescriptionNodeComponent getComponent() {
        return component;
    }


    private ThirdPartyDescriptionNodeComponent component;

    @Inject
    void createComponent(ThirdPartyDescriptionNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyDescriptionNodeModule(new ThirdPartyDescriptionNodeModule(this)).build();
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
