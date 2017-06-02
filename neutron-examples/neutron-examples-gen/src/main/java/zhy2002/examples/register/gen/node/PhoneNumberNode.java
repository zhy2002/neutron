package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.register.gen.di.PhoneNumberNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;


public class PhoneNumberNode extends PhoneInfoFieldNode {

    @Inject
    protected PhoneNumberNode(@Owner PhoneInfoNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PhoneNumberNode.class;
    }

    protected final PhoneNumberNodeComponent getComponent() {
        return component;
    }


    private PhoneNumberNodeComponent component;

    @Inject
    void createComponent(PhoneNumberNodeComponent.Builder builder) {
        this.component = builder.setPhoneNumberNodeModule(new PhoneNumberNodeModule(this)).build();
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
