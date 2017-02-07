package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@PersonResponsibleLendNodeChildScope
public class PersonResponsibleLendNodeChildModule {

    private final PersonResponsibleLendNode parent;

    public PersonResponsibleLendNodeChildModule(PersonResponsibleLendNode parent) {
        this.parent = parent;
    }


    @Provides
    @PersonResponsibleLendNodeChildScope
    @Named("personTypeOfChangeNode")
    PersonTypeOfChangeNode providePersonTypeOfChangeNode(
        MembersInjector<PersonTypeOfChangeNode> injector
    ) {
        PersonTypeOfChangeNode node = new PersonTypeOfChangeNode(parent, "personTypeOfChangeNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonResponsibleLendNodeChildScope
    @Named("personMitigationMethodNode")
    PersonMitigationMethodNode providePersonMitigationMethodNode(
        MembersInjector<PersonMitigationMethodNode> injector
    ) {
        PersonMitigationMethodNode node = new PersonMitigationMethodNode(parent, "personMitigationMethodNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonResponsibleLendNodeChildScope
    @Named("personSignificantChangeFlagNode")
    PersonSignificantChangeFlagNode providePersonSignificantChangeFlagNode(
        MembersInjector<PersonSignificantChangeFlagNode> injector
    ) {
        PersonSignificantChangeFlagNode node = new PersonSignificantChangeFlagNode(parent, "personSignificantChangeFlagNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonResponsibleLendNodeChildScope
    @Named("personRepaymentDifficultyNode")
    PersonRepaymentDifficultyNode providePersonRepaymentDifficultyNode(
        MembersInjector<PersonRepaymentDifficultyNode> injector
    ) {
        PersonRepaymentDifficultyNode node = new PersonRepaymentDifficultyNode(parent, "personRepaymentDifficultyNode");

        injector.injectMembers(node);
        return node;
    }

}