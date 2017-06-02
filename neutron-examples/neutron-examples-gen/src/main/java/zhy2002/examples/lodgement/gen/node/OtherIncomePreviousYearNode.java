package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OtherIncomePreviousYearNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherIncomePreviousYearNode extends BooleanUiNode<OtherIncomeNode> {

    @Inject
    protected OtherIncomePreviousYearNode(@Owner OtherIncomeNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherIncomePreviousYearNode.class;
    }

    protected final OtherIncomePreviousYearNodeComponent getComponent() {
        return component;
    }


    private OtherIncomePreviousYearNodeComponent component;

    @Inject
    void createComponent(OtherIncomePreviousYearNodeComponent.Builder builder) {
        this.component = builder.setOtherIncomePreviousYearNodeModule(new OtherIncomePreviousYearNodeModule(this)).build();
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
