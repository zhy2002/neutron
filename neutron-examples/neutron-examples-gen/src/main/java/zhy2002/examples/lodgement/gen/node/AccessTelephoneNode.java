package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.AccessTelephoneNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class AccessTelephoneNode extends TelephoneNode<AccessNode> {

    @Inject
    public AccessTelephoneNode(@Owner AccessNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AccessTelephoneNode.class;
    }

    protected final AccessTelephoneNodeComponent getComponent() {
        return component;
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

}
