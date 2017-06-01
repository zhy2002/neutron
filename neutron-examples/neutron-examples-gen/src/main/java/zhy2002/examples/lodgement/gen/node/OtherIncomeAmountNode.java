package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OtherIncomeAmountNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class OtherIncomeAmountNode extends BaseCurrencyNode<OtherIncomeNode> {

    @Inject
    public OtherIncomeAmountNode(@Owner OtherIncomeNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherIncomeAmountNode.class;
    }

    protected final OtherIncomeAmountNodeComponent getComponent() {
        return component;
    }


    private OtherIncomeAmountNodeComponent component;

    @Inject
    void createComponent(OtherIncomeAmountNodeComponent.Builder builder) {
        this.component = builder.setOtherIncomeAmountNodeModule(new OtherIncomeAmountNodeModule(this)).build();
    }

    private RuleProvider<OtherIncomeAmountNode> getRuleProvider() {
        return component.getOtherIncomeAmountNodeRuleProvider();
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

    private RuleProvider<OtherIncomeAmountNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
