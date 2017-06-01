package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {PersonNodeModule.class})
public interface PersonNodeComponent {

    List<RuleProvider<PersonNode>> provideRuleProviders();

    PersonGeneralNode createPersonGeneralNode();
    PersonContactNode createPersonContactNode();
    CurrentEmploymentListNode createCurrentEmploymentListNode();
    PreviousEmploymentListNode createPreviousEmploymentListNode();
    PersonTrustNode createPersonTrustNode();
    PersonPrivacyNode createPersonPrivacyNode();
    PersonOtherIncomeListNode createPersonOtherIncomeListNode();
    PersonResponsibleLendNode createPersonResponsibleLendNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonNodeModule(PersonNodeModule module);

        PersonNodeComponent build();
    }

}
