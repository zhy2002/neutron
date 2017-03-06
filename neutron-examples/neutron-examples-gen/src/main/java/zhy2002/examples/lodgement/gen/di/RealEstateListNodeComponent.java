package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@RealEstateListNodeScope
@Subcomponent(modules = {RealEstateListNodeModule.class})
public interface RealEstateListNodeComponent {

    RealEstateListNodeRuleProvider getRealEstateListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setRealEstateListNodeModule(RealEstateListNodeModule module);

        RealEstateListNodeComponent build();
    }
}
