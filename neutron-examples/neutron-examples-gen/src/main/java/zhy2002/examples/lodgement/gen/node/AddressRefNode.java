package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class AddressRefNode extends ReferenceUiNode<AddressRefListNode> {
    private AddressRefNodeComponent component;

    public AddressRefNode(@NotNull AddressRefListNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return AddressRefNode.class;
    }

    @Inject
    void createComponent(AddressRefNodeComponent.Builder builder) {
        this.component = builder.setAddressRefNodeModule(new AddressRefNodeModule(this)).build();
    }

    private RuleProvider<AddressRefNode> getRuleProvider() {
        return component.getAddressRefNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }

}
