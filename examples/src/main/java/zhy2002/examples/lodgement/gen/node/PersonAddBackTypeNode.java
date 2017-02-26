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


public class PersonAddBackTypeNode extends StringUiNode<PersonOtherIncomeNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonAddBackTypeNode.class;
    }

    private PersonAddBackTypeNodeComponent component;

    @Inject
    void createComponent(PersonAddBackTypeNodeComponent.Builder builder) {
        this.component = builder.setPersonAddBackTypeNodeModule(new PersonAddBackTypeNodeModule(this)).build();
    }

    @Override
    protected PersonAddBackTypeNodeRuleProvider getRuleProvider() {
        return component.getPersonAddBackTypeNodeRuleProvider();
    }

    public PersonAddBackTypeNode(@NotNull PersonOtherIncomeNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setOptions(ApplicationNodeConstants.PERSON_ADD_BACK_TYPE.toArray());
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