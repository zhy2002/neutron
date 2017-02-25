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

public class PersonOtherIncomePreviousYearNode extends BooleanUiNode<PersonOtherIncomeNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonOtherIncomePreviousYearNode.class;
    }

    private PersonOtherIncomePreviousYearNodeComponent component;

    @Inject
    void createComponent(PersonOtherIncomePreviousYearNodeComponent.Builder builder) {
        this.component = builder.setPersonOtherIncomePreviousYearNodeModule(new PersonOtherIncomePreviousYearNodeModule(this)).build();
    }

    @Override
    protected PersonOtherIncomePreviousYearNodeRuleProvider getRuleProvider() {
        return component.getPersonOtherIncomePreviousYearNodeRuleProvider();
    }

    public PersonOtherIncomePreviousYearNode(PersonOtherIncomeNode parent, String name) {
        super(parent, name);
    }

}
