package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OtherAssetMarketValueNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherAssetMarketValueNode extends BaseCurrencyNode<OtherAssetNode> {

    @Inject
    public OtherAssetMarketValueNode(@Owner OtherAssetNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherAssetMarketValueNode.class;
    }

    protected final OtherAssetMarketValueNodeComponent getComponent() {
        return component;
    }


    private OtherAssetMarketValueNodeComponent component;

    @Inject
    void createComponent(OtherAssetMarketValueNodeComponent.Builder builder) {
        this.component = builder.setOtherAssetMarketValueNodeModule(new OtherAssetMarketValueNodeModule(this)).build();
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
