package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PersonPrivacyNodeScope
@Subcomponent(modules = {PersonPrivacyNodeModule.class})
public interface PersonPrivacyNodeComponent {

    PersonPrivacyNodeRuleProvider getPersonPrivacyNodeRuleProvider();
    Map<String, RuleProvider<PersonPrivacyNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonPrivacyNodeModule(PersonPrivacyNodeModule module);

        PersonPrivacyNodeComponent build();
    }
}
