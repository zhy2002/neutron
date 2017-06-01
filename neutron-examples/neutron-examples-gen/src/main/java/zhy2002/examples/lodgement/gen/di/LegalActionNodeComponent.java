package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {LegalActionNodeModule.class})
public interface LegalActionNodeComponent {

    List<RuleProvider<LegalActionNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setLegalActionNodeModule(LegalActionNodeModule module);

        LegalActionNodeComponent build();
    }

}
