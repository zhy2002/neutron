package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OtherAssetTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherAssetTypeNode extends StringUiNode<OtherAssetNode> {

    @Inject
    public OtherAssetTypeNode(@Owner OtherAssetNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherAssetTypeNode.class;
    }

    protected final OtherAssetTypeNodeComponent getComponent() {
        return component;
    }


    private OtherAssetTypeNodeComponent component;

    @Inject
    void createComponent(OtherAssetTypeNodeComponent.Builder builder) {
        this.component = builder.setOtherAssetTypeNodeModule(new OtherAssetTypeNodeModule(this)).build();
    }

    private RuleProvider<OtherAssetTypeNode> getRuleProvider() {
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

}
