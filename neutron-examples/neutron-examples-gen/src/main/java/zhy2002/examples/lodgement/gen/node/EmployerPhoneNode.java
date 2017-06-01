package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.EmployerPhoneNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class EmployerPhoneNode extends TelephoneNode<EmployedNode> {

    @Inject
    public EmployerPhoneNode(@Owner EmployedNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return EmployerPhoneNode.class;
    }

    protected final EmployerPhoneNodeComponent getComponent() {
        return component;
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

}
