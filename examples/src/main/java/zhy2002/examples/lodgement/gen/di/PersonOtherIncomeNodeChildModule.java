package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@PersonOtherIncomeNodeChildScope
public class PersonOtherIncomeNodeChildModule {

    private final PersonOtherIncomeNode parent;

    public PersonOtherIncomeNodeChildModule(PersonOtherIncomeNode parent) {
        this.parent = parent;
    }


    @Provides
    @PersonOtherIncomeNodeChildScope
    @Named("personAddBackTypeNode")
    PersonAddBackTypeNode providePersonAddBackTypeNode(
        MembersInjector<PersonAddBackTypeNode> injector
    ) {
        PersonAddBackTypeNode node = new PersonAddBackTypeNode(parent, "personAddBackTypeNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonOtherIncomeNodeChildScope
    @Named("personOtherIncomeAmountNode")
    PersonOtherIncomeAmountNode providePersonOtherIncomeAmountNode(
        MembersInjector<PersonOtherIncomeAmountNode> injector
    ) {
        PersonOtherIncomeAmountNode node = new PersonOtherIncomeAmountNode(parent, "personOtherIncomeAmountNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonOtherIncomeNodeChildScope
    @Named("personOtherIncomeDescriptionNode")
    PersonOtherIncomeDescriptionNode providePersonOtherIncomeDescriptionNode(
        MembersInjector<PersonOtherIncomeDescriptionNode> injector
    ) {
        PersonOtherIncomeDescriptionNode node = new PersonOtherIncomeDescriptionNode(parent, "personOtherIncomeDescriptionNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonOtherIncomeNodeChildScope
    @Named("personOtherIncomePreviousYearNode")
    PersonOtherIncomePreviousYearNode providePersonOtherIncomePreviousYearNode(
        MembersInjector<PersonOtherIncomePreviousYearNode> injector
    ) {
        PersonOtherIncomePreviousYearNode node = new PersonOtherIncomePreviousYearNode(parent, "personOtherIncomePreviousYearNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonOtherIncomeNodeChildScope
    @Named("personOtherIncomeTypeNode")
    PersonOtherIncomeTypeNode providePersonOtherIncomeTypeNode(
        MembersInjector<PersonOtherIncomeTypeNode> injector
    ) {
        PersonOtherIncomeTypeNode node = new PersonOtherIncomeTypeNode(parent, "personOtherIncomeTypeNode");

        injector.injectMembers(node);
        return node;
    }

}