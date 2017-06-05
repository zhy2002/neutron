package zhy2002.examples.app.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.app.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {SiteLogoNodeModule.class})
public interface SiteLogoNodeComponent {

    List<RuleProvider<SiteLogoNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setSiteLogoNodeModule(SiteLogoNodeModule module);

        SiteLogoNodeComponent build();
    }

}
