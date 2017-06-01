package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OtherIncomeTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherIncomeTypeNode extends StringUiNode<OtherIncomeNode> {

    @Inject
    public OtherIncomeTypeNode(@Owner OtherIncomeNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherIncomeTypeNode.class;
    }

    protected final OtherIncomeTypeNodeComponent getComponent() {
        return component;
    }


    private OtherIncomeTypeNodeComponent component;

    @Inject
    void createComponent(OtherIncomeTypeNodeComponent.Builder builder) {
        this.component = builder.setOtherIncomeTypeNodeModule(new OtherIncomeTypeNodeModule(this)).build();
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
