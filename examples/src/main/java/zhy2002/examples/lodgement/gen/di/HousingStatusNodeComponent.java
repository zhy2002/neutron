package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@HousingStatusNodeScope
@Subcomponent(modules = {HousingStatusNodeModule.class})
public interface HousingStatusNodeComponent {

    HousingStatusNodeRuleProvider getHousingStatusNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setHousingStatusNodeModule(HousingStatusNodeModule module);

        HousingStatusNodeComponent build();
    }
}
