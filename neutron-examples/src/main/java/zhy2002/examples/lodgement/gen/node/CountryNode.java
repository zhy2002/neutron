package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CountryNode extends BaseCountryNode<AddressNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return CountryNode.class;
    }

    private CountryNodeComponent component;

    @Inject
    void createComponent(CountryNodeComponent.Builder builder) {
        this.component = builder.setCountryNodeModule(new CountryNodeModule(this)).build();
    }

    @Override
    protected CountryNodeRuleProvider getRuleProvider() {
        return component.getCountryNodeRuleProvider();
    }

    public CountryNode(@NotNull AddressNode<?> parent, String name) {
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
