package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ThirdPartyTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ThirdPartyTypeNode extends StringUiNode<RelatedPartyNode> {

    @Inject
    protected ThirdPartyTypeNode(@Owner RelatedPartyNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ThirdPartyTypeNode.class;
    }

    protected final ThirdPartyTypeNodeComponent getComponent() {
        return component;
    }


    private ThirdPartyTypeNodeComponent component;

    @Inject
    void createComponent(ThirdPartyTypeNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyTypeNodeModule(new ThirdPartyTypeNodeModule(this)).build();
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
