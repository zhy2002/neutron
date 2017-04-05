package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherIncomePreviousYearNode extends BooleanUiNode<OtherIncomeNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OtherIncomePreviousYearNode.class;
    }

    private OtherIncomePreviousYearNodeComponent component;

    @Inject
    void createComponent(OtherIncomePreviousYearNodeComponent.Builder builder) {
        this.component = builder.setOtherIncomePreviousYearNodeModule(new OtherIncomePreviousYearNodeModule(this)).build();
    }

    private RuleProvider<OtherIncomePreviousYearNode> getRuleProvider() {
        return component.getOtherIncomePreviousYearNodeRuleProvider();
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

    private RuleProvider<OtherIncomePreviousYearNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public OtherIncomePreviousYearNode(@NotNull OtherIncomeNode parent, String name) {
        super(parent, name);
    }

}
