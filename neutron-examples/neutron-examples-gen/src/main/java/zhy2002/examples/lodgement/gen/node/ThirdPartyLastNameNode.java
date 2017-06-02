package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ThirdPartyLastNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ThirdPartyLastNameNode extends StringUiNode<RelatedPartyNode> {

    @Inject
    protected ThirdPartyLastNameNode(@Owner RelatedPartyNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ThirdPartyLastNameNode.class;
    }

    protected final ThirdPartyLastNameNodeComponent getComponent() {
        return component;
    }


    private ThirdPartyLastNameNodeComponent component;

    @Inject
    void createComponent(ThirdPartyLastNameNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyLastNameNodeModule(new ThirdPartyLastNameNodeModule(this)).build();
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
