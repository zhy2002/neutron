package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.DateOfBirthNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class DateOfBirthNode extends DobNode<PersonGeneralNode> {

    @Inject
    protected DateOfBirthNode(@Owner PersonGeneralNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return DateOfBirthNode.class;
    }

    protected final DateOfBirthNodeComponent getComponent() {
        return component;
    }


    private DateOfBirthNodeComponent component;

    @Inject
    void createComponent(DateOfBirthNodeComponent.Builder builder) {
        this.component = builder.setDateOfBirthNodeModule(new DateOfBirthNodeModule(this)).build();
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
