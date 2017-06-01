package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OtherIncomeAddBackTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherIncomeAddBackTypeNode extends StringUiNode<OtherIncomeNode> {

    @Inject
    public OtherIncomeAddBackTypeNode(@Owner OtherIncomeNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherIncomeAddBackTypeNode.class;
    }

    protected final OtherIncomeAddBackTypeNodeComponent getComponent() {
        return component;
    }


    private OtherIncomeAddBackTypeNodeComponent component;

    @Inject
    void createComponent(OtherIncomeAddBackTypeNodeComponent.Builder builder) {
        this.component = builder.setOtherIncomeAddBackTypeNodeModule(new OtherIncomeAddBackTypeNodeModule(this)).build();
    }

    private RuleProvider<OtherIncomeAddBackTypeNode> getRuleProvider() {
        return component.getOtherIncomeAddBackTypeNodeRuleProvider();
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

    private RuleProvider<OtherIncomeAddBackTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
