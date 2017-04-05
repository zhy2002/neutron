package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class AccessTelephoneNode extends TelephoneNode<AccessNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return AccessTelephoneNode.class;
    }

    private AccessTelephoneNodeComponent component;

    @Inject
    void createComponent(AccessTelephoneNodeComponent.Builder builder) {
        this.component = builder.setAccessTelephoneNodeModule(new AccessTelephoneNodeModule(this)).build();
    }

    private RuleProvider<AccessTelephoneNode> getRuleProvider() {
        return component.getAccessTelephoneNodeRuleProvider();
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

    private RuleProvider<AccessTelephoneNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public AccessTelephoneNode(@NotNull AccessNode parent, String name) {
        super(parent, name);
    }

}
