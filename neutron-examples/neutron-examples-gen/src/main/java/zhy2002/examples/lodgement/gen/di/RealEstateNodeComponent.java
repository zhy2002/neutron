package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@RealEstateNodeScope
@Subcomponent(modules = {RealEstateNodeModule.class})
public interface RealEstateNodeComponent {

    RealEstateNodeRuleProvider getRealEstateNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setRealEstateNodeModule(RealEstateNodeModule module);

        RealEstateNodeComponent build();
    }
}
