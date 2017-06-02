package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OtherLiabilityTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherLiabilityTypeNode extends StringUiNode<OtherLiabilityNode> {

    @Inject
    protected OtherLiabilityTypeNode(@Owner OtherLiabilityNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherLiabilityTypeNode.class;
    }

    protected final OtherLiabilityTypeNodeComponent getComponent() {
        return component;
    }


    private OtherLiabilityTypeNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityTypeNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityTypeNodeModule(new OtherLiabilityTypeNodeModule(this)).build();
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
