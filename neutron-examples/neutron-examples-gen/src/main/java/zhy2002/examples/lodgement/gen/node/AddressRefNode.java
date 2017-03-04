package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class AddressRefNode extends ReferenceUiNode<AddressRefListNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return AddressRefNode.class;
    }

    private AddressRefNodeComponent component;

    @Inject
    void createComponent(AddressRefNodeComponent.Builder builder) {
        this.component = builder.setAddressRefNodeModule(new AddressRefNodeModule(this)).build();
    }

    @Override
    protected AddressRefNodeRuleProvider getRuleProvider() {
        return component.getAddressRefNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public AddressRefNode(@NotNull AddressRefListNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRemoveEmpty(true);
    }

}
