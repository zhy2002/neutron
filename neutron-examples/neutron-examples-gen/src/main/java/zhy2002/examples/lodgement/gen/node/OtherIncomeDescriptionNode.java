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
    public OtherIncomeDescriptionNode(@Owner OtherIncomeNode parent, @ChildName String name) {
        super(parent, name);
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

    private RuleProvider<OtherIncomeDescriptionNode> getRuleProvider() {
        return component.getOtherIncomeDescriptionNodeRuleProvider();
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

    private RuleProvider<OtherIncomeDescriptionNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
