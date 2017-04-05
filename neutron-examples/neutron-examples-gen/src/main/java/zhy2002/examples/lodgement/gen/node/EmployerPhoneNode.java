package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class EmployerPhoneNode extends TelephoneNode<EmployedNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return EmployerPhoneNode.class;
    }

    private EmployerPhoneNodeComponent component;

    @Inject
    void createComponent(EmployerPhoneNodeComponent.Builder builder) {
        this.component = builder.setEmployerPhoneNodeModule(new EmployerPhoneNodeModule(this)).build();
    }

    private RuleProvider<EmployerPhoneNode> getRuleProvider() {
        return component.getEmployerPhoneNodeRuleProvider();
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

    private RuleProvider<EmployerPhoneNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public EmployerPhoneNode(@NotNull EmployedNode parent, String name) {
        super(parent, name);
    }

}
