package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@TitleNodeScope
@Subcomponent(modules = {TitleNodeModule.class})
public interface TitleNodeComponent {

    RuleProvider<TitleNode> getTitleNodeRuleProvider();
    Map<String, RuleProvider<TitleNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setTitleNodeModule(TitleNodeModule module);

        TitleNodeComponent build();
    }
}
