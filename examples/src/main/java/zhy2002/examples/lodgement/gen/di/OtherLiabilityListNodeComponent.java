package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@OtherLiabilityListNodeScope
@Subcomponent(modules = {OtherLiabilityListNodeModule.class})
public interface OtherLiabilityListNodeComponent {

    OtherLiabilityListNodeRuleProvider getOtherLiabilityListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityListNodeModule(OtherLiabilityListNodeModule module);

        OtherLiabilityListNodeComponent build();
    }
}
