package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PersonGeneralNodeScope
@Subcomponent(modules = {PersonGeneralNodeModule.class})
public interface PersonGeneralNodeComponent {

    PersonGeneralNodeRuleProvider getPersonGeneralNodeRuleProvider();
    Map<String, RuleProvider<PersonGeneralNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonGeneralNodeModule(PersonGeneralNodeModule module);

        PersonGeneralNodeComponent build();
    }
}
