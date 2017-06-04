package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.EmploymentTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class EmploymentTypeNode extends StringUiNode<EmploymentNode<?>> {

    @Inject
    protected EmploymentTypeNode(@Owner EmploymentNode<?> parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return EmploymentTypeNode.class;
    }

    protected final EmploymentTypeNodeComponent getComponent() {
        return component;
    }


    private EmploymentTypeNodeComponent component;

    @Inject
    void createComponent(EmploymentTypeNodeComponent.Builder builder) {
        this.component = builder.setEmploymentTypeNodeModule(new EmploymentTypeNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    @Override
    public Boolean getRequired() {
        boolean parentHasValue = getParent().hasValue();
        if(parentHasValue)
            return super.getRequired();

        return Boolean.FALSE;
    }

}
