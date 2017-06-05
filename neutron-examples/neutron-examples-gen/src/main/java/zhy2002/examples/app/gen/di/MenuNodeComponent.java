package zhy2002.examples.app.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.app.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {MenuNodeModule.class})
public interface MenuNodeComponent {

    List<RuleProvider<MenuNode>> provideRuleProviders();

    SiteLogoNode createSiteLogoNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setMenuNodeModule(MenuNodeModule module);

        MenuNodeComponent build();
    }

}
