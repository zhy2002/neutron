package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherAssetTypeNode extends StringUiNode<OtherAssetNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OtherAssetTypeNode.class;
    }

    private OtherAssetTypeNodeComponent component;

    @Inject
    void createComponent(OtherAssetTypeNodeComponent.Builder builder) {
        this.component = builder.setOtherAssetTypeNodeModule(new OtherAssetTypeNodeModule(this)).build();
    }

    private OtherAssetTypeNodeRuleProvider getRuleProvider() {
        return component.getOtherAssetTypeNodeRuleProvider();
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

    private RuleProvider<OtherAssetTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public OtherAssetTypeNode(@NotNull OtherAssetNode parent, String name) {
        super(parent, name);
    }

}
