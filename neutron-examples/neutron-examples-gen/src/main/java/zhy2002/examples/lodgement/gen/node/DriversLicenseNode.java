package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class DriversLicenseNode extends StringUiNode<PersonGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return DriversLicenseNode.class;
    }

    private DriversLicenseNodeComponent component;

    @Inject
    void createComponent(DriversLicenseNodeComponent.Builder builder) {
        this.component = builder.setDriversLicenseNodeModule(new DriversLicenseNodeModule(this)).build();
    }

    @Override
    protected DriversLicenseNodeRuleProvider getRuleProvider() {
        return component.getDriversLicenseNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public DriversLicenseNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setPattern("\\d{8,8}");
        setPatternMessage("Must be 8 digits");
    }

}
