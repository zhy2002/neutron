package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.FeeTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class FeeTypeNode extends StringUiNode<ProductFeeNode> {

    @Inject
    public FeeTypeNode(@Owner ProductFeeNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return FeeTypeNode.class;
    }

    protected final FeeTypeNodeComponent getComponent() {
        return component;
    }


    private FeeTypeNodeComponent component;

    @Inject
    void createComponent(FeeTypeNodeComponent.Builder builder) {
        this.component = builder.setFeeTypeNodeModule(new FeeTypeNodeModule(this)).build();
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
