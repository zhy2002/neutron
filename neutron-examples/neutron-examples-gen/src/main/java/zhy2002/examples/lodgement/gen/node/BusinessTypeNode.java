package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.BusinessTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class BusinessTypeNode extends StringUiNode<SelfEmployedNode> {

    @Inject
    public BusinessTypeNode(@Owner SelfEmployedNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return BusinessTypeNode.class;
    }

    protected final BusinessTypeNodeComponent getComponent() {
        return component;
    }


    private BusinessTypeNodeComponent component;

    @Inject
    void createComponent(BusinessTypeNodeComponent.Builder builder) {
        this.component = builder.setBusinessTypeNodeModule(new BusinessTypeNodeModule(this)).build();
    }

    private RuleProvider<BusinessTypeNode> getRuleProvider() {
        return component.getBusinessTypeNodeRuleProvider();
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

    private RuleProvider<BusinessTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
