package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PersonContactNode extends BaseContactNode<PersonNode> {

    private PersonHomePhoneNode personHomePhoneNode;

    private PersonContactNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(PersonContactNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return PersonContactNode.class;
    }

    private PersonContactNodeComponent component;

    @Inject
    void createComponent(PersonContactNodeComponent.Builder builder) {
        this.component = builder.setPersonContactNodeModule(new PersonContactNodeModule(this)).build();
    }

    @Override
    protected PersonContactNodeRuleProvider getRuleProvider() {
        return component.getPersonContactNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public PersonContactNode(@NotNull PersonNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public PersonHomePhoneNode getPersonHomePhoneNode() {
        return personHomePhoneNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        personHomePhoneNode = childFactory.createPersonHomePhoneNode();
        children.add(personHomePhoneNode);
        return children;
    }

}
