package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OtherLiabilityDescriptionNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherLiabilityDescriptionNode extends StringUiNode<OtherLiabilityNode> {

    @Inject
    protected OtherLiabilityDescriptionNode(@Owner OtherLiabilityNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherLiabilityDescriptionNode.class;
    }

    protected final OtherLiabilityDescriptionNodeComponent getComponent() {
        return component;
    }


    private OtherLiabilityDescriptionNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityDescriptionNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityDescriptionNodeModule(new OtherLiabilityDescriptionNodeModule(this)).build();
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
