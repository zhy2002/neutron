package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class EmployerNameNode extends StringUiNode<EmployedNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return EmployerNameNode.class;
    }

    private EmployerNameNodeComponent component;

    @Inject
    void createComponent(EmployerNameNodeComponent.Builder builder) {
        this.component = builder.setEmployerNameNodeModule(new EmployerNameNodeModule(this)).build();
    }

    private RuleProvider<EmployerNameNode> getRuleProvider() {
        return component.getEmployerNameNodeRuleProvider();
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

    private RuleProvider<EmployerNameNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public EmployerNameNode(@NotNull EmployedNode parent, String name) {
        super(parent, name);
    }

}
