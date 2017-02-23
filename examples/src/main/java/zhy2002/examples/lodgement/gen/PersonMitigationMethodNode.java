package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class PersonMitigationMethodNode extends StringUiNode<PersonResponsibleLendNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return PersonMitigationMethodNode.class;
    }

    private PersonMitigationMethodNodeComponent component;

    @Inject
    void createComponent(PersonMitigationMethodNodeComponent.Builder builder) {
        this.component = builder.setPersonMitigationMethodNodeModule(new PersonMitigationMethodNodeModule(this)).build();
    }

    @Override
    protected PersonMitigationMethodNodeRuleProvider getRuleProvider() {
        return component.getPersonMitigationMethodNodeRuleProvider();
    }

    public PersonMitigationMethodNode(PersonResponsibleLendNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setOptions(ApplicationNodeConstants.PERSON_MITIGATION_TYPE.toArray());
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
