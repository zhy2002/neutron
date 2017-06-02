package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.PersonEmailNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PersonEmailNode extends EmailNode<PersonContactNode> {

    @Inject
    protected PersonEmailNode(@Owner PersonContactNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PersonEmailNode.class;
    }

    protected final PersonEmailNodeComponent getComponent() {
        return component;
    }


    private PersonEmailNodeComponent component;

    @Inject
    void createComponent(PersonEmailNodeComponent.Builder builder) {
        this.component = builder.setPersonEmailNodeModule(new PersonEmailNodeModule(this)).build();
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
