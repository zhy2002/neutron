package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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

    @Override
    protected OtherAssetMarketValueNodeRuleProvider getRuleProvider() {
        return component.getOtherAssetMarketValueNodeRuleProvider();
    }

    public OtherAssetMarketValueNode(@NotNull OtherAssetNode parent, String name) {
        super(parent, name);
    }

}
