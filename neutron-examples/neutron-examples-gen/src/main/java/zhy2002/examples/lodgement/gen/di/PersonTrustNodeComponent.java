package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PersonTrustNodeScope
@Subcomponent(modules = {PersonTrustNodeModule.class})
public interface PersonTrustNodeComponent {

    RuleProvider<PersonTrustNode> getPersonTrustNodeRuleProvider();
    Map<String, RuleProvider<PersonTrustNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonTrustNodeModule(PersonTrustNodeModule module);

        PersonTrustNodeComponent build();
    }
}
