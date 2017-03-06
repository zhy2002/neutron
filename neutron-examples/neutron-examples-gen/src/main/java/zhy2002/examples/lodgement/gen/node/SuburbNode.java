package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private SuburbNodeRuleProvider getRuleProvider() {
        return component.getSuburbNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public SuburbNode(@NotNull AddressNode<?> parent, String name) {
        super(parent, name);
    }

    @Override
    public Boolean getRequired() {
        boolean parentHasValue = getParent().hasValue();
        if(parentHasValue)
            return super.getRequired();

        return Boolean.FALSE;
    }

}
