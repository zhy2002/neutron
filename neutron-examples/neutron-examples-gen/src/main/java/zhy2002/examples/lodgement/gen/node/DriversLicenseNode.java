package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.DriversLicenseNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class DriversLicenseNode extends StringUiNode<PersonGeneralNode> {

    @Inject
    public DriversLicenseNode(@Owner PersonGeneralNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return DriversLicenseNode.class;
    }

    protected final DriversLicenseNodeComponent getComponent() {
        return component;
    }


    private DriversLicenseNodeComponent component;

    @Inject
    void createComponent(DriversLicenseNodeComponent.Builder builder) {
        this.component = builder.setDriversLicenseNodeModule(new DriversLicenseNodeModule(this)).build();
    }

    private RuleProvider<DriversLicenseNode> getRuleProvider() {
        return component.getDriversLicenseNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<DriversLicenseNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
