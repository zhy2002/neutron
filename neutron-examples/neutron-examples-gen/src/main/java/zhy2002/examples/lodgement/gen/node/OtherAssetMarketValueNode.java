package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class OtherAssetMarketValueNode extends BaseCurrencyNode<OtherAssetNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OtherAssetMarketValueNode.class;
    }

    private OtherAssetMarketValueNodeComponent component;

    @Inject
    void createComponent(OtherAssetMarketValueNodeComponent.Builder builder) {
        this.component = builder.setOtherAssetMarketValueNodeModule(new OtherAssetMarketValueNodeModule(this)).build();
    }

    private RuleProvider<OtherAssetMarketValueNode> getRuleProvider() {
        return component.getOtherAssetMarketValueNodeRuleProvider();
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

    private RuleProvider<OtherAssetMarketValueNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public OtherAssetMarketValueNode(@NotNull OtherAssetNode parent, String name) {
        super(parent, name);
    }

}
