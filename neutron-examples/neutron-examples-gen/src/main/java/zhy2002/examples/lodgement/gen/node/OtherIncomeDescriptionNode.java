package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OtherIncomeDescriptionNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherIncomeDescriptionNode extends StringUiNode<OtherIncomeNode> {

    @Inject
    protected OtherIncomeDescriptionNode(@Owner OtherIncomeNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherIncomeDescriptionNode.class;
    }

    protected final OtherIncomeDescriptionNodeComponent getComponent() {
        return component;
    }


    private OtherIncomeDescriptionNodeComponent component;

    @Inject
    void createComponent(OtherIncomeDescriptionNodeComponent.Builder builder) {
        this.component = builder.setOtherIncomeDescriptionNodeModule(new OtherIncomeDescriptionNodeModule(this)).build();
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
