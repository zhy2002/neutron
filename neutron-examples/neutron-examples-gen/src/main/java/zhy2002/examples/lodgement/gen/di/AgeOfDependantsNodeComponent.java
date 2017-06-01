package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {AgeOfDependantsNodeModule.class})
public interface AgeOfDependantsNodeComponent {

    List<RuleProvider<AgeOfDependantsNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setAgeOfDependantsNodeModule(AgeOfDependantsNodeModule module);

        AgeOfDependantsNodeComponent build();
    }

}
