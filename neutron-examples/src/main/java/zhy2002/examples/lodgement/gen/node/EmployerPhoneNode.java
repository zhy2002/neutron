package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class EmployerPhoneNode extends TelephoneNode<EmployedNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return EmployerPhoneNode.class;
    }

    private EmployerPhoneNodeComponent component;

    @Inject
    void createComponent(EmployerPhoneNodeComponent.Builder builder) {
        this.component = builder.setEmployerPhoneNodeModule(new EmployerPhoneNodeModule(this)).build();
    }

    @Override
    protected EmployerPhoneNodeRuleProvider getRuleProvider() {
        return component.getEmployerPhoneNodeRuleProvider();
    }

    public EmployerPhoneNode(@NotNull EmployedNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}
