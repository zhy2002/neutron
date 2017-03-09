package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherAssetDescriptionNode extends StringUiNode<OtherAssetNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OtherAssetDescriptionNode.class;
    }

    private OtherAssetDescriptionNodeComponent component;

    @Inject
    void createComponent(OtherAssetDescriptionNodeComponent.Builder builder) {
        this.component = builder.setOtherAssetDescriptionNodeModule(new OtherAssetDescriptionNodeModule(this)).build();
    }

    private OtherAssetDescriptionNodeRuleProvider getRuleProvider() {
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

    public OtherAssetDescriptionNode(@NotNull OtherAssetNode parent, String name) {
        super(parent, name);
    }

}
