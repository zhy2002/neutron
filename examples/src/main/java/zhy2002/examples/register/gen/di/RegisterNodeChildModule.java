package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;

@Module(subcomponents = {
})
@RegisterNodeChildScope
public class RegisterNodeChildModule {


    @Provides
    @RegisterNodeChildScope
    @Named("usernameNode")
    UsernameNode provideUsernameNode(
        RegisterNode parent,
        MembersInjector<UsernameNode> injector
    ) {
        UsernameNode node = new UsernameNode(parent, "usernameNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @RegisterNodeChildScope
    @Named("emailNode")
    EmailNode provideEmailNode(
        RegisterNode parent,
        MembersInjector<EmailNode> injector
    ) {
        EmailNode node = new EmailNode(parent, "emailNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @RegisterNodeChildScope
    @Named("passwordNode")
    PasswordNode providePasswordNode(
        RegisterNode parent,
        MembersInjector<PasswordNode> injector
    ) {
        PasswordNode node = new PasswordNode(parent, "passwordNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @RegisterNodeChildScope
    @Named("repeatPasswordNode")
    RepeatPasswordNode provideRepeatPasswordNode(
        RegisterNode parent,
        MembersInjector<RepeatPasswordNode> injector
    ) {
        RepeatPasswordNode node = new RepeatPasswordNode(parent, "repeatPasswordNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @RegisterNodeChildScope
    @Named("ageNode")
    AgeNode provideAgeNode(
        RegisterNode parent,
        MembersInjector<AgeNode> injector
    ) {
        AgeNode node = new AgeNode(parent, "ageNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @RegisterNodeChildScope
    @Named("planNode")
    PlanNode providePlanNode(
        RegisterNode parent,
        MembersInjector<PlanNode> injector
    ) {
        PlanNode node = new PlanNode(parent, "planNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @RegisterNodeChildScope
    @Named("receiveOffersNode")
    ReceiveOffersNode provideReceiveOffersNode(
        RegisterNode parent,
        MembersInjector<ReceiveOffersNode> injector
    ) {
        ReceiveOffersNode node = new ReceiveOffersNode(parent, "receiveOffersNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @RegisterNodeChildScope
    @Named("ownInvestmentPropertyNode")
    OwnInvestmentPropertyNode provideOwnInvestmentPropertyNode(
        RegisterNode parent,
        MembersInjector<OwnInvestmentPropertyNode> injector
    ) {
        OwnInvestmentPropertyNode node = new OwnInvestmentPropertyNode(parent, "ownInvestmentPropertyNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @RegisterNodeChildScope
    @Named("residentialPropertyNode")
    PropertyDetailsNode provideResidentialPropertyNode(
        RegisterNode parent,
        MembersInjector<PropertyDetailsNode> injector
    ) {
        PropertyDetailsNode node = new PropertyDetailsNode(parent, "residentialPropertyNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @RegisterNodeChildScope
    @Named("investmentPropertyNode")
    PropertyDetailsNode provideInvestmentPropertyNode(
        RegisterNode parent,
        MembersInjector<PropertyDetailsNode> injector
    ) {
        PropertyDetailsNode node = new PropertyDetailsNode(parent, "investmentPropertyNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @RegisterNodeChildScope
    @Named("homePhoneNode")
    PhoneInfoNode provideHomePhoneNode(
        RegisterNode parent,
        MembersInjector<PhoneInfoNode> injector
    ) {
        PhoneInfoNode node = new PhoneInfoNode(parent, "homePhoneNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @RegisterNodeChildScope
    @Named("errorListNode")
    ErrorListNode provideErrorListNode(
        RegisterNode parent,
        MembersInjector<ErrorListNode> injector
    ) {
        ErrorListNode node = new ErrorListNode(parent, "errorListNode");

        injector.injectMembers(node);
        return node;
    }

}