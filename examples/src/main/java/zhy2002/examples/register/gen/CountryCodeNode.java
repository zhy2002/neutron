package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;

public class CountryCodeNode extends PhoneInfoFieldNode {

    @Override
    public final Class<?> getConcreteClass() {
        return CountryCodeNode.class;
    }

    private CountryCodeNodeComponent component;

    @Inject
    void createComponent(CountryCodeNodeComponent.Builder builder) {
        this.component = builder.setCountryCodeNodeModule(new CountryCodeNodeModule(this)).build();
    }

    @Override
    protected CountryCodeNodeRuleProvider getRuleProvider() {
        return component.getCountryCodeNodeRuleProvider();
    }

    public CountryCodeNode(@NotNull PhoneInfoNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequiredMessage("Country code is required.");
    }

}
