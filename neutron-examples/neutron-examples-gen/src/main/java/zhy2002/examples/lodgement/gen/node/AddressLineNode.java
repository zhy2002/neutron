package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.AddressLineNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class AddressLineNode extends StringUiNode<AddressNode<?>> {

    @Inject
    public AddressLineNode(@Owner AddressNode<?> parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AddressLineNode.class;
    }

    protected final AddressLineNodeComponent getComponent() {
        return component;
    }


    private AddressLineNodeComponent component;

    @Inject
    void createComponent(AddressLineNodeComponent.Builder builder) {
        this.component = builder.setAddressLineNodeModule(new AddressLineNodeModule(this)).build();
    }

    private RuleProvider<AddressLineNode> getRuleProvider() {
        return component.getAddressLineNodeRuleProvider();
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

    private RuleProvider<AddressLineNode> getInstanceRuleProvider() {
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
