package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class HousingStatusNode extends StringUiNode<PersonGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return HousingStatusNode.class;
    }

    private HousingStatusNodeComponent component;

    @Inject
    void createComponent(HousingStatusNodeComponent.Builder builder) {
        this.component = builder.setHousingStatusNodeModule(new HousingStatusNodeModule(this)).build();
    }

    @Override
    protected HousingStatusNodeRuleProvider getRuleProvider() {
        return component.getHousingStatusNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public HousingStatusNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setOptions(ApplicationNodeConstants.HOUSING_STATUS.toArray());
        setRequired(true);
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
