package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.FeePayFromNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class FeePayFromNode extends StringUiNode<ProductFeeNode> {

    @Inject
    protected FeePayFromNode(@Owner ProductFeeNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return FeePayFromNode.class;
    }

    protected final FeePayFromNodeComponent getComponent() {
        return component;
    }


    private FeePayFromNodeComponent component;

    @Inject
    void createComponent(FeePayFromNodeComponent.Builder builder) {
        this.component = builder.setFeePayFromNodeModule(new FeePayFromNodeModule(this)).build();
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
