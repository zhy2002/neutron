package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {PersonPrivacyNodeModule.class})
public interface PersonPrivacyNodeComponent extends BasePrivacyNodeComponent {


    RuleProvider<PersonPrivacyNode> getPersonPrivacyNodeRuleProvider();
    Map<String, RuleProvider<PersonPrivacyNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonPrivacyNodeModule(PersonPrivacyNodeModule module);

        PersonPrivacyNodeComponent build();
    }

}
