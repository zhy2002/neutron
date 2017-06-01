package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {IdNodeModule.class})
public interface IdNodeComponent {

    List<RuleProvider<IdNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setIdNodeModule(IdNodeModule module);

        IdNodeComponent build();
    }

}
