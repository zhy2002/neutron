package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PersonEmailNodeScope
@Subcomponent(modules = {PersonEmailNodeModule.class})
public interface PersonEmailNodeComponent {

    PersonEmailNodeRuleProvider getPersonEmailNodeRuleProvider();
    Map<String, RuleProvider<PersonEmailNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonEmailNodeModule(PersonEmailNodeModule module);

        PersonEmailNodeComponent build();
    }
}
