package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@HousingStatusNodeScope
@Subcomponent(modules = {HousingStatusNodeModule.class})
public interface HousingStatusNodeComponent {

    RuleProvider<HousingStatusNode> getHousingStatusNodeRuleProvider();
    Map<String, RuleProvider<HousingStatusNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setHousingStatusNodeModule(HousingStatusNodeModule module);

        HousingStatusNodeComponent build();
    }
}
