package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class OtherAssetDescriptionNode extends StringUiNode<OtherAssetNode> {

    private OtherAssetDescriptionNodeComponent component;

    @Inject
    public OtherAssetDescriptionNode(@Owner OtherAssetNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherAssetDescriptionNode.class;
    }

    @Inject
    void createComponent(OtherAssetDescriptionNodeComponent.Builder builder) {
        this.component = builder.setOtherAssetDescriptionNodeModule(new OtherAssetDescriptionNodeModule(this)).build();
    }

    private RuleProvider<OtherAssetDescriptionNode> getRuleProvider() {
        return component.getOtherAssetDescriptionNodeRuleProvider();
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

    private RuleProvider<OtherAssetDescriptionNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
