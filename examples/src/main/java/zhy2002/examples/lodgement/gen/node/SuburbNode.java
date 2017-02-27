package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class SuburbNode extends StringUiNode<AddressNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return SuburbNode.class;
    }

    private SuburbNodeComponent component;

    @Inject
    void createComponent(SuburbNodeComponent.Builder builder) {
        this.component = builder.setSuburbNodeModule(new SuburbNodeModule(this)).build();
    }

    @Override
    protected SuburbNodeRuleProvider getRuleProvider() {
        return component.getSuburbNodeRuleProvider();
    }

    public SuburbNode(@NotNull AddressNode<?> parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

    @Override
    public Boolean getRequired() {
        boolean parentHasValue = getParent().hasValue();
        if(parentHasValue)
            return super.getRequired();

        return Boolean.FALSE;
    }

}
