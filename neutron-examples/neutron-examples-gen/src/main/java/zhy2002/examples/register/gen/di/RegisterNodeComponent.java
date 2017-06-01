package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ComponentScope
@Subcomponent(modules = {RegisterNodeModule.class})
public interface RegisterNodeComponent {

    UsernameNode createUsernameNode();
    EmailNode createEmailNode();
    PasswordNode createPasswordNode();
    RepeatPasswordNode createRepeatPasswordNode();
    AgeNode createAgeNode();
    PlanNode createPlanNode();
    ReceiveOffersNode createReceiveOffersNode();
    OwnInvestmentPropertyNode createOwnInvestmentPropertyNode();
    PropertyDetailsNode createPropertyDetailsNode();
    PhoneInfoNode createPhoneInfoNode();
    ErrorListNode createErrorListNode();

    RuleProvider<RegisterNode> getRegisterNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setRegisterNodeModule(RegisterNodeModule module);

        RegisterNodeComponent build();
    }

}
