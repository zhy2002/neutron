package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.EmploymentTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class EmploymentTypeNode extends StringUiNode<EmploymentNode<?>> {

    @Inject
    public EmploymentTypeNode(@Owner EmploymentNode<?> parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return EmploymentTypeNode.class;
    }

    protected final EmploymentTypeNodeComponent getComponent() {
        return component;
    }


    private EmploymentTypeNodeComponent component;

    @Inject
    void createComponent(EmploymentTypeNodeComponent.Builder builder) {
        this.component = builder.setEmploymentTypeNodeModule(new EmploymentTypeNodeModule(this)).build();
    }

    private RuleProvider<EmploymentTypeNode> getRuleProvider() {
        return component.getEmploymentTypeNodeRuleProvider();
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

    private RuleProvider<EmploymentTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @Override
    public Boolean getRequired() {
        boolean parentHasValue = getParent().hasValue();
        if(parentHasValue)
            return super.getRequired();

        return Boolean.FALSE;
    }

}
