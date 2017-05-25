package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PersonMobileNumberNodeScope
@Subcomponent(modules = {PersonMobileNumberNodeModule.class})
public interface PersonMobileNumberNodeComponent {

    RuleProvider<PersonMobileNumberNode> getPersonMobileNumberNodeRuleProvider();
    Map<String, RuleProvider<PersonMobileNumberNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonMobileNumberNodeModule(PersonMobileNumberNodeModule module);

        PersonMobileNumberNodeComponent build();
    }
}
