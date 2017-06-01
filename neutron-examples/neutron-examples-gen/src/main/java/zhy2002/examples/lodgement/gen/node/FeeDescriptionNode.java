package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.FeeDescriptionNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class FeeDescriptionNode extends StringUiNode<ProductFeeNode> {

    @Inject
    public FeeDescriptionNode(@Owner ProductFeeNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return FeeDescriptionNode.class;
    }

    protected final FeeDescriptionNodeComponent getComponent() {
        return component;
    }


    private FeeDescriptionNodeComponent component;

    @Inject
    void createComponent(FeeDescriptionNodeComponent.Builder builder) {
        this.component = builder.setFeeDescriptionNodeModule(new FeeDescriptionNodeModule(this)).build();
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
