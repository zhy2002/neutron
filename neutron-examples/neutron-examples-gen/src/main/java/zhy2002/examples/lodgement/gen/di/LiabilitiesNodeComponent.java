package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {LiabilitiesNodeModule.class})
public interface LiabilitiesNodeComponent {

    List<RuleProvider<LiabilitiesNode>> provideRuleProviders();

    CreditCardListNode createCreditCardListNode();
    LoanListNode createLoanListNode();
    OtherLiabilityListNode createOtherLiabilityListNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setLiabilitiesNodeModule(LiabilitiesNodeModule module);

        LiabilitiesNodeComponent build();
    }

}
