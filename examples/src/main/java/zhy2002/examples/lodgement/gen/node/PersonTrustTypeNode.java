package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PersonTrustTypeNode extends StringUiNode<PersonTrustNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonTrustTypeNode.class;
    }

    private PersonTrustTypeNodeComponent component;

    @Inject
    void createComponent(PersonTrustTypeNodeComponent.Builder builder) {
        this.component = builder.setPersonTrustTypeNodeModule(new PersonTrustTypeNodeModule(this)).build();
    }

    @Override
    protected PersonTrustTypeNodeRuleProvider getRuleProvider() {
        return component.getPersonTrustTypeNodeRuleProvider();
    }

    public PersonTrustTypeNode(@NotNull PersonTrustNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setOptions(ApplicationNodeConstants.TRUST_TYPE.toArray());
    }

    @JsMethod
    public Object getOptions() {
        return getStateValue(ApplicationNodeConstants.OPTIONS);
    }

    @JsMethod
    public void setOptions(Object value) {
        setStateValue(ApplicationNodeConstants.OPTIONS, Object.class, value);
    }

}
