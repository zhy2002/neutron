package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class PersonTypeOfChangeNode extends StringUiNode<PersonResponsibleLendNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonTypeOfChangeNode.class;
    }

    private PersonTypeOfChangeNodeComponent component;

    @Inject
    void createComponent(PersonTypeOfChangeNodeComponent.Builder builder) {
        this.component = builder.setPersonTypeOfChangeNodeModule(new PersonTypeOfChangeNodeModule(this)).build();
    }

    @Override
    protected PersonTypeOfChangeNodeRuleProvider getRuleProvider() {
        return component.getPersonTypeOfChangeNodeRuleProvider();
    }

    public PersonTypeOfChangeNode(@NotNull PersonResponsibleLendNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setOptions(ApplicationNodeConstants.PERSON_CHANGE_TYPE.toArray());
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
