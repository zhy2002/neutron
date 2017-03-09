package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;


public class PhoneNumberNode extends PhoneInfoFieldNode {

    @Override
    public final Class<?> getConcreteClass() {
        return PhoneNumberNode.class;
    }

    private PhoneNumberNodeComponent component;

    @Inject
    void createComponent(PhoneNumberNodeComponent.Builder builder) {
        this.component = builder.setPhoneNumberNodeModule(new PhoneNumberNodeModule(this)).build();
    }

    private PhoneNumberNodeRuleProvider getRuleProvider() {
        return component.getPhoneNumberNodeRuleProvider();
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

    private RuleProvider<PhoneNumberNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public PhoneNumberNode(@NotNull PhoneInfoNode parent, String name) {
        super(parent, name);
    }

}
