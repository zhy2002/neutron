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


public class CompanyApplicationTypeNode extends StringUiNode<CompanyGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyApplicationTypeNode.class;
    }

    private CompanyApplicationTypeNodeComponent component;

    @Inject
    void createComponent(CompanyApplicationTypeNodeComponent.Builder builder) {
        this.component = builder.setCompanyApplicationTypeNodeModule(new CompanyApplicationTypeNodeModule(this)).build();
    }

    @Override
    protected CompanyApplicationTypeNodeRuleProvider getRuleProvider() {
        return component.getCompanyApplicationTypeNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public CompanyApplicationTypeNode(@NotNull CompanyGeneralNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setOptions(ApplicationNodeConstants.COMPANY_APPLICATION_TYPE.toArray());
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
