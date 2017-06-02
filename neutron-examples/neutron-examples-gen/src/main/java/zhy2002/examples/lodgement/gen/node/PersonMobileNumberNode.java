package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.PersonMobileNumberNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PersonMobileNumberNode extends BaseMobileNumberNode<PersonContactNode> {

    @Inject
    protected PersonMobileNumberNode(@Owner PersonContactNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PersonMobileNumberNode.class;
    }

    protected final PersonMobileNumberNodeComponent getComponent() {
        return component;
    }


    private PersonMobileNumberNodeComponent component;

    @Inject
    void createComponent(PersonMobileNumberNodeComponent.Builder builder) {
        this.component = builder.setPersonMobileNumberNodeModule(new PersonMobileNumberNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
