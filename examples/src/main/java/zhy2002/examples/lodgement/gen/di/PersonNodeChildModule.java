package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@PersonNodeChildScope
public class PersonNodeChildModule {


    @Provides
    @PersonNodeChildScope
    @Named("personGeneralNode")
    PersonGeneralNode providePersonGeneralNode(
        PersonNode parent,
        MembersInjector<PersonGeneralNode> injector
    ) {
        PersonGeneralNode node = new PersonGeneralNode(parent, "personGeneralNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonNodeChildScope
    @Named("personContactNode")
    PersonContactNode providePersonContactNode(
        PersonNode parent,
        MembersInjector<PersonContactNode> injector
    ) {
        PersonContactNode node = new PersonContactNode(parent, "personContactNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonNodeChildScope
    @Named("currentEmploymentListNode")
    CurrentEmploymentListNode provideCurrentEmploymentListNode(
        PersonNode parent,
        MembersInjector<CurrentEmploymentListNode> injector
    ) {
        CurrentEmploymentListNode node = new CurrentEmploymentListNode(parent, "currentEmploymentListNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonNodeChildScope
    @Named("previousEmploymentListNode")
    PreviousEmploymentListNode providePreviousEmploymentListNode(
        PersonNode parent,
        MembersInjector<PreviousEmploymentListNode> injector
    ) {
        PreviousEmploymentListNode node = new PreviousEmploymentListNode(parent, "previousEmploymentListNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonNodeChildScope
    @Named("personTrustNode")
    PersonTrustNode providePersonTrustNode(
        PersonNode parent,
        MembersInjector<PersonTrustNode> injector
    ) {
        PersonTrustNode node = new PersonTrustNode(parent, "personTrustNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonNodeChildScope
    @Named("personPrivacyNode")
    PersonPrivacyNode providePersonPrivacyNode(
        PersonNode parent,
        MembersInjector<PersonPrivacyNode> injector
    ) {
        PersonPrivacyNode node = new PersonPrivacyNode(parent, "personPrivacyNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonNodeChildScope
    @Named("personOtherIncomeListNode")
    PersonOtherIncomeListNode providePersonOtherIncomeListNode(
        PersonNode parent,
        MembersInjector<PersonOtherIncomeListNode> injector
    ) {
        PersonOtherIncomeListNode node = new PersonOtherIncomeListNode(parent, "personOtherIncomeListNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonNodeChildScope
    @Named("personResponsibleLendNode")
    PersonResponsibleLendNode providePersonResponsibleLendNode(
        PersonNode parent,
        MembersInjector<PersonResponsibleLendNode> injector
    ) {
        PersonResponsibleLendNode node = new PersonResponsibleLendNode(parent, "personResponsibleLendNode");

        injector.injectMembers(node);
        return node;
    }

}