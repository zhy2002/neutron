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


public class PersonOtherIncomeTypeNode extends StringUiNode<PersonOtherIncomeNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonOtherIncomeTypeNode.class;
    }

    private PersonOtherIncomeTypeNodeComponent component;

    @Inject
    void createComponent(PersonOtherIncomeTypeNodeComponent.Builder builder) {
        this.component = builder.setPersonOtherIncomeTypeNodeModule(new PersonOtherIncomeTypeNodeModule(this)).build();
    }

    @Override
    protected PersonOtherIncomeTypeNodeRuleProvider getRuleProvider() {
        return component.getPersonOtherIncomeTypeNodeRuleProvider();
    }

    public PersonOtherIncomeTypeNode(@NotNull PersonOtherIncomeNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setOptions(ApplicationNodeConstants.OTHER_INCOME_TYPE.toArray());
        setRequired(true);
        setValue("Other Income");
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
