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
    public OtherLiabilityDescriptionNode(@Owner OtherLiabilityNode parent) {
        super(parent);
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

    private RuleProvider<OtherLiabilityDescriptionNode> getRuleProvider() {
        return component.getOtherLiabilityDescriptionNodeRuleProvider();
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

    private RuleProvider<OtherLiabilityDescriptionNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
