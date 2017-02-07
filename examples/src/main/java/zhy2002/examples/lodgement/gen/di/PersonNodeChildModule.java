package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
    PersonGeneralNodeChildComponent.class,
    PersonContactNodeChildComponent.class,
    CurrentEmploymentListNodeItemComponent.class,
    PreviousEmploymentListNodeItemComponent.class,
    PersonTrustNodeChildComponent.class,
    PersonPrivacyNodeChildComponent.class,
    PersonOtherIncomeListNodeItemComponent.class,
    PersonResponsibleLendNodeChildComponent.class
})
@PersonNodeChildScope
public class PersonNodeChildModule {

    private final PersonNode parent;

    public PersonNodeChildModule(PersonNode parent) {
        this.parent = parent;
    }


    @Provides
    @PersonNodeChildScope
    @Named("personGeneralNode")
    PersonGeneralNode providePersonGeneralNode(
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
        MembersInjector<PersonResponsibleLendNode> injector
    ) {
        PersonResponsibleLendNode node = new PersonResponsibleLendNode(parent, "personResponsibleLendNode");

        injector.injectMembers(node);
        return node;
    }

}